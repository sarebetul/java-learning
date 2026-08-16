public class StopwatchThread implements Runnable{
    private Thread t;
    private String threadName;

    public StopwatchThread(String threadName){
        this.threadName = threadName;
        System.out.println("being created: " + threadName);
    }
    @Override
    public void run() {
        System.out.println("running: " + threadName);

        for(int i=1; i<=10; i++){
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread finished: " + threadName);
    }
    public void start(){
        System.out.println("A thread object is being created.");
        if(t == null){
            t = new Thread(this);
            t.start();
        }
    }
}
