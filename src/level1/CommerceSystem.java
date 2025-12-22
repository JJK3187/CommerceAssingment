package level1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem implements Runnable {
    private Cart cart;
    @Override
    public void run() {
       Scanner scanner = new Scanner(System.in);
       List<Category> categories = new ArrayList<>();
       cart = new Cart(new ArrayList<>());

       // 카테고리 생성
       Category electronics = new Category("전자제품");
       Category clothing = new Category("의류");
       Category food = new Category("식품");

       // 전자제품 추가
       electronics.addProduct(new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 10));
       electronics.addProduct(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 20));
       electronics.addProduct(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 5));
       electronics.addProduct(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 40));

       // 의류 추가
       clothing.addProduct(new Product("청바지", 89000, "데님 청바지", 50));
       clothing.addProduct(new Product("티셔츠", 29000, "면 티셔츠", 100));
       clothing.addProduct(new Product("후드집업", 59000, "기모 후드집업", 30));

       // 식품 추가
       food.addProduct(new Product("사과", 5000, "국내산 사과", 200));
       food.addProduct(new Product("우유", 3000, "저지방 우유", 150));
       food.addProduct(new Product("바나나", 4000, "필리핀산 바나나", 100));

       // 카테고리 리스트에 추가
       categories.add(electronics);
       categories.add(clothing);
       categories.add(food);

       // 메인 메뉴 출력
       while (true) {
           System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
           int index = 1;
           for (Category category : categories) {
               System.out.println(index + ". " + category.getCategoryName());
               index++;
           }
           System.out.println("0. 종료      | 프로그램 종료");
           // 장바구니 기능 추가
           System.out.println("[ 주문 관리 ]" + "\n" + "4. 장바구니 확인  | 장바구니를 확인 후 주문합니다." + "\n" + "5. 주문 취소  | 진행중인 주분을 취소합니다.");

           int input = scanner.nextInt();

           if (input == 0) {
               System.out.println("커머스 플랫폼을 종료합니다.");
               break;
           }
           if (input == 4) {
               cart.displayCart();
               System.out.println("1. 돌아가기");
               int input3 = scanner.nextInt();
               if (input3 == 1) {
                   break;
               }
           }

           // 카테고리 선택
           try {
               if (input >= 1 && input <= categories.size()) {
                   Category selectedCategory = categories.get(input - 1);
                   showCategoryMenu(selectedCategory, scanner);
               } else {
                   System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
               }
           } catch (InputMismatchException e) {
               System.out.println("숫자를 입력해주세요.");
           }
       }
    }

    // 카테고리 내 상품 선택
    public void showCategoryMenu(Category category, Scanner scanner) {
        while (true) {
            category.displayCategory();

            int input = scanner.nextInt();

            if (input ==  0) {
                // 뒤로가기
                break;
            }

            // 상품 선택
            try {
                if (input >= 1 && input <= category.getProductCount()) {
                    Product selectedProduct = category.getProduct(input - 1);
                    category.displayProductDetail(input - 1);
                    System.out.println("위 상품을 장바구니에 추가하시겠습니까?" + "\n" + "1. 확인 " + " 2. 취소");
                    int input2 = scanner.nextInt();
                    switch(input2){
                        case 1:
                            System.out.print("수량을 입력하세요: ");
                            int quantity = scanner.nextInt();
                            if (quantity > 0) {
                                cart.addItem(new CartItem(selectedProduct, quantity));
                                System.out.println("장바구니에 추가되었습니다.");
                            } else {
                                System.out.println("수량은 1개 이상이어야 합니다.");
                            }
                            break;
                        case 2:
                            break;
                        default:
                                System.out.println("잘못된 입력 입니다.");
                    }

                } else {
                    System.out.println("잘못된 상품 번호입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
            }
        }
    }
}
