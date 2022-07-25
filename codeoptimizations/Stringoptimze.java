
//Optimize using the String optimization techniques

public class Stringoptimze {
	
	public String stringAppendLoop() {
		String s = "";
		 for (int i = 0; i < 100000; i++) {  
			 if(s.length()>0)
				 s + =", ";
	          s+="bar";s
	        }  
		 return s;
	}

	public static void main(String[] args) {
		
	}

}
