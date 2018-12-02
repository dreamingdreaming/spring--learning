package com.ren.li.springmabatis.pojo;

public class Stockincomebill {
    private Integer sibid;

    private String sibname;

    private Integer eid;

    private Integer did;

    public Integer getSibid() {
        return sibid;
    }

    public void setSibid(Integer sibid) {
        this.sibid = sibid;
    }

    public String getSibname() {
        return sibname;
    }

    public void setSibname(String sibname) {
        this.sibname = sibname == null ? null : sibname.trim();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}