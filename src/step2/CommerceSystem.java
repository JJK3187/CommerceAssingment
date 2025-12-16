package step2;

import step1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem implements  Runnable {

    @Override
    public void run() {
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 10);
        Product product2 = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 20);
        Product product3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 5);
        Product product4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 40);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        for (Product product : products) {
            System.out.println("1. " + product1.getName() + " | " + product1.getPrice() + " | " + product1.getDescriprtion());
            System.out.println("2. " + product2.getName() + " | " + product2.getPrice() + " | " + product2.getDescriprtion());
            System.out.println("3. " + product3.getName() + " | " + product3.getPrice() + " | " + product3.getDescriprtion());
            System.out.println("4. " + product4.getName() + " | " + product4.getPrice() + " | " + product4.getDescriprtion());
            System.out.println("0. 종료" + " | " + "프로그램 종료");
            String exit = scanner.nextLine();
            if (exit.equals("0")) {
                break;
            }
        }
    }
}
