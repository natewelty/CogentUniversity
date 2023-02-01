package AnnotationSetup;


import org.springframework.stereotype.Component;

@Component
public class ChatRoomService {
	private final SettingService settings;
	
	public ChatRoomService(SettingService settings) {
		this.settings = settings;
	}
	
	public void start()
	{	
		settings.configure();
		System.out.println("Starting chat room");
		
	}
}