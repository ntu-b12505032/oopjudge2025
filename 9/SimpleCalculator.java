import java.text.DecimalFormat;

/**
 * A simple calculator that performs operations (+, -, *, /) on a single result.
 * It processes string commands and handles various input exceptions.
 */
public class SimpleCalculator {

    private double result = 0.0;
    private int count = 0;
    private String lastOperator = "";
    private double lastValue = 0.0;
    private DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Processes a command to perform a calculation or throw an exception if the command is invalid.
     *
     * @param cmd the command string in the format "operator value"
     * @throws UnknownCmdException if the command is invalid.
     */
    public void calResult(String cmd) throws UnknownCmdException {
        if (cmd == null || cmd.trim().isEmpty()) {
            throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
        }

        String[] parts = cmd.trim().split(" ");
        if (parts.length != 2) {
            throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
        }

        String operator = parts[0];
        String valueStr = parts[1];
        boolean validOperator = operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
        boolean validValue = true;
        double value = 0.0;

        try {
            value = Double.parseDouble(valueStr);
        } catch (NumberFormatException e) {
            validValue = false;
        }

        if (!validOperator && !validValue) {
            throw new UnknownCmdException(operator + " is an unknown operator and " + valueStr + " is an unknown value");
        } else if (!validOperator) {
            throw new UnknownCmdException(operator + " is an unknown operator");
        } else if (!validValue) {
            throw new UnknownCmdException(valueStr + " is an unknown value");
        }

        if (operator.equals("/") && value == 0.0) {
            throw new UnknownCmdException("Can not divide by 0");
        }

        switch (operator) {
            case "+":
                result += value;
                break;
            case "-":
                result -= value;
                break;
            case "*":
                result *= value;
                break;
            case "/":
                result /= value;
                break;
        }

        count++;
        lastOperator = operator;
        lastValue = value;
    }

    /**
     * Returns the appropriate message after a calculation step based on the internal state.
     *
     * @return the formatted message string.
     */
    public String getMsg() {
        if (count == 0) {
            return "Calculator is on. Result = " + df.format(result);
        } else if (lastOperator.isEmpty()) {
            return "Final result = " + df.format(result);
        } else {
            String msg = "Result " + lastOperator + " " + df.format(lastValue) + " = " + df.format(result);
            msg += count == 1 ? ". New result = " : ". Updated result = ";
            msg += df.format(result);
            return msg;
        }
    }

    /**
     * Checks whether the command signals the end of calculation.
     *
     * @param cmd the command string.
     * @return true if the command is "r" or "R", otherwise false.
     */
    public boolean endCalc(String cmd) {
        return cmd.equalsIgnoreCase("r");
    }
}
