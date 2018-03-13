package com.Sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sample.Entity.Gestor;
import com.Sample.Service.GestorService;
import com.Sample.Service.ProgramaService;

@RestController
@RequestMapping("gestor")
public class GestorController {

	@Autowired
	private GestorService gestorService;
	
	@Autowired
	private ProgramaService programaService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public Object index() {
		return gestorService.findAll();
	}
	@RequestMapping(value = "/programaa", method = RequestMethod.GET)
	@ResponseBody
	public Object programa() {
		return programaService.findAll();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Gestor areaa) {
		gestorService.save(areaa);
		return new ResponseEntity<>(areaa, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> updd(@RequestBody Gestor departamento) {
		gestorService.save(departamento);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id) {
		gestorService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
