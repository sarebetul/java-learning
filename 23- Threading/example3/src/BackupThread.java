public class BackupThread implements Runnable{
    private Thread t;
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("backing");
        }
    }
    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
    }
}
