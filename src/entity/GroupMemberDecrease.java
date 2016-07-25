package entity;

/**
 * 群人员减少
 * 
 * @author liqingcan
 *
 */
public class GroupMemberDecrease {
	private String groupID;
	private String qq;
	private String operatedQQ;

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

	public String getOperatedQQ() {
		return operatedQQ;
	}

	public void setOperatedQQ(String operatedQQ) {
		this.operatedQQ = operatedQQ;
	}

	public GroupMemberDecrease() {
		super();
	}
	
	public GroupMemberDecrease(String s) {
		super();
		String ss[] = s.split(" ");
		this.groupID = ss[1];
		this.qq = ss[2];
		this.operatedQQ = ss[3];
	}

	public GroupMemberDecrease(String groupID, String qq, String operatedQQ) {
		super();
		this.groupID = groupID;
		this.qq = qq;
		this.operatedQQ = operatedQQ;
	}
}
