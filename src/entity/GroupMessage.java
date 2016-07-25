package entity;

import util.Utils;

/**
 * 群消息
 * 
 * @author liqingcan
 *
 */
public class GroupMessage {
	private String groupID;
	private String qq;
	private String msg;

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
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

	public GroupMessage() {
		super();
	}

	public GroupMessage(String s) {
		super();
		String ss[] = s.split(" ");
		this.groupID = ss[1];
		this.qq = ss[2];
		this.setMsgByEncoded(ss[3]);
	}

	@Override
	public String toString() {
		return "GroupMessage " + groupID + " " + this.getEncodedMsg();
	}

}
