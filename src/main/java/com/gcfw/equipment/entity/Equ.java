package com.gcfw.equipment.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Equ implements Serializable {
    private Integer  id;
    private String deviceID;
    private String jgbh;
    private String equi_name;
    private String sort;
    private String companyid;
    private String equ_videoid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date productiondate;
    private String devicecode;    //同 devicecode
    private String  CARCODE;   //表 sys_userdevice 字段

}
