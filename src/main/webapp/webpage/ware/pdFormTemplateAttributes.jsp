<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>模板属性
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="pdFormTemplateAttributesForm" class="form-horizontal form-bordered" action="/pdFormTemplateAttributes/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">模板id:</label>
        <div class="col-md-4">
	          <input type="text" name="templateId" class="form-control" value="${pdFormTemplateAttributes.templateId}"  maxlength="36"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">属性名称:</label>
        <div class="col-md-4">
	          <input type="text" name="attributesName" class="form-control" value="${pdFormTemplateAttributes.attributesName}"  maxlength="36"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">元素属性:</label>
        <div class="col-md-4">
					<div class="input-icon right">
	        	<i class="fa"></i>
						<select name="elementAttribute" class="form-control" >
							<option value="">请选择</option>
							<option value="1">Option 1</option>
							<option value="2">Option 2</option>
							<option value="3">Option 3</option>
						</select>
					</div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">元素类型:</label>
        <div class="col-md-4">
	        <div class="input-icon right">
	        	<i class="fa"></i>
	        	<textarea name="elementType" rows="5" class="form-control" maxlength="500" >${pdFormTemplateAttributes.elementType}</textarea>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">元素排序:</label>
        <div class="col-md-4">
	          <input type="text" name="elementOrder" class="form-control" value="${pdFormTemplateAttributes.elementOrder}"  maxlength="10"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">描述:</label>
        <div class="col-md-4">
	          <input type="text" name="describe" class="form-control" value="${pdFormTemplateAttributes.describe}"  maxlength="200"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">是否为空:</label>
        <div class="col-md-4">
					<div class="input-icon right">
	        	<i class="fa"></i>
						<select name="isNull" class="form-control" >
							<option value="">请选择</option>
							<option value="1">Option 1</option>
							<option value="2">Option 2</option>
							<option value="3">Option 3</option>
						</select>
					</div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">元素选项内容:</label>
        <div class="col-md-4">
	        <div class="input-icon right">
	        	<i class="fa"></i>
	        	<textarea name="elementOption" rows="5" class="form-control" maxlength="500" >${pdFormTemplateAttributes.elementOption}</textarea>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">元素格式:</label>
        <div class="col-md-4">
	          <input type="text" name="elementFormat" class="form-control" value="${pdFormTemplateAttributes.elementFormat}"  maxlength="36"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">是否显示:</label>
        <div class="col-md-4">
	          <input type="text" name="isShow" class="form-control" value="${pdFormTemplateAttributes.isShow}"  maxlength="1"/>
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
      <input type="hidden" name="id" value="${pdFormTemplateAttributes.id}">
  	</form>
  </div>
</div>
<script type="text/javascript" src="<c:url value="/static/custom/datepicker-util.js"></c:url>"></script>
<script type="text/javascript">
	$(function(){
		$('#pdFormTemplateAttributesForm').validate();
	});
</script>