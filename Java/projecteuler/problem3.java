
public class third {

	public third() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prime = 600851475143.0;
		int divisor = 2;
		
		for (;;) {
			if (divisor>prime) {
				break;
			}
			if (prime%divisor ==0){
				prime/=divisor;
				System.out.println(divisor);
			}
			else {
				divisor++;
			}
		}

	}

}
