public class Roots{
	public static void main (String[] args){
		System.out.print(sqrt(25));
	}
	public static double sqrt(double n){
		double a = n;
		double b = a/2;
		double c = (b+a/b)/2.0;
		while(Math.abs(b-c)>=0.0001){
			b = (b+a/b)/2.0;
			c = (b+a/b)/2.0;
		}
		return b;
	}
}
