package SimpleE_CommerceSystem;

import java.util.Objects;

public class Admin extends User{

    // inheritance concept

    int updatedProducts = 0;
    public void updateProduct(Product prod, String field, String update)
    {
        switch (field) {
            case "productId" : prod.setProductId(Integer.parseInt(update)); break;
            case "name" : prod.setName(update); break;
            case "price" : prod.setPrice(Double.parseDouble(update)); break;
            case "stock" : prod.setStock(Integer.parseInt(update)); break;
            default: System.out.println("Invalid update");
        }
        updatedProducts ++;
    }

    @Override
    public void getUserDetails() {
        super.getUserDetails();
        System.out.println("He/She updated "+ updatedProducts+ " number of products");
    }
}
