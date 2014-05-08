
public class fourth {

	public fourth() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		System.out.println("Hello");
		String number;
		
		int largest =0;
		int length;
		int shortLength;
		int temp;
		String candidate;
		
		for (int i=100;i<1000;i++){
			for (int j=100;j<1000;j++){
				
				temp = i*j;
				candidate = Integer.toString(temp);
				number = Integer.toString(temp);
				length = number.length();
				shortLength = length/2;
				
				if ((temp)>largest && isPalindrome(number, length, shortLength)){
					largest = temp;
				}
			}
		}
		System.out.println(largest);
	}
	
	static boolean isPalindrome(String toCheck, int length, int shortLength){
		int firstChar = shortLength;
		int secondChar = length;
		
		for (int i=0;i<firstChar;i++) {
			if (toCheck.charAt(firstChar-1-i)!=toCheck.charAt(secondChar-firstChar+i)) {
				return false;
			}
		}
		return true;
	}

}
