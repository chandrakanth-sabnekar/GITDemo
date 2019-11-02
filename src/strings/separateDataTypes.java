package strings;

import java.util.ArrayList;
import java.util.Iterator;

public class separateDataTypes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input: "ABCD1223EFGH4567ABC"
		// Output: ABCDEFGHABC 12234567
		// 65-90    48-57
		ArrayList<String> alStr = new ArrayList<String>();
		ArrayList<Integer> alInt = new ArrayList<Integer>();
		//Iterator itr = alStr.iterator();
		//itr.hasNext();
		char ch;
		int temp,s2;
		String s1;
		String str = "ABCD1223EFGH4567ABC";
		char [] chArr = str.toCharArray();
		for(int i=0;i<chArr.length;i++) {
			ch = chArr[i];
			temp = (int)ch;
			if(temp>=65 && temp<=90) {
				s1 = String.valueOf(ch);
				alStr.add(s1);				
			}
			if(temp>=48 && temp<=57) {
				s2 = Character.getNumericValue(temp);
				alInt.add(s2);			
			}				
		}
			System.out.print(alStr);
			System.out.print(alInt);
	}
}
