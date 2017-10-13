package com.shuframework.admin.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 系统表_部门
 * </p>
 *
 * @author shuheng
 * @since 2017-10-13
 */
@TableName("sys_dept")
public class SysDept extends Model<SysDept> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 部门id
     */
	private String deptid;
    /**
     * 部门名称
     */
	private String name;
    /**
     * 父id
     */
	private String pid;
    /**
     * 层级
     */
	private String levels;
    /**
     * 创建时间
     */
	private Date createtime;
    /**
     * 更新时间
     */
	private Date updatetime;
    /**
     * 描述
     */
	private String description;
    /**
     * 排序号
     */
	private Integer sortid;
    /**
     * 节点状态，'open' 或 'closed'
     */
	private String state;
    /**
     * 状态, 0不可以 1可用
     */
	private String enable;
    /**
     * 部门类型
     */
	private String type;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSortid() {
		return sortid;
	}

	public void setSortid(Integer sortid) {
		this.sortid = sortid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysDept{" +
			"id=" + id +
			", deptid=" + deptid +
			", name=" + name +
			", pid=" + pid +
			", levels=" + levels +
			", createtime=" + createtime +
			", updatetime=" + updatetime +
			", description=" + description +
			", sortid=" + sortid +
			", state=" + state +
			", enable=" + enable +
			", type=" + type +
			"}";
	}
}
