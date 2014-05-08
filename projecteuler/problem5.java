
public class fifth {

	public fifth() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		boolean forLoop;
		
		int number = 1;
		for(;;){
			forLoop = true;
			for (int i=1;i<=20;i++){
				if (number%i != 0) {
					forLoop = false;
					break;
				}
			}
			if (forLoop) {
				break;
			}
			else {
				number++;
				//System.out.println(number);
			}
		}
		
		System.out.println(number);

	}

}
