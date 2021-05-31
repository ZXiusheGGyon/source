package com.idp.web.ware.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 商品流转信息实体类.
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
public class PdGoodsLogistics extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private String id;
	/**userId*/
	private String userId;
	/**层级*/
	private Integer nodeLevel;
	/**节点其他信息*/
	private String otherMsg;
	/**商品信息*/
	private String goodsId;
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
	 *方法: 取得Integer
	 *@return: Integer  层级
	 */
	public Integer getNodeLevel(){
		return this.nodeLevel;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  层级
	 */
	public void setNodeLevel(Integer nodeLevel){
		this.nodeLevel = nodeLevel;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  节点其他信息
	 */
	public String getOtherMsg(){
		return this.otherMsg;
	}

	/**
	 *方法: 设置String
	 *@param: String  节点其他信息
	 */
	public void setOtherMsg(String otherMsg){
		this.otherMsg = otherMsg;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  商品信息
	 */
	public String getGoodsId(){
		return this.goodsId;
	}

	/**
	 *方法: 设置String
	 *@param: String  商品信息
	 */
	public void setGoodsId(String goodsId){
		this.goodsId = goodsId;
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
