package sandbox;

public class MessageHandler implements IHandleMessage {

	@Override
	public void handleMessage(MessageA mA){
		System.out.println(mA);
	}
	
	@Override
	public void handleMessage(MessageB mB){
		System.out.println(mB);
	}

	@Override
	public void handleMessage(Message message) {
		System.out.println("What I don't want!");
		
	}

	
	

}
