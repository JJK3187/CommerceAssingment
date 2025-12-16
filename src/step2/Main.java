package step2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CommerceSystem commerceSystem = new CommerceSystem();
        Thread thread1 = new Thread(commerceSystem);

        thread1.start();
    }

}