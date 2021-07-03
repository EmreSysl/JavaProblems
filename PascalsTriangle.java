package LeetCode;

import java.util.*;

public class PascalsTriangle {

	public static void main(String[] args) {
		PascalsTriangle a = new PascalsTriangle();
		int numRows = 2;
		System.out.println(a.generate(numRows));
	}
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>();
        for(int i=1; i<=numRows; i++) {
        	List<Integer> c = new ArrayList<>();
        	for(int j=0; j<i; j++) {
        		if(j==0 || j==i-1) c.add(1);
        		else c.add(a.get(i-2).get(j)+a.get(i-2).get(j-1));
        	}
        	a.add(c);
        }
        return a;
    }

}
