import java.util.ArrayDeque;
import java.util.Queue;


public class Equals {
	
	String s1="vaibhu";
	String s2="vaibhu";
	String s3= new String("vaibhu");
	
	public boolean test(){
		return s1==s2;
	}
	public boolean test1(){
		return s1==s3;
	}
	public boolean test2(){
		return s1.equals(s2);
	}
	public boolean test3(){
		return s1.equals(s3);
	}
	
	
	public static void main(String[] args) {

		Equals e= new Equals();
		System.out.println(e.test());
		System.out.println(e.test1());
		System.out.println(e.test2());
		System.out.println(e.test3());
		
		 Queue<Integer> queue = new ArrayDeque<>();

		    queue.add(1);
		    queue.add(2);
		    queue.add(3);

		    while (!queue.isEmpty()) {
		        System.out.println(queue.remove());// prints 1 2 3
		    }
	}
}
