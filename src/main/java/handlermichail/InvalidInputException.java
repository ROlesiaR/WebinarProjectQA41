package handlermichail;

public class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super("\u001B[31m"+message+"\u001B[0M");
    }

}
