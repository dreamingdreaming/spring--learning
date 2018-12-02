package com.ren.li.springmabatis.pojo;

public class Stockincomeitem {
    private Integer sibtid;

    private String sibtname;

    private Integer sibid;

    private Integer pid;

    public Integer getSibtid() {
        return sibtid;
    }

    public void setSibtid(Integer sibtid) {
        this.sibtid = sibtid;
    }

    public String getSibtname() {
        return sibtname;
    }

    public void setSibtname(String sibtname) {
        this.sibtname = sibtname == null ? null : sibtname.trim();
    }

    public Integer getSibid() {
        return sibid;
    }

    public void setSibid(Integer sibid) {
        this.sibid = sibid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}