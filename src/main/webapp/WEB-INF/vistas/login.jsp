<%@include file="header.jsp" %>

  <main class="container-fluid bg-dark pt-5 pb-5">


    <div class="container pt-4 pb-5">
      <div class="row">
        <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
          <div class="card card-signin my-5 ">
            <div class="card-body pb-0">
              <h5 class="card-title text-center pb-3">Ingresa a tu cuenta</h5>
              <form class="form-signin">
                <div class="form-label-group pb-3">
                  <input type="email" id="inputEmail " class="form-control " placeholder="Correo Electronico" required
                    autofocus>

                </div>

                <div class="form-label-group pb-3">
                  <input type="password" id="inputPassword " class="form-control" placeholder="Contraseña" required>

                </div>

                <div class="custom-control custom-checkbox mb-3">
                  <input type="checkbox" class="custom-control-input" id="customCheck1">
                  <label class="custom-control-label" for="customCheck1">Recordar Contraseña</label>
                </div>
                <button class="btn btn-lg  btn-block text-uppercase mt-4 boton-logueo ancla-botones-de-login " type="submit">Iniciar
                  Sesion</button>
                  <p class="text-center pt-4"><a href="recuperaTuCuenta">¿Olvidaste tu contraseña?</a></p>
                  <button class="btn btn-lg btn-google mt-4 btn-danger btn-block text-uppercase" type="submit"><i
                    class="fab fa-google mr-2"></i><a class="ancla-botones-de-login" href="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"> Continuar con Google</a> </button>
                <button class="btn btn-lg btn-primary text-light mt-4 btn-facebook btn-block  text-uppercase" type="submit"><i
                  class="fab fa-facebook-f mr-2"></i> <a class="ancla-botones-de-login" href="https://www.facebook.com/">Continuar con Facebook</a></button>
                  <hr class="my-4">
               
              </form>
 
              </div>
              <div class="container ">
                <p class=" text-center">No tienes una cuenta?</p>
               	 <!--<button class="btn btn-lg btn-block btn-registrar mb-5"><a class="ancla-botones-de-login" href="registro">Registrese Aqui</a> </button>  -->
                 <a class="ancla-botones-de-login" href="registro"> <button class="btn btn-lg btn-block btn-registrar mb-5">Registrese Aqui </button>  </a>
              </div>
            
            </div>
          </div>
        </div>
      </div>
    </div>



  </main>

 <%@include file="footer.jsp" %>

