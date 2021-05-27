<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>模板id</th>
				<th>属性名称</th>
				<th>元素属性</th>
				<th>元素类型</th>
				<th>元素排序</th>
				<th>是否为空</th>
				<th>元素选项内容</th>
				<th>元素格式</th>
				<th>是否显示</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="pdFormTemplateAttributes" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
					<td>${pdFormTemplateAttributes.templateId}</td>
					<td>${pdFormTemplateAttributes.attributesName}</td>
					<td>${pdFormTemplateAttributes.elementAttribute}</td>
					<td>${pdFormTemplateAttributes.elementType}</td>
					<td>${pdFormTemplateAttributes.elementOrder}</td>
					<td>${pdFormTemplateAttributes.isNull}</td>
					<td>${pdFormTemplateAttributes.elementOption}</td>
					<td>${pdFormTemplateAttributes.elementFormat}</td>
					<td>${pdFormTemplateAttributes.isShow}</td>
				<td>
					<a href="javascript:;" class="btn btn-sm blue" onclick="update('/pdFormTemplateAttributes/pdFormTemplateAttributes?id=${pdFormTemplateAttributes.id}')">
						<i class="fa fa-edit"></i>编辑
					</a>
					<a href="javascript:;" class="btn btn-sm red" onclick="del('/pdFormTemplateAttributes/delete?id=${pdFormTemplateAttributes.id}')">
						<i class="fa fa-trash"></i>删除
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>