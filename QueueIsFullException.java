public class QueueIsFullException extends Exception {
    public QueueIsFullException(String errorMessage) {
        super(errorMessage);
    }
}