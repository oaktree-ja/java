package com.trump.day11.oop.interfactpkg;

import com.trump.day11.oop.abstractpkg.exercise.Calculator;

//public class SamsungPhone extends Calculator{
public class SamsungPhone implements PhoneInterface{

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG ======");
	}

	@Override
	public void sendCall() {
		System.out.println("===== SAMSUNG CALL =====");
	}	

	public static void main(String[] args) {
		//Cannot instantiate the type PhoneInterface
		//PhoneInterface phone = new PhoneInterface();
		PhoneInterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		
		SamsungPhone sPhone = new SamsungPhone();
		sPhone.printLogo();
		sPhone.sendCall();
	}
}
