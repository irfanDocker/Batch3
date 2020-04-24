package homework;

public class Practice {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = (a < b) ? 3000000 : 22222;
		
		int d =0;
		
		if(a < b) {
			d= 3000000;
		}else {
			d= 22222;
		}
		
		System.out.println(d);
	}
	
}
