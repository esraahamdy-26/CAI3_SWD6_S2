package SimpleE_CommerceSystem;

public class Product {

    // Encapsulation Concept

    private int productId;
    private String name;
    private double price;
    private int stock;
    int paiedItems;

    public Product(int productId, String name)
    {
        this.productId = productId;
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0)
        {
            throw new IllegalArgumentException("Price cannot be negative value!");
        }
        else
        {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock < 0)
        {
            throw new IllegalArgumentException("Stock cannot be negative value!");
        }
        else
        {
            this.stock = stock;
        }
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        if (price == 0)
        {
            System.out.println("Free");
            return 0;
        }
        else
        {
            return price;
        }
    }

    public int getStock() {
        if (stock == 0)
        {
            return 0;
        }
        else
        {
            return stock;
        }
    }
}
