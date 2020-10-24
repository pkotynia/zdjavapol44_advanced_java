package exercise.task_24;

public class BasketFullException extends RuntimeException {

    private int code;

    public BasketFullException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
