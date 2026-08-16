public class Main {
    public static void main(String[] args){
        Product product = new Product(1,"Laptop", "Asus Laptop", 50000,3);
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
