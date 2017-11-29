<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>分红系数管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="sysFhProportionNewForm" class="form-horizontal form-bordered" action="/sysFhProportionNew/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">分红比例:</label>
        <div class="col-md-4">
	          <input type="text" name="fhValues" class="form-control" value="${sysFhProportionNew.fhValues}"  maxlength="10"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">结束时间:</label>
        <div class="col-md-4">
	        <div class="input-icon right">
	        	<i class="fa"></i>
	          <div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="endDate" readonly 
								value="<fmt:formatDate value="${sysFhProportionNew.endDate}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
							<span class="input-group-btn">
							<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
					</div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">开始时间:</label>
        <div class="col-md-4">
	        <div class="input-icon right">
	        	<i class="fa"></i>
	          <div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="beginDate" readonly 
								value="<fmt:formatDate value="${sysFhProportionNew.beginDate}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
							<span class="input-group-btn">
							<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
					</div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">是否启用 0是 1否:</label>
        <div class="col-md-4">
					<div class="input-icon right">
	        	<i class="fa"></i>
						<select name="isDelete" class="form-control" >
							<option value="">请选择</option>
							<option value="1">Option 1</option>
							<option value="2">Option 2</option>
							<option value="3">Option 3</option>
						</select>
					</div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">分红的积分数目:</label>
        <div class="col-md-4">
	        <div class="input-icon right">
	        	<i class="fa"></i>
	        	<textarea name="jfNum" rows="5" class="form-control" maxlength="500" >${sysFhProportionNew.jfNum}</textarea>
	        </div>
        </div>
      </div>
      <div class="form-actions">
        <div class="col-md-9 col-md-offset-3">
          <button type="button" class="btn btn-primary" onclick="save(this)">
          	<spring:message code="btn.save"></spring:message>
          </button>
          <button type="reset" class="btn btn-default" onclick="cancel()">
          	<spring:message code="btn.return"></spring:message>
          </button>
        </div>
      </div>
      <input type="hidden" name="id" value="${sysFhProportionNew.id}">
  	</form>
  </div>
</div>
<script type="text/javascript" src="<c:url value="/static/custom/datepicker-util.js"></c:url>"></script>
<script type="text/javascript">
	$(function(){
		$('#sysFhProportionNewForm').validate();
	});
</script>