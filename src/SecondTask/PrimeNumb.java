package SecondTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        try{
            Integer d = Integer.parseInt(input.nextLine());
            boolean[] isPrime = new boolean[d];
            Arrays.fill(isPrime, true);
            for (int i = 2; i * i < d; i++) {
                if (isPrime[i]) {
                    for (int j = 2 * i; j < d; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            ArrayList<Integer> primes = new ArrayList<>();
            for (int i = 2; i < d; i++) {
                if (isPrime[i]) {
                    if (d % i == 0) {
                        primes.add(i);
                    }
                }
            }

            System.out.println(Arrays.toString(primes.toArray()));
        }
        catch(Exception e){
            System.out.println("Введенные вами число не целое");
        }

    }
}
