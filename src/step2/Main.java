package step2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CommerceSystem commerceSystem = new CommerceSystem();
        Thread thread1 = new Thread(commerceSystem);

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("커머스 플랫폼을 종료합니다.");
    }

}