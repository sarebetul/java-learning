public class Main {
    public static void main(String[] args){
        Repository<Customer> customerRepository = new Repository<>();
        Customer customer = new Customer();
        customerRepository.save(customer);
        Repository<Product> productRepository = new Repository<>();
        Product product = new Product();
        productRepository.save(product);
    }
}
