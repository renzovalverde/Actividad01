package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	public MedicamentoRepository repository;
	
	
	
	@Override
	public List<Medicamento> listarmedicamento() {
		return repository.findAll();
	}

	@Override
	public Medicamento insertarActualizamedicamento(Medicamento obj) {
		
		return repository.save(obj);
	}

}
