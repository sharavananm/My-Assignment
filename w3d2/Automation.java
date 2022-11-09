package w3d2;

public class Automation extends MultipleLanguage implements Language , TestTool{

	@Override
	void ruby() {
		System.out.println("ruby");
		
	}

	public void Java() {
		System.out.println("java");		
	}

	public void Selenium() {
			System.out.println("selenium");	
	}
	
	public static void main(String[] args) {
		Automation p = new Automation();
		p.Java();
		p.Selenium();
		p.python();
		p.ruby();
	}

}
