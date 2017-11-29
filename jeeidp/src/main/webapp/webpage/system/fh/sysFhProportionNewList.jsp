<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>分红比例</th>
				<th>结束时间</th>
				<th>开始时间</th>
				<th>是否启用 0是 1否</th>
				<th>分红的积分数目</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="sysFhProportionNew" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
					<td>${sysFhProportionNew.fhValues}</td>
					<td><fmt:formatDate value="${sysFhProportionNew.endDate}" pattern="yyyy-MM-dd"/></td>
					<td><fmt:formatDate value="${sysFhProportionNew.beginDate}" pattern="yyyy-MM-dd"/></td>
					<td>${sysFhProportionNew.isDelete}</td>
					<td>${sysFhProportionNew.jfNum}</td>
				<td>
					<a href="javascript:;" class="btn btn-sm blue" onclick="update('/sysFhProportionNew/sysFhProportionNew?id=${sysFhProportionNew.id}')">
						<i class="fa fa-edit"></i>编辑
					</a>
					<a href="javascript:;" class="btn btn-sm red" onclick="del('/sysFhProportionNew/delete?id=${sysFhProportionNew.id}')">
						<i class="fa fa-trash"></i>删除
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>