package com.dongkii.solution.web.programmers.Etc;

import java.util.*;

public class runningRace {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        HashMap<String, Integer> nameRank = new HashMap<>();
        HashMap<Integer, String> rankName = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            nameRank.put(players[i], i+1);
            rankName.put(i+1, players[i]);
        }

        for(int i = 0; i < callings.length; i++) {
            int rank = nameRank.get(callings[i]);
            String tmp1 = rankName.get(rank);
            String tmp2 = rankName.get(rank-1);

            rankName.put(rank-1, tmp1);
            rankName.put(rank, tmp2);

            nameRank.put(tmp1, rank-1);
            nameRank.put(tmp2, rank);
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(nameRank.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        int i = 0;
        for(Map.Entry<String, Integer> entry :entryList) {
            answer[i] = entry.getKey();
            i++;
        }

        return answer;
    }
}
