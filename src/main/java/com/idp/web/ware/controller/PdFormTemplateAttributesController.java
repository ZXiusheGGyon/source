package com.idp.web.ware.controller;
import com.idp.common.response.ResponseCode;
import com.idp.web.ware.entity.PdFormTemplateAttributes;
import com.idp.web.ware.service.PdFormTemplateAttributesService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;

import net.sf.json.JSONObject;
/**
 * 
 * 模板属性controller
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
@RequestMapping("/pdFormTemplateAttributes")
public class PdFormTemplateAttributesController extends BaseController {

	private Logger logger = Logger.getLogger(PdFormTemplateAttributesController.class);

	@Resource
	private PdFormTemplateAttributesService pdFormTemplateAttributesService;
	
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
		
		return "ware/pdFormTemplateAttributesSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	分页查询
	 * </pre>
	 * 
	 * @param pdFormTemplateAttributes
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(PdFormTemplateAttributes pdFormTemplateAttributes,Page<PdFormTemplateAttributes> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", pdFormTemplateAttributesService.findByPage(pdFormTemplateAttributes, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdFormTemplateAttributesList";
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
	@RequestMapping("/pdFormTemplateAttributes")
	public String pdFormTemplateAttributes(String id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				PdFormTemplateAttributes pdFormTemplateAttributes = pdFormTemplateAttributesService.getById(id);
				request.setAttribute("pdFormTemplateAttributes", pdFormTemplateAttributes);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "ware/pdFormTemplateAttributes";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-07 HS
	 * 	保存
	 * </pre>
	 * 
	 * @param pdFormTemplateAttributes
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(PdFormTemplateAttributes pdFormTemplateAttributes){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(pdFormTemplateAttributes.getId())){
				
				pdFormTemplateAttributesService.update(pdFormTemplateAttributes);
			}
			// 新增
			else{
				
				pdFormTemplateAttributesService.add(pdFormTemplateAttributes);
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
			
			pdFormTemplateAttributesService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
	/**
	 * 模板属性新增接口
	 * @param jsonList
	 * @return
	 */
	@RequestMapping(value = "/addBatchAttr",method = RequestMethod.POST)
	@ResponseBody
	public String addBatchAttr(@RequestParam("jsonList") String jsonList){

		if(pdFormTemplateAttributesService.addBatchAttr(jsonList))
			return success(ResponseCode.SUCCESS,null,"添加成功");
		else
			return success(ResponseCode.ERROR,null,"添加失败");

	}

}
