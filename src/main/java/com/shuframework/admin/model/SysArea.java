package com.shuframework.admin.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 地理行政区划
 * </p>
 *
 * @author shuheng
 * @since 2017-10-13
 */
@TableName("sys_area")
public class SysArea extends Model<SysArea> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("area_id")
	private String areaId;
	@TableField("parent_id")
	private String parentId;
    /**
     * 全称
     */
	private String name;
    /**
     * 简称
     */
	@TableField("short_name")
	private String shortName;
    /**
     * 关联序号
     */
	private String seq;
    /**
     * 排序
     */
	private Integer sortid;
    /**
     * 层级
     */
	private Integer levels;
    /**
     * 拼音
     */
	private String pinyin;
    /**
     * 简拼
     */
	private String jianpin;
    /**
     * 首字母
     */
	@TableField("first_char")
	private String firstChar;
    /**
     * 电话区号
     */
	@TableField("phone_area_code")
	private String phoneAreaCode;
    /**
     * 邮编
     */
	@TableField("zip_code")
	private String zipCode;
    /**
     * 状态，0不可用 1可用
     */
	private String enable;
    /**
     * 备注
     */
	private String remark;
    /**
     * 经度
     */
	private BigDecimal longitude;
    /**
     * 纬度
     */
	private BigDecimal latitude;
    /**
     * 创建时间
     */
	private Date createtime;
    /**
     * 更新时间
     */
	private Date updatetime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public Integer getSortid() {
		return sortid;
	}

	public void setSortid(Integer sortid) {
		this.sortid = sortid;
	}

	public Integer getLevels() {
		return levels;
	}

	public void setLevels(Integer levels) {
		this.levels = levels;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getJianpin() {
		return jianpin;
	}

	public void setJianpin(String jianpin) {
		this.jianpin = jianpin;
	}

	public String getFirstChar() {
		return firstChar;
	}

	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}

	public String getPhoneAreaCode() {
		return phoneAreaCode;
	}

	public void setPhoneAreaCode(String phoneAreaCode) {
		this.phoneAreaCode = phoneAreaCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysArea{" +
			"id=" + id +
			", areaId=" + areaId +
			", parentId=" + parentId +
			", name=" + name +
			", shortName=" + shortName +
			", seq=" + seq +
			", sortid=" + sortid +
			", levels=" + levels +
			", pinyin=" + pinyin +
			", jianpin=" + jianpin +
			", firstChar=" + firstChar +
			", phoneAreaCode=" + phoneAreaCode +
			", zipCode=" + zipCode +
			", enable=" + enable +
			", remark=" + remark +
			", longitude=" + longitude +
			", latitude=" + latitude +
			", createtime=" + createtime +
			", updatetime=" + updatetime +
			"}";
	}
}
