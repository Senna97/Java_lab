package array;

public class TowDimensionArray {
    public static void main(String[] args) {
//        int[][] arr = new int[2][3];
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(arr.length); //arr.length: 행의 길이 = 2
        System.out.println(arr[0].length); //arr[i].length: 열의 길이 = 3

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        System.out.println();

        char[][] alphabets = new char[13][2];

        char ch = 'A';

        for(int i = 0; i < alphabets.length; i++) {
            for(int j = 0; j < alphabets[i].length; j++, ch++) {
                alphabets[i][j] = ch;
            }
        }

        for(int i = 0; i < alphabets.length; i++) {
            for(int j = 0; j < alphabets[i].length; j++, ch++) {
                System.out.println(alphabets[i][j]);
            }
        }
    }
}
