package org.cogent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("BeanWithPerson")
public class BeanWithPerson {
	@Autowired
	@Qualifier("Gyanendra")
	Person person;
	
}
