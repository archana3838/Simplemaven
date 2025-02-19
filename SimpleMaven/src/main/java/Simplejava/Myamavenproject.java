package Simplejava;

public class Myamavenproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("to java class");
		System.out.println(sb);
		sb.insert(6, "archana");
		System.out.println(sb);
		
		
		sb.replace(7, 16, "to");
		System.out.println(sb);
		
		sb.delete(9, 11);
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		
	}

}
