package com.idp.web.system.service;
import com.idp.web.system.entity.SysFhProportionNew;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 分红系数管理service接口
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
public interface SysFhProportionNewService{
	
 	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	分页查询
	 * </pre>
	 * 
	 * @param sysFhProportionNew
	 * @param page
	 * @return
	 */
	public Page<SysFhProportionNew> findByPage(SysFhProportionNew sysFhProportionNew, Page <SysFhProportionNew> page);
	
	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	查询
	 * </pre>
	 * 
	 * @param sysFhProportionNew
	 * @return
	 */
	public List<SysFhProportionNew> findBySearch(SysFhProportionNew sysFhProportionNew);
	
	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param SysFhProportionNew
	 * @return
	 */
	public SysFhProportionNew getById(String id);
	
	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	新增
	 * </pre>
	 * 
	 * @param sysFhProportionNew
	 */
	public void add(SysFhProportionNew sysFhProportionNew);
	
	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	修改
	 * </pre>
	 * 
	 * @param sysFhProportionNew
	 */
	public void update(SysFhProportionNew sysFhProportionNew);
	
	/**
	 * 
	 * <pre>
	 * 	2017-11-02 周润德
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(String id);
}
