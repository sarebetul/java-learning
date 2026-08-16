public class TimerThread implements Runnable{
    private Thread t;
    @Override
    public void run() {
        for (int i=1; i<6; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
    }
}
