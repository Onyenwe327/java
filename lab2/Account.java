public class Account extends Accountdemo{
    private String accountNum;
    private String deposit;
    private String withdraw;
    private double balance;
    public Account(){}
    public Account(String accountNum){
    }
    public Account(String accountNum , double balance , String deposit , String withdraw){
    this.accountNum = accountNum;
    this.balance = balance;
    this.deposit = deposit;
    this.withdraw = withdraw;
    }
    public double getBalance(){
      return this.balance;}
    public String getInfo(){
      return "Account Number:" + this.accountNum +  "Balance:"+ this.balance+  "Deposit:"  +this.deposit+ "Withdraw:" +this.withdraw;
    }
    }