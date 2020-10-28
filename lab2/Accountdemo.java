public class Accountdemo{
    public static void main(String args[]){
        String accountNum="504046771";
		double balance=99999;
		String deposit="1000 ";
		String withdraw="1000";
		Account account = new Account(accountNum, balance, deposit, withdraw);
    System.out.println(account.getBalance());
    System.out.println(account.getInfo());}
  }
