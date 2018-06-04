<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">List</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Advanced Tables</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<div class="dataTable_wrapper">
						<table class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th>MEMBER_ID</th>
									<th>NAME</th>
									<th>CELLPHONE</th>
									<th>EMAIL</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${resultList}" var="resultData"
									varStatus="loop">
									<tr
										class="${(loop.index+1)%2 == 2 ? 'odd gradeX' : 'even gradeC'}">
										<td>${resultData.MEMBER_ID}</td>
										<td>${resultData.NAME}</td>
										<td>${resultData.CELLPHONE}</td>
										<td>${resultData.EMAIL}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<!-- /.table-responsive -->
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
</div>
<!-- /#page-wrapper -->

