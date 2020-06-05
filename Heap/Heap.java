import java.util.Scanner;



public class Heap {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int length_heap = scan.nextInt();
		int[] heap_array = new int[length_heap+1];   
		for(int i = 1; i <= length_heap; i++) {	
			int tmp = scan.nextInt();
			heap_array[i] = tmp;
		}
		for(int j = 1; j <= length_heap; j++) {
		    String str = "node " + j +": " ;
		    int left_node = 2*j;
		    int right_node = 2*j +1; 
		    int parent = j/2;
		    
		    str += "key = " + heap_array[j];
			if (j != 1) {
			   str += " parent key = " + heap_array[parent] + "," ; 
		    }
			if (left_node <= length_heap) {
				str += " left key = " + heap_array[left_node] + ",";
			}
			if (right_node <= length_heap) {
				str += " right key = " + heap_array[right_node] + ",";
			}
			System.out.println(str);
		}
	}
}
