package com.idp.web.ware.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 模板属性实体类.
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
public class PdFormTemplateAttributes extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private String id;
	/**模板id*/
	private String templateId;
	/**属性名称*/
	private String attributesName;
	/**元素属性*/
	private String elementAttribute;
	/**元素类型*/
	private String elementType;
	/**元素排序*/
	private Integer elementOrder;
	/**描述*/
	private String elementDescribe;
	/**是否为空*/
	private String isNull;
	/**元素选项内容*/
	private String elementOption;
	/**元素格式*/
	private String elementFormat;
	/**是否显示*/
	private String isShow;
	
	
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
	 *@return: String  模板id
	 */
	public String getTemplateId(){
		return this.templateId;
	}

	/**
	 *方法: 设置String
	 *@param: String  模板id
	 */
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  属性名称
	 */
	public String getAttributesName(){
		return this.attributesName;
	}

	/**
	 *方法: 设置String
	 *@param: String  属性名称
	 */
	public void setAttributesName(String attributesName){
		this.attributesName = attributesName;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  元素属性
	 */
	public String getElementAttribute(){
		return this.elementAttribute;
	}

	/**
	 *方法: 设置String
	 *@param: String  元素属性
	 */
	public void setElementAttribute(String elementAttribute){
		this.elementAttribute = elementAttribute;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  元素类型
	 */
	public String getElementType(){
		return this.elementType;
	}

	/**
	 *方法: 设置String
	 *@param: String  元素类型
	 */
	public void setElementType(String elementType){
		this.elementType = elementType;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  元素排序
	 */
	public Integer getElementOrder(){
		return this.elementOrder;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  元素排序
	 */
	public void setElementOrder(Integer elementOrder){
		this.elementOrder = elementOrder;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  描述
	 */
	public String getElementDescribe(){
		return this.elementDescribe;
	}

	/**
	 *方法: 设置String
	 *@param: String  描述
	 */
	public void setElementDescribe(String elementDescribe){
		this.elementDescribe = elementDescribe;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  是否为空
	 */
	public String getIsNull(){
		return this.isNull;
	}

	/**
	 *方法: 设置String
	 *@param: String  是否为空
	 */
	public void setIsNull(String isNull){
		this.isNull = isNull;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  元素选项内容
	 */
	public String getElementOption(){
		return this.elementOption;
	}

	/**
	 *方法: 设置String
	 *@param: String  元素选项内容
	 */
	public void setElementOption(String elementOption){
		this.elementOption = elementOption;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  元素格式
	 */
	public String getElementFormat(){
		return this.elementFormat;
	}

	/**
	 *方法: 设置String
	 *@param: String  元素格式
	 */
	public void setElementFormat(String elementFormat){
		this.elementFormat = elementFormat;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  是否显示
	 */
	public String getIsShow(){
		return this.isShow;
	}

	/**
	 *方法: 设置String
	 *@param: String  是否显示
	 */
	public void setIsShow(String isShow){
		this.isShow = isShow;
	}
	
	
}
