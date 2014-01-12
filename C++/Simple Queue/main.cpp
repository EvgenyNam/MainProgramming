#include <iostream>
#include <stdlib.h>

using namespace std;

class Node {
	public:
	int value;
	Node* next;

	Node (int toSet) {
		value = toSet;
	}
};

class Queue {
	public:
	Node* top = NULL;
	Node* bottom = NULL;

	void Enqueue(int toAppend) {
		if (top==NULL) {
			//Create a new instance, set both pointers to the new instance

			//****** NEW returns the address
			top = new Node(toAppend);
			bottom = top;

			cout << bottom->value << endl;
		}
		else {
			Node* temp = new Node(toAppend);
			top->next = temp;
			top = temp;

			//Clear useless reference, but pointers usually get removed automatically
			temp = NULL;

			cout << top->value << endl;
		}
	}

	int Dequeue() {
		//3 cases, top == bottom AND NOT NULL
		// top == bottom and both NULL
		// top != bottom
		if ((top==bottom) && top!=NULL) {
			int toReturn = top->value;
			delete top;

			top = NULL;
			bottom = NULL;
			return toReturn;
		}
		else if ((top==bottom) && top==NULL) {
			return -1;
		}
		else {
			int toReturn = bottom->value;
			Node* temp = bottom;
			bottom = bottom->next;
			delete temp;
			temp = NULL;
			return toReturn;
		}
		return 0;
	}

	//Write a method called enqueue in order ... traverses until finds a suitable spot to be placed in
};

int main()
{
	//Node okay(4);
	Queue queue;

	queue.Enqueue(4);
	queue.Enqueue(6);
	queue.Enqueue(10);

	cout<< queue.Dequeue() <<endl;
	cout<< queue.Dequeue() <<endl;
	cout<< queue.Dequeue() <<endl;
	cout<< queue.Dequeue() <<endl;

	//int something = rand() % 10;

    //cout << "Hello world!" << endl;
    //cout << okay.value << endl;
    return 0;
}

