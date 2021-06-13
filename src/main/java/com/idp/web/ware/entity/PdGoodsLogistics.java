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
 * 	2017-12-14 HS
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
	/**追溯码*/
	private String goodsCode;
	/**入库单号*/
	private String orderNumber;
	/**单据类型*/
	private String orderType;
	/**发货单位(xx公司生产)*/
	private String companyInformationId;
	/**入库负责人*/
	private String head;
	/**追溯码文件地址*/
	private String goodsCodesPath;
	
	
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
	
	/**
	 *方法: 取得String
	 *@return: String  追溯码
	 */
	public String getGoodsCode(){
		return this.goodsCode;
	}

	/**
	 *方法: 设置String
	 *@param: String  追溯码
	 */
	public void setGoodsCode(String goodsCode){
		this.goodsCode = goodsCode;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  入库单号
	 */
	public String getOrderNumber(){
		return this.orderNumber;
	}

	/**
	 *方法: 设置String
	 *@param: String  入库单号
	 */
	public void setOrderNumber(String orderNumber){
		this.orderNumber = orderNumber;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  单据类型
	 */
	public String getOrderType(){
		return this.orderType;
	}

	/**
	 *方法: 设置String
	 *@param: String  单据类型
	 */
	public void setOrderType(String orderType){
		this.orderType = orderType;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  发货单位(xx公司生产)
	 */
	public String getCompanyInformationId(){
		return this.companyInformationId;
	}

	/**
	 *方法: 设置String
	 *@param: String  发货单位(xx公司生产)
	 */
	public void setCompanyInformationId(String companyInformationId){
		this.companyInformationId = companyInformationId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  入库负责人
	 */
	public String getHead(){
		return this.head;
	}

	/**
	 *方法: 设置String
	 *@param: String  入库负责人
	 */
	public void setHead(String head){
		this.head = head;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  追溯码文件地址
	 */
	public String getGoodsCodesPath(){
		return this.goodsCodesPath;
	}

	/**
	 *方法: 设置String
	 *@param: String  追溯码文件地址
	 */
	public void setGoodsCodesPath(String goodsCodesPath){
		this.goodsCodesPath = goodsCodesPath;
	}
	
	
}
