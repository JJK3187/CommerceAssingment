package step3;

import java.util.ArrayList;
import java.util.List;

public class Category {

    //  속성
    private String categoryName;
    private List<Product> products;

    // 생성자
    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.products = new ArrayList<>();
    }

    // 기능
    // getter
    public String getCategoryName() {
        return categoryName;
    }

    // setter
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    // 상품 추가
    public void addProduct(Product product) {
        products.add(product);
    }

    // 카테고리 내 상품 갯수 출력
    public int getProductCount() {
        return products.size();
    }


    // 카테고리 출력
    public void displayCategory() {
        System.out.println("[ " + categoryName + " 카테고리 ]");
        int index = 1;
        for (Product product : products) {
            System.out.println(index + ". " + product.getName() + " | " + String.format("%,d", product.getPrice()) + "원" + " | " + product.getDescription());
            index++;
        }
        System.out.println("0. 뒤로가기");
    }

    // 상품 상세 정보 출력
    public void displayProductDetail(int productIndex) {
        if (productIndex >= 0) {
            Product product = products.get(productIndex);
            System.out.println("선택한 상품: " + product.getName() + " | " + String.format("%,d", product.getPrice()) + "원" + " | " + product.getDescription() + " | 재고: " + product.getQuantity() + "개");
        } else {
            System.out.println("잘못된 상품 번호입니다.");
        }
    }
}
