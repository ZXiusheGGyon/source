<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>userId</th>
				<th>层级</th>
				<th>节点其他信息</th>
				<th>商品信息</th>
				<th>创建时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="pdGoodsLogistics" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
					<td>${pdGoodsLogistics.userId}</td>
					<td>${pdGoodsLogistics.level}</td>
					<td>${pdGoodsLogistics.otherMsg}</td>
					<td>${pdGoodsLogistics.goodsId}</td>
					<td><fmt:formatDate value="${pdGoodsLogistics.createDate}" pattern="yyyy-MM-dd"/></td>
				<td>
					<a href="javascript:;" class="btn btn-sm blue" onclick="update('/pdGoodsLogistics/pdGoodsLogistics?id=${pdGoodsLogistics.id}')">
						<i class="fa fa-edit"></i>编辑
					</a>
					<a href="javascript:;" class="btn btn-sm red" onclick="del('/pdGoodsLogistics/delete?id=${pdGoodsLogistics.id}')">
						<i class="fa fa-trash"></i>删除
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>