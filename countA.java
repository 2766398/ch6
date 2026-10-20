public class countA{
	public static void main(String [] args){
		System.out.println(counTA("aaa"));
		System.out.println(counTA("banana"));
	}
	public static int counTA(String a){
		int n = 0;
		for(int i = 1; i < a.length()-2; i++){
			if(a.charAt(i+1)!='a'&& a.charAt(i)=='a'&& a.charAt(i-1)!='a'){
				n++;
			}
		}
		if(a.charAt(0)=='a'){
			n++;
		}
		if(a.charAt(a.length()-1)=='a'){
			n++;
		}
		return n;
	}
}
