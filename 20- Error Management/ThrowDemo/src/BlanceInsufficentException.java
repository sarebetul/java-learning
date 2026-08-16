public class BlanceInsufficentException extends Exception{
    String message;
    public BlanceInsufficentException(String message){
        this.message = message;
    }
    public String getMessage(){
        return super.getMessage();
    }
}
