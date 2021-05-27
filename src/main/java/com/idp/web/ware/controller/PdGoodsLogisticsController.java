package com.idp.web.ware.controller;
import com.idp.web.ware.entity.PdGoodsLogistics;
import com.idp.web.ware.service.PdGoodsLogisticsService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;

import net.sf.json.JSONObject;

/**
 * 
 * 商品流转信息controller
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
@Controller
@RequestMapping("/pdGoodsLogistics")
public class PdGoodsLogisticsController extends BaseController {

	private Logger logger = Logger.getLogger(PdGoodsLogisticsController.class);

	@Resource
	private PdGoodsLogisticsService pdGoodsLogisticsService;
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "ware/pdGoodsLogisticsSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdGoodsLogistics
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(PdGoodsLogistics pdGoodsLogistics,Page<PdGoodsLogistics> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", pdGoodsLogisticsService.findByPage(pdGoodsLogistics, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdGoodsLogisticsList";
	}

	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/pdGoodsLogistics")
	public String pdGoodsLogistics(String id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				PdGoodsLogistics pdGoodsLogistics = pdGoodsLogisticsService.getById(id);
				request.setAttribute("pdGoodsLogistics", pdGoodsLogistics);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdGoodsLogistics";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	保存
	 * </pre>
	 * 
	 * @param pdGoodsLogistics
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(PdGoodsLogistics pdGoodsLogistics){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(pdGoodsLogistics.getId())){
				
				pdGoodsLogisticsService.update(pdGoodsLogistics);
			}
			// 新增
			else{
				
				pdGoodsLogisticsService.add(pdGoodsLogistics);
			}
			json.put("result", "save_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "save_fail");
		}
		
		return json.toString();
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(String id){
		
		JSONObject json = new JSONObject();
		
		try {
			
			pdGoodsLogisticsService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
