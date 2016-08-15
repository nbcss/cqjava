package cqjava.entity;

/**
 * 讨论组消息
 * 
 * @author liqingcan
 *
 */
public final class DiscussMessage extends CQMessage {
	private String discussID;

	public String getDiscussID() {
		return discussID;
	}

	public void setDiscussID(String discussID) {
		this.discussID = discussID;
	}

	public DiscussMessage() {
		super();
	}

	public DiscussMessage(String s) {
		super();
		try {
			String ss[] = s.split(" ");
			this.discussID = ss[1];
			this.qq = ss[2];
			this.setMsgByEncoded(ss[3]);
		} catch (Exception e) {

		}
	}

	@Override
	public String toString() {
		return "DiscussMessage " + this.discussID + " " + this.getEncodedMsg();
	}

}
