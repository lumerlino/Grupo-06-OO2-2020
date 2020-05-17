package com.unla.Grupo06OO22020.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.Grupo06OO22020.helpers.ViewRouteHelpers;
import com.unla.Grupo06OO22020.models.SucursalModel;
import com.unla.Grupo06OO22020.services.ISucursalService;

public class SucursalController {
	@Autowired
	@Qualifier("sucursalService")
	private ISucursalService sucursalService;
	
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelpers.SUCURSAL_INDEX);
		mAV.addObject("sucursales", sucursalService.getAll());
		mAV.addObject("sucursal", new SucursalModel());
		return mAV;
	}
	
	@PostMapping("")
	public RedirectView redirect(@ModelAttribute("sucursal") SucursalModel sucursalModel){
		return new RedirectView(ViewRouteHelpers.SUCURSAL_INDEX);
	}
	
	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelpers.SUCURSAL_ADD);
		mAV.addObject("sucursal", new SucursalModel());
		return mAV;
	}
	
	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("sucursal") SucursalModel sucursalModel) {
		sucursalService.insertOrUpdate(sucursalModel);
		return new RedirectView(ViewRouteHelpers.SUCURSAL_ROOT);
	}
	
	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") long idSucursal) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelpers.SUCURSAL_UPDATE);
		mAV.addObject("sucursal", sucursalService.findByIdSucursal(idSucursal));
		return mAV;
	}
	
	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("sucursal") SucursalModel sucursalModel) {
		sucursalService.insertOrUpdate(sucursalModel);
		return new RedirectView(ViewRouteHelpers.SUCURSAL_ROOT);
	}
	
	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") long idSucursal) {
		sucursalService.remove(idSucursal);
		return new RedirectView(ViewRouteHelpers.SUCURSAL_ROOT);
	}

}
