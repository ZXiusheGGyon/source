package com.idp.web.ware.service.impl;
import com.idp.web.ware.service.PdFormDataService;
import com.idp.web.ware.dao.PdFormDataDao;
import com.idp.web.ware.entity.PdFormData;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.common.util.ResourceUtils;

/**
 * 
 * 商品数据service实现类
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
@Service("pdFormDataService")
public class PdFormDataServiceImpl implements PdFormDataService {

	@Resource
	private PdFormDataDao pdFormDataDao;
	
	@Override
	public Page<PdFormData> findByPage(PdFormData pdFormData, Page<PdFormData> page) {

		page.setResult(pdFormDataDao.find(pdFormData, page));
		
		return page;
	}

	@Override
	public List<PdFormData> findBySearch(PdFormData pdFormData) {

		return pdFormDataDao.find(pdFormData);
	}
	
	@Override
	public PdFormData getById(String id) {

		return pdFormDataDao.getById(id);
	}

	@Override
	public void add(PdFormData pdFormData) {

		pdFormData.setId(ResourceUtils.getUUID());
		pdFormDataDao.add(pdFormData);
	}
	
	@Override
	public void update(PdFormData pdFormData) {

		pdFormDataDao.update(pdFormData);
	}

	@Override
	public void delete(String id) {

		pdFormDataDao.delete(id);
	}//*=-0=-090-=-0/*-*//***-
 	
}