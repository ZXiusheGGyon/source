package com.idp.web.ware.controller;
import com.idp.common.constant.SessionAttr;
import com.idp.common.model.UploadModel;
import com.idp.common.util.UploadUtils;
import com.idp.web.system.entity.SysUser;
import com.idp.web.ware.dao.PdGoodsDao;
import com.idp.web.ware.entity.PdGoods;
import com.idp.web.ware.entity.PdGoodsLogistics;
import com.idp.web.ware.service.PdGoodsLogisticsService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;

import net.sf.json.JSONObject;

import java.util.List;

/**
 * 
 * 商品流转信息controller
 * 
 * <pre>
 * 	历史记录：
 * 	2017-12-14 HS
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

	@Resource
	private PdGoodsDao pdGoodsDao;
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-14 HS
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "ware/goods_logistics/pdGoodsLogisticsSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-14 HS
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
		
		return "ware/goods_logistics/pdGoodsLogisticsList";
	}

	/**
	 * 
	 * <pre>
	 * 	2017-12-14 HS
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
		
		return "ware/goods_logistics/pdGoodsLogistics";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-12-14 HS
	 * 	保存
	 * </pre>
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(HttpServletRequest request){
		PdGoodsLogistics pdGoodsLogistics = new PdGoodsLogistics();
		JSONObject json = new JSONObject();
		
		try {
			HttpSession session = request.getSession();
			SysUser sysUser = (SysUser) session.getAttribute(SessionAttr.USER_LOGIN.getValue());
			pdGoodsLogistics.setUserId(sysUser.getId());

			List<PdGoods> pdGoodses = pdGoodsDao.selectGoodsByUserId(sysUser.getId());
			request.setAttribute("pdGoodses", pdGoodses);

			UploadModel model = new UploadModel(UploadUtils.getServerUploadBasePath(UploadUtils.PATH_IMAGES),
					UploadModel.IMAGES, pdGoodsLogistics);
			UploadUtils.uploadFileSealedObject(request, model);

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
	 * 	2017-12-14 HS
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

	/**
	 * author hs
	 * @param request
	 * @return 跳转页面
	 */
	@RequestMapping("/addPdGoodsLogisticsView")
	public String addPdGoodsLogisticsView(HttpServletRequest request){
		HttpSession session = request.getSession();
		SysUser sysUser = (SysUser) session.getAttribute(SessionAttr.USER_LOGIN.getValue());
		List<PdGoods> pdGoodses = pdGoodsDao.selectGoodsByUserId(sysUser.getId());
		request.setAttribute("pdGoodses", pdGoodses);

		return "ware/goods_logistics/pdGoodsLogistics";
	}
}
