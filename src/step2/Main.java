package step2;

public class Main {

    public static void main(String[] args) {

        CommerceSystem commerceSystem = new CommerceSystem();
        Thread thread1 = new Thread(commerceSystem);

        thread1.start();
    }

}