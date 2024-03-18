public class Customer {

    static int code = 100;
    String name;
    int orderCode;
    int foodType;
    int quantity;
    String address;

    public Customer(String name, int food, int quantity, String address) {
        this.name = name;
        this.quantity = quantity;
        this.foodType = food;
        this.address = address;
        this.orderCode = code++;
    }
}