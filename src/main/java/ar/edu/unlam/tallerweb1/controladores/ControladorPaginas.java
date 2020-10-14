package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

@Controller
public class ControladorPaginas {

	@Inject 
	private ServicioLogin servicioLogin;
	
	

	@RequestMapping ("/inicio")
	public ModelAndView home() {
		ModelMap modelo = new ModelMap();
		modelo.put("titulo","Inicio");
		return new ModelAndView("index",modelo);
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelMap modelo = new ModelMap();
		modelo.put("titulo","Login");
		return new ModelAndView("login",modelo);

	
	}

	@RequestMapping("/registro")
	public ModelAndView registro() {
		ModelMap modelo = new ModelMap();
		modelo.put("titulo","Registro");
		return new ModelAndView("registro",modelo);
	}


	@RequestMapping ("/recuperaTuCuenta")
	public ModelAndView recuperarCuenta() {
		ModelMap modelo = new ModelMap();
		modelo.put("titulo","Recuperar Cuenta");
		return new ModelAndView("contraseñaOlvidada",modelo);
	}
	
	
	@RequestMapping("/miCuenta")
	public ModelAndView miCuenta() {
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Mi Cuenta");
		return new ModelAndView ("micuenta",modelo);
	}
	
	
	@RequestMapping("/misCompras")
	public ModelAndView misCompras() {
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Mis Compras");
		return new ModelAndView ("miscompras",modelo);
	}
	
	
	@RequestMapping("/modificarDatos")
	public ModelAndView modificarDatos() {
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Modificar Datos");
		return new ModelAndView ("modificardatos",modelo);
	}
	@RequestMapping(path="/confirmacionModificarDatos",method=RequestMethod.GET)
	public ModelAndView confirmarModificarDatos(
			@RequestParam(value="nombre",required=true) String nombre,
			@RequestParam(value="apellido",required=true) String apellido,
			@RequestParam(value="email",required=true) String email,
			@RequestParam(value="contraseña",required=true) String contraseña
			){
		servicioLogin.modificarDatos(nombre, apellido, email, contraseña);
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Confirmación modificar datos");
		return new ModelAndView ("confirmarModificarDatos",modelo);
	}
	
	@RequestMapping("/recomendaciones")
		public ModelAndView recomendaciones() {
			ModelMap modelo = new ModelMap();
			modelo.put("titulo", "Recomendaciones");
			return new ModelAndView("recomendaciones", modelo);
		}
	

}
