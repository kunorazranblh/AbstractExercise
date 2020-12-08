package abstractExercise;

abstract class Marks{
	   abstract void getPercentage();
	}
	class A extends Marks{
	   double percentage, Mark1, Mark2, Mark3;
	   
	   A(double m1, double m2, double m3){
	      this.Mark1=m1;
	      this.Mark2=m2;
	      this.Mark3=m3;
	   }
	   
	   void getPercentage(){
	      percentage = (Mark1 + Mark2 + Mark3)/300*100;
	      System.out.println("Class A percentage: "+ percentage +"%");
	   }
	}
	class B extends Marks {
	   double percentage, Mark1, Mark2, Mark3, Mark4;
	   
	   B(double m1, double m2, double m3, double m4){
	      this.Mark1=m1;
	      this.Mark2=m2;
	      this.Mark3=m3;
	      this.Mark4=m4;
	   }
	   
	   void getPercentage(){
	      percentage = (Mark1 + Mark2 + Mark3 + Mark4)/400*100;
	      System.out.println("Class B percentage : "+ percentage +"%");
	   }
	}
	public class Que3 {
	   public static void main(String[] args) {
	      
	      A obj = new A(80,95,80);
	      obj.getPercentage();
	      B obj1 = new B(55,80,95,85);
	      obj1.getPercentage();
	   }
	}
