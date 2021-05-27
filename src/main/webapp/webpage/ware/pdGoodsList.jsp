<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>商品名称</th>
				<th>创建人</th>
				<th>创建时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="pdGoods" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
					<td>${pdGoods.goodsName}</td>
					<td>${pdGoods.userId}</td>
					<td><fmt:formatDate value="${pdGoods.createDate}" pattern="yyyy-MM-dd"/></td>
				<td>
					<a href="javascript:;" class="btn btn-sm blue" onclick="update('/pdGoods/pdGoods?goodsId=${pdGoods.goodsId}')">
						<i class="fa fa-edit"></i>编辑
					</a>
					<a href="javascript:;" class="btn btn-sm red" onclick="del('/pdGoods/delete?goodsId=${pdGoods.goodsId}')">
						<i class="fa fa-trash"></i>删除
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>