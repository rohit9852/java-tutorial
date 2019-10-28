package string;
//import java.util.*;
class fina
{
	protected void finalize() throws Throwable //remove the garbage collection useing finalize key word 
	{
		System.out.println("Object finalized");
	}
}

public class finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fina t= new  fina();
		t=null;
		System.gc();

	}

}
