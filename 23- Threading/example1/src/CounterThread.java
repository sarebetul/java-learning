public class CounterThread implements Runnable{
    private Thread t;
    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
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
