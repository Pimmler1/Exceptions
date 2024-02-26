package task3;

public class IllegalWattException extends RuntimeException{
    public IllegalWattException(){}
    public IllegalWattException(String message){
        super(message);
    }
}
