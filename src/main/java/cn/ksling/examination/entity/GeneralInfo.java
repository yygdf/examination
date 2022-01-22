package cn.ksling.examination.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GeneralInfo {
    private Integer id;

    private Integer no;

    private String name;

    private String gender;

    private Date birthDay;

    private String address;

    private String phoneNo;

    private String schoolName;

    private Date entryTime;

    private String profilePhoto;

    private String medicalHistory;
}