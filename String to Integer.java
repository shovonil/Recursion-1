
public class solution {

	public static int convertStringToInt(String str){
		
		if(str.length()==1){
			int a=str.charAt(0)-48;
			return a;
		}
		int b= convertStringToInt(str.substring(1));
		return (str.charAt(0)-48)*((int) Math.pow(10, str.length()-1))+b;


	}
}
