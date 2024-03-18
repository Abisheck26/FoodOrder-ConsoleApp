import java.util.*;

public class FoodOrder {

    static int chickenCount = 5; // 1
    static int muttonCount = 5; // 2
    static int fishCount = 5; // 3
    static int prawnCount = 5; // 4

    static HashMap<Integer, Customer> customers = new LinkedHashMap<>();

    public void orderFood(Customer c) {

        
        if (c.foodType == 1) {
            chickenCount=chickenCount-c.quantity;           
            customers.put(c.orderCode, c);
        }
        else if (c.foodType == 2) {
            muttonCount=muttonCount-c.quantity;
            customers.put(c.orderCode, c);
        }
        else if (c.foodType == 3) {
            fishCount=fishCount-c.quantity;
            customers.put(c.orderCode, c);
        }
        else if (c.foodType == 4) {
            prawnCount=prawnCount-c.quantity;
            customers.put(c.orderCode, c);
        }
        System.out.println("Your food ordered successfully\n");

    }

    public void showOrders(){
        if(customers.size()==0){
            System.out.println("No orders");
        }
        else{
            for(Customer c :customers.values()){
                System.out.println("OrderCode:"+c.orderCode);
                System.out.println("Name:"+c.name);
                System.out.println("FoodType:"+c.foodType);
                System.out.println("Quantity:"+c.quantity);
                System.out.println("Address:"+c.address);
            }
        }
    }

    public void showAvailable(){

        System.out.println("Available Items :");
        System.out.println("1.Chicken :"+chickenCount);
        System.out.println("2.Mutton :"+muttonCount);
        System.out.println("3.Fish :"+fishCount);
        System.out.println("4.Prawn :"+prawnCount+"\n");
    }

    public void cancel(int orderCode){

        Customer c=customers.get(orderCode);
        customers.remove(orderCode);
        System.out.println("Order Cancelled Successfully\n");
        if(c.foodType==1){
            chickenCount=chickenCount+c.quantity;
        }
        else if(c.foodType==2){
            muttonCount=muttonCount+c.quantity;
        }
        else if(c.foodType==3){
            fishCount=fishCount+c.quantity;
        }
        else if(c.foodType==4){
            prawnCount=prawnCount+c.quantity;
        }
    }

}