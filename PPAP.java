import java.util.Scanner;
public class PPAP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "", b = "", c = "";
        System.out.println("line:");
        a = input.nextLine();
        b = a.substring(9,a.indexOf(","));
        c = a.substring(a.indexOf(",")+11);
        System.out.println(ppap(b, c));
	}
	public static String ppap(String a, String b){
		return("Uh!" + " " + a + " " + b + ".");
	}
}

//i have a x ,I h
//0123456789?x
