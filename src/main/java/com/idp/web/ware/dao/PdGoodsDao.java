package com.idp.web.ware.dao;
import com.idp.web.ware.entity.PdGoods;
import com.idp.common.base.BaseDao;

import java.util.List;

/**
 * 
 * 商品dao接口.
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
public interface PdGoodsDao extends BaseDao<PdGoods, String> {
    public List<PdGoods> selectGoodsByUserId(String userId);

}