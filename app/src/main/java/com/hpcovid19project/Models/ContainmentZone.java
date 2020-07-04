package com.hpcovid19project.Models;

public class ContainmentZone {

    String sno, district, hotspot;

    public ContainmentZone() {
    }

    public ContainmentZone(String sno, String district, String hotspot) {
        this.sno = sno;
        this.district = district;
        this.hotspot = hotspot;
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

    public String getHotspot() {
        return hotspot;
    }

    public void setHotspot(String hotspot) {
        this.hotspot = hotspot;
    }
}
