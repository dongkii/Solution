package com.dongkii.solution.web.programmers.Etc;

import java.util.*;

public class NQ3 {
    public static String sExpression(String nodes) {
        String answer = "";

        String[] node = nodes.split(" ");

        HashSet<String> set = new HashSet<String>(Arrays.asList(node));

        if(node.length != set.size()) {
            return "E2"; // Duplicate Edges Err
        }

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        // node sort
        Arrays.sort(node);

        answer = node[0].replace(",", "(") + ")"; // (A(B))
        map.put(node[0].substring(1, 2), Arrays.asList(node[0].substring(3, 4)));

        for(int i = 1; i < node.length; i++) {
            String parent = node[i].substring(1, 2);
            String child = node[i].substring(3, 4);

            if(map.get(parent) == null) {
                map.put(parent, Arrays.asList(child));
            } else {
                if(map.get(parent).size() > 1) return "E1";
                map.put(parent, Arrays.asList(map.get(parent).get(0), child));
            }

            if(parent.compareTo(child) == 1) return "E3"; // Cycle present Err

            if(map.get(child) != null) return "E3";

            // child 없는 상태
            if (answer.contains(parent) && answer.contains(parent + ")")) {
                answer = answer.replace("(" + parent + ")", node[i].replace(",", "(") + ")");
            } else if (answer.contains(parent) && answer.contains(parent + "(")) {
                answer = answer.substring(0, answer.indexOf(parent) + 4) + "(" + child + ")" + answer.substring(answer.indexOf(parent) + 4);
            } else {

            }
        }



        return answer;
    }

    public static String a(String nodes) {
        String answer = "";

        String[] node = nodes.split(" ");

        HashSet<String> set = new HashSet<String>(Arrays.asList(node));

        if(node.length != set.size()) return "E2";

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        HashSet<String> pSet = new HashSet<>();
        HashSet<String> cSet = new HashSet<>();

        for(int i = 0; i < node.length; i++) {
            String parent = node[i].substring(1, 2);
            String child = node[i].substring(3, 4);

            pSet.add(parent);
            cSet.add(child);

            if(map.get(parent) == null) {
                map.put(parent, Arrays.asList(child));
            } else {
                if(map.get(parent).size() > 1) return "E1";
                map.put(parent, Arrays.asList(map.get(parent).get(0), child));
            }
        }

        String root = "";

        for(String k : pSet) {
            if(!cSet.contains(k)) {
                if("".equals(root)) return "E4";
                root = k;
            }
        }

        if(map.get(root).size() == 1) {
            answer = "(" + root + "(" + map.get(root).get(0) + "))";
        } else {
            answer = "(" + root + "(" + map.get(root).get(0) + ")(" + map.get(root).get(1) + "))";
        }


        for(String key : map.keySet()) {
            if(!key.equals(root)) {
                if(map.get(key).size() == 1) {
                    answer = answer.replace("(" + key + ")", "(" + key + "(" + map.get(key).get(0) + "))");
                } else {
                    answer = answer.replace("(" + key + ")", "(" + key + "(" + map.get(key).get(0) + ")(" + map.get(key).get(1) + "))");
                }
            }
        }

        return answer;
    }
}
