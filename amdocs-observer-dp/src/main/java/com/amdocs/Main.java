package com.amdocs;

public class Main {

	public static void main(String[] args) {
		PaperWala paperWala = new PaperWala("Pune Paperwala Pvt ltd.");
		paperWala.addSubscriber(new Subscriber("Ramesh"));
		paperWala.addSubscriber(new Subscriber("Rajesh"));
		paperWala.addSubscriber(new Subscriber("Ram"));
		
		paperWala.notifyAllSubscribers("Times of India");
	}

}
