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
 * 系统管理_地理行政区划
 * </p>
 *
 * @author shuheng
 * @since 2018-03-31
 */
@TableName("sys_area")
public class SysArea extends Model<SysArea> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 行政区号
     */
	@TableField("area_code")
	private String areaCode;
    /**
     * 父id
     */
	@TableField("parent_id")
	private Long parentId;
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
     * 关联路径(用逗号分隔)
     */
	private String path;
    /**
     * 关联路径名称
     */
	@TableField("path_name")
	private String pathName;
    /**
     * 排序
     */
	private Integer sortid;
    /**
     * 层级
     */
	private Integer levels;
    /**
     * 类型 1省 2自治区 3直辖市 4特别行政区 省会市 3地级市 4区 5县
     */
	@TableField("area_type")
	private Integer areaType;
    /**
     * 区域类型 1华北 2华东 3东北 4中南 5西南 6西北 7港澳台
     */
	@TableField("region_type")
	private Integer regionType;
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
	private Integer enable;
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
	@TableField("create_time")
	private Date createTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
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

	public Integer getAreaType() {
		return areaType;
	}

	public void setAreaType(Integer areaType) {
		this.areaType = areaType;
	}

	public Integer getRegionType() {
		return regionType;
	}

	public void setRegionType(Integer regionType) {
		this.regionType = regionType;
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

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysArea{" +
			"id=" + id +
			", areaCode=" + areaCode +
			", parentId=" + parentId +
			", name=" + name +
			", shortName=" + shortName +
			", path=" + path +
			", pathName=" + pathName +
			", sortid=" + sortid +
			", levels=" + levels +
			", areaType=" + areaType +
			", regionType=" + regionType +
			", pinyin=" + pinyin +
			", jianpin=" + jianpin +
			", firstChar=" + firstChar +
			", phoneAreaCode=" + phoneAreaCode +
			", zipCode=" + zipCode +
			", enable=" + enable +
			", remark=" + remark +
			", longitude=" + longitude +
			", latitude=" + latitude +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			"}";
	}
}
