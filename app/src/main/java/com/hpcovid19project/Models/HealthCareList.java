package com.hpcovid19project.Models;

public class HealthCareList {

    String sno, district, hospital;

    public HealthCareList() {
    }

    public HealthCareList(String sno, String district, String hospital) {
        this.sno = sno;
        this.district = district;
        this.hospital = hospital;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
