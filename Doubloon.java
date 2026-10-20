public class Doubloon{
	public static void main(String[]args){
		System.out.println(isDoubloon("bagreh"));
	}
	public static boolean isDoubloon(String a){
		int count = 0;
		for(int i = 0; i<=a.length(); i++){
			for(int j = 0; j<=a.length(); j++){
				if(a.charAt(i)==a.charAt(i+j)){
					count++;
				}
			}
			if(count!=2){
				return false;
			}
		return false;
	}
}

b a n a n a ""
0 1 2 3 4 5 6
