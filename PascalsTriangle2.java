package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

	public static void main(String[] args) {
		PascalsTriangle2 a = new PascalsTriangle2();
		int numRows = 1;
		System.out.println(a.getRow(numRows));
	}
	
	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> a = new ArrayList<>();
        for(int i=1; i<=rowIndex+1; i++) {
        	List<Integer> c = new ArrayList<>();
        	for(int j=0; j<i; j++) {
        		if(j==0 || j==i-1) c.add(1);
        		else c.add(a.get(i-2).get(j)+a.get(i-2).get(j-1));
        	}
        	a.add(c);
        }
        return a.get(rowIndex);
    }

}
