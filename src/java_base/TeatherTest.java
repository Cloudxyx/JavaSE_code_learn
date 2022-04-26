package java_base;

import java.util.Scanner;

public class TeatherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.getScore(score);
        } catch (ScoreException e) {
            throw new RuntimeException(e);
        }

    }
}
