public class Abecedarian{
	public static void main (String[]args){
		isAbecedarian("hello");
	}
	public static boolean isAbecedarian(String a){
		int b = 0;
		for(int i=0; i<a.length()-1; i++){
			if(a.charAt(i)>a.charAt(i+1)){
				b=1;
			}
		}
		if (b>0){
			return false;
		} else {
			return true;
		}
	}
}
