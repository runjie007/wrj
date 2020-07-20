package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

public class School implements Serializable {
    @Id
    private Integer ssid;

    private String ssname;

    private static final long serialVersionUID = 1L;

    /**
     * @return ssid
     */
    public Integer getSsid() {
        return ssid;
    }

    /**
     * @param ssid
     */
    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    /**
     * @return ssname
     */
    public String getSsname() {
        return ssname;
    }

    /**
     * @param ssname
     */
    public void setSsname(String ssname) {
        this.ssname = ssname == null ? null : ssname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ssid=").append(ssid);
        sb.append(", ssname=").append(ssname);
        sb.append("]");
        return sb.toString();
    }
}