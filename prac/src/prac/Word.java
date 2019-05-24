package prac;

import java.util.*;

public class Word {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word");
		String word = sc.nextLine();
		String[] split = word.split("");
		List<String> arraylist = new ArrayList<String>();
		arraylist.add(split[0]);
		arraylist.add(split[1]);
		System.out.println(arraylist);
		
		LinkedList<String> l = new LinkedList<String>(arraylist);
		l.add(split[0]);
		l.add(split[1]);

		l.removeLast();
		
		 
		Collections.sort(l);
		System.out.println(l);

	
		
	}



}
