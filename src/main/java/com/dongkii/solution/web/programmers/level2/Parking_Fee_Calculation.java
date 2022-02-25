package com.dongkii.solution.web.programmers.level2;

import java.util.*;

public class Parking_Fee_Calculation {
    public static int[] solution(int[] fees, String[] records) {
        // fees의 인덱스  0 : 기본시간(분) , 1 : 기본요금(원), 2 : 단위시간(분), 3 : 단위요금(원)
        // records의 값, 입출차시간 차량번호 입출차여부(IN/OUT)

        Map<String, String> carMap = new HashMap<String, String>(); // 차량번호 키, 주차시간 값
        Set<String> carSet = new LinkedHashSet<String>();

        for(int i = records.length-1; i >= 0; i--) {
            String[] tmp = records[i].split("\\s");
            // 0 : 입출차시간, 1 : 차량번호, 2 : 입출차여부
            carSet.add(tmp[1]);
            int t = 0;

            if (carMap.get(tmp[1]) == null && "IN".equals(tmp[2])) {  // 맵에 없고, 인이면 23:59 에서 빼야함,
                t = (23 - Integer.parseInt(tmp[0].split(":")[0])) * 60 + (59 - Integer.parseInt(tmp[0].split(":")[1]));

                carMap.put(tmp[1], String.valueOf(t) + " 0");
            } else if(carMap.get(tmp[1]) == null && "OUT".equals(tmp[2])) { // 맵에 없고 아웃이면 등록
                carMap.put(tmp[1], "0 " + tmp[0]);
            } else if("0".equals(carMap.get(tmp[1]).split("\\s")[1]) && "IN".equals(tmp[2])) { // 맵에 있지만 값이 없을 경우 24에서 빼야함
                t = (23 - Integer.parseInt(tmp[0].split(":")[0])) * 60 + (59 - Integer.parseInt(tmp[0].split(":")[1]));

                carMap.put(tmp[1], String.valueOf(Integer.parseInt(carMap.get(tmp[1]).split("\\s")[0]) + t) + " 0");
            } else if(carMap.get(tmp[1]) != null && "OUT".equals(tmp[2])) { // 맵이 널이아니고 아웃일경우 등록
                carMap.put(tmp[1], carMap.get(tmp[1]).split("\\s")[0] + " " + tmp[0]);
            } else {
                t = (Integer.parseInt(carMap.get(tmp[1]).split("\\s")[1].split(":")[0]) - Integer.parseInt(tmp[0].split(":")[0])) * 60
                        + (Integer.parseInt(carMap.get(tmp[1]).split("\\s")[1].split(":")[1])- Integer.parseInt(tmp[0].split(":")[1]));

                carMap.put(tmp[1], (Integer.parseInt(carMap.get(tmp[1]).split("\\s")[0]) + t) + " 0");
            }
        }

        // 차량번호 셋 정렬
        String[] carArr = carSet.stream().sorted().toArray(String[]::new);
        int[] answer = new int[carSet.size()];

        // 차량번호별 누적 금액 산출
        for(int j = 0; j < carArr.length; j++) {
            String carNumber = String.valueOf(carArr[j]);
            int time = Integer.parseInt(carMap.get(carNumber).split("\\s")[0]);
            answer[j] = time <= fees[0] ? fees[1] : (int)Math.ceil( (time - fees[0]) / (double)fees[2]) * fees[3] + fees[1];
        }

        return answer;
    }
}
