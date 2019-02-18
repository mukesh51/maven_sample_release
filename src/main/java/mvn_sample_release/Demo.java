package mvn_sample_release;

public class Demo {
	
	 public static void main(String args[]) {
	      
	        System.out.println("Testing Maven Release Current Version is "+
	                Demo.class.getPackage().getImplementationVersion());
	 }
	
	 public String sayHello() {
		 return "Hello World -- Mukesh";
	 }
	 
	 public int getYear() {
		 return 2019;
	 }
}
