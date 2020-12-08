package abstractExercise;

abstract class Bank {
	   abstract void getBalance();  
	}
	class BankA extends Bank {
	   void getBalance(){
	      System.out.println("Bank A balance: $100");
	   }
	}
	class BankB extends Bank{
	   void getBalance(){
	      System.out.println("Bank B balance: $150");
	   }
	}
	class BankC extends Bank{
	   void getBalance(){
	      System.out.println("Bank C balance: $200");
	   }
	}

	public class Que2 {
	   public static void main(String[] args) {
	   BankA obj = new BankA();
	   BankB obj1 = new BankB();
	   BankC obj2 = new BankC();
	   obj.getBalance();
	   obj1.getBalance();
	   obj2.getBalance();
	   }
	   
	}
