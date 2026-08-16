public class Main {
  public static void main(String[] args){
    DownloadThread thread = new DownloadThread();
    thread.start();
    UploadThread thread1 = new UploadThread();
    thread1.start();
    BackupThread thread2 = new BackupThread();
    thread2.start();
  }
}
