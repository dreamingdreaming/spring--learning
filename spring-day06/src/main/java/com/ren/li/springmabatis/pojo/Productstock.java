package com.ren.li.springmabatis.pojo;

public class Productstock {
    private Integer psid;

    private String psname;

    private Integer did;

    public Integer getPsid() {
        return psid;
    }

    public void setPsid(Integer psid) {
        this.psid = psid;
    }

    public String getPsname() {
        return psname;
    }

    public void setPsname(String psname) {
        this.psname = psname == null ? null : psname.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}