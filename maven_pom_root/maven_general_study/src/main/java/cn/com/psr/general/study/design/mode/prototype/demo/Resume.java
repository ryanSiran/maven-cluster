package cn.com.psr.general.study.design.mode.prototype.demo;

public class Resume implements Cloneable{

	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	private WorkExperience workExperience;
	
	public Resume(String name) {
		this.name = name;
		workExperience = new WorkExperience();
	}
	
	public void setPerSonalInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company){
		this.workExperience.setWorkDate(timeArea);
		this.workExperience.setCompany(company);
	}
	
	public void display(){
		System.out.println(name + " - " + sex + " - " + age);
//		System.out.println("工作经历 " + timeArea + " - " + company);
		System.out.println("工作经历 " + workExperience.getWorkDate() + " - " + workExperience.getCompany());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
