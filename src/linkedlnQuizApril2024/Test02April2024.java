package linkedlnQuizApril2024;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Test02April2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));
		Iterator i=list.iterator();
		Collections.reverse(list);
		Collections.sort(list);
		while(i.hasNext())
			System.out.println(i.next()+ "");

	}
}
