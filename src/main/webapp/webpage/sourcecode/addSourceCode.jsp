<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>新建追溯码
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="pdFormDataForm" class="form-horizontal form-bordered" action="/pdFormData/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">商品信息:</label>
        <div class="col-md-4">
	          <input type="text" name="goodsData" class="form-control" value="${pdFormData.goodsData}"  maxlength="200"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">商品规格:</label>
        <div class="col-md-4">
	          <input type="text" name="templateAttributesId" class="form-control" value="${pdFormData.templateAttributesId}"  maxlength="36"/>
        </div>

      </div>

        <div class="form-group">
            <label class="col-md-3 control-label">包装级数:</label>
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
            <label class="col-md-2 control-label" style="text-align: left">什么是包装级数</label>
        </div>

        <div class="form-group">
            <label class="col-md-3 control-label">包装比例:</label>
            <div class="col-md-4">
                <input type="text" name="goodsData" class="form-control" value="${pdFormData.goodsData}"  maxlength="200"/>
            </div>
            <label class="col-md-2 control-label" style="text-align: left">什么是包装比例</label>
        </div>

        <div class="form-group">
            <label class="col-md-3 control-label"></label>
            <div class="col-md-4">
                <table border="1" width="50%">
                    <tr><td>包装级别</td><td>所需包装数量</td><td>包装类型</td></tr>
                    <tr><td>2</td><td>200</td><td>箱</td></tr>
                    <tr><td>1</td><td>10000</td><td>盒</td></tr>
                    <tr><td colspan="3">所追溯源码总数</td></tr>
                </table>
            </div>
        </div>

  		<div class="form-group">
        <label class="col-md-3 control-label">包装关联图:</label>
        <div class="col-md-4">
	          <img src="">
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