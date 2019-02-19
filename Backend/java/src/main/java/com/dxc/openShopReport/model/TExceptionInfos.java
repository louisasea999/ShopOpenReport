package com.dxc.openShopReport.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_exception_infos")
public class TExceptionInfos {
    @Id
    @Column(name = "exception_id")
    private Integer exceptionId;

    @Column(name = "exception_url")
    private String exceptionUrl;

    @Column(name = "exception_ip")
    private String exceptionIp;

    @Column(name = "exception_message")
    private String exceptionMessage;

    @Column(name = "exception_time")
    private Date exceptionTime;

    @Column(name = "exception_param")
    private String exceptionParam;

    @Column(name = "exception_stack")
    private String exceptionStack;

    /**
     * @return exception_id
     */
    public Integer getExceptionId() {
        return exceptionId;
    }

    /**
     * @param exceptionId
     */
    public void setExceptionId(Integer exceptionId) {
        this.exceptionId = exceptionId;
    }

    /**
     * @return exception_url
     */
    public String getExceptionUrl() {
        return exceptionUrl;
    }

    /**
     * @param exceptionUrl
     */
    public void setExceptionUrl(String exceptionUrl) {
        this.exceptionUrl = exceptionUrl;
    }

    /**
     * @return exception_ip
     */
    public String getExceptionIp() {
        return exceptionIp;
    }

    /**
     * @param exceptionIp
     */
    public void setExceptionIp(String exceptionIp) {
        this.exceptionIp = exceptionIp;
    }

    /**
     * @return exception_message
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * @param exceptionMessage
     */
    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    /**
     * @return exception_time
     */
    public Date getExceptionTime() {
        return exceptionTime;
    }

    /**
     * @param exceptionTime
     */
    public void setExceptionTime(Date exceptionTime) {
        this.exceptionTime = exceptionTime;
    }

    /**
     * @return exception_param
     */
    public String getExceptionParam() {
        return exceptionParam;
    }

    /**
     * @param exceptionParam
     */
    public void setExceptionParam(String exceptionParam) {
        this.exceptionParam = exceptionParam;
    }

    /**
     * @return exception_stack
     */
    public String getExceptionStack() {
        return exceptionStack;
    }

    /**
     * @param exceptionStack
     */
    public void setExceptionStack(String exceptionStack) {
        this.exceptionStack = exceptionStack;
    }
}