<%@ include file="header.jsp" %>
    
<body class="bg-dark">
    
    <!--Java Script de Bootstrap-->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>    

    <main>
        <!--Descripcion de la promocion 1-->
        <section class="container-fluid row text-center contenedor-promo" style="margin-top: 3em;">
            <div class="container-fluid col">
                <img src="img/Promo1.jpeg" alt="Promocion 1" class="img-promo border" style="height: 25em;width: 20em">
            </div>
            <div class="container-fluid col">
                <h1 class="text-light">Promoción 1</h1>
                <p class="text-light">Descripcion</p>
                <p class="text-light">$Precio</p>
                <a href="#" class="btn btn-primary btn-lg">Agregar al Carrito</a>
            </div>
        </section>

        <!--Susbripcion a Newsletter-->
        <section class="text-center" style="width: 100%;">
            <div class="text-center" style="margin-top: 3em;margin-bottom: 3em;">
                <h4 class="text-light">Suscribase a nuestro <strong>Newsletter</strong></h4>
                <form action="">
                    <input type="email" name="email" id="email">
                    <input type="submit" value="Suscribirse" class="btn btn-primary">
                </form>
            </div>
        </section>
    </main>
	
	
<%@ include file="footer.jsp" %>	
</body>
</html>