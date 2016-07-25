package entity;

import util.Utils;

/**
 * 私聊消息类
 * 
 * @author liqingcan
 *
 */
public class PrivateMessage {
	private String qq;
	private String msg;

	public String getQQ() {
		return qq;
	}

	public void setQQ(String qq) {
		this.qq = qq;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 获取编码后的消息
	 * 
	 * @return
	 */
	public String getEncodedMsg() {
		return Utils.Encode(msg);
	}

	/**
	 * 通过编码后的信息来设置消息
	 * 
	 * @param msg
	 */
	public void setMsgByEncoded(String msg) {
		this.msg = Utils.Decode(msg);
	}

	@Override
	public String toString() {
		return "PrivateMessage " + qq + " " + this.getEncodedMsg();
	}

	public PrivateMessage() {
		super();
	}

	public PrivateMessage(String s) {
		super();
		String ss[] = s.split(" ");
		this.qq = ss[1];
		this.setMsgByEncoded(ss[2]);
	}

}
