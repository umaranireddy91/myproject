package Java_Class1;

public class TestClass2 {
	// Created myMethod with return type void
        static void myMethod(String fname) {
	    System.out.println(fname + " Empala");
	    
	    
	  }
	
	// Created another Method with the name of checkMyAge
	    static void checkMyAge(int age) {
		if(age<18) {
			System.out.println("I'm not old enough to use my voting power");
			
		}else {
			System.out.println("I'm old enough to use my voting power");
			
		}
	 }
		
	    // Created myMethod1 with return type String
		static String myMethod1(String x, String y) {
		    return x + y;
		  }
		
	
		// Calling all the above methods in main method
	  public static void main(String[] args) {
		  int i = 0;
		    while (i < 10) {
		      System.out.println(i);
		      i++;
		    }  
	    myMethod("uma"); // myMethod calling
	    myMethod("Madhav"); // myMethod
	    myMethod("Madhavi"); //myMethod
	    checkMyAge(25); // checkMyAge calling
	    
	    System.out.println((myMethod1("uma", "Rani"))); 
	    System.out.println("this is the message to check the montreal branch in my git server");
	  }
	  
	  
	 
}
