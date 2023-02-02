package AnnotationSetup;

import org.springframework.stereotype.Component;

@Component
public class SettingService {
	
	public void configure()
	{
		System.out.println("Configuring chat");
	}
}
