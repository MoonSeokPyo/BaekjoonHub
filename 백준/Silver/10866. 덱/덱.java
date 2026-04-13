import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
//		push_front X: 정수 X를 덱의 앞에 넣는다.
//		push_back X: 정수 X를 덱의 뒤에 넣는다.
//		pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 덱에 들어있는 정수의 개수를 출력한다.
//		empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//		front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String cmd;
		int input, size;
		Node head = null, tail = null, temp;
		for (int i = 0; i < n; i++) {
			cmd = sc.next();
			if (cmd.equals("push_front")) {
				input = sc.nextInt();
				if(head == null) {
					head = new Node(input);
					tail = head;
				} else {
					temp = head;
					head = new Node(input);
					head.next(temp);
					temp.prev(head);
				}
				
			}
			else if(cmd.equals("push_back")) {
				input = sc.nextInt();
				if(tail == null) {
					tail = new Node(input);
					head = tail;
				} else {
					temp = tail;
					tail = new Node(input);
					tail.prev(temp);
					temp.next(tail);
				}
			}
			else if(cmd.equals("pop_front")) {
				if(head != null) {
					System.out.println(head.data);
					head = head.next;
					if(head != null)
						head.prev = null;
					else
						tail = null;
				} else
					System.out.println(-1);
			}
			else if(cmd.equals("pop_back")) {
				if(tail != null) {
					System.out.println(tail.data);
					tail = tail.prev;
					if(tail != null)
						tail.next = null;
					else
						head = null;
				} else
					System.out.println(-1);
			}
			else if(cmd.equals("size")) {
				size = 0;
				if(head != null) {
					temp = head;
					while(temp != null) {
						temp = temp.next;
						size++;
					}
				}
				System.out.println(size);
			}
			else if(cmd.equals("empty")) {
				if(head == null)
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(cmd.equals("front")) {
				if(head != null)
					System.out.println(head.data);
				else
					System.out.println(-1);
			}
			else if(cmd.equals("back")) {
				if(tail != null)
					System.out.println(tail.data);
				else
					System.out.println(-1);
				
			}
			
		}
		
	}
	
}

class Node{
	int data;
	Node next = null;
	Node prev = null;
	Node(int data){
		this.data = data;
	}
	void next(Node node) {
		this.next = node;
	}
	void prev(Node node) {
		this.prev = node;
	}
}