<%@ include file="header.jsp" %>
<body>
	<main>
		<section>
            <article class="container"> 
                <div class="container">
                  <h2>Modificar datos</h2>
                </div>  
                <form action="confirmacionModificarDatos">
                  <div class="form-group">
                    <label for="nombre">Nombre: </label>
                    <input type="text" name="nombre" id="nombre" class="form-control">
                  </div>
                  <div class="form-group">
                    <label for="apellido">Apellido: </label>
                   <input type="text" name="apellido" id="apellido" class="form-control">
                  </div>
                  <div class="form-group">
                   <label for="email">Email: </label>
                    <input type="email" name="email" id="email" class="form-control">
                  </div>
                  <div class="form-group">
                    <label for="contraseņa">Contraseņa: </label>
                    <input type="password" name="contraseņa" id="contraseņa" class="form-control">
                  </div>
                    <button type="submit" class="btn btn-primary" id="boton-guardar">Guardar</button>


                </form>
            </article>
        </section>
	</main>
</body>
<%@ include file="footer.jsp" %>