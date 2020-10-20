<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>	
	<main>
		<section class="text-center contenedor-newsletter" >
        	<h4 class="text-light">Suscribase a nuestro <strong>Newsletter</strong></h4>
            <form:form action="confirmacionNewsletter" method="POST" modelAttribute="newsletter">
            	<form:input type="email" path="email" id="email"/>
                <button class="btn  btn-primary" Type="Submit"/>Login</button>
            </form:form>
        </section>
	</main>
	
</body>
</html>