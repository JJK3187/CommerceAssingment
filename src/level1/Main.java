package level1;

public class Main {

    public static void main(String[] args) {

        // 스레드 생성
        CommerceSystem commerceSystem = new CommerceSystem();
        Thread thread1 = new Thread(commerceSystem);

        // 스레드 실행
        thread1.start();
    }
}
