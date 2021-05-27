<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>商品模板表
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="pdFormTemplateForm" class="form-horizontal form-bordered" action="/pdFormTemplate/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">模板名称:</label>
        <div class="col-md-4">
	          <input type="text" name="templateName" class="form-control" value="${pdFormTemplate.templateName}"  maxlength="36"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">备注:</label>
        <div class="col-md-4">
	        <div class="input-icon right">
	        	<i class="fa"></i>
	        	<textarea name="remark" rows="5" class="form-control" maxlength="500" >${pdFormTemplate.remark}</textarea>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">创建时间:</label>
        <div class="col-md-4">
	        <div class="input-icon right">
	        	<i class="fa"></i>
	          <div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="createDate" readonly 
								value="<fmt:formatDate value="${pdFormTemplate.createDate}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
							<span class="input-group-btn">
							<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
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
      <input type="hidden" name="id" value="${pdFormTemplate.id}">
  	</form>
  </div>
</div>
<script type="text/javascript" src="<c:url value="/static/custom/datepicker-util.js"></c:url>"></script>
<script type="text/javascript">
	$(function(){
		$('#pdFormTemplateForm').validate();
	});
</script>