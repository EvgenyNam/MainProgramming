import java.util.ArrayList;

public class DFSandBFS {

	//Use these for iterative implementation
	static ArrayList <TreeNodeSearch> visitedList = new ArrayList<TreeNodeSearch>();
	static ArrayList <TreeNodeSearch> queueList = new ArrayList<TreeNodeSearch>();

	public DFSandBFS() {

	}

	public static void main(String[] argc) {

		//Just create a simple base case to test
		TreeNodeSearch starting = new TreeNodeSearch('W');
		starting.left = new TreeNodeSearch('V');
		starting.right = new TreeNodeSearch('A');

		starting.left.left = new TreeNodeSearch('B');
		starting.left.right = new TreeNodeSearch('C');

		starting.right.left = new TreeNodeSearch('D');
		starting.right.right = new TreeNodeSearch('E');

		System.out.println("Recursive BFS: ");
		RecursiveBFS(starting);
		System.out.println("\n");
		System.out.println("Recursive DFS: ");
		RecursiveDFS2(starting);
	}

	//Simple recursive BFS which uses the call stack
	static void RecursiveBFS(TreeNodeSearch start) {
		System.out.print(start.value + " ");

		if (start.left!=null)
			queueList.add(start.left);
		if (start.right!=null)
			queueList.add(start.right);

		if (!queueList.isEmpty()){
			TreeNodeSearch temp = queueList.get(0);
			queueList.remove(0);
			RecursiveBFS(temp);
		}
	}

	//Simple recursive DFS which uses the call stack
	static void RecursiveDFS2( TreeNodeSearch start) {
		System.out.print(start.value + " ");
		start.visited = true;

		if (start.left!=null && !start.left.visited) {
			queueList.add(0, start.left);
			RecursiveDFS2( start.left );
		}
		if (start.right!=null && !start.right.visited) {
			queueList.add(0, start.right);
			RecursiveDFS2( start.right);
		}

	}

}

//Im gonna use this class for Binary Tree Nodes
//Visited is not needed in this case, try in iterative
class TreeNodeSearch {
	TreeNodeSearch left, right;
	Boolean visited = false;
	char value;

	TreeNodeSearch(char incomingValue) {
		value = incomingValue;
	}

}
