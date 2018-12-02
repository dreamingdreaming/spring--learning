package com.ren.li.springmabatis.pojo;

public class Stockoutcomebillitem {
    private Integer sobtid;

    private String sobtname;

    private Integer sobid;

    private Integer pid;

    public Integer getSobtid() {
        return sobtid;
    }

    public void setSobtid(Integer sobtid) {
        this.sobtid = sobtid;
    }

    public String getSobtname() {
        return sobtname;
    }

    public void setSobtname(String sobtname) {
        this.sobtname = sobtname == null ? null : sobtname.trim();
    }

    public Integer getSobid() {
        return sobid;
    }

    public void setSobid(Integer sobid) {
        this.sobid = sobid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}