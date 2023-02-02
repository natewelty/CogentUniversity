package AnnotationSetup;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("AnnotationSetup")
public class Main {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
		ChatService chatService = applicationContext.getBean(ChatService.class);
		chatService.chat();
		applicationContext.close();
	}
	
}
