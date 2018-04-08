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
 * 系统管理_部门
 * </p>
 *
 * @author shuheng
 * @since 2018-03-31
 */
@TableName("sys_dept")
public class SysDept extends Model<SysDept> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 部门id
     */
	@TableField("dept_code")
	private String deptCode;
    /**
     * 部门名称
     */
	private String name;
    /**
     * 父id
     */
	@TableField("parent_id")
	private Long parentId;
    /**
     * 层级
     */
	private String levels;
    /**
     * 关联路径(用逗号分隔)
     */
	private String path;
    /**
     * 描述
     */
	private String description;
    /**
     * 状态, 0不可以 1可用
     */
	private Integer enable;
    /**
     * 排序号
     */
	private Integer sortid;
    /**
     * 部门类型
     */
	private Integer type;
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

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getSortid() {
		return sortid;
	}

	public void setSortid(Integer sortid) {
		this.sortid = sortid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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
		return "SysDept{" +
			"id=" + id +
			", deptCode=" + deptCode +
			", name=" + name +
			", parentId=" + parentId +
			", levels=" + levels +
			", path=" + path +
			", description=" + description +
			", enable=" + enable +
			", sortid=" + sortid +
			", type=" + type +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			"}";
	}
}
