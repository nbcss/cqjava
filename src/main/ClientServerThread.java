package main;

import entity.DiscussMessage;
import entity.GroupMemberDecrease;
import entity.GroupMemberIncrease;
import entity.GroupMessage;
import entity.PrivateMessage;
import util.Utils;

/**
 * 客户端业务处理类
 * 
 * @author liqingcan
 *
 */
public class ClientServerThread extends Thread {
	public void run() {
		while (true) {
			String s = Utils.receive();
			switch (s.split(" ")[0]) {
			case "PrivateMessage":
				PrivateMessage pm = new PrivateMessage(s);
				System.out.println(pm.getQQ() + "说" + pm.getMsg());
				break;
			case "GroupMessage":
				GroupMessage gm = new GroupMessage(s);
				System.out.println(gm.getGroupID()+"群"+gm.getQQ()+"说"+gm.getMsg());
				break;
			case "DiscussMessage":
				DiscussMessage dm = new DiscussMessage(s);
				System.out.println(dm.getDiscussID()+"讨论组"+dm.getQQ()+"说"+dm.getMsg());
				break;
			case "GroupMemberDecrease":
				GroupMemberDecrease gmd = new GroupMemberDecrease(s);
				System.out.println(gmd.getGroupID()+"群"+gmd.getQQ()+"将"+gmd.getOperatedQQ()+"移出群");
				break;
			case "GroupMemberIncrease":
				GroupMemberIncrease gmi = new GroupMemberIncrease(s);
				System.out.println(gmi.getGroupID()+"群"+gmi.getQQ()+"邀请"+gmi.getOperatedQQ()+"进入群");
				break;
			}
		}
	}
}
