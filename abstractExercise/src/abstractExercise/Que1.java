package abstractExercise;

abstract class Parents {
	   abstract void message();
	   void printMessage(){
	      System.out.println("Message");
	   }
	}
	class studentA extends Parents {
	   void message(){
	      System.out.println("This is first subclass");
	   }
	  
	}
	class studentB extends Parents{
	   void message(){
	      System.out.println("This is second subclass");
	   }
	}

	public class Que1 {
	   public static void main(String[] args) {
	      studentA obj = new studentA();
	      studentB obj1 = new studentB();
	      obj.message();
	      obj1.message();
	   }
	}