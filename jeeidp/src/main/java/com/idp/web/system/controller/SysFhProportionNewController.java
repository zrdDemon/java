package com.idp.web.system.controller;
import com.idp.web.system.entity.SysFhProportionNew;
import com.idp.web.system.service.SysFhProportionNewService;
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
 * 分红系数管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2017-11-02 周润德
 * 	新建文件
 * </pre>
 * 
 * @author 
 * <pre>
 * SD
 * 	周润德
 * PG
 *	周润德
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
@RequestMapping("/sysFhProportionNew")
public class SysFhProportionNewController extends BaseController {

	private Logger logger = Logger.getLogger(SysFhProportionNewController.class);

	@Resource
	private SysFhProportionNewService sysFhProportionNewService;
	
	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "system/fh/sysFhProportionNewSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	分页查询
	 * </pre>
	 * 
	 * @param sysFhProportionNew
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(SysFhProportionNew sysFhProportionNew,Page<SysFhProportionNew> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", sysFhProportionNewService.findByPage(sysFhProportionNew, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "system/fh/sysFhProportionNewList";
	}

	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/sysFhProportionNew")
	public String sysFhProportionNew(String id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				SysFhProportionNew sysFhProportionNew = sysFhProportionNewService.getById(id);
				request.setAttribute("sysFhProportionNew", sysFhProportionNew);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "system/fh/sysFhProportionNew";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	保存
	 * </pre>
	 * 
	 * @param sysFhProportionNew
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(SysFhProportionNew sysFhProportionNew){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(sysFhProportionNew.getId())){
				
				sysFhProportionNewService.update(sysFhProportionNew);
			}
			// 新增
			else{
				
				sysFhProportionNewService.add(sysFhProportionNew);
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
	 * 	2017-11-02 周润德
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
			
			sysFhProportionNewService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
