package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bean.EmpBean;
import com.dao.EmpDao;

@Service
public class EmpService {
	
	@Autowired
	EmpDao empdao;

	public void addEmp(EmpBean empbean) {
		empdao.save(empbean);
	}
	
	public List<EmpBean> getAllEmp(){
		return empdao.findAll();
	}
	
	public EmpBean getEmpById(int id) {
		Optional<EmpBean> e = empdao.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteEmp(int id) {
		empdao.deleteById(id);
	}
}
