package model.TabuUsernameTable;

import model.Member.MemberVO;

public class TabuUsernameTableVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tabuId;
	private MemberVO memberByToTabuUsername;
	private MemberVO memberByTabuUsername;
	private String tabuReason;

	public TabuUsernameTableVO() {
	}

	public TabuUsernameTableVO(int tabuId) {
		this.tabuId = tabuId;
	}

	public TabuUsernameTableVO(int tabuId, MemberVO memberByToTabuUsername,
			MemberVO memberByTabuUsername, String tabuReason) {
		this.tabuId = tabuId;
		this.memberByToTabuUsername = memberByToTabuUsername;
		this.memberByTabuUsername = memberByTabuUsername;
		this.tabuReason = tabuReason;
	}

	@Override
	public String toString() {

		return "[" + tabuId + "," + tabuReason + "]";
	}

	public static int convertInt(String data) {
		int result = 0;
		try {
			result = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = -1000;
		}
		return result;
	}

	public int getTabuId() {
		return this.tabuId;
	}

	public void setTabuId(int tabuId) {
		this.tabuId = tabuId;
	}

	public MemberVO getMemberByToTabuUsername() {
		return this.memberByToTabuUsername;
	}

	public void setMemberByToTabuUsername(MemberVO memberByToTabuUsername) {
		this.memberByToTabuUsername = memberByToTabuUsername;
	}

	public MemberVO getMemberByTabuUsername() {
		return this.memberByTabuUsername;
	}

	public void setMemberByTabuUsername(MemberVO memberByTabuUsername) {
		this.memberByTabuUsername = memberByTabuUsername;
	}

	public String getTabuReason() {
		return this.tabuReason;
	}

	public void setTabuReason(String tabuReason) {
		this.tabuReason = tabuReason;
	}
}
