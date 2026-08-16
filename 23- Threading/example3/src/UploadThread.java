public class UploadThread implements Runnable{
    private Thread t;
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("uploading");
        }
    }
    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
    }
}
