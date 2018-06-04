<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Edit</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Form Elements</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form role="form" method="POST"
								action="<c:url value = "/commonCode/read"/>">
								<div class="form-group">
									<label for="disabledSelect">COMMON_CODE_ID Disabled
										input </label> <input class="form-control" type="text"
										name="COMMON_CODE_ID" value="33333-3333-UUID333333333333">
									<p class="help-block">using UUID method with disabled</p>
								</div>
								<div class="form-group">
									<label>Common Code Name Text Input </label> <input
										class="form-control" type="text" name="NAME">
								</div>
								<div class="form-group">
									<label for="disabledSelect">ORDER_NUMBER Disabled input
									</label> <input class="form-control" type="text" name="ORDER_NUMBER"
										value="1" readonly>
									<p class="help-block">disabled</p>
								</div>
								<div class="form-group">
									<label>DESCRIPTION Text area</label>
									<textarea class="form-control" rows="3" name="DESCRIPTION"
										placeholder="Describe yourself here..."></textarea>
								</div>
								<div class="form-group">
									<label for="disabledSelect">PARENT_COMMON_CODE_ID
										Disabled input </label> <input class="form-control" type="text"
										name="PARENT_COMMON_CODE_ID"
										value="22222-2222-UUID222222222222" readonly>
									<p class="help-block">using Parent UUID method with
										disabled</p>
								</div>
								<button type="submit" class="btn btn-default">Submit
									Button</button>
								<button type="reset" class="btn btn-default">Reset
									Button</button>
							</form>
						</div>
						<!-- /.col-lg-6 (nested) -->
						<div class="col-lg-6">
							<h1>Disabled Form States</h1>
							<form role="form">
								<fieldset readonly>
									<div class="form-group">
										<label for="disabledSelect">Disabled input</label> <input
											class="form-control" id="disabledInput" type="text"
											placeholder="Disabled input" readonly>
									</div>
									<div class="form-group">
										<label for="disabledSelect">Disabled select menu</label> <select
											id="disabledSelect" class="form-control">
											<option>Disabled select</option>
										</select>
									</div>
									<div class="checkbox">
										<label> <input type="checkbox">Disabled
											Checkbox
										</label>
									</div>
									<button type="submit" class="btn btn-primary">Disabled
										Button</button>
								</fieldset>
							</form>
							<h1>Form Validation States</h1>
							<form role="form">
								<div class="form-group has-success">
									<label class="control-label" for="inputSuccess">Input
										with success</label> <input type="text" class="form-control"
										id="inputSuccess">
								</div>
								<div class="form-group has-warning">
									<label class="control-label" for="inputWarning">Input
										with warning</label> <input type="text" class="form-control"
										id="inputWarning">
								</div>
								<div class="form-group has-error">
									<label class="control-label" for="inputError">Input
										with error</label> <input type="text" class="form-control"
										id="inputError">
								</div>
							</form>
							<h1>Input Groups</h1>
							<form role="form">
								<div class="form-group input-group">
									<span class="input-group-addon">@</span> <input type="text"
										class="form-control" placeholder="Username">
								</div>
								<div class="form-group input-group">
									<input type="text" class="form-control"> <span
										class="input-group-addon">.00</span>
								</div>
								<div class="form-group input-group">
									<span class="input-group-addon"><i class="fa fa-eur"></i>
									</span> <input type="text" class="form-control"
										placeholder="Font Awesome Icon">
								</div>
								<div class="form-group input-group">
									<span class="input-group-addon">$</span> <input type="text"
										class="form-control"> <span class="input-group-addon">.00</span>
								</div>
								<div class="form-group input-group">
									<input type="text" class="form-control"> <span
										class="input-group-btn">
										<button class="btn btn-default" type="button">
											<i class="fa fa-search"></i>
										</button>
									</span>
								</div>
							</form>
						</div>
						<!-- /.col-lg-6 (nested) -->
					</div>
					<!-- /.row (nested) -->
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