package w1d1;

public class Firstcode {
	public void phoneLaunch()                  // ???????? 1st method should be void or any method can create
	{
		System.out.println("Brand - iphone");
	}
	
public int getNum()
{
	return 123456;
}
public String getPhoneColor()
{
	return "Color - Black";
}

public static void main(String[] args) {
	                                          //create object--> syntax - classname objectname=new classname();
	
	Firstcode mobile = new Firstcode();       // #error#----> The value of the local variable mobile is not used
	mobile.getPhoneColor();                   //without using calling method, will get the above prompt msg
	String phoneClr = mobile.getPhoneColor();
	System.out.println(phoneClr);
	mobile.phoneLaunch();
	
	Secondcode obj2=new Secondcode();
	obj2.modelnumber();
}
}
