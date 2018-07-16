package com.cherry.framework.model;

import java.io.Serializable;
import java.util.Date;

public class LogEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.module_id
     *
     * @mbggenerated
     */
    private Integer moduleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.module_name
     *
     * @mbggenerated
     */
    private String moduleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.parameters
     *
     * @mbggenerated
     */
    private String parameters;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.ip_address
     *
     * @mbggenerated
     */
    private String ipAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.mac_address
     *
     * @mbggenerated
     */
    private String macAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_log.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fr_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.id
     *
     * @return the value of fr_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.id
     *
     * @param id the value for fr_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.module_id
     *
     * @return the value of fr_log.module_id
     *
     * @mbggenerated
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.module_id
     *
     * @param moduleId the value for fr_log.module_id
     *
     * @mbggenerated
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.module_name
     *
     * @return the value of fr_log.module_name
     *
     * @mbggenerated
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.module_name
     *
     * @param moduleName the value for fr_log.module_name
     *
     * @mbggenerated
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.user_id
     *
     * @return the value of fr_log.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.user_id
     *
     * @param userId the value for fr_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.user_name
     *
     * @return the value of fr_log.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.user_name
     *
     * @param userName the value for fr_log.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.content
     *
     * @return the value of fr_log.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.content
     *
     * @param content the value for fr_log.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.parameters
     *
     * @return the value of fr_log.parameters
     *
     * @mbggenerated
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.parameters
     *
     * @param parameters the value for fr_log.parameters
     *
     * @mbggenerated
     */
    public void setParameters(String parameters) {
        this.parameters = parameters == null ? null : parameters.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.create_date
     *
     * @return the value of fr_log.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.create_date
     *
     * @param createDate the value for fr_log.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.ip_address
     *
     * @return the value of fr_log.ip_address
     *
     * @mbggenerated
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.ip_address
     *
     * @param ipAddress the value for fr_log.ip_address
     *
     * @mbggenerated
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.mac_address
     *
     * @return the value of fr_log.mac_address
     *
     * @mbggenerated
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.mac_address
     *
     * @param macAddress the value for fr_log.mac_address
     *
     * @mbggenerated
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_log.remark
     *
     * @return the value of fr_log.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_log.remark
     *
     * @param remark the value for fr_log.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fr_log
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", moduleId=").append(moduleId);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", content=").append(content);
        sb.append(", parameters=").append(parameters);
        sb.append(", createDate=").append(createDate);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", macAddress=").append(macAddress);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}