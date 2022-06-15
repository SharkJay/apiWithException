package 异常.异常练习;

public class AgeOutOfBoundsException extends RuntimeException {

    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
