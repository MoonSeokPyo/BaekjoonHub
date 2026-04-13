import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.nextLine();
//		int[] cmd;
//		int cmd, input;
//		Node02 head = null, tail = null, temp;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] cmd;
		Node02 head = null, tail = null, temp;
		int size = 0;
		for (int i = 0; i < n; i++) {
			cmd = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
			
			if(cmd[0] == 1) {
				if(head == null) {
					head = new Node02(cmd[1]);
					tail = head;
				} else {
					temp = head;
					head = new Node02(cmd[1]);
					head.next = temp;
					temp.prev = head;
				}
				size++;
			}
			else if(cmd[0] == 2) {
				if(tail == null) {
					tail = new Node02(cmd[1]);
					head = tail;
				} else {
					temp = tail;
					tail = new Node02(cmd[1]);
					tail.prev = temp;
					temp.next = tail;
				}
				size++;
			}
			else if(cmd[0] == 3) {
				if (head != null) {
//					System.out.println(head.data);
					bw.write(head.data + "\n");
//					bw.newLine();
					head = head.next;
					if (head != null) 
						head.prev = null;
					else
						tail = head;
					size--;
				} else {
//					System.out.println(-1);
					bw.write(-1 + "\n");
//					bw.newLine();
				}
					
			}
			else if(cmd[0] == 4) {
				if (tail != null) {
//					System.out.println(tail.data);
					bw.write(tail.data + "\n");
//					bw.newLine();
					tail = tail.prev;
					if(tail != null)
						tail.next = null;
					else
						head = tail;
					size--;
				} else {
//					System.out.println(-1);
					bw.write(-1 + "\n");
//					bw.newLine();
				}
			}
			else if(cmd[0] == 5) {
				
//				if(head != null) {
//					temp = head;
//					while(temp != null) {
//						size++;
//						temp = temp.next;
//					}
//				}
				
//				System.out.println(size);
				bw.write(size + "\n");
//				bw.newLine();
			}
			else if(cmd[0] == 6) {
				if(head == null) {
//					System.out.println(1);
					bw.write(1 + "\n");
//					bw.newLine();
				}
				else {
//					System.out.println(0);
					bw.write(0 + "\n");
//					bw.newLine();
				}
			}
			else if(cmd[0] == 7) {
				if (head != null) {
//					System.out.println(head.data);
					bw.write(head.data + "\n");
//					bw.newLine();
				}
				else {
//					System.out.println(-1);
					bw.write(-1 + "\n");
//					bw.newLine();
				}
			}
			else if(cmd[0] == 8) {
				if (tail != null) {
//					System.out.println(tail.data);
					bw.write(tail.data + "\n");
//					bw.newLine();
				}
				else {
//					System.out.println(-1);
					bw.write(-1 + "\n");
//					bw.newLine();
				}
			}
			
//			switch (cmd) {
//			case 1:
//				input = sc.nextInt();
//				if(head == null) {
//					head = new Node02(input);
//					tail = head;
//				} else {
//					temp = head;
//					head = new Node02(input);
//					head.next = temp;
//					temp.prev = head;
//				}
//				break;
//			case 2:
//				input = sc.nextInt();
//				if(tail == null) {
//					tail = new Node02(input);
//					head = tail;
//				} else {
//					temp = tail;
//					tail = new Node02(input);
//					tail.prev = temp;
//					temp.next = tail;
//				}
//				break;
//			case 3:
//				if (head != null) {
//					System.out.println(head.data);
//					head = head.next;
//					if (head != null) 
//						head.prev = null;
//					else
//						tail = head;
//				} else
//					System.out.println(-1);
//				break;
//			case 4:
//				if (tail != null) {
//					System.out.println(tail.data);
//					tail = tail.prev;
//					if(tail != null)
//						tail.next = null;
//					else
//						head = tail;
//				} else
//					System.out.println(-1);
//				break;
//			case 5:
//				int size = 0;
//				if(head != null) {
//					temp = head;
//					while(temp != null) {
////						System.out.println("temp.data = "+temp.data);
//						size++;
//						temp = temp.next;
//					}
//				}
//				System.out.println(size);
//				break;
//			case 6:
//				if(head == null)
//					System.out.println(1);
//				else
//					System.out.println(0);
//				break;
//			case 7:
//				if (head != null)
//					System.out.println(head.data);
//				else
//					System.out.println(-1);
//				break;
//			case 8:
//				if (tail != null)
//					System.out.println(tail.data);
//				else
//					System.out.println(-1);
//				break;
//
//			default:
//				break;
//			}
			
//			switch (cmd[0]) {
//			case 1:
//				if(head == null) {
//					head = new Node02(cmd[1]);
//					tail = head;
//				} else {
//					temp = head;
//					head = new Node02(cmd[1]);
//					head.next = temp;
//					temp.prev = head;
//				}
//				break;
//			case 2:
//				if(tail == null) {
//					tail = new Node02(cmd[1]);
//					head = tail;
//				} else {
//					temp = tail;
//					tail = new Node02(cmd[1]);
//					tail.prev = temp;
//					temp.next = tail;
//				}
//				break;
//			case 3:
//				if (head != null) {
//					System.out.println(head.data);
//					head = head.next;
//					if (head != null) 
//						head.prev = null;
//					else
//						tail = head;
//				} else
//					System.out.println(-1);
//				break;
//			case 4:
//				if (tail != null) {
//					System.out.println(tail.data);
//					tail = tail.prev;
//					if(tail != null)
//						tail.next = null;
//					else
//						head = tail;
//				} else
//					System.out.println(-1);
//				break;
//			case 5:
//				int size = 0;
//				if(head != null) {
//					temp = head;
//					while(temp != null) {
////						System.out.println("temp.data = "+temp.data);
//						size++;
//						temp = temp.next;
//					}
//				}
//				System.out.println(size);
//				break;
//			case 6:
//				if(head == null)
//					System.out.println(1);
//				else
//					System.out.println(0);
//				break;
//			case 7:
//				if (head != null)
//					System.out.println(head.data);
//				else
//					System.out.println(-1);
//				break;
//			case 8:
//				if (tail != null)
//					System.out.println(tail.data);
//				else
//					System.out.println(-1);
//				break;
//
//			default:
//				break;
//			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
class Node02 {
	int data;
	Node02 prev = null;
	Node02 next = null;
	Node02(int data){
		this.data = data;
	}
}