package com.iq.HasARelationship;

public class Department {
	int dId;
	String role;
	String company;
	public Department(int dId, String role,String company) {
		super();
		this.dId = dId;
		this.role = role;
		this.company=company;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", role=" + role + ", company=" + company + "]";
	}
	public Object getLocation() {
		
		return null;
	}
	

}
