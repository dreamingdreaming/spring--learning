package com.ren.li.springmabatis.pojo;

public class Stockoutcomebill {
    private Integer sobid;

    private String sobname;

    private Integer eid;

    public Integer getSobid() {
        return sobid;
    }

    public void setSobid(Integer sobid) {
        this.sobid = sobid;
    }

    public String getSobname() {
        return sobname;
    }

    public void setSobname(String sobname) {
        this.sobname = sobname == null ? null : sobname.trim();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}