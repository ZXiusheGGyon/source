package com.idp.web.ware.controller;
import com.idp.web.ware.entity.PdFormTemplate;
import com.idp.web.ware.service.PdFormTemplateService;
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
 * 商品模板表controller
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
@RequestMapping("/pdFormTemplate")
public class PdFormTemplateController extends BaseController {

	private Logger logger = Logger.getLogger(PdFormTemplateController.class);

	@Resource
	private PdFormTemplateService pdFormTemplateService;
	
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
		
		return "ware/pdFormTemplateSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdFormTemplate
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(PdFormTemplate pdFormTemplate,Page<PdFormTemplate> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", pdFormTemplateService.findByPage(pdFormTemplate, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdFormTemplateList";
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
	@RequestMapping("/pdFormTemplate")
	public String pdFormTemplate(String id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				PdFormTemplate pdFormTemplate = pdFormTemplateService.getById(id);
				request.setAttribute("pdFormTemplate", pdFormTemplate);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdFormTemplate";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	保存
	 * </pre>
	 * 
	 * @param pdFormTemplate
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(PdFormTemplate pdFormTemplate){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(pdFormTemplate.getId())){
				
				pdFormTemplateService.update(pdFormTemplate);
			}
			// 新增
			else{
				
				pdFormTemplateService.add(pdFormTemplate);
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
			
			pdFormTemplateService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
