package strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class stack {

	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Set<String> s1 = new HashSet<String>();  

		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  