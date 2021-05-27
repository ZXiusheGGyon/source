package com.idp.web.ware.service;
import com.idp.web.ware.entity.PdFormTemplate;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 商品模板表service接口
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
public interface PdFormTemplateService{
	
 	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdFormTemplate
	 * @param page
	 * @return
	 */
	public Page<PdFormTemplate> findByPage(PdFormTemplate pdFormTemplate,Page<PdFormTemplate> page);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	查询
	 * </pre>
	 * 
	 * @param pdFormTemplate
	 * @return
	 */
	public List<PdFormTemplate> findBySearch(PdFormTemplate pdFormTemplate);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param PdFormTemplate
	 * @return
	 */
	public PdFormTemplate getById(String id);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	新增
	 * </pre>
	 * 
	 * @param pdFormTemplate
	 */
	public void add(PdFormTemplate pdFormTemplate);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	修改
	 * </pre>
	 * 
	 * @param pdFormTemplate
	 */
	public void update(PdFormTemplate pdFormTemplate);
	
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
