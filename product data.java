import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name, category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Category: " + category + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Electronics", 999.99);
        serializeProduct(product);
        Product deserializedProduct = deserializeProduct();
        deserializedProduct.printDetails();
    }

    private static void serializeProduct(Product product) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.ser"))) {
            oos.writeObject(product);
            System.out.println("Product serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Product deserializeProduct() {
        Product product = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.ser"))) {
            product = (Product) ois.readObject();
            System.out.println("Product deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
