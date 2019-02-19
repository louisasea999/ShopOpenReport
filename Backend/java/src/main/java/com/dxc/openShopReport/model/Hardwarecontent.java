package com.dxc.openShopReport.model;

import java.util.Date;
import javax.persistence.*;

public class Hardwarecontent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "shopCode")
    private String shopcode;

    private String content;

    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return shopCode
     */
    public String getShopcode() {
        return shopcode;
    }

    /**
     * @param shopcode
     */
    public void setShopcode(String shopcode) {
        this.shopcode = shopcode;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}