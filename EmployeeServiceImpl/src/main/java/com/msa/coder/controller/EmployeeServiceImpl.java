package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("EmployeeServiceImpl")
public class EmployeeServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default EmployeeMapper employeeMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("searchEmployeeByEmployeeName")
    public Object searchEmployeeByEmployeeName(String arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("searchEmployeeByEmployeeId")
    public Object searchEmployeeByEmployeeId(String arg0) {
        // TODO
    }

    @GetMapping("searchEmployeeByEmployeeId")
    public EUDataGridResult searchEmployeeByEmployeeId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("EmployeeServiceImpl")
    public  EmployeeServiceImpl() {
        // TODO
    }

    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("get")
    public EmployeeVO get(String arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(Employee arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(EmployeeVO arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Employee arg0) {
        // TODO
    }

    @GetMapping("searchEmployeeByEmployeeName")
    public EUDataGridResult searchEmployeeByEmployeeName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Employee arg0) {
        // TODO
    }

    @GetMapping("searchEmployeeByDepartmentName")
    public EUDataGridResult searchEmployeeByDepartmentName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("isDistinct")
    public Object isDistinct() {
        // TODO
    }

    @GetMapping("getOredCriteria")
    public Object getOredCriteria() {
        // TODO
    }

    @GetMapping("getOrderByClause")
    public Object getOrderByClause() {
        // TODO
    }

    @GetMapping("getEmpId")
    public Object getEmpId() {
        // TODO
    }

    @GetMapping("getEmpName")
    public Object getEmpName() {
        // TODO
    }

    @GetMapping("getSex")
    public Object getSex() {
        // TODO
    }

    @GetMapping("getIdCode")
    public Object getIdCode() {
        // TODO
    }

    @GetMapping("getBirthday")
    public Object getBirthday() {
        // TODO
    }

    @GetMapping("getJoinDate")
    public Object getJoinDate() {
        // TODO
    }

    @GetMapping("getStatus")
    public Object getStatus() {
        // TODO
    }

    @GetMapping("getEducation")
    public Object getEducation() {
        // TODO
    }

    @GetMapping("getDegree")
    public Object getDegree() {
        // TODO
    }

    @GetMapping("getMajor")
    public Object getMajor() {
        // TODO
    }

    @GetMapping("getGraduateSchool")
    public Object getGraduateSchool() {
        // TODO
    }

    @GetMapping("getEducationForm")
    public Object getEducationForm() {
        // TODO
    }

    @GetMapping("getDepartment")
    public Object getDepartment() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getDeviceMaintainDate")
    public Object getDeviceMaintainDate() {
        // TODO
    }

    @GetMapping("getDeviceMaintainCost")
    public Object getDeviceMaintainCost() {
        // TODO
    }

    @GetMapping("getDeviceMaintainEmpId")
    public Object getDeviceMaintainEmpId() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getDeviceMaintainId")
    public Object getDeviceMaintainId() {
        // TODO
    }

    @GetMapping("getDeviceFaultId")
    public Object getDeviceFaultId() {
        // TODO
    }

    @GetMapping("getDeviceMaintainResult")
    public Object getDeviceMaintainResult() {
        // TODO
    }

    @GetMapping("setDeviceFaultId")
    public Object setDeviceFaultId() {
        // TODO
    }

    @GetMapping("setDeviceMaintainCost")
    public Object setDeviceMaintainCost() {
        // TODO
    }

    @GetMapping("setDeviceMaintainDate")
    public Object setDeviceMaintainDate() {
        // TODO
    }

    @GetMapping("setDeviceMaintainEmpId")
    public Object setDeviceMaintainEmpId() {
        // TODO
    }

    @GetMapping("setDeviceMaintainId")
    public Object setDeviceMaintainId() {
        // TODO
    }

    @GetMapping("setDeviceMaintainResult")
    public Object setDeviceMaintainResult() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("InitBinder")
    public Object InitBinder() {
        // TODO
    }

    @GetMapping("getItemList")
    public Object getItemList() {
        // TODO
    }

    @GetMapping("add")
    public Object add() {
        // TODO
    }

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

    @GetMapping("searchFCountCheckByFCountCheckId")
    public Object searchFCountCheckByFCountCheckId() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setEmpName")
    public Object setEmpName() {
        // TODO
    }

    @GetMapping("setpMeasureCheckId")
    public Object setpMeasureCheckId() {
        // TODO
    }

    @GetMapping("setProcessId")
    public Object setProcessId() {
        // TODO
    }

    @GetMapping("setCheckItem")
    public Object setCheckItem() {
        // TODO
    }

    @GetMapping("setCdate")
    public Object setCdate() {
        // TODO
    }

    @GetMapping("setMeasureData")
    public Object setMeasureData() {
        // TODO
    }

    @GetMapping("setEmpId")
    public Object setEmpId() {
        // TODO
    }

    @GetMapping("setResult")
    public Object setResult() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("getpMeasureCheckId")
    public Object getpMeasureCheckId() {
        // TODO
    }

    @GetMapping("getProcessId")
    public Object getProcessId() {
        // TODO
    }

    @GetMapping("getCheckItem")
    public Object getCheckItem() {
        // TODO
    }

    @GetMapping("getCdate")
    public Object getCdate() {
        // TODO
    }

    @GetMapping("getMeasureData")
    public Object getMeasureData() {
        // TODO
    }

    @GetMapping("getEmpId")
    public Object getEmpId() {
        // TODO
    }

    @GetMapping("getResult")
    public Object getResult() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getEmpName")
    public Object getEmpName() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getBirthday")
    public Object getBirthday() {
        // TODO
    }

    @GetMapping("setBirthday")
    public Object setBirthday() {
        // TODO
    }

    @GetMapping("getDegree")
    public Object getDegree() {
        // TODO
    }

    @GetMapping("setDegree")
    public Object setDegree() {
        // TODO
    }

    @GetMapping("getDepartmentId")
    public Object getDepartmentId() {
        // TODO
    }

    @GetMapping("setDepartmentId")
    public Object setDepartmentId() {
        // TODO
    }

    @GetMapping("getEducation")
    public Object getEducation() {
        // TODO
    }

    @GetMapping("setEducation")
    public Object setEducation() {
        // TODO
    }

    @GetMapping("getEducationForm")
    public Object getEducationForm() {
        // TODO
    }

    @GetMapping("setEducationForm")
    public Object setEducationForm() {
        // TODO
    }

    @GetMapping("getEmpId")
    public Object getEmpId() {
        // TODO
    }

    @GetMapping("setEmpId")
    public Object setEmpId() {
        // TODO
    }

    @GetMapping("getEmpName")
    public Object getEmpName() {
        // TODO
    }

    @GetMapping("setEmpName")
    public Object setEmpName() {
        // TODO
    }

    @GetMapping("getIdCode")
    public Object getIdCode() {
        // TODO
    }

    @GetMapping("setIdCode")
    public Object setIdCode() {
        // TODO
    }

    @GetMapping("getJoinDate")
    public Object getJoinDate() {
        // TODO
    }

    @GetMapping("setJoinDate")
    public Object setJoinDate() {
        // TODO
    }

    @GetMapping("getMajor")
    public Object getMajor() {
        // TODO
    }

    @GetMapping("setMajor")
    public Object setMajor() {
        // TODO
    }

    @GetMapping("getSex")
    public Object getSex() {
        // TODO
    }

    @GetMapping("setSex")
    public Object setSex() {
        // TODO
    }

    @GetMapping("getStatus")
    public Object getStatus() {
        // TODO
    }

    @GetMapping("setStatus")
    public Object setStatus() {
        // TODO
    }

}
