package com.idp.web.ware.service;
import com.idp.web.ware.entity.PdFormTemplateAttributes;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 模板属性service接口
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
public interface PdFormTemplateAttributesService{
	
 	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdFormTemplateAttributes
	 * @param page
	 * @return
	 */
	public Page<PdFormTemplateAttributes> findByPage(PdFormTemplateAttributes pdFormTemplateAttributes,Page<PdFormTemplateAttributes> page);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	查询
	 * </pre>
	 * 
	 * @param pdFormTemplateAttributes
	 * @return
	 */
	public List<PdFormTemplateAttributes> findBySearch(PdFormTemplateAttributes pdFormTemplateAttributes);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param PdFormTemplateAttributes
	 * @return
	 */
	public PdFormTemplateAttributes getById(String id);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	新增
	 * </pre>
	 * 
	 * @param pdFormTemplateAttributes
	 */
	public void add(PdFormTemplateAttributes pdFormTemplateAttributes);
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	修改
	 * </pre>
	 * 
	 * @param pdFormTemplateAttributes
	 */
	public void update(PdFormTemplateAttributes pdFormTemplateAttributes);
	
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
