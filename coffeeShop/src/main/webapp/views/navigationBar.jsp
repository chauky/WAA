<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<ul class="nav navbar-nav">
			<li class="active"><a href="/">Home</a></li>
			<sec:authorize access="hasAuthority('ADMIN')">
				<li><a href="/persons/personList"> List of Persons</a></li>
				<li><a href="/orders/orderList"> List of Orders</a></li>
			</sec:authorize>
			<li><a href="/products/productList"> List of Products</a></li>
			<li><a href="/persons/updateInfo"> Update info</a></li>
			<li><a class="button" data-submit="parent" href="/logout">Log
					out</a></li>
		</ul>
	</div>
</nav>