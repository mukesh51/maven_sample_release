package mvn_sample_release;

public class Demo {
	
	 public static void main(String args[]) {
	      
	        System.out.println("Testing Maven Release Current Version is "+
	                Demo.class.getPackage().getImplementationVersion());
	 }
	
	 public String sayHello() {
		 return "Good One";
	 }
	 
	 public int getYear() {
		 return 2019;
	 }
}
//https://blog.codecentric.de/en/2015/04/increment-versions-maven-build-helper-versions-plugin/
//https://axelfontaine.com/blog/dead-burried.html
//https://blog.codecentric.de/en/2015/01/continuous-delivery-microservices-jenkins-job-dsl-plugin/
// mvn build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion} versions:commit
