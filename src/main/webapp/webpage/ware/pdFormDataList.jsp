<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>商品数据</th>
				<th>模板属性id</th>
				<th>商品id</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="pdFormData" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
					<td>${pdFormData.goodsData}</td>
					<td>${pdFormData.templateAttributesId}</td>
					<td>${pdFormData.goodsId}</td>
				<td>
					<a href="javascript:;" class="btn btn-sm blue" onclick="update('/pdFormData/pdFormData?id=${pdFormData.id}')">
						<i class="fa fa-edit"></i>编辑
					</a>
					<a href="javascript:;" class="btn btn-sm red" onclick="del('/pdFormData/delete?id=${pdFormData.id}')">
						<i class="fa fa-trash"></i>删除
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>