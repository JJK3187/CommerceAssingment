package level1;

import java.util.List;

public class Cart {

    private List<CartItem> items;

    public Cart(List<CartItem> items) {
        this.items = items;
    }

    public List<CartItem> getItems() {
        return items;
    }
    // 장바구니 상품 추가
    public void addItem(CartItem item) {
        items.add(item);
    }
    // 장바구니 상품 제거
    public void removeItem(CartItem item) {}

    // 장바구니 조회
    public void displayCart() {

        int index = 1;
        for (CartItem item : items) {
            Product product = item.getProduct();

            System.out.println(index + "." + product.getName()
                    + " | 단가: " + product.getPrice() + "원"
                    + " | 수량: " + item.getQuantity() + "개");
            index++;
        }

    }

}
