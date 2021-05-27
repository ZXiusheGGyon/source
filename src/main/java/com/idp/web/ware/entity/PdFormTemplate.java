package com.idp.web.ware.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 商品模板表实体类.
 * 
 * <pre>
 * 	历史记录：
 * 	2017-12-07 HS
 * 	新建文件
 * </pre>
 * 
 * @author 
 * <pre>
 * SD
 * 	HS
 * PG
 *	HS
 * UT
 *
 * MA
 * </pre>
 * @version $Rev$
 *
 * <p/> $Id$
 *
 */
public class PdFormTemplate extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private String id;
	/**userId*/
	private String userId;
	/**模板名称*/
	private String templateName;
	/**备注*/
	private String remark;
	/**创建时间*/
	private Date createDate;
	
	
	/**
	 *方法: 取得String
	 *@return: String  id
	 */
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置String
	 *@param: String  id
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  userId
	 */
	public String getUserId(){
		return this.userId;
	}

	/**
	 *方法: 设置String
	 *@param: String  userId
	 */
	public void setUserId(String userId){
		this.userId = userId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  模板名称
	 */
	public String getTemplateName(){
		return this.templateName;
	}

	/**
	 *方法: 设置String
	 *@param: String  模板名称
	 */
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  备注
	 */
	public String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置String
	 *@param: String  备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  创建时间
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  创建时间
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	
	
}
