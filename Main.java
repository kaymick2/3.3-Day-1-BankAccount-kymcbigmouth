class Main {
  public static void main(String[] args) {
    BankAccount checking = new BankAccount("checking", 0);
    BankAccount savings = new BankAccount("savings", 0);
    checking.deposit(500);
    checking.deposit(500);
    checking.withdrawal(234.68);
    System.out.print("\nThe checking account balance is $");
    System.out.printf("%.2f", checking.getBalance());
    savings.deposit(425);
    savings.deposit(1);
    savings.withdrawal(0.13);
    System.out.print("\nThe savings account balance is $");
    System.out.printf("%.2f", savings.getBalance());
    savings.reset();
    checking.reset();
    System.out.println("\nUh oh, looks like someone put a skimmer on your local ATM and stole your funds!");
    System.out.println("Good thing you get paid in two days.");
    System.out.print("\nThe savings account balance is now $");
    System.out.printf("%.2f", savings.getBalance());
    System.out.print("\nThe checking account balance is now $");
    System.out.printf("%.2f", checking.getBalance());
    System.out.println("\nYou feel sad, but not to worry! Payday is soon!");
    System.out.println("************************************************");
    System.out.println("\nHappy Friday! Both your employer AND your side job ( ͡° ͜ʖ ͡°) paid you!");
    System.out.println();
    System.out.println("Let's put the job money in savings and put the other money in checking.");
    System.out.println();
    System.out.println("It seems that showing off on a certain profile was worth it!");
    System.out.println();
    System.out.println(
        "You also made a trip to the bank and figured out you could upgrade your bank account so it earns interest! You feel rich. Let's deposit some money.");
    System.out.println();
    checking.deposit(1000);
    savings.deposit(500);
    System.out.println("Wow, your side gig paid more than your actual job!");
    System.out.println();
    System.out.println("Let's see what interest would be like after 1 year. The rate is 10%. Not bad!");
    System.out.print("\nThe savings account balance before interest is $");
    System.out.printf("%.2f", savings.getBalance());
    System.out.print("\nThe checking account balance before interest is $");
    System.out.printf("%.2f", checking.getBalance());
    System.out.println();
    System.out.print("\nThe savings account balance after interest after 1 year at 10% interest would be $");
    System.out.printf("%.2f", (savings.figureInterest(10)));
    System.out.print("\nThe checking account balance after 1 year at 10% interest would be $");
    System.out.printf("%.2f", (checking.figureInterest(10)));
  }
}