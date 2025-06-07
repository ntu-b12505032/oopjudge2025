/**
 * Custom exception for handling unknown commands in the calculator.
 */
public class UnknownCmdException extends Exception {

    /**
     * Constructs an UnknownCmdException with a specified error message.
     *
     * @param errMessage the detail message describing the exception.
     */
    public UnknownCmdException(String errMessage) {
        super(errMessage);
    }
}
