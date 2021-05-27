package com.idp.web.ware.service;
import com.idp.web.ware.entity.PdFormData;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 商品数据service接口
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
public interface PdFormDataService{
	
 	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdFormData
	 * @param page
	 * @return
	 */
	public Page<PdFormData> findByPage(PdFormData pdFormData,Page<PdFormData> page);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	查询
	 * </pre>
	 * 
	 * @param pdFormData
	 * @return
	 */
	public List<PdFormData> findBySearch(PdFormData pdFormData);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param PdFormData
	 * @return
	 */
	public PdFormData getById(String id);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	新增
	 * </pre>
	 * 
	 * @param pdFormData
	 */
	public void add(PdFormData pdFormData);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	修改
	 * </pre>
	 * 
	 * @param pdFormData
	 */
	public void update(PdFormData pdFormData);
	
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
