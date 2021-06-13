package com.idp.web.ware.service.impl;
import com.idp.web.ware.service.PdGoodsService;
import com.idp.web.ware.dao.PdGoodsDao;
import com.idp.web.ware.entity.PdGoods;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.common.util.ResourceUtils;

/**
 * 
 * 商品service实现类
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
@Service("pdGoodsService")
public class PdGoodsServiceImpl implements PdGoodsService {

	@Resource
	private PdGoodsDao pdGoodsDao;
	
	@Override
	public Page<PdGoods> findByPage(PdGoods pdGoods, Page<PdGoods> page) {

		page.setResult(pdGoodsDao.find(pdGoods, page));
		
		return page;
	}
	
	@Override
	public List<PdGoods> findBySearch(PdGoods pdGoods) {

		return pdGoodsDao.find(pdGoods);
	}
	
	@Override
	public PdGoods getById(String goodsId) {

		return pdGoodsDao.getById(goodsId);
	}

	@Override
	public void add(PdGoods pdGoods) {

		pdGoods.setGoodsId(ResourceUtils.getUUID());
		pdGoodsDao.add(pdGoods);
	}
	
	@Override
	public void update(PdGoods pdGoods) {

		pdGoodsDao.update(pdGoods);
	}

	@Override
	public void delete(String goodsId) {

		pdGoodsDao.delete(goodsId);
	}

	@Override
	public List<PdGoods> selectGoodsByUserId(String userId) {
		return pdGoodsDao.selectGoodsByUserId(userId);
	}
}