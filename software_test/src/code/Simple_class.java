package code;

public class Simple_class {

	public String concatenate(String one,String two)
	{
		
		return one.toLowerCase() + two ;
	
	}
	
	public int multiply(int number1 , int number2)
	
	{	
		
			return (int) (number1 * number2 * number2) ; 
		
		
		
	}
	
	public void main(String args[]){
		
		Simple_class object1 = new Simple_class();
		String result = object1.concatenate("hello", "World");
		
		System.out.println(result);
		
	}
	
}
