package com.example.demo.rest.domain;

public class Emp {
	private String occrrSeq;

	private String occrrDtdm;

	private String cudDiv;

	private String empNo;

	private String empNm;

	private int age;

	private String postNumber;

	private String roadAddress;

	private String dtlAddress;

	private String emailAddress;

	private String cellPhNumber;

	private String deptCode;

	private String regDtdm;

	private String modDtdm;

	public String getOccrrSeq() {
		return occrrSeq;
	}

	public void setOccrrSeq(String occrrSeq) {
		this.occrrSeq = occrrSeq;
	}

	public String getOccrrDtdm() {
		return occrrDtdm;
	}

	public void setOccrrDtdm(String occrrDtdm) {
		this.occrrDtdm = occrrDtdm;
	}

	public String getCudDiv() {
		return cudDiv;
	}

	public void setCudDiv(String cudDiv) {
		this.cudDiv = cudDiv;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(String postNumber) {
		this.postNumber = postNumber;
	}

	public String getRoadAddress() {
		return roadAddress;
	}

	public void setRoadAddress(String roadAddress) {
		this.roadAddress = roadAddress;
	}

	public String getDtlAddress() {
		return dtlAddress;
	}

	public void setDtlAddress(String dtlAddress) {
		this.dtlAddress = dtlAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCellPhNumber() {
		return cellPhNumber;
	}

	public void setCellPhNumber(String cellPhNumber) {
		this.cellPhNumber = cellPhNumber;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getRegDtdm() {
		return regDtdm;
	}

	public void setRegDtdm(String regDtdm) {
		this.regDtdm = regDtdm;
	}

	public String getModDtdm() {
		return modDtdm;
	}

	public void setModDtdm(String modDtdm) {
		this.modDtdm = modDtdm;
	}

	@Override
	public String toString() {
		return "Emp{" + "occrrSeq=" + occrrSeq + "occrrDtdm=" + occrrDtdm + "}";
	}

}
