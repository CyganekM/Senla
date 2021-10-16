package ThirdTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelLetters {

    public static void main(String[] args) {
        List<Word> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String[] str = scanner.nextLine().trim().split(" ");
        for (String s : str) {
            words.add(new Word(s));
        }
        words.sort((s1, s2) -> s2.getVowelsСount() - s1.getVowelsСount());
        words.forEach(System.out::println);
    }
}
