package cqjava.entity;

import cqjava.util.Utils;

public class CQMessage {
	protected String qq;
	protected String msg;

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
}
