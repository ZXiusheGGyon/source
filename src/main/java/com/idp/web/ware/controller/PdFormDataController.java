package com.idp.web.ware.controller;
import com.idp.web.ware.entity.PdFormData;
import com.idp.web.ware.service.PdFormDataService;
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
 * 商品数据controller
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
@RequestMapping("/pdFormData")
public class PdFormDataController extends BaseController {

	private Logger logger = Logger.getLogger(PdFormDataController.class);

	@Resource
	private PdFormDataService pdFormDataService;
	
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
		
		return "ware/pdFormDataSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdFormData
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(PdFormData pdFormData,Page<PdFormData> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", pdFormDataService.findByPage(pdFormData, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdFormDataList";
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
	@RequestMapping("/pdFormData")
	public String pdFormData(String id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				PdFormData pdFormData = pdFormDataService.getById(id);
				request.setAttribute("pdFormData", pdFormData);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdFormData";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	保存
	 * </pre>
	 * 
	 * @param pdFormData
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(PdFormData pdFormData){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(pdFormData.getId())){
				
				pdFormDataService.update(pdFormData);
			}
			// 新增
			else{
				
				pdFormDataService.add(pdFormData);
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
			
			pdFormDataService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
