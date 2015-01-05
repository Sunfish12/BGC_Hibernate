package model;

public class Member_FavoredTypeVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int memberId;
	private MemberVO member;
	private String username;
	private String favoredType;

	public Member_FavoredTypeVO() {
	}

	public Member_FavoredTypeVO(MemberVO member) {
		this.member = member;
	}

	public Member_FavoredTypeVO(MemberVO member, String username, String favoredType) {
		this.member = member;
		this.username = username;
		this.favoredType = favoredType;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFavoredType() {
		return this.favoredType;
	}

	public void setFavoredType(String favoredType) {
		this.favoredType = favoredType;
	}

}
