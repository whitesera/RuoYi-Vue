package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 花名册对象 personnel_archives
 * 
 * @author sera
 * @date 2025-02-21
 */
public class PersonnelArchives extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 工号 */
    @Excel(name = "工号")
    private String workNumber;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contactNumber;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 民族 */
    @Excel(name = "民族")
    private String nationality;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String politicalStatus;

    /** 中心 */
    @Excel(name = "中心")
    private String center;

    /** 岗位 */
    @Excel(name = "岗位")
    private String position;

    /** 职级 */
    @Excel(name = "职级")
    private String jobLevel;

    /** 班组 */
    @Excel(name = "班组")
    private String team;

    /** 用工性质 */
    @Excel(name = "用工性质")
    private String employmentType;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date hireDate;

    /** 转正时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "转正时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date confirmDate;

    /** 籍贯 */
    @Excel(name = "籍贯")
    private String originPlace;

    /** 户籍性质 */
    @Excel(name = "户籍性质")
    private String hukouType;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String homeAddress;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String maritalStatus;

    /** 紧急联系人 */
    @Excel(name = "紧急联系人")
    private String emergencyContact;

    /** 工龄 */
    @Excel(name = "工龄")
    private Long workYears;

    /** 学历 */
    @Excel(name = "学历")
    private String education;

    /** 证书 */
    @Excel(name = "证书")
    private String certification;

    /** 招聘渠道 */
    @Excel(name = "招聘渠道")
    private String recruitmentChannel;

    /** 在职情况 */
    @Excel(name = "在职情况")
    private String vehicleInfo;

    /** 上家单位信息 */
    @Excel(name = "上家单位信息")
    private String previousEmployer;

    /** 住宿 */
    @Excel(name = "住宿")
    private String accommodation;

    /** 毕业院校 */
    @Excel(name = "毕业院校")
    private String almaMater;

    /** 所学专业 */
    @Excel(name = "所学专业")
    private String major;

    /** 晋升/调动信息 */
    @Excel(name = "晋升/调动信息")
    private String promotionInfo;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractNumber;

    /** 合同类型 */
    @Excel(name = "合同类型")
    private String contractType;

    /** 合同开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contractStart;

    /** 合同结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contractEnd;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWorkNumber(String workNumber) 
    {
        this.workNumber = workNumber;
    }

    public String getWorkNumber() 
    {
        return workNumber;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }
    public void setContactNumber(String contactNumber) 
    {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() 
    {
        return contactNumber;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setNationality(String nationality) 
    {
        this.nationality = nationality;
    }

    public String getNationality() 
    {
        return nationality;
    }
    public void setPoliticalStatus(String politicalStatus) 
    {
        this.politicalStatus = politicalStatus;
    }

    public String getPoliticalStatus() 
    {
        return politicalStatus;
    }
    public void setCenter(String center) 
    {
        this.center = center;
    }

    public String getCenter() 
    {
        return center;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setJobLevel(String jobLevel) 
    {
        this.jobLevel = jobLevel;
    }

    public String getJobLevel() 
    {
        return jobLevel;
    }
    public void setTeam(String team) 
    {
        this.team = team;
    }

    public String getTeam() 
    {
        return team;
    }
    public void setEmploymentType(String employmentType) 
    {
        this.employmentType = employmentType;
    }

    public String getEmploymentType() 
    {
        return employmentType;
    }
    public void setHireDate(Date hireDate) 
    {
        this.hireDate = hireDate;
    }

    public Date getHireDate() 
    {
        return hireDate;
    }
    public void setConfirmDate(Date confirmDate) 
    {
        this.confirmDate = confirmDate;
    }

    public Date getConfirmDate() 
    {
        return confirmDate;
    }
    public void setOriginPlace(String originPlace) 
    {
        this.originPlace = originPlace;
    }

    public String getOriginPlace() 
    {
        return originPlace;
    }
    public void setHukouType(String hukouType) 
    {
        this.hukouType = hukouType;
    }

    public String getHukouType() 
    {
        return hukouType;
    }
    public void setHomeAddress(String homeAddress) 
    {
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() 
    {
        return homeAddress;
    }
    public void setMaritalStatus(String maritalStatus) 
    {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() 
    {
        return maritalStatus;
    }
    public void setEmergencyContact(String emergencyContact) 
    {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContact() 
    {
        return emergencyContact;
    }
    public void setWorkYears(Long workYears) 
    {
        this.workYears = workYears;
    }

    public Long getWorkYears() 
    {
        return workYears;
    }
    public void setEducation(String education) 
    {
        this.education = education;
    }

    public String getEducation() 
    {
        return education;
    }
    public void setCertification(String certification) 
    {
        this.certification = certification;
    }

    public String getCertification() 
    {
        return certification;
    }
    public void setRecruitmentChannel(String recruitmentChannel) 
    {
        this.recruitmentChannel = recruitmentChannel;
    }

    public String getRecruitmentChannel() 
    {
        return recruitmentChannel;
    }
    public void setVehicleInfo(String vehicleInfo) 
    {
        this.vehicleInfo = vehicleInfo;
    }

    public String getVehicleInfo() 
    {
        return vehicleInfo;
    }
    public void setPreviousEmployer(String previousEmployer) 
    {
        this.previousEmployer = previousEmployer;
    }

    public String getPreviousEmployer() 
    {
        return previousEmployer;
    }
    public void setAccommodation(String accommodation) 
    {
        this.accommodation = accommodation;
    }

    public String getAccommodation() 
    {
        return accommodation;
    }
    public void setAlmaMater(String almaMater) 
    {
        this.almaMater = almaMater;
    }

    public String getAlmaMater() 
    {
        return almaMater;
    }
    public void setMajor(String major) 
    {
        this.major = major;
    }

    public String getMajor() 
    {
        return major;
    }
    public void setPromotionInfo(String promotionInfo) 
    {
        this.promotionInfo = promotionInfo;
    }

    public String getPromotionInfo() 
    {
        return promotionInfo;
    }
    public void setContractNumber(String contractNumber) 
    {
        this.contractNumber = contractNumber;
    }

    public String getContractNumber() 
    {
        return contractNumber;
    }
    public void setContractType(String contractType) 
    {
        this.contractType = contractType;
    }

    public String getContractType() 
    {
        return contractType;
    }
    public void setContractStart(Date contractStart) 
    {
        this.contractStart = contractStart;
    }

    public Date getContractStart() 
    {
        return contractStart;
    }
    public void setContractEnd(Date contractEnd) 
    {
        this.contractEnd = contractEnd;
    }

    public Date getContractEnd() 
    {
        return contractEnd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workNumber", getWorkNumber())
            .append("name", getName())
            .append("idCard", getIdCard())
            .append("contactNumber", getContactNumber())
            .append("gender", getGender())
            .append("nationality", getNationality())
            .append("politicalStatus", getPoliticalStatus())
            .append("center", getCenter())
            .append("position", getPosition())
            .append("jobLevel", getJobLevel())
            .append("team", getTeam())
            .append("employmentType", getEmploymentType())
            .append("hireDate", getHireDate())
            .append("confirmDate", getConfirmDate())
            .append("originPlace", getOriginPlace())
            .append("hukouType", getHukouType())
            .append("homeAddress", getHomeAddress())
            .append("maritalStatus", getMaritalStatus())
            .append("emergencyContact", getEmergencyContact())
            .append("workYears", getWorkYears())
            .append("education", getEducation())
            .append("certification", getCertification())
            .append("recruitmentChannel", getRecruitmentChannel())
            .append("vehicleInfo", getVehicleInfo())
            .append("previousEmployer", getPreviousEmployer())
            .append("accommodation", getAccommodation())
            .append("almaMater", getAlmaMater())
            .append("major", getMajor())
            .append("promotionInfo", getPromotionInfo())
            .append("contractNumber", getContractNumber())
            .append("contractType", getContractType())
            .append("contractStart", getContractStart())
            .append("contractEnd", getContractEnd())
            .toString();
    }
}
