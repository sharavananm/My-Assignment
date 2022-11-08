package w3d2;

public class CommunicationMode extends AbstractClass  implements Mobile{   //concrete class

	public void makeVoiceCall() {
		System.out.println("Received Voice call");
	}

	public void makeVideoCall() {
		System.out.println("Reveived Video Call");
	}
	
	public void sendText() {
		System.out.println("Reveived Text");
		
	}
	public static void main(String[] args) {
		CommunicationMode Type = new CommunicationMode();
		Type.makeVoiceCall();
		Type.makeVideoCall();	
		Type.sendText();
		Type.sendAudio();
		
	}

	
}
	