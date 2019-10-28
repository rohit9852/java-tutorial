package string;

public class Wraper {
	public static void main(String [] args)
	{
		int i=10;//Single value cantainer
		Integer iref=new Integer(i);//Boxed(Constructing the object)
		int j=iref.intValue();//unboxing(extracting the value from object)
		
		Integer  k=i;//Autoboxing
		int l=k;//Autoboxing
		
		System.out.println(i);
		System.out.println(iref);
		System.out.println(k);
		System.out.println(l);
		System.out.println(j);
		
		
		
		
	}

}
