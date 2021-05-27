package com.idp.web.ware.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 商品数据实体类.
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
public class PdFormData extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private String id;
	/**商品数据*/
	private String goodsData;
	/**模板属性id*/
	private String templateAttributesId;
	/**商品id*/
	private String goodsId;
	
	
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
	 *@return: String  商品数据
	 */
	public String getGoodsData(){
		return this.goodsData;
	}

	/**
	 *方法: 设置String
	 *@param: String  商品数据
	 */
	public void setGoodsData(String goodsData){
		this.goodsData = goodsData;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  模板属性id
	 */
	public String getTemplateAttributesId(){
		return this.templateAttributesId;
	}

	/**
	 *方法: 设置String
	 *@param: String  模板属性id
	 */
	public void setTemplateAttributesId(String templateAttributesId){
		this.templateAttributesId = templateAttributesId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  商品id
	 */
	public String getGoodsId(){
		return this.goodsId;
	}

	/**
	 *方法: 设置String
	 *@param: String  商品id
	 */
	public void setGoodsId(String goodsId){
		this.goodsId = goodsId;
	}
	
	
}
