
public class problem14 {

	public problem14() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//113383
		for (int i=113384; i<1000000; i++) {
			int starting = i;
			System.out.println(starting);
			
			while(starting!=1) {
				if (starting%2!=0) {
					//odd
					starting = 3*starting+1;
				}
				else {
					starting/=2;
				}
				
				//System.out.print(starting + " ");
			}
		}
		
		System.out.println("done");

	}

}
