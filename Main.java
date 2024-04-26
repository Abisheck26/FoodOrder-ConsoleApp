import java.util.*;

public class Main {

    public static void order(Customer c) {
        FoodOrder order = new FoodOrder();
        if ((c.foodType == 1) && (order.chickenCount >= c.quantity)) {
            System.out.println("Prefered Food available\n");
            order.orderFood(c);
        } else if ((c.foodType == 2) && (order.muttonCount >= c.quantity)) {
            System.out.println("Prefered Food available\n");
            order.orderFood(c);
        } else if ((c.foodType == 3) && (order.fishCount >= c.quantity)) {
            System.out.println("Prefered Food available\n");
            order.orderFood(c);
        } else if ((c.foodType == 4) && (order.prawnCount >= c.quantity)) {
            System.out.println("Prefered Food available\n");
            order.orderFood(c);
        } else {
            System.out.println("Prefered Food or Quantity not available\nCheck Available Food :");
            order.showAvailable();
        }
    }

    public static void cancelOrder(int orderCode) {

        FoodOrder order = new FoodOrder();
        if (order.customers.containsKey(orderCode)) {
            order.cancel(orderCode);
        } else {
            System.out.println("Order Not Found!");
        }
    }

    public static void menu() {
        System.out.println("1.Chicken : OrderCode- 1");
        System.out.println("2.Mutton  : OrderCode- 2");
        System.out.println("3.Fish    : OrderCode- 3");
        System.out.println("4.Prawn   : OrderCode- 4\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean loop = true;

        while (loop) {

            System.out.println(
                    "1.Order Food\n2.Cancel Order\n3.View Orders\n4.Show Available Food Items\n5.Menu\n6.Exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter your Name,Preferred food,Quantity and Address\n");
                    System.out.println("For Preferred food enter code \nChicken-1, Mutton-2, Fish-3, Prawn-4");
                    String name = scan.next();
                    int foodCode = scan.nextInt();
                    int quantity = scan.nextInt();
                    String address = scan.next();

                    Customer c = new Customer(name, foodCode, quantity, address);
                    order(c);
                }
                    break;
                case 2: {
                    System.out.println("Enter the OrderCode to cancel the order");
                    int orderCode = scan.nextInt();
                    cancelOrder(orderCode);
                }
                    break;
                case 3: {

                    FoodOrder order = new FoodOrder();
                    order.showOrders();
                }
                    break;
                case 4: {
                    FoodOrder order = new FoodOrder();
                    order.showAvailable();

                }
                    break;

                case 5: {
                    menu();
                }
                    break;
                case 6: {
                    System.out.println("Are you sure you want to exit?(Y/N)");
                    String choose = scan.next();
                    if (choose.equals("Y")) {
                        
                        loop = false;
                    } else {
                        loop = true;
                    }

                }
                    break;

                default: {
                    System.out.println("\nInvalid Number\n");
                }
                    break;
            }

        }
    }
}
