package isep.shared.exceptions;

public class InvalidNumberOfHubsException extends Exception{
    public InvalidNumberOfHubsException(){
        super("Number of Hubs must be a positive number!");
    }
}
