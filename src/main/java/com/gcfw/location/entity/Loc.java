package com.gcfw.location.entity;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Loc implements Serializable {
    private Integer  id;
    private String devicecode;
    private String jd;
    private String wd;
    private String orther;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String chex;
}
