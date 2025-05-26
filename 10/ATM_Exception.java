/**
 * Exception class for ATM operations.
 * Used to indicate issues such as invalid withdrawal amounts or insufficient balance.
 */
public class ATM_Exception extends Exception {

    /**
     * Enumeration of possible exception types.
     */
    public enum ExceptionTYPE {
        BALANCE_NOT_ENOUGH,
        AMOUNT_INVALID
    }

    private ExceptionTYPE exceptionCondition;

    /**
     * Constructs an ATM_Exception with the specified exception type.
     *
     * @param exceptionCondition the exception type.
     */
    public ATM_Exception(ExceptionTYPE exceptionCondition) {
        this.exceptionCondition = exceptionCondition;
    }

    /**
     * Returns the name of the exception type.
     *
     * @return a string message representing the exception type.
     */
    @Override
    public String getMessage() {
        return exceptionCondition.name();
    }
}
