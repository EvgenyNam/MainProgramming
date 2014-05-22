
public class Start {

	public Start() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello 2");
		//FirstClass testObject = new FirstClass();
		
		int upperLimit = 1000;
		int sum = 0;
		int three = 0;
		int five = 0;
		
		//increment sum by 3 in the first loop, if it's <= than the upper limit, AND %5 == 0 , then add it to sum
		//2nd, separate loop, just go through all 5's without checking
		
		for(;;){
			three+=3;
			if (three>=upperLimit){
				break;
			}
			
			if (three%5!=0) {
				sum+=three;
			}
		}
		for (;;){
			five+=5;
			if (five>=upperLimit){
				break;
			}
		
			sum+=five;
		}
		
		System.out.println(sum);
	}
	
	public class FirstClass {
		int firstProperty;
		int secondProperty;
		
		public FirstClass() {
			firstProperty = 0;
			secondProperty = 0;
		}
		
		public void setFirstProperty(int value) {
			this.firstProperty = value;
		}
		
		public void setSecondProperty(int value) {
			this.secondProperty = value;
		}
	}
}

