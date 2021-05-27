<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>userId</th>
				<th>模板名称</th>
				<th>创建时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="pdFormTemplate" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
					<td>${pdFormTemplate.userId}</td>
					<td>${pdFormTemplate.templateName}</td>
					<td><fmt:formatDate value="${pdFormTemplate.createDate}" pattern="yyyy-MM-dd"/></td>
				<td>
					<a href="javascript:;" class="btn btn-sm blue" onclick="update('/pdFormTemplate/pdFormTemplate?id=${pdFormTemplate.id}')">
						<i class="fa fa-edit"></i>编辑
					</a>
					<a href="javascript:;" class="btn btn-sm red" onclick="del('/pdFormTemplate/delete?id=${pdFormTemplate.id}')">
						<i class="fa fa-trash"></i>删除
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>