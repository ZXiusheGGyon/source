package com.idp.web.ware.controller;
import com.idp.web.ware.entity.PdGoods;
import com.idp.web.ware.service.PdGoodsService;
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
 * 商品controller
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
@RequestMapping("/pdGoods")
public class PdGoodsController extends BaseController {

	private Logger logger = Logger.getLogger(PdGoodsController.class);

	@Resource
	private PdGoodsService pdGoodsService;
	
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
		
		return "ware/pdGoodsSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdGoods
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(PdGoods pdGoods,Page<PdGoods> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", pdGoodsService.findByPage(pdGoods, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdGoodsList";
	}

	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param goodsId
	 * @param request
	 * @return
	 */
	@RequestMapping("/pdGoods")
	public String pdGoods(String goodsId,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(goodsId)){
				
				PdGoods pdGoods = pdGoodsService.getById(goodsId);
				request.setAttribute("pdGoods", pdGoods);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdGoods";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	保存
	 * </pre>
	 * 
	 * @param pdGoods
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(PdGoods pdGoods){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(pdGoods.getGoodsId())){
				
				pdGoodsService.update(pdGoods);
			}
			// 新增
			else{
				
				pdGoodsService.add(pdGoods);
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
	 * @param goodsId
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(String goodsId){
		
		JSONObject json = new JSONObject();
		
		try {
			
			pdGoodsService.delete(goodsId);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
