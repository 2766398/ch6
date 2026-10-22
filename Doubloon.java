public class Doubloon{
	public static void main(String[]args){
		System.out.println(isDoubloon("bloon"));
	}
	public static boolean isDoubloon(String a){
		int count = 0;
		for(int i = 0; i<a.length(); i++){
			for(int j = 0; j<a.length(); j++){
				if(a.charAt(i)==a.charAt(j)){
					count++;
				}
			}
		if(count!=2){
			return false;
		}
	}
	return true;
}
}
