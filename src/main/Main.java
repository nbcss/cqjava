package main;

import entity.ClientHello;
import util.Utils;

public class Main {

	public static void main(String[] args) {
		int port =11234;
		ClientHello hello = new ClientHello(port);
		Utils.init();
		Utils.setPort(port);
		
		SayHelloThread sayHello = new SayHelloThread(hello);
		sayHello.start();
		ClientServerThread clientServer = new ClientServerThread();
		clientServer.start();
	}

}
