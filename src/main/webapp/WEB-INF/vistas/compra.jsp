<%@include file = "header.jsp" %>
<main>
<div class="container" id="flex">
      <section id="division">
        <article class="titulo-tipo-entrada">
            <h2>GENERAL</h2>
        </article>  
        <article class="contenedor-entrada-general">
            <div class="informacion-entrada">
                <div class="titulo-informacion-entrada">
                 <p>GENERAL CINEMANIA</p>
                </div>
                <div class="logo-descripcion">
                 <img src="img/entradas-de-cine.png" alt="Entrada" class="logo">
                 <p>Entrada general <br>(1 persona)</p>
                </div> 
             </div>
             <div class="precio-entrada">
                 <p>$1000</p>
             </div>
        </article>
        <article class="titulo-tipo-entrada">
            <h2>ENTRADAS CON DESCUENTOS</h2>
        </article>
        <article>
            <div class="agrupacion-entrada">
                <div class="contenedor-entrada-descuento" >
                    <div class="informacion-entrada">
                        <div class="titulo-informacion-entrada">
                        <p>ENTRADA MASTER CARD</p>
                        </div>
                        <div class="logo-descripcion">
                        <img src="img/entradas-de-cine.png" alt="" class="logo">
                        <p>Entrada con tarjeta Master Card <br>(1 persona)</p>
                        </div> 
                    </div>
                    <div class="precio-entrada">
                        <p>$900</p>
                    </div>
                </div>
                <div class="contenedor-entrada-descuento">
                    <div class="informacion-entrada">
                        <div class="titulo-informacion-entrada">
                        <p>ENTRADA VISA</p>
                        </div>
                        <div class="logo-descripcion">
                        <img src="img/entradas-de-cine.png" alt="" class="logo">
                        <p>Entrada con tarjeta Visa <br>(1 persona)</p>
                        </div> 
                    </div>
                    <div class="precio-entrada">
                        <p>$850</p>
                    </div>
                </div>
        </div>
        <div class="agrupacion-entrada">
            <div class="contenedor-entrada-descuento">
                <div class="informacion-entrada">
                    <div class="titulo-informacion-entrada">
                     <p>ENTRADA CINEMANIA</p>
                    </div>
                    <div class="logo-descripcion">
                     <img src="img/entradas-de-cine.png" alt="" class="logo">
                     <p>Entrada con tarjeta Cinemania <br>(1 persona)</p>
                    </div> 
                 </div>
                 <div class="precio-entrada">
                     <p>$800</p>
                 </div>
            </div>
            <div class="contenedor-entrada-descuento">
                <div class="informacion-entrada">
                    <div class="titulo-informacion-entrada">
                     <p>ENTRADA CREDICOOP</p>
                    </div>
                    <div class="logo-descripcion">
                     <img src="img/entradas-de-cine.png" alt="" class="logo">
                     <p>Entrada con Credicoop <br>(1 persona)</p>
                    </div> 
                 </div>
                 <div class="precio-entrada">
                     <p>$900</p>
                 </div>
            </div>
        </div>
        </article>
      </section>
      
      <section>

        <article class="contenedor-informacion-pelicula">
          
              <div class = "imagenTitulo">
              <img src="img/descarga.jpg">
              <div class = "divInformacionPelicula">
              <h1>Pulp Fiction</h1>
              <div>
              <p class = "edad">+16</p>
              <p>Castellano</p>
              <div class = "ubicacion"> 
              <i class="fas fa-map-marker-alt"></i>
              <h7>Cinemark Hoyts<br>
              Sala 7</h7>
              </div>  
              <p>Vergara 2822, Morón.</p>
              <p>Lunes 19 de Octubre, 22 hs.</p>
          
              </div>

              </div>
              </div>
                
              <div class = "entradaComprar">
              <img src="img/img_54668.png">
              <div class= "left">
              <h7>1 entrada</h7>
              <p>(Entrada general)</p>
              </div>

              <h7 id= "precio">$1200</h7>
              <img src="img/boton-agregar.png">
              <img src="img/boton-de-resta.png">
              </div>

              <div class="total">
                <h3>TOTAL</h3>
                <h3>$1200</h3>
              </div>
            
         
        </article>  

        <article class = "botones">
         <h7 class= "volver">VOLVER</h7>
         <h7 class = "siguiente">SIGUIENTE</h7> 
        </article>

      </section>
    </div>
    </main>
    <footer>
        <section class="contenedor-footer">

            <section class="derechos">
              <p><i class="far fa-copyright"></i>Todos los derechos reservados</p>
            </section>
            <section class="seccion-menu-inf">
              <nav class="nav-inferior">
                <ul>
                  <li><a href="peliculas">Peliculas</a></li>
                  <li><a href="recomendaciones">Recomendaciones</a></li>
                  <li><a href="promociones">Promociones</a></li>
                  <li><a href="cuenta">Mi cuenta</a></li>
                </ul>
              </nav>
            </section>
      
</main>
<%@include file ="footer.jsp" %>