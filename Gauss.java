public class Gauss{
	public static void main (String[] args){
		System.out.print(gauss(45,3));
	}
	public static double gauss(double x, int n){
		double next = 1;
		double sum = 0;
		for(int i=0; i<n; i++){
			sum += next;
			next *= -x*x/(i+1);
		}
		return sum;
	}
}
