public class Scrabble {
    public static void main(String[] args) {
        System.out.println(canSpell("helewriuuht", "hero"));
    }
    public static boolean canSpell(String a, String word) {
		for(int i = 0; i<word.length(); i++){
			char letter = word.charAt(i);
			if(counter(letter, word)>counter(letter, a)){
				return false;
			}
		}
		return true;
	}
    public static int counter(char b, String a) {
        int number = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                number++;
            }
        }
        return number;
    }
}
