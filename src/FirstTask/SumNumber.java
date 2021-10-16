package FirstTask;

import java.util.Scanner;

public class SumNumber {

    static int sumFromString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        String d = input.nextLine();
        System.out.println("Сумма чисел:" + sumFromString(d));
    }
}
