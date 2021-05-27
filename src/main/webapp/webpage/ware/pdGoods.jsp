<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>商品
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="pdGoodsForm" class="form-horizontal form-bordered" action="/pdGoods/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">商品名称:</label>
        <div class="col-md-4">
	          <input type="text" name="goodsName" class="form-control" value="${pdGoods.goodsName}"  maxlength="72"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">创建人:</label>
        <div class="col-md-4">
	          <input type="text" name="userId" class="form-control" value="${pdGoods.userId}"  maxlength="36"/>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">创建时间:</label>
        <div class="col-md-4">
	        <div class="input-icon right">
	        	<i class="fa"></i>
	          <div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="createDate" readonly 
								value="<fmt:formatDate value="${pdGoods.createDate}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
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
      <input type="hidden" name="goodsId" value="${pdGoods.goodsId}">
  	</form>
  </div>
</div>
<script type="text/javascript" src="<c:url value="/static/custom/datepicker-util.js"></c:url>"></script>
<script type="text/javascript">
	$(function(){
		$('#pdGoodsForm').validate();
	});
</script>