<%@ include file="header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body class="bg-dark">
	<main>
		<c:if test="${empty error}">
			<section class="text-center text-light confirmacion-newsletter">
				<h2>Confirmacion de Suscripcion</h2>
				<p>Felicitaciones! Se suscribió con exito a nuestro newsletter, confirme su suscripcion a traves del correo electronico que le hemos mandado al email: ${email}</p>
			</section>
		</c:if>
		
		<c:if test="${not empty error}">
			<section class="text-center text-light confirmacion-newsletter">
				<h2>${error}</h2>
				<p>Usted ${error}, muchas gracias por registrarse</p>
			</section>
		</c:if>
	</main>
</body>
<%@ include file="footer.jsp" %>