package entity;

/**
 * 打招呼类，告诉插件客户端的端口。默认端口11234
 * 
 * @author liqingcan
 *
 */
public class ClientHello {
	private Integer port;

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public ClientHello(Integer port) {
		super();
		this.port = port;
	}

	public ClientHello() {
		super();
		// 设置默认客户端端口为11234
		this.port = 11234;
	}

	@Override
	public String toString() {
		return "ClientHello " + port;
	}

}
