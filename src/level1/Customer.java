package level1;

public class Customer {

    // 속성
    private String name;
    private String email;
    private String tier;

    // 생성자
    public Customer(String name, String email, String tier) {
        this.name = name;
        this.email = email;
        this.tier = tier;
    }

    // 기능
    // getter
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getTier() {
        return tier;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTier(String tier) {
        this.tier = tier;
    }
}
