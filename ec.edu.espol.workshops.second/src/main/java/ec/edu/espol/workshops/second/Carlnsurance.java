package ec.edu.espol.workshops.second;

public class Carlnsurance {
	
	private String name;
	private int age;
	private char sex;
	private String status;
	private int premium;
	private boolean licenseDriver;
	
	public Carlnsurance(String name, int age, char sex, String status, boolean licenseDriver) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.status = status;
		this.premium = 600;
		this.licenseDriver = licenseDriver;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPremium(int premium) {
		this.premium = premium;
	}
	
	public int getPremium() {
		return premium;
	}
	
	public void setLicenseDriver(boolean license) {
		this.licenseDriver = license;
	}
	
	public boolean getLicenseDriver() {
		return licenseDriver;
	}
}
