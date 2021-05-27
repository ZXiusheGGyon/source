package com.idp.web.ware.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 商品实体类.
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
public class PdGoods extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**goodsId*/
	private String goodsId;
	/**商品名称*/
	private String goodsName;
	/**创建人*/
	private String userId;
	/**创建时间*/
	private Date createDate;
	
	
	/**
	 *方法: 取得String
	 *@return: String  goodsId
	 */
	public String getGoodsId(){
		return this.goodsId;
	}

	/**
	 *方法: 设置String
	 *@param: String  goodsId
	 */
	public void setGoodsId(String goodsId){
		this.goodsId = goodsId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  商品名称
	 */
	public String getGoodsName(){
		return this.goodsName;
	}

	/**
	 *方法: 设置String
	 *@param: String  商品名称
	 */
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  创建人
	 */
	public String getUserId(){
		return this.userId;
	}

	/**
	 *方法: 设置String
	 *@param: String  创建人
	 */
	public void setUserId(String userId){
		this.userId = userId;
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
