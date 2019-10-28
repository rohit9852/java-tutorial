package string;

public class finalkey {
	public static void main(String[] args)
	{
		//final is keyword
		//apply restriction
		//final class canot be inherited,final method can't overhiden 
		//final varibale cant be changed
		//final int a=100;
		//a=500// cant be changed
		
		
		
		
		
		//finally
		//it is used for expetion handlinng
	//it is executed compulsary
		//wirtten code neccesry
		try
		{
			int x=100;
		}
		catch(Exception  e) {System.out.println(e);}
		finally
		{
			System.out.println("it si very important");
		}
	}

}
