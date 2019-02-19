package com.dxc.openShopReport.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_logger_infos")
public class TLoggerInfos {
    @Id
    @Column(name = "ali_id")
    private Integer aliId;

    @Column(name = "ali_client_ip")
    private String aliClientIp;

    @Column(name = "ali_uri")
    private String aliUri;

    @Column(name = "ali_type")
    private String aliType;

    @Column(name = "ali_method")
    private String aliMethod;

    @Column(name = "ali_session_id")
    private String aliSessionId;

    @Column(name = "ali_time")
    private Date aliTime;

    @Column(name = "ali_return_time")
    private String aliReturnTime;

    @Column(name = "ali_http_status_code")
    private String aliHttpStatusCode;

    @Column(name = "ali_time_consuming")
    private Integer aliTimeConsuming;

    @Column(name = "ali_param_data")
    private String aliParamData;

    @Column(name = "ali_return_data")
    private String aliReturnData;

    /**
     * @return ali_id
     */
    public Integer getAliId() {
        return aliId;
    }

    /**
     * @param aliId
     */
    public void setAliId(Integer aliId) {
        this.aliId = aliId;
    }

    /**
     * @return ali_client_ip
     */
    public String getAliClientIp() {
        return aliClientIp;
    }

    /**
     * @param aliClientIp
     */
    public void setAliClientIp(String aliClientIp) {
        this.aliClientIp = aliClientIp;
    }

    /**
     * @return ali_uri
     */
    public String getAliUri() {
        return aliUri;
    }

    /**
     * @param aliUri
     */
    public void setAliUri(String aliUri) {
        this.aliUri = aliUri;
    }

    /**
     * @return ali_type
     */
    public String getAliType() {
        return aliType;
    }

    /**
     * @param aliType
     */
    public void setAliType(String aliType) {
        this.aliType = aliType;
    }

    /**
     * @return ali_method
     */
    public String getAliMethod() {
        return aliMethod;
    }

    /**
     * @param aliMethod
     */
    public void setAliMethod(String aliMethod) {
        this.aliMethod = aliMethod;
    }

    /**
     * @return ali_session_id
     */
    public String getAliSessionId() {
        return aliSessionId;
    }

    /**
     * @param aliSessionId
     */
    public void setAliSessionId(String aliSessionId) {
        this.aliSessionId = aliSessionId;
    }

    /**
     * @return ali_time
     */
    public Date getAliTime() {
        return aliTime;
    }

    /**
     * @param aliTime
     */
    public void setAliTime(Date aliTime) {
        this.aliTime = aliTime;
    }

    /**
     * @return ali_return_time
     */
    public String getAliReturnTime() {
        return aliReturnTime;
    }

    /**
     * @param aliReturnTime
     */
    public void setAliReturnTime(String aliReturnTime) {
        this.aliReturnTime = aliReturnTime;
    }

    /**
     * @return ali_http_status_code
     */
    public String getAliHttpStatusCode() {
        return aliHttpStatusCode;
    }

    /**
     * @param aliHttpStatusCode
     */
    public void setAliHttpStatusCode(String aliHttpStatusCode) {
        this.aliHttpStatusCode = aliHttpStatusCode;
    }

    /**
     * @return ali_time_consuming
     */
    public Integer getAliTimeConsuming() {
        return aliTimeConsuming;
    }

    /**
     * @param aliTimeConsuming
     */
    public void setAliTimeConsuming(Integer aliTimeConsuming) {
        this.aliTimeConsuming = aliTimeConsuming;
    }

    /**
     * @return ali_param_data
     */
    public String getAliParamData() {
        return aliParamData;
    }

    /**
     * @param aliParamData
     */
    public void setAliParamData(String aliParamData) {
        this.aliParamData = aliParamData;
    }

    /**
     * @return ali_return_data
     */
    public String getAliReturnData() {
        return aliReturnData;
    }

    /**
     * @param aliReturnData
     */
    public void setAliReturnData(String aliReturnData) {
        this.aliReturnData = aliReturnData;
    }

    @Override
    public String toString() {
        return "TLoggerInfos{" +
                "aliId=" + aliId +
                ", aliClientIp='" + aliClientIp + '\'' +
                ", aliUri='" + aliUri + '\'' +
                ", aliType='" + aliType + '\'' +
                ", aliMethod='" + aliMethod + '\'' +
                ", aliSessionId='" + aliSessionId + '\'' +
                ", aliTime=" + aliTime +
                ", aliReturnTime='" + aliReturnTime + '\'' +
                ", aliHttpStatusCode='" + aliHttpStatusCode + '\'' +
                ", aliTimeConsuming=" + aliTimeConsuming +
                ", aliParamData='" + aliParamData + '\'' +
                ", aliReturnData='" + aliReturnData + '\'' +
                '}';
    }
}