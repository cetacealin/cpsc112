import java.util.Scanner;
public class CreditCard {

  private static final double baseRate = 0.05;
  private static int[] lastAccountNumber = {9,9,9,9,9,9,9};
  private static int counter=0;
  private String accountholder;
  private int[] accountnumber= new int[7];
  private int creditScore;
  private double rate;
  private double balance;
  private double creditLimit;
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
	  
  }
  public CreditCard (String _accountholder, int _creditScore)
  {
    accountholder = _accountholder;
    creditScore = _creditScore;

    balance = 0;

    if (_creditScore <= 300)
    {
      rate = baseRate + 0.10;
      creditLimit = 1000;
    }
    else if (_creditScore <= 500 && _creditScore > 300)
    {
      rate = baseRate + 0.07;
      creditLimit = 3000;
    }
    else if (_creditScore <= 700 && _creditScore > 500)
    {
      rate = baseRate + 0.04;
      creditLimit = 7000;
    }
    else
    {
      rate = baseRate + 0.01;
      creditLimit = 15000;
    }
     counter++;
     int temp=counter;
     if (counter>9999999) {
    	 System.out.println("Sorry we run out of account");
     }
     
     else  {
    accountnumber[6]=temp%10;
    temp=temp/10;
    accountnumber[5]=temp%10;
    temp=temp/10;
    accountnumber[4]=temp%10;
    temp=temp/10;
    accountnumber[3]=temp%10;
    temp=temp/10;
    accountnumber[2]=temp%10;
    temp=temp/10;
    accountnumber[1]=temp%10;
    temp=temp/10;
    accountnumber[0]=temp%10;
    }
  }
  public void makePurchase() {
	 double purchase=input.nextDouble();
	 if (balance> creditLimit) {
		 System.out.println("Insufficient balance can not make any transaction, please make the payment first");
		 }
  
  	else if(purchase + balance > creditLimit) 
    {
     do {
      System.out.println("Transaction denied: Insufficient credit limit.");
      System.out.println("Please try again: ");
      purchase=input.nextDouble();
         } while ((purchase + balance) > creditLimit);
     balance += purchase;
    }
  	else {
      balance += purchase;
  	}
}

  public void makePayment(){
	  double payment=input.nextDouble();
    if (payment >= balance){
      creditScore += 10;
      if (creditScore<= 500 && creditScore > 300) {
    	  rate = baseRate + 0.07;
          creditLimit = 3000;
      }
      else if (creditScore <= 700 && creditScore > 500){
        rate = baseRate + 0.04;
        creditLimit = 7000;
      }
      else if (creditScore>700){
        rate = baseRate + 0.01;
        creditLimit = 15000;
      }
      if (payment > balance) {
      System.out.println("Your payment exceeds your balance of $" + (payment - balance));
      
      }
      balance = 0;
    }
    else if (payment < 0.10 * balance)
    {
      balance -= payment;
      System.out.println("Your interest rate has increased by 1%");
      rate += 0.01;
    }
    else {
    	balance -= payment;
    }
  }
  public void raiseRate(double newRate) //Raises rate by a given percentage
  {
    rate += newRate;
  }

  public void raiseLimit(double newLimit) //Raises account holder's limit by a given amount
  {
    creditLimit += newLimit;
  }
  public double calculateBalance()
  {
	  balance = balance + (balance * (rate / 12));
	  return balance ;
  }
  public void toStrings() {
	  System.out.println("Account holder's name is :"+accountholder);
	  System.out.println("Account number is :"+"****"+accountnumber[4]+accountnumber[5]+accountnumber[6]);
	  System.out.println("Account balance is :"+balance);
	  System.out.println("Account limit is :"+creditLimit);
	  
  }
}
