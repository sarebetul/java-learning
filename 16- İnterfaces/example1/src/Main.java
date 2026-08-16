public class Main {
    public static void main(String[] args){
        LoggerManager manager = new LoggerManager();
        manager.addLog(new FileLogger(), "Dosyaya kayıt");
        manager.addLog(new DatabaseLogger(), "Veritabanına kayıt");
        manager.addLog(new ConsoleLogger(), "Konsola kayıt");
    }
}
