import Soal1.com.polban.jtk.sales.*;

public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product("Rumah", 700000000, 10);
        Sales sales1 = new Sales(product1);
        sales1.sellProduct(5);
        sales1.restockProduct(5);
        sales1.updateProductPrice(-700000000);
    }
}

