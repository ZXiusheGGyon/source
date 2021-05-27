package com.idp.web.ware.service.impl;
import com.idp.web.ware.service.PdFormTemplateAttributesService;
import com.idp.web.ware.dao.PdFormTemplateAttributesDao;
import com.idp.web.ware.entity.PdFormTemplateAttributes;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.common.util.ResourceUtils;

/**
 * 
 * 模板属性service实现类
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
@Service("pdFormTemplateAttributesService")
public class PdFormTemplateAttributesServiceImpl implements PdFormTemplateAttributesService {

	@Resource
	private PdFormTemplateAttributesDao pdFormTemplateAttributesDao;
	
	@Override
	public Page<PdFormTemplateAttributes> findByPage(PdFormTemplateAttributes pdFormTemplateAttributes, Page<PdFormTemplateAttributes> page) {

		page.setResult(pdFormTemplateAttributesDao.find(pdFormTemplateAttributes, page));
		
		return page;
	}
	
	@Override
	public List<PdFormTemplateAttributes> findBySearch(PdFormTemplateAttributes pdFormTemplateAttributes) {

		return pdFormTemplateAttributesDao.find(pdFormTemplateAttributes);
	}
	
	@Override
	public PdFormTemplateAttributes getById(String id) {

		return pdFormTemplateAttributesDao.getById(id);
	}

	@Override
	public void add(PdFormTemplateAttributes pdFormTemplateAttributes) {

		pdFormTemplateAttributes.setId(ResourceUtils.getUUID());
		pdFormTemplateAttributesDao.add(pdFormTemplateAttributes);
	}
	
	@Override
	public void update(PdFormTemplateAttributes pdFormTemplateAttributes) {

		pdFormTemplateAttributesDao.update(pdFormTemplateAttributes);
	}

	@Override
	public void delete(String id) {

		pdFormTemplateAttributesDao.delete(id);
	}
 	
}