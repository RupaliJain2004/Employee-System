package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bean.EmpBean;

@Repository
public interface EmpDao extends JpaRepository<EmpBean, Integer> {

}
