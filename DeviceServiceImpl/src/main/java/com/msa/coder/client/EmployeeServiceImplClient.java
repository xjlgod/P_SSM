package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "EmployeeServiceImpl", fallback = EmployeeServiceImplClientFallback.class)
public interface EmployeeServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("setDeviceMaintainEmpId")
    public Object setDeviceMaintainEmpId();

    @GetMapping("InitBinder")
    public Object InitBinder();

    @GetMapping("getBirthday")
    public Object getBirthday();

    @GetMapping("setJoinDate")
    public Object setJoinDate();

    @GetMapping("setSex")
    public Object setSex();

    @GetMapping("setBirthday")
    public Object setBirthday();

    @GetMapping("getSex")
    public Object getSex();

    @GetMapping("getDegree")
    public Object getDegree();

    @GetMapping("getMajor")
    public Object getMajor();

    @GetMapping("getpMeasureCheckId")
    public Object getpMeasureCheckId();

    @GetMapping("getEducation")
    public Object getEducation();

    @GetMapping("setDeviceMaintainCost")
    public Object setDeviceMaintainCost();

    @GetMapping("setEducation")
    public Object setEducation();

    @GetMapping("setDeviceMaintainResult")
    public Object setDeviceMaintainResult();

    @GetMapping("setDeviceMaintainDate")
    public Object setDeviceMaintainDate();

    @GetMapping("getJoinDate")
    public Object getJoinDate();

    @GetMapping("setMajor")
    public Object setMajor();

    @GetMapping("setDeviceMaintainId")
    public Object setDeviceMaintainId();

    @GetMapping("getIdCode")
    public Object getIdCode();

    @GetMapping("setEducationForm")
    public Object setEducationForm();

    @GetMapping("setDegree")
    public Object setDegree();

    @GetMapping("getDepartment")
    public Object getDepartment();

    @GetMapping("setIdCode")
    public Object setIdCode();

    @GetMapping("getEducationForm")
    public Object getEducationForm();

    @GetMapping("getGraduateSchool")
    public Object getGraduateSchool();

}
