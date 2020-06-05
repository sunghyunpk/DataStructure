package Lab04;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class keyValue{
    String key;
    int value;
    public keyValue(String key, int value) {
    	this.key = key;
    	this.value = value;
    }
    public int getValue() {
    	return this.value;
    }
    public String getKey() {
    	return this.key;
    }
    public void setValue(String key) {
    	this.key = key;
    }
}

public class DNA {
	LinkedList<keyValue>[] table;
	int hash_characters;
	int dna_size;
	int fill = 0;
	List<String> DNA = new ArrayList<>();
	
	
	public void solution(int hash_characters) {
		int dna_size = (int)Math.pow(4, hash_characters);
		table = new LinkedList[dna_size];
		
		for(int i = 0; i < dna_size; i++) {
			table[i] = new LinkedList<keyValue>();
		}
		this.hash_characters = hash_characters;
		this.dna_size = dna_size; 
		
		
		
	}
	public int hash(String s) {
		int hashcode = 0 ;
		for (int i = 0; i<hash_characters; i++) {
			char c = s.charAt(i);
			int num = 0;
			if (c == 'A') {
				num = 0;
			}
			if (c == 'T'){
				num = 1;
						
			}
			if (c == 'C') {
				num = 2;
						
			}
			if (c == 'G') {
				num = 3;
			}
			hashcode += (int)num*(Math.pow(4,i));
		}
		return hashcode;
	}
	public void put(keyValue k) {
		
	    if(table[hash(k.key)].isEmpty()) {
			/*table[hash(k.key)] = new LinkedList<keyValue>();
			table[hash(k.key)].add(k);*/
			fill++;
	}
	    table[hash((k.key))].add(k);
	}
	
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		int dna_length = s.nextInt();
		int hash_char = s.nextInt();
		String dna = s.next();
		DNA test = new DNA();
		test.solution(hash_char);
		
		
		for (int i = 0; i <= dna.length() - dna_length; i++ ) {
			String subset = dna.substring(i,dna_length+i);
			test.put(new keyValue(subset, i));
			
		}
		
		System.out.println(test.dna_size + " " + test.fill);
			
	}
		
	}

