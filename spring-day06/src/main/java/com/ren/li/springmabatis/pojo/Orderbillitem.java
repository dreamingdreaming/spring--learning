package com.ren.li.springmabatis.pojo;

public class Orderbillitem {
    private Integer obtid;

    private String obtname;

    private Integer oid;

    private Integer pid;

    public Integer getObtid() {
        return obtid;
    }

    public void setObtid(Integer obtid) {
        this.obtid = obtid;
    }

    public String getObtname() {
        return obtname;
    }

    public void setObtname(String obtname) {
        this.obtname = obtname == null ? null : obtname.trim();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}