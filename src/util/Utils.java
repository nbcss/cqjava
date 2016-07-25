package util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Base64;

public class Utils {
	private static DatagramSocket socket;
	private static InetAddress address;
	private static int port = 11234;// 默认为11234端口

	/**
	 * 将字符串按要求编码
	 * 
	 * @param msg
	 * @return
	 */
	public static String Encode(String msg) {
		try {
			return Base64.getEncoder().encodeToString(msg.getBytes("GBK"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 将字符串按要求解码
	 * 
	 * @param msg
	 * @return
	 */
	public static String Decode(String msg) {
		try {
			return new String(Base64.getDecoder().decode(msg), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 发送
	 * 
	 * @param s
	 */
	public static void send(String s) {
		byte[] data = s.getBytes();
		DatagramPacket packet = new DatagramPacket(data, data.length, address, 11235);
		try {
			socket.send(packet);
			System.out.println("send:\t[" + s + "]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 接收
	 * 
	 * @return
	 */
	public static String receive() {
		String result = null;
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		try {
			socket.receive(packet);
			result = new String(data, 0, packet.getLength());
			System.out.println("receive:[" + result + "]");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	public static void setPort(int p) {
		port = p;
	}

	public static void close() {
		socket.close();
	}

	public static void init() {
		if (socket == null) {
			try {
				socket = new DatagramSocket(port);
			} catch (SocketException e) {
				e.printStackTrace();
			}
		}
		if (address == null) {
			try {
				address = InetAddress.getByName("localhost");
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
	}
}
