
public class solution {

	// Return the updated string
	public static String addStars(String str) {
		// Write your code here
	
		
		if(str.length()==1 ||str.length()==0) {
			return str;
		}
		if(str.charAt(0)==str.charAt(1)) {
			String newStr=addStars(str.substring(1));
			return str.charAt(0)+"*"+newStr;
		}else {
			String newStr=addStars(str.substring(1));
			return str.charAt(0)+newStr;
		}
		
	}

	}
