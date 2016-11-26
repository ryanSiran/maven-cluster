package cn.com.psr.general.study.design.mode.prototype.demo;

public class Client {

	public static void main(String[] args) {
		
		Resume rs = new Resume("司然");
		rs.setWorkExperience("1年", "多粉");
		rs.setPerSonalInfo("男", "24");
		
		rs.display();
		
		try {
			Resume rs2 = (Resume) rs.clone();
			rs2.setWorkExperience("1年", "youE");
			rs2.display();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
}
