public class Scrabble{
	public static void main(String[]args){
		System.out.println(canSpell("hello", "hell"));
	}
	public static boolean canSpell(String a, String n){
		int count = 0;
			for(int q = 0; q<n.length(); q++){
				for(int i = 0; i<a.length(); i++){
					if(n.charAt(q)==a.charAt(i)){
						count++;
					}
				}
				if(count==0){
					return false;
			}
		}
		return true;
	}
}
