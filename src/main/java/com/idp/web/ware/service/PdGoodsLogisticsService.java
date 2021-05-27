package com.idp.web.ware.service;
import com.idp.web.ware.entity.PdGoodsLogistics;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 商品流转信息service接口
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
public interface PdGoodsLogisticsService{
	
 	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdGoodsLogistics
	 * @param page
	 * @return
	 */
	public Page<PdGoodsLogistics> findByPage(PdGoodsLogistics pdGoodsLogistics,Page<PdGoodsLogistics> page);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	查询
	 * </pre>
	 * 
	 * @param pdGoodsLogistics
	 * @return
	 */
	public List<PdGoodsLogistics> findBySearch(PdGoodsLogistics pdGoodsLogistics);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param PdGoodsLogistics
	 * @return
	 */
	public PdGoodsLogistics getById(String id);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	新增
	 * </pre>
	 * 
	 * @param pdGoodsLogistics
	 */
	public void add(PdGoodsLogistics pdGoodsLogistics);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	修改
	 * </pre>
	 * 
	 * @param pdGoodsLogistics
	 */
	public void update(PdGoodsLogistics pdGoodsLogistics);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(String id);
}
