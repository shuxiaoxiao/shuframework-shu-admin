package com.shuframework.admin.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 系统表_字典表
 * </p>
 *
 * @author shuheng
 * @since 2017-10-13
 */
@TableName("sys_dictionary")
public class SysDictionary extends Model<SysDictionary> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 父编码
     */
	private Long pid;
    /**
     * 类型编码
     */
	@TableField("type_code")
	private String typeCode;
    /**
     * 显示的文字
     */
	private String name;
    /**
     * 存的具体值
     */
	private String value;
    /**
     * 描述
     */
	private String description;
    /**
     * 状态，0不可用 1可用
     */
	private String enable;
    /**
     * 排序号
     */
	private Integer sortid;
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

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public Integer getSortid() {
		return sortid;
	}

	public void setSortid(Integer sortid) {
		this.sortid = sortid;
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
		return "SysDictionary{" +
			"id=" + id +
			", pid=" + pid +
			", typeCode=" + typeCode +
			", name=" + name +
			", value=" + value +
			", description=" + description +
			", enable=" + enable +
			", sortid=" + sortid +
			", createtime=" + createtime +
			", updatetime=" + updatetime +
			"}";
	}
}
