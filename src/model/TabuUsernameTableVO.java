package model;

public class TabuUsernameTableVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tabuId;
	private MemberVO memberByTabuMemberId;
	private MemberVO memberByToTabuMemberId;
	private String tabuReason;

	public TabuUsernameTableVO() {
	}

	public TabuUsernameTableVO(int tabuId) {
		this.tabuId = tabuId;
	}

	public TabuUsernameTableVO(int tabuId, MemberVO memberByTabuMemberId,
			MemberVO memberByToTabuMemberId, String tabuReason) {
		this.tabuId = tabuId;
		this.memberByTabuMemberId = memberByTabuMemberId;
		this.memberByToTabuMemberId = memberByToTabuMemberId;
		this.tabuReason = tabuReason;
	}

	public int getTabuId() {
		return this.tabuId;
	}

	public void setTabuId(int tabuId) {
		this.tabuId = tabuId;
	}

	public MemberVO getMemberByTabuMemberId() {
		return this.memberByTabuMemberId;
	}

	public void setMemberByTabuMemberId(MemberVO memberByTabuMemberId) {
		this.memberByTabuMemberId = memberByTabuMemberId;
	}

	public MemberVO getMemberByToTabuMemberId() {
		return this.memberByToTabuMemberId;
	}

	public void setMemberByToTabuMemberId(MemberVO memberByToTabuMemberId) {
		this.memberByToTabuMemberId = memberByToTabuMemberId;
	}

	public String getTabuReason() {
		return this.tabuReason;
	}

	public void setTabuReason(String tabuReason) {
		this.tabuReason = tabuReason;
	}

}
