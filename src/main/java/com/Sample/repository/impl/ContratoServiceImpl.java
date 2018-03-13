//package com.Sample.repository.impl;
//
//import org.springframework.data.domain.Pageable;
//
//import com.Sample.Entity.Contrato;
//import com.Sample.repository.ContratoRepository;
//
//public class ContratoServiceImpl implements ContratoServicee {
//	private ContratoRepository cr;
//
//	@Override
//	public Iterable<Contrato> findAll(Pageable p) {
//		return cr.findAll(p);
//	}
//
//	@Override
//	public Contrato find(Long id) {
//		return cr.findOne(id);
//	}
//
//	@Override
//	public Iterable<Contrato> findAll() {
//		return cr.findAll();
//	}
//
//}
