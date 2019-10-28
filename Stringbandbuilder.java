package string;

public class Stringbandbuilder {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String st= new String("rohit");
		StringBuilder bu=new StringBuilder("rohit");
		StringBuffer bf=new StringBuffer("rohit");
		System.out.println(st.concat("hi"));
		System.out.println(bu.append("hi"));//mutable
		System.out.println(bf.append("hi"));//mutable
		String ns=st.concat("hii..");//imutable
		System.out.println(st);
		
		//stack
		

	}

}
