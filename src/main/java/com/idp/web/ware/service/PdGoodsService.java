package com.idp.web.ware.service;
import com.idp.web.ware.entity.PdGoods;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 商品service接口
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
public interface PdGoodsService{
	
 	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdGoods
	 * @param page
	 * @return
	 */
	public Page<PdGoods> findByPage(PdGoods pdGoods,Page<PdGoods> page);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	查询
	 * </pre>
	 * 
	 * @param pdGoods
	 * @return
	 */
	public List<PdGoods> findBySearch(PdGoods pdGoods);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param PdGoods
	 * @return
	 */
	public PdGoods getById(String goodsId);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	新增
	 * </pre>
	 * 
	 * @param pdGoods
	 */
	public void add(PdGoods pdGoods);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	修改
	 * </pre>
	 * 
	 * @param pdGoods
	 */
	public void update(PdGoods pdGoods);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	删除
	 * </pre>
	 * 
	 * @param goodsId
	 */
	public void delete(String goodsId);

	/**
	 * author hs
	 * @param userId
	 * @return
	 */
	public List<PdGoods> selectGoodsByUserId(String userId);
}
