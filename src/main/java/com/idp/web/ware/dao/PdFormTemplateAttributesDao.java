package com.idp.web.ware.dao;
import com.idp.web.ware.entity.PdFormTemplateAttributes;
import com.idp.common.base.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * 模板属性dao接口.
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
@Repository
public interface PdFormTemplateAttributesDao extends BaseDao<PdFormTemplateAttributes, String> {


    /**
     * 批量加入数据
     * @param list
     * @return
     */
    int addBatchAttr(List<PdFormTemplateAttributes> list);

}