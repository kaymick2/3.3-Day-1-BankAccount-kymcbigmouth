class BankAccount {
  /**
   * @author KyMcBigmouth
   * @version 1.2
   * 
   *          This program is used for calculating total balance, interest, and
   *          transactions *in a bank account. FEATURES: multiple accounts with
   *          customizable names interest calculation add/withdraw money
   * 
   */
  private double balance;
  private String name;

  public BankAccount() {
    balance = 0;
  }

  private double interest;

  /**
   * constructor for object BankAccount
   * 
   * @param type   = type of account
   * @param amount = amount of money in account
   * 
   */
  public BankAccount(String type, double amount) {
    name = type;
    balance = amount;
  }

  /**
   * easier way to return account names
   */
  public String actypes() {
    return name;
  }

  /**
   * Withdraws a certain amount of money.
   * 
   * @param amount = the amount to withdraw
   */
  public void withdrawal(double amount) {
    balance = balance - amount;
  }

  /**
   * Deposits a certain amount of money.
   * 
   * @param amount = the amount to deposit.
   */
  public void deposit(double amount) {
    balance = balance + amount;
  }

  /**
   * Displays balance.
   * 
   * @return the amount of money currently in the account. Note- should be used
   *         with implicit parameters, such as <account name>.getBalance()
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Computes simple interest on an account after one year and adds it to the
   * account's balance.
   * 
   * @param x = the percent of interest given. This number is multiplied by 0.01,
   *          so x SHOULD NOT be in decimal form unless the percentage is as such.
   *          example for 5% interest after 1 year in a checking account-
   *          checking.getInterest(5)
   * @return balance = returns account balance after interest is calculated.
   *         note-this currently cannot be undone
   */
  public double getInterest(double x) {
    balance = balance * (1 + (0.01 * x));
    return balance;

  }

  /**
   * Computes simple interest on an account after one year WITHOUT adding it to
   * the account balance. used with a print command.
   * 
   * @param y = the percent of interest given. This number is multiplied by 0.01,
   *          so y SHOULD NOT be in decimal form unless the percentage is as such.
   *          example for 5% interest after 1 year in a checking account-
   *          checking.figureInterest(5)
   * @return interest = returns balance with interest added. does not change
   *         original balance.
   */
  public double figureInterest(double y) {
    interest = balance * (1 + (0.01 * y));
    return interest;

  }

  /**
   * RESETS BALANCE. DO NOT USE IF YOU ARE NOT AWARE OF THE ASSOCIATED RISKS.
   */
  public void reset() {
    balance = 0;
  }
}