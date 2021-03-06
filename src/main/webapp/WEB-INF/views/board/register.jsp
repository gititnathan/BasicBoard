<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<!-- Main Content -->
<section class="content">
	<div class="row">
	<!-- left column -->
	<div class="col-md-12">
	
		<!-- general form elements -->
		<div class="box">
			<div class="box-header with-border">
				<h3 class="box-title">REGISTER BOARD</h3>
	
	<!-- Register Form -->
	<form role="form" method="post">
		<div class="box-body">
		 
		 <div class="form-group">
		 	<label for="exampleInputEmail1">Title</label>
		 	<input type="text" name="title" class="form-control" placeholder="Enter Title">
		 </div>
		 
		 <div class="form-group">
		 	<label for="exampleInputPassword1">Content</label>
		 	<textarea class="form-control" name="content" rows="3" placeholder="Enter..."></textarea> 	
		 </div>
		 
		 <div class="form-group">
		 	<label for="exampleInputEmail1">Writer</label>
		 	<input type="text" name="writer" class="form-control" placeholder="Enter Writer">
		 </div>	 
		</div>
	
		<div class="box-footer">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>
			</div>
		</div> <!-- .box -->
		
	</div><!-- .col-md-12 -->
	</div><!-- .row -->
</section>
<%@include file="../include/footer.jsp" %>

