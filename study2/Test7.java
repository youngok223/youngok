package study2;

public class Test7 {

	public static void main(String[] args) {
		
		int a = 1;
		++a; // 2
		a++; // 3
		
		int b = 1;
		int c = ++b;//전위연산;
		System.out.println(b+","+c); // 2,2
		
		int d = 1;
		int e = d++;//후위연산;
		System.out.println(d+","+e); //2,1
	}

}
