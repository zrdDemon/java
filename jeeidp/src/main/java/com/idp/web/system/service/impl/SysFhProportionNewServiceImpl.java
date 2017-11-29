package com.idp.web.system.service.impl;
import com.idp.web.system.service.SysFhProportionNewService;
import com.idp.web.system.dao.SysFhProportionNewDao;
import com.idp.web.system.entity.SysFhProportionNew;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.common.util.ResourceUtils;

/**
 * 
 * 分红系数管理service实现类
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
@Service("sysFhProportionNewService")
public class SysFhProportionNewServiceImpl implements SysFhProportionNewService {

	@Resource
	private SysFhProportionNewDao sysFhProportionNewDao;
	
	@Override
	public Page<SysFhProportionNew> findByPage(SysFhProportionNew sysFhProportionNew, Page<SysFhProportionNew> page) {

		page.setResult(sysFhProportionNewDao.find(sysFhProportionNew, page));
		
		return page;
	}
	
	@Override
	public List<SysFhProportionNew> findBySearch(SysFhProportionNew sysFhProportionNew) {

		return sysFhProportionNewDao.find(sysFhProportionNew);
	}
	
	@Override
	public SysFhProportionNew getById(String id) {

		return sysFhProportionNewDao.getById(id);
	}

	@Override
	public void add(SysFhProportionNew sysFhProportionNew) {

		sysFhProportionNew.setId(ResourceUtils.getUUID());
		sysFhProportionNewDao.add(sysFhProportionNew);
	}
	
	@Override
	public void update(SysFhProportionNew sysFhProportionNew) {

		sysFhProportionNewDao.update(sysFhProportionNew);
	}

	@Override
	public void delete(String id) {

		sysFhProportionNewDao.delete(id);
	}
 	
}