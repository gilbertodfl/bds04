package com.devsuperior.bds04.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds04.entities.City;


//repare que aqui é uma INTERFACE 
// e quem precisa importar o import org.springframework.data.jpa.repository.JpaRepository;
public interface CityRepository extends JpaRepository <City, Long>{

	

}
