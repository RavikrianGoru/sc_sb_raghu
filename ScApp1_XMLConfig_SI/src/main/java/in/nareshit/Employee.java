package in.nareshit;

public class Employee {
private String ename;
private int eid;
@Override
public String toString() {
	return "Employee [ename=" + ename + ", eid=" + eid + "]";
}
public Employee(String ename, int eid) {
	super();
	this.ename = ename;
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
}
