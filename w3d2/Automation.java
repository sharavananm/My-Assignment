package w3d2;

public class Automation extends MultipleLanguage {

	public void Java() {
		System.out.println("Java");
		
	}
	
  public void Selenium() {
	  System.out.println("Selenium");
	
 }

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}

	public static void main(String[] args) {
		
		Automation execution = new Automation();
		execution.Java();
		execution.Selenium();
		execution.python();
		execution.ruby();
		
	}	
}
