package vaibhu;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<String> tree= new TreeSet<String>();
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
