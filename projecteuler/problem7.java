
public class problem7 {

	public problem7() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int desiredNumber = 10001;
		for (int i=2;i<=999999;i++){
			boolean prime = true;
			for (int j=2;j<i;j++){
				if (i%j ==0) {
					prime = false;
				}
			}
			
			if (prime) {
				counter++;
				if (counter==desiredNumber){
					System.out.println(i);
					break;
				}
			}
		}

	}

}
