package model.MemberFavoredType;

import model.Member.MemberVO;

public class MemberFavoredTypeVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int memberId;
	private MemberVO member;
	private String favoredType;

	public MemberFavoredTypeVO() {
	}

	public MemberFavoredTypeVO(int memberId) {
		this.memberId = memberId;
	}

	public MemberFavoredTypeVO(int memberId, MemberVO member, String favoredType) {
		this.memberId = memberId;
		this.member = member;
		this.favoredType = favoredType;
	}

	@Override
	public String toString() {
		return "[" + memberId + "," + favoredType + "]";
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public MemberVO getMember() {
		return this.member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
	}

	public String getFavoredType() {
		return this.favoredType;
	}

	public void setFavoredType(String favoredType) {
		this.favoredType = favoredType;
	}

}
