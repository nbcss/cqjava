package cqjava.main;

/**
 * 仅仅用于向酷q提供java插件使用的端口
 * @author liqingcan
 *
 */
public class SayHello extends Thread{
	private int port;
	
	public void run() {
		while(true){
			CQ.send("ClientHello " + port);
			try {
				Thread.sleep(5*60*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public SayHello(int port) {
		super();
		this.port = port;
	}
}
