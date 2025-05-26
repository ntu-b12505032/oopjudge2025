/**
 * A simple implementation of ATM service that only supports withdrawals.
 */
public class Simple_ATM_Service implements ATM_Service {

    /**
     * Checks whether the account has sufficient balance to withdraw the given amount.
     *
     * @param account the account to check.
     * @param money   the amount to withdraw.
     * @return true if the balance is sufficient.
     * @throws ATM_Exception if the balance is not enough.
     */
    @Override
    public boolean checkBalance(Account account, int money) throws ATM_Exception {
        if (account.getBalance() < money) {
            throw new ATM_Exception(ATM_Exception.ExceptionTYPE.BALANCE_NOT_ENOUGH);
        }
        return true;
    }

    /**
     * Checks whether the withdrawal amount is a valid amount (multiple of 1000).
     *
     * @param money the amount to check.
     * @return true if the amount is valid.
     * @throws ATM_Exception if the amount is not a multiple of 1000.
     */
    @Override
    public boolean isValidAmount(int money) throws ATM_Exception {
        if (money % 1000 != 0) {
            throw new ATM_Exception(ATM_Exception.ExceptionTYPE.AMOUNT_INVALID);
        }
        return true;
    }

    /**
     * Attempts to withdraw the specified amount from the given account.
     * It performs validation and catches any ATM_Exception raised, printing the appropriate message.
     * The updated balance is printed in every case.
     *
     * @param account the account to withdraw from.
     * @param money   the amount to withdraw.
     */
    @Override
    public void withdraw(Account account, int money) {
        try {
            checkBalance(account, money);
            isValidAmount(money);
            account.setBalance(account.getBalance() - money);
        } catch (ATM_Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("updated balance : " + account.getBalance());
        }
    }
}
