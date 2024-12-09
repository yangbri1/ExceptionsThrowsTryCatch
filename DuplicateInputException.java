// create custom 'DuplicateInputException' where inherits duplicate exception class from 'Exception' parent
public class DuplicateInputException extends Exception{
    // create a Constructor class 
    public DuplicateInputException() {
        // leverage built-in functionality from 'Exception' class for this case
        super("Duplicate Input!! Reeeeeee");
    }
}
