package cqjava.util;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Utils {
	
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

}
