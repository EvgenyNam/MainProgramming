
public class problem6 {

	public problem6() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumSquares = 0;
		int squareSum = 0;
		
		System.out.println("Hello");
		
		for (int i = 1; i<=100; i++){
			sumSquares += i*i;
			squareSum += i;
		}
		
		squareSum*=squareSum;
		
		System.out.println(squareSum-sumSquares);
		

	}

}
