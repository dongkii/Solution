package com.dongkii.solution.web.programmers.level2;

import java.util.*;
public class OpenChatting_room {
    public static String[] solution(String[] record) {
        Map<String, String> nameMap = new HashMap<String, String>();    // key: ID, value: NAME 으로 
        List<String> idList = new ArrayList<String>();                  // 아이디를 저장할 리스트
        List<String> statusList = new ArrayList<String>();              // 상태를 저장할 리스트
        
        for(int i = 0; i < record.length; i++) {                        // record 만큼 반복
            switch (record[i].split(" ")[0]) {                    // switch문으로 split한 0번째 값 비교
                case "Leave":                                           // 나간 상태는 name 값이 없어서 아이디와 상태만 저장
                    statusList.add("님이 나갔습니다.");                   // 나간 상태 저장
                    idList.add(record[i].split(" ")[1]);          // 상태에 대한 아이디 저장
                    break;
                case "Enter":                                          // 들어온 상태(Enter)와 아이디 변경(change)는 map에만 넣으면 되니 break 생략
                    statusList.add("님이 들어왔습니다.");                 // 들어온 상태 저장
                    idList.add(record[i].split(" ")[1]);         // 상태에 대한 아이디 저장
                case "Change":
                    nameMap.put(record[i].split(" ")[1], record[i].split(" ")[2]); // Enter, Change 모두 name 값이 맵에 있으므로 저장(키값이 중복되므로 나중값만 저장됨)
                    break;
                default:
                    break;
            }
        }

        String[] answer = new String[statusList.size()];

        for(int j = 0; j < answer.length; j++) {
            answer[j] = nameMap.get(idList.get(j)) + statusList.get(j);
        }

        return answer;
    }
}

/*
"Enter uid1234 Muzi"
"Enter uid4567 Prodo"
"Leave uid1234"
"Enter uid1234 Prodo"
"Change uid4567 Ryan"
 */