package cqjava.entity;


/**
 * 私聊消息类
 * 
 * @author liqingcan
 *
 */
public final class PrivateMessage extends CQMessage{

	@Override
	public String toString() {
		return "PrivateMessage " + this.qq + " " + this.getEncodedMsg();
	}

	public PrivateMessage() {
		super();
	}

	/**
	 * 直接通过酷q返回的指令直接解析成一个私聊消息对象
	 * @param s
	 */
	public PrivateMessage(String s) {
		super();
		try{
			String ss[] = s.split(" ");
			this.qq = ss[1];
			this.setMsgByEncoded(ss[2]);
		}catch(Exception e){
			
		}
	}

}
