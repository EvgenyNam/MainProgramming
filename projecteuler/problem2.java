
public class second {

	public second() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		int first = 1;
		int second = 2;
		int sum = 2;
		int third;
		
		
		for (;;) {
			third = first + second;
			first = second;
			second = third;
			
			if (third>4000000) {
				break;
			}
			
			if (third%2==0){
				sum+=third;
			}
		}
		System.out.println(sum);
	}

}
