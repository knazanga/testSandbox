package sandbox;

public interface IHandleMessage {

	void handleMessage(Message message);
	
	void handleMessage(MessageA message);
	
	void handleMessage(MessageB message);
}
