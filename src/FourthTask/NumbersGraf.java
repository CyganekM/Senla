package FourthTask;

import java.util.Scanner;

public class NumbersGraf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        prNumber(input.nextLine());
    }
        public static void prNumber(String number){
            String[][] numberGraf = new String[10][7];
            {
                numberGraf[0][0] = "   ***   ";
                numberGraf[0][1] = "  *   *  ";
                numberGraf[0][2] = " *     * ";
                numberGraf[0][3] = " *     * ";
                numberGraf[0][4] = " *     * ";
                numberGraf[0][5] = "  *   *  ";
                numberGraf[0][6] = "   ***   ";

                numberGraf[1][0] = "   *   ";
                numberGraf[1][1] = "  **   ";
                numberGraf[1][2] = "   *   ";
                numberGraf[1][3] = "   *   ";
                numberGraf[1][4] = "   *   ";
                numberGraf[1][5] = "   *   ";
                numberGraf[1][6] = "  ***  ";

                numberGraf[2][0] = "  ***  ";
                numberGraf[2][1] = " *   * ";
                numberGraf[2][2] = "    *  ";
                numberGraf[2][3] = "   *   ";
                numberGraf[2][4] = "  *    ";
                numberGraf[2][5] = " *     ";
                numberGraf[2][6] = " ***** ";

                numberGraf[3][0] = "  ****  ";
                numberGraf[3][1] = " *    * ";
                numberGraf[3][2] = "     *  ";
                numberGraf[3][3] = "   **   ";
                numberGraf[3][4] = "     *  ";
                numberGraf[3][5] = " *    * ";
                numberGraf[3][6] = "  ****  ";

                numberGraf[4][0] = "     *  ";
                numberGraf[4][1] = "     *  ";
                numberGraf[4][2] = "   * *  ";
                numberGraf[4][3] = "  *  *  ";
                numberGraf[4][4] = " ****** ";
                numberGraf[4][5] = "     *  ";
                numberGraf[4][6] = "     *  ";

                numberGraf[5][0] = "  **** ";
                numberGraf[5][1] = "  *    ";
                numberGraf[5][2] = "  *    ";
                numberGraf[5][3] = "  ***  ";
                numberGraf[5][4] = "     * ";
                numberGraf[5][5] = " *   * ";
                numberGraf[5][6] = "  ***  ";

                numberGraf[6][0] = "  ***  ";
                numberGraf[6][1] = " *   * ";
                numberGraf[6][2] = " *     ";
                numberGraf[6][3] = " ****  ";
                numberGraf[6][4] = " *   * ";
                numberGraf[6][5] = " *   * ";
                numberGraf[6][6] = "  ***  ";

                numberGraf[7][0] = " ***** ";
                numberGraf[7][1] = "     * ";
                numberGraf[7][2] = "    *  ";
                numberGraf[7][3] = "  *    ";
                numberGraf[7][4] = "  *    ";
                numberGraf[7][5] = "  *    ";
                numberGraf[7][6] = "  *    ";

                numberGraf[8][0] = "  ****  ";
                numberGraf[8][1] = " *    * ";
                numberGraf[8][2] = "  *  *  ";
                numberGraf[8][3] = "   **   ";
                numberGraf[8][4] = "  *  *  ";
                numberGraf[8][5] = " *    * ";
                numberGraf[8][6] = "  ****  ";

                numberGraf[9][0] = "  ***  ";
                numberGraf[9][1] = " *   * ";
                numberGraf[9][2] = " *   * ";
                numberGraf[9][3] = "  **** ";
                numberGraf[9][4] = "     * ";
                numberGraf[9][5] = " *   * ";
                numberGraf[9][6] = "  ***  ";
            }
            int mn = maxNumber(number);
            int ngl = numberGraf[0].length;
            int nl = number.length();
            for (int i = 0; i <= ngl-1; i++) {
                for (int j = 0; j < nl; j++) {
                    int index = Character.getNumericValue(number.charAt(j));
                    if (index == mn
                    ){
                        System.out.print(numberGraf[index][i].replace("*", String.valueOf(index)));
                    }else {
                        System.out.print(numberGraf[index][i]);
                    }

                }
                System.out.println();
            }
        }

        public static int maxNumber(String number){
            char[] numArr = number.toCharArray();
            int maxNum = 0;
            for (int i = 0; i < numArr.length-1; i++) {
                if (maxNum<Character.getNumericValue(numArr[i])){
                    maxNum=Character.getNumericValue(numArr[i]);
                }
            }
            return maxNum;
        }
}


