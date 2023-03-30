package com.cogent.car;
import org.springframework.context.annotation.Bean;


public class Car {
	Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	public void letsGo() {
		tyre.roll();
	}
}
