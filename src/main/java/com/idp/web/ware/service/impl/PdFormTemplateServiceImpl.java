package com.idp.web.ware.service.impl;
import com.idp.web.ware.service.PdFormTemplateService;
import com.idp.web.ware.dao.PdFormTemplateDao;
import com.idp.web.ware.entity.PdFormTemplate;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.common.util.ResourceUtils;

/**
 * 
 * 商品模板表service实现类
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
@Service("pdFormTemplateService")
public class PdFormTemplateServiceImpl implements PdFormTemplateService {

	@Resource
	private PdFormTemplateDao pdFormTemplateDao;
	
	@Override
	public Page<PdFormTemplate> findByPage(PdFormTemplate pdFormTemplate, Page<PdFormTemplate> page) {

		page.setResult(pdFormTemplateDao.find(pdFormTemplate, page));
		
		return page;
	}
	
	@Override
	public List<PdFormTemplate> findBySearch(PdFormTemplate pdFormTemplate) {

		return pdFormTemplateDao.find(pdFormTemplate);
	}
	
	@Override
	public PdFormTemplate getById(String id) {

		return pdFormTemplateDao.getById(id);
	}

	@Override
	public void add(PdFormTemplate pdFormTemplate) {

		pdFormTemplate.setId(ResourceUtils.getUUID());
		pdFormTemplateDao.add(pdFormTemplate);
	}
	
	@Override
	public void update(PdFormTemplate pdFormTemplate) {

		pdFormTemplateDao.update(pdFormTemplate);
	}

	@Override
	public void delete(String id) {

		pdFormTemplateDao.delete(id);
	}
 	
}