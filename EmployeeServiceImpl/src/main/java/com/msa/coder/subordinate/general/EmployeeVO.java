package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class EmployeeVO {
    /**
    * object fields.
    */
    @Autowired
    private Object birthday;

    @Autowired
    private String empId;

    @Autowired
    private String graduateSchool;

    @Autowired
    private String education;

    @Autowired
    private String idCode;

    @Autowired
    private String sex;

    @Autowired
    private String degree;

    @Autowired
    private String educationForm;

    @Autowired
    private Object joinDate;

    @Autowired
    private String major;

    @Autowired
    private String empName;

    @Autowired
    private Department department;

    @Autowired
    private String status;

    /**
    * methods.
    */
    public void setGraduateSchool(String arg0) {
    // TODO
    }

    public String getEmpId() {
    // TODO
    }

    public String getGraduateSchool() {
    // TODO
    }

    public void setDepartment(Department arg0) {
    // TODO
    }

    public String getDegree() {
    // TODO
    }

    public void setDegree(String arg0) {
    // TODO
    }

    public void setEmpName(String arg0) {
    // TODO
    }

    public Object getJoinDate() {
    // TODO
    }

    public  EmployeeVO() {
    // TODO
    }

    public void setIdCode(String arg0) {
    // TODO
    }

    public String getEducation() {
    // TODO
    }

    public void setMajor(String arg0) {
    // TODO
    }

    public Department getDepartment() {
    // TODO
    }

    public void setSex(String arg0) {
    // TODO
    }

    public String getMajor() {
    // TODO
    }

    public String getSex() {
    // TODO
    }

    public void setEducation(String arg0) {
    // TODO
    }

    public Object getBirthday() {
    // TODO
    }

    public String getStatus() {
    // TODO
    }

    public void setEducationForm(String arg0) {
    // TODO
    }

    public void setStatus(String arg0) {
    // TODO
    }

    public void setBirthday(Object arg0) {
    // TODO
    }

    public void setJoinDate(Object arg0) {
    // TODO
    }

    public void setEmpId(String arg0) {
    // TODO
    }

    public String getEducationForm() {
    // TODO
    }

    public String getEmpName() {
    // TODO
    }

    public String getIdCode() {
    // TODO
    }

}
