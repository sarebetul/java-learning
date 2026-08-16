public class CustomerManeger {
    private BaseLogger logger;
    public CustomerManeger(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Customer added");
        this.logger.log("Log message");
    }
}
