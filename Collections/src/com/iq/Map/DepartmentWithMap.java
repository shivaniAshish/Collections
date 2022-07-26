package com.iq.Map;

public class DepartmentWithMap {
	int dptmntId;
	String dptmntName;
	public DepartmentWithMap(int dptmntId,String dptmntName) {
		this.dptmntId=dptmntId;
		this.dptmntName=dptmntName;
	}
	public int getdptmntId() {
		return dptmntId;	
	}
	public void setdptmntId(int dptmntId) {
		this.dptmntId=dptmntId;
	}
	public String getdptmntName() {
		return dptmntName;
	}
	public void setdptmntName(String dptmntName) {
		this.dptmntName=dptmntName;
	}
	@Override
	public String toString() {
		return " [departmentId=" + dptmntId + ", departmentName=" + dptmntName + "]";
	}

}
