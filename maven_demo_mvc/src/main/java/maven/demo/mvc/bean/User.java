package maven.demo.mvc.bean;

public class User {
	  
	private long id;
	private String userName;
	private String userPwd;
	private short userStatus;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public short getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(short userStatus) {
		this.userStatus = userStatus;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + ", userStatus=" + userStatus
				+ "]";
	}

}
