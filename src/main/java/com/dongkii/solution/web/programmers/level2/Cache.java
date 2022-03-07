package com.dongkii.solution.web.programmers.level2;

import java.util.*;

public class Cache {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        // 캐시에 저장된 데이터를 확인하기 위한 리스트
        List<String> cache = new ArrayList<String>();

        // 캐시 사이즈가 0일 경우 모든 경우의 수 cache miss
        if(cacheSize == 0) {
            return cities.length * 5;
        }

        // cities의 길이만큼 반복
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            if(cache.size() == 0) { // cache에 저장된 데이터가 없을 경우
                cache.add(city);    // cache에 데이터 저장
                answer += 5;        // cache miss
            } else {
                boolean cacheYN = false;

                for(int j = 0; j < cache.size(); j++) {
                    if(city.equals(cache.get(j))) { // 캐시의 데이터와 배열의 인덱스가 일치할경우 캐시존재
                        //cache.remove(j);    //
                        //cache.add(city);
                        answer += 1;    // cache hit 처리
                        cacheYN = true; // cache hit 여부 판단
                        break;
                    }
                }

                if(!cacheYN) {  // cache miss일 경우
                    if(cache.size() == cacheSize) { // cache가 꽉찼을 때, list사이즈랑 캐시 사이즈가 동일할 때
                        cache.remove(0); // cache 삭제
                        cache.add(city);       // cache 추가
                        answer += 5;           // cache miss
                    } else {
                        cache.add(city);
                        answer += 5;           // cache miss
                    }
                }
            }
        }

        return answer;
    }
}
