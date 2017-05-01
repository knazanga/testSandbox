package sandbox;

public class App {

	public static void main(String[] args) {
		IHandleMessage handler =new MessageHandler();
		Message m= new MessageA();
		
		handler.handleMessage(m);
		
		m = new MessageB();
		
		handler.handleMessage(m);
		

	}

}
