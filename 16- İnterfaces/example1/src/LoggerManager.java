public class LoggerManager {
    public void addLog(ILogger logger, String message){
        logger.log(message);
    }
}
