package member.model;

public class Member {
	private String userid;
	private String passwd;
	private String uname;
	private int age;
	private double salary;

	public Member() {
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String disp() {
		return "userid=" + userid + "\npasswd=" + passwd + "\nuname=" + uname + "\nage=" + age + "\nsalary=" + salary;
	}

}
