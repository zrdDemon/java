package com.idp.web.system.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 分红系数管理实体类.
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
public class SysFhProportionNew extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private String id;
	/**分红比例*/
	private BigDecimal fhValues;
	/**createDate*/
	private Date createDate;
	/**endDate*/
	private Date endDate;
	/**beginDate*/
	private Date beginDate;
	/**是否启用 0是 1否*/
	private Integer isDelete;
	/**分红的积分数目*/
	private BigDecimal jfNum;
	
	
	/**
	 *方法: 取得String
	 *@return: String  id
	 */
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置String
	 *@param: String  id
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  分红比例
	 */
	public BigDecimal getFhValues(){
		return this.fhValues;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  分红比例
	 */
	public void setFhValues(BigDecimal fhValues){
		this.fhValues = fhValues;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  createDate
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  createDate
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  endDate
	 */
	public Date getEndDate(){
		return this.endDate;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  endDate
	 */
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  beginDate
	 */
	public Date getBeginDate(){
		return this.beginDate;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  beginDate
	 */
	public void setBeginDate(Date beginDate){
		this.beginDate = beginDate;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  是否启用 0是 1否
	 */
	public Integer getIsDelete(){
		return this.isDelete;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  是否启用 0是 1否
	 */
	public void setIsDelete(Integer isDelete){
		this.isDelete = isDelete;
	}
	
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  分红的积分数目
	 */
	public BigDecimal getJfNum(){
		return this.jfNum;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  分红的积分数目
	 */
	public void setJfNum(BigDecimal jfNum){
		this.jfNum = jfNum;
	}
	
	
}
