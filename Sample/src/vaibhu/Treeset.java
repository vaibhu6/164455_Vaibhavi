package vaibhu;
import java.util.ArrayList;


public class Treeset {
	public static void main(String[] args) {
		ArrayList<String> tree= new ArrayList<String>();
		tree.add("20");
		tree.add("10");
		tree.add("40");
		tree.add("30");

		for(String s:tree)
			System.out.println(s);
		
		tree.add("10");
		for(String s:tree)
			System.out.println(s);
		
	}		
}
