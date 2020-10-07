package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPaginas {
	
	
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

}
