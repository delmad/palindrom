
public class Palindrom {

	public static void main(String[] args) {
	String trueResult =  " ist ein Palindrom.";
	String falseResult =  " ist kein Palindrom.";
     String[] test_strings = {"Damad", "Lagerregal", "Die Liebe fleht: Helfe bei Leid!","Das ist kein Palindrom!"};
	
     for(String oneteststring:test_strings){
    	 if(isPalindrom(oneteststring)){
    		 System.out.println(oneteststring + trueResult);
    	 } else{
    		 System.out.println(oneteststring + falseResult);
    	 }
     }
	
	} 
	public static boolean isPalindrom(String s) {
		s = s.toLowerCase();
		s = s.replaceAll(" ", "");
		s = s.replaceAll(":" , "");
		s = s.replaceAll("!" , "");
		String revers ="" ; 
		for(int i = s.length()-1; i>= 0; i--){
			revers += s.charAt(i);
			
		}
		return s.equals(revers);
		
		
	}
	 

}
