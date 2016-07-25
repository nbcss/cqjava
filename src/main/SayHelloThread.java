package main;

import entity.ClientHello;
import util.Utils;

/**
 * 定时（每5分钟）向插件提供客户端服务端口的线程
 * @author liqingcan
 *
 */
public class SayHelloThread extends Thread{
	private ClientHello hello;
	
	public ClientHello getHello() {
		return hello;
	}

	public void setHello(ClientHello hello) {
		this.hello = hello;
	}

	public SayHelloThread() {
		super();
	}

	public SayHelloThread(ClientHello hello) {
		super();
		this.hello = hello;
	}

	public void run(){
		while(true){
			Utils.send(this.hello.toString());
			try {
				Thread.sleep(5*60*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
