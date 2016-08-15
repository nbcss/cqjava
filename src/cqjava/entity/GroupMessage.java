package cqjava.entity;

/**
 * 群消息
 * 
 * @author liqingcan
 *
 */
public final class GroupMessage extends CQMessage {
	private String groupID;

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public GroupMessage() {
		super();
	}

	/**
	 * 直接通过酷q返回的指令直接解析成一个群消息对象
	 * 
	 * @param s
	 */
	public GroupMessage(String s) {
		super();
		try {
			String ss[] = s.split(" ");
			this.groupID = ss[1];
			this.qq = ss[2];
			this.setMsgByEncoded(ss[3]);
		} catch (Exception e) {

		}
	}

	@Override
	public String toString() {
		return "GroupMessage " + this.groupID + " " + this.getEncodedMsg();
	}

}
