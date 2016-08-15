package cqjava.main;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import cqjava.entity.CQMessage;


/**
 * 酷Qjava
 * @author liqingcan
 *
 */
public class CQ {
	private static int port;//java程序所使用socket端口
	private static DatagramSocket socket;
	private static InetAddress address;
	
	/**
	 * 判断是否设置了端口
	 * @return
	 */
	public static boolean isSetPort(){
		return port!=0;
	}

	/**
	 * 获取端口值
	 * @return
	 */
	public static int getPort() {
		return port;
	}

	/**
	 * 设置端口并初始化socket和inetaddress
	 * @param port
	 */
	public static void setPort(int port) {
		CQ.port = port;
		try {
			socket = new DatagramSocket(port);
			address = InetAddress.getByName("localhost");
		} catch (SocketException | UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 打招呼函数，调用一次函数后，会每隔5分钟，向酷q发送一次本程序使用的端口
	 */
	public static void sayHello(){
		SayHello sayHello = new SayHello(port);
		sayHello.start();
	}
	
	/**
	 * 直接发送一个CQMessage对象
	 * @param m
	 */
	public static void send(CQMessage m){
		send(m.toString());
	}
	
	/**
	 * 发送指令给酷q
	 * @param s
	 */
	public static void send(String s){
		byte[] data = s.getBytes();
		DatagramPacket packet = new DatagramPacket(data, data.length, address, 11235);
		try {
			socket.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 接收从酷q返回的消息
	 * @return
	 */
	public static String receive() {
		String result = null;
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		try {
			socket.receive(packet);
			result = new String(data, 0, packet.getLength());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}
}
