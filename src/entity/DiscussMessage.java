package entity;

import util.Utils;

/**
 * 讨论组消息
 * 
 * @author liqingcan
 *
 */
public class DiscussMessage {
	private String discussID;
	private String qq;
	private String msg;

	public String getDiscussID() {
		return discussID;
	}

	public void setDiscussID(String discussID) {
		this.discussID = discussID;
	}

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
	 * 通过编码后的消息设置消息
	 * 
	 * @param msg
	 */
	public void setMsgByEncoded(String msg) {
		this.msg = Utils.Decode(msg);
	}

	public DiscussMessage() {
		super();
	}
	
	public DiscussMessage(String s) {
		super();
		String ss[] = s.split(" ");
		this.discussID = ss[1];
		this.qq = ss[2];
		this.setMsgByEncoded(ss[3]);
	}	

	@Override
	public String toString() {
		return "DiscussMessage " + discussID + " " + this.getEncodedMsg();
	}

}
