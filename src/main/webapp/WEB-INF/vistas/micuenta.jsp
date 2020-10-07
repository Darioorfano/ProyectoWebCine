<%@include file="header.jsp" %>
<body>
	<main>
		<section class="contenedor-mi-cuenta">
                <article class="contenedor-mi-cuenta-opciones">
                    <ul>
                        <li><i class="fas fa-user"></i>
                        <a href="micuenta.jsp">Mis datos</a></li>
                       
                        <li><i class="fas fa-shopping-basket"></i>
                        <a href="miscompras.jsp">Mis compras</a></li>
                    </ul>
                </article>
                <div class="separado">
                <article class="contenedor-titulo-mi-cuenta">
                    <div>
                        <h2>MIS DATOS</h2>
                     </div>
                </article>
                <article class="contenedor-mi-cuenta-datos">
                   <div>
                    <div class="foto-usuario">
                        <i class="fas fa-user-circle"></i>
                  </div>
                  </div>
                  <div class="contenedor-datos">
                   <div class="datos">
                        <p>NOMBRE:</p>
                        <p>        </p>
                   </div>
                  <div class="datos">
                      <p>APELLIDO:</p>
                      <p>        </p>
                  </div>
                  <div class="datos">
                      <p>EMAIL:</p>
                      <p>      </p>
                  </div>
                  </div>
                  </article>
                  <article>
                    <div class="boton-modificar-datos">
                      <button><a href="modificardatos.jsp" class="btn btn-primary">MODIFICAR DATOS</a></button>
                    </div>
                  </article>
            </div>
            </section>	
	</main>
</body>
<%@include file="footer.jsp" %>