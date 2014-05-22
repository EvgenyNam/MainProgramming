package projecteuler;
import java.io.*;
import java.lang.Math;

public class problem13 {

	public problem13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			InputStream hello = new FileInputStream("C:/Users/mevge_000/workspace/projecteuler/src/projecteuler/data.txt");
			int size = hello.available();
			
			int words = 100;
			int lengthWord = 50;
			int howManyFirstDigits = 10;
			int keeper = 0;
			
			char[][] matrix = new char[words][lengthWord];
			
			/*
			for (int i =0;i<size;i++){
				System.out.print((char)hello.read());
				System.out.print(".");
			}
			System.out.println(size);
			*/
			for(int i=0; i<words; i++){
				for(int j=0; j<lengthWord; j++){
					matrix[i][j] = (char)hello.read();
					
					if (j==lengthWord-1) {
						hello.read();
						hello.read();
					}
				}
			}
			
			//System.out.println(matrix[1][2]);
			
			int carry=0;
			Node start = new Node(0);
			
			for (int j=lengthWord-1; j>=0; j--) {
				int sum = 0;
				//System.out.println(sum);
				sum+=carry;
				
				for (int i=0;i<words;i++) {;
				
					//Character to integer conversion, has to be from ASCII to Integer
					sum+=(int)matrix[i][j] - 48;
				}
				carry = (int)Math.floor(sum/10);
				start.appendToEnd(sum%10);
				//System.out.println("appending to end: "+ sum%10);
			}
			
			//To account for the very last addition
			if (carry!=0) {
				start.appendToEnd(carry);
				System.out.println("last carry: "+carry);
			}
			
			Node ref = start;
			Node reverse = new Node(0);
			
			while(ref.next!=null) {
				while(ref.next.next!=null){
					ref = ref.next;
				}
				reverse.appendToEnd(ref.next.data);
				ref.next = null;
				ref = start;
			}
			
			while(reverse!=null){
				if(keeper==0) {
					reverse = reverse.next;
					keeper++;
				} 
				else {
					if (keeper-1<howManyFirstDigits) {
						System.out.print(reverse.data + " ");
						reverse = reverse.next;
						keeper++;
					}
					else {
						break;
					}
				}
				
			}
			
		} catch(IOException e) {
			System.out.println("There's no such file");
		}
		
		
		//System.out.println("hello");
		// TODO Auto-generated method stub

	}

}

class Node {
	int data;
	Node next;
	
	Node(int newData){
		data = newData;
	}
	
	void appendToEnd(int toAdd){
		Node someNode = this;
		while(someNode.next!=null) {
			someNode = someNode.next;
		}
		
		someNode.next = new Node(toAdd);
	}
}

