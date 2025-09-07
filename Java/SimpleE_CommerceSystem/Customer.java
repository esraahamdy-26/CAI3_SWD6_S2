package SimpleE_CommerceSystem;

import java.util.ArrayList;
public class Customer extends User{

    // inheritance concept

    ArrayList<Product> orders = new ArrayList<>();


    public void placeOrder(Product prod)
    {
        if ( prod.getStock() == 0)
        {
            System.out.println("Sorry can't place this order. There is only "+ prod.getStock() + " items.");
        }
        else
        {
            prod.setStock(prod.getStock() - 1);
            System.out.println(prod.getName() + " added successfully to your chart");
            orders.add(prod);
            prod.paiedItems = 1;
        }
    }

    public void placeOrder(Product prod, int quantity)
    {
        if (quantity > prod.getStock())
        {
            System.out.println("Sorry can't place this order. There is only "+ prod.getStock() + " items.");
        }
        else
        {
            prod.setStock(prod.getStock() - quantity);
            orders.add(prod);
            prod.paiedItems = quantity;
            System.out.println(prod.getName() + " added successfully to your chart");
        }

    }

    @Override
    public void getUserDetails() {
        super.getUserDetails();
        System.out.println("His/Her history "+ orders + ".");
    }
}
