import java.util.ArrayList;
import java.util.Iterator;

public class ProductsIterator {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("1","Apple"));
        products.add(new Product("2","Banana"));
        products.add(new Product("3","Cherry"));

        System.out.println(GetProductNames(products));
    }

    private static String GetProductNames(ArrayList<Product> products) {
      StringBuilder list = new StringBuilder();

        for (Product product : products) {
            list.append(product.toString());
        }
        return list.toString();
    }
}