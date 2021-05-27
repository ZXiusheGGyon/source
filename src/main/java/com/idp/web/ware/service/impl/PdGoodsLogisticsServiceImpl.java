package com.idp.web.ware.service.impl;
import com.idp.web.ware.service.PdGoodsLogisticsService;
import com.idp.web.ware.dao.PdGoodsLogisticsDao;
import com.idp.web.ware.entity.PdGoodsLogistics;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.common.util.ResourceUtils;

/**
 * 
 * 商品流转信息service实现类
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
@Service("pdGoodsLogisticsService")
public class PdGoodsLogisticsServiceImpl implements PdGoodsLogisticsService {

	@Resource
	private PdGoodsLogisticsDao pdGoodsLogisticsDao;
	
	@Override
	public Page<PdGoodsLogistics> findByPage(PdGoodsLogistics pdGoodsLogistics, Page<PdGoodsLogistics> page) {

		page.setResult(pdGoodsLogisticsDao.find(pdGoodsLogistics, page));
		
		return page;
	}
	
	@Override
	public List<PdGoodsLogistics> findBySearch(PdGoodsLogistics pdGoodsLogistics) {

		return pdGoodsLogisticsDao.find(pdGoodsLogistics);
	}
	
	@Override
	public PdGoodsLogistics getById(String id) {

		return pdGoodsLogisticsDao.getById(id);
	}

	@Override
	public void add(PdGoodsLogistics pdGoodsLogistics) {

		pdGoodsLogistics.setId(ResourceUtils.getUUID());
		pdGoodsLogisticsDao.add(pdGoodsLogistics);
	}
	
	@Override
	public void update(PdGoodsLogistics pdGoodsLogistics) {

		pdGoodsLogisticsDao.update(pdGoodsLogistics);
	}

	@Override
	public void delete(String id) {

		pdGoodsLogisticsDao.delete(id);
	}
 	
}