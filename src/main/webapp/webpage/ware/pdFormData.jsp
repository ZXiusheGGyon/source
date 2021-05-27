<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>商品数据
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="pdFormDataForm" class="form-horizontal form-bordered" action="/pdFormData/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">商品数据:</label>
        <div class="col-md-4">
	          <input type="text" name="goodsData" class="form-control" value="${pdFormData.goodsData}"  maxlength="200"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">模板属性id:</label>
        <div class="col-md-4">
	          <input type="text" name="templateAttributesId" class="form-control" value="${pdFormData.templateAttributesId}"  maxlength="36"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">商品id:</label>
        <div class="col-md-4">
	          <input type="text" name="goodsId" class="form-control" value="${pdFormData.goodsId}"  maxlength="36"/>
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
      <input type="hidden" name="id" value="${pdFormData.id}">
  	</form>
  </div>
</div>
<script type="text/javascript" src="<c:url value="/static/custom/datepicker-util.js"></c:url>"></script>
<script type="text/javascript">
	$(function(){
		$('#pdFormDataForm').validate();
	});
</script>