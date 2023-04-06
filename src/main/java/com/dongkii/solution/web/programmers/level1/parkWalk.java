package com.dongkii.solution.web.programmers.level1;

public class parkWalk {

    private static char[][] map;
    private static int[] answer;
    private static int ROW;
    private static int COL;

    public static int[] solution(String[] park, String[] routes) {
        answer = new int[]{};

        ROW = park.length;
        COL = park[0].length();
        map = new char[ROW][COL];
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[0].length(); j++) {
                char ch = park[i].charAt(j);
                map[i][j] = ch;

                if(ch == 'S') {
                    answer = new int[]{i, j};
                }
            }
        }

        for(String route : routes) {
            int[] newPos = getNewPos(route);

            if(newPos == null) {
                continue;
            }

            answer = newPos;
        }

        return answer;
    }

    private static boolean isNotMoveable(int[] newPos, String dimention) {
        int curRow = answer[0];
        int curCol = answer[1];
        int newRow = newPos[0];
        int newCol = newPos[1];

        switch (dimention) {
            case "N":
                for(int i = 1; i <= Math.abs(newRow - curRow); i++) {
                    if(map[curRow - i][curCol] == 'X')
                        return true;
                }
                break;
            case "S":
                for(int i = 1; i <= Math.abs(newRow - curRow); i++) {
                    if(map[curRow + i][curCol] == 'X')
                        return true;
                }
                break;
            case "W":
                for(int i = 1; i <= Math.abs(newCol - curCol); i++) {
                    if(map[curRow][curCol - i] == 'X')
                        return true;
                }
                break;
            case "E":
                for(int i = 1; i <= Math.abs(newCol - curCol); i++) {
                    if(map[curRow][curCol + i] == 'X')
                        return true;
                }
                break;
        }

        return false;
    }

    private static boolean isOutOfMap(int[] newPos) {
        int row = newPos[0];
        int col = newPos[1];
        return row < 0 || row >= ROW || col < 0 || col >= COL;
    }

    private static int[] getNewPos(String route) {
        String[] arr = route.split(" ");
        String dimention = arr[0];
        int moveCount = Integer.parseInt(arr[1]);

        int newRow = 0;
        int newCol = 0;

        switch(dimention) {
            case "N":
                newRow = answer[0] - moveCount;
                newCol = answer[1];
                break;
            case "S":
                newRow = answer[0] + moveCount;
                newCol = answer[1];
                break;
            case "W":
                newRow = answer[0];
                newCol = answer[1] - moveCount;
                break;
            case "E":
                newRow = answer[0];
                newCol = answer[1] + moveCount;
                break;
        }

        if(isOutOfMap(new int[]{newRow, newCol}) || isNotMoveable(new int[] {newRow, newCol}, dimention))
            return null;

        return new int[] {newRow, newCol};
    }
}
