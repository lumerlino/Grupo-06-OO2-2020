package com.unla.Grupo06OO22020.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.Grupo06OO22020.services.IEmpleadoService;
import com.unla.Grupo06OO22020.helpers.ViewRouteHelpers;
import com.unla.Grupo06OO22020.models.EmpleadoModel;
import com.unla.Grupo06OO22020.models.SucursalModel;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {
	
	@Autowired
    @Qualifier("empleadoService")
	private IEmpleadoService empleadoService;
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelpers.EMPLEADO_INDEX);
		mAV.addObject("empleados", empleadoService.getAll());
		mAV.addObject("empleado", new EmpleadoModel());
		return mAV;
	}
	
	@PostMapping("")
	public RedirectView redirect(@ModelAttribute("empleado") EmpleadoModel empleadoModel) {
		return new RedirectView(ViewRouteHelpers.EMPLEADO_INDEX);
	}
	
	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelpers.EMPLEADO_ADD);
		mAV.addObject("empleado", new EmpleadoModel());
		return mAV;
	}
	
	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("empleado") EmpleadoModel empleadoModel) {
		empleadoService.insertOrUpdate(empleadoModel);
		return new RedirectView(ViewRouteHelpers.EMPLEADO_ROOT);
	}
	
	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") long idPersona) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelpers.EMPLEADO_UPDATE);
		mAV.addObject("empleado", empleadoService.findByIdPersona(idPersona));
		return mAV;
	}
	
	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("empleado") EmpleadoModel empleadoModel) {
		empleadoService.insertOrUpdate(empleadoModel);
		return new RedirectView(ViewRouteHelpers.EMPLEADO_ROOT);
	}
	
	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") long idPersona) {
		empleadoService.remove(idPersona);
		return new RedirectView(ViewRouteHelpers.EMPLEADO_ROOT);
	}
	
	@PostMapping("/back")
	public RedirectView back() {
		
		return new RedirectView(ViewRouteHelpers.EMPLEADO_ROOT);
	}

}
