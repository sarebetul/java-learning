public class ProductManager {
    public void add(Product product){
        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product)){
            System.out.println("added");
        }else{
            System.out.println("product information is invalid");
        }
    }
}
