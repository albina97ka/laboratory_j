interface Product {
    String getName();
    double getPrice();
    int getRating();
}

class Product1 implements Product {
    private String name;
    private double price;
    private int rating;

    Product1(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
}

class Product2 implements Product {
    private String name;
    private double price;
    private int rating;

    Product2(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
}

class Product3 implements Product {
    private String name;
    private double price;
    private int rating;

    Product3(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
}

interface User {
    String getLogin();
    String getPassword();
}

class User1 implements User {
    private String login;
    private String password;

    User1(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}

class User2 implements User {
    private String login;
    private String password;

    User2(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}

class User3 implements User {
    private String login;
    private String password;

    User3(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}

class UserProduct {
    public void buyProduct(Product product, User user) {
        System.out.println(user.getLogin() + " купил товар " + product.getName());
    }
}

class Main11 {
    public static void main(String[] args) {

        Product1 product1 = new Product1("Сыр", 248.99, 4);
        Product2 product2 = new Product2("Сок", 149.99, 3);
        Product3 product3 = new Product3("Молоко", 45.99, 4);

        User1 user1 = new User1("Артем", "32543");
        User2 user2 = new User2("Матвей", "46312");
        User3 user3 = new User3("Никита", "76551");

        UserProduct userProduct = new UserProduct();
        userProduct.buyProduct(product1, user1);
        userProduct.buyProduct(product2, user2);
        userProduct.buyProduct(product3, user3);
    }
}