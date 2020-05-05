package com.loja.apirest3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.apirest3.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);
	
	

}
