
public class solution {

	// Return the changed string
	public static String removeX(String input){

		if(input.length()==0){
			return input;
		}
		if(input.charAt(0)=='x'){
			String smalloutput=removeX(input.substring(1));
			return smalloutput;
		}else{
			String smalloutput= removeX(input.substring(1));
			return input.charAt(0)+smalloutput;
		}
	}
}
