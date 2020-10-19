<%@include file="header.jsp" %>

<main class=" pb-5 fondo-cartelera container-fluid ">
      
        <section class="container-fluid pt-4 pb-5 ">
            <article class="data-list-cines">
          <select name="cines" id="cine">
            <option value="">CineMark Malvinas Argentinas</option>
          </select>
            
          <select name="peliculas" id="pelicula">
            <option value="">Harry Potter las Reliquias de las muertes</option>


        </select>

    </article>

    <article class="horarios-disponibles-peliculas ">
        <p>Hoy</p>
        <p>19/10</p>
    </article>
    </section>

   


    <section class="container-fluid d-flex justify-content-between">
         
                    
                        <article class="contenedor-horarios col-4">
    
                            <p class="pb-4 pt-2  text-center titulo-horario-cine-especificado ">Horarios ${nombrecine} para hoy</p>
                        
                            <p class="horarioCine">21:40</p>
                            <button type="button" class="btn btn-dark boton-comprar w-50">Comprar</button>
                        
                        
                        </article>
                 
                    

              
                
            
                <article class="col-4 bg-secondary d-flex ">
                        <div class="col-6">
                            <div>
                                <img src="img/sintiempoparamorir.jpg" alt="">
                            </div>
                            <p>Género:${genero}</p>
                            <p>Duracion: ${duracion}</p>
                        </div>
                       
                        <div class="col-6">
                            <p>Jamie Lee Regresa a su iconico PersonaJE</p>
                        </div>
                  
                      
              
        
                </article>
              
            
            
            
      
    
    </section>
       
     
      
       
      

    </main>











<%@include file="footer.jsp" %>