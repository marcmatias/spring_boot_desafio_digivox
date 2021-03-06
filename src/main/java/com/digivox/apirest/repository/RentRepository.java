package com.digivox.apirest.repository;

import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

import com.digivox.apirest.models.Book;
import com.digivox.apirest.models.Client;
import com.digivox.apirest.models.Rent;

public interface RentRepository extends JpaRepository<Rent, Long> {

	Rent findById(long id);
	
	List<Rent> findAllByStartDateBetween(LocalDate dateAfter, LocalDate dateBefore);
	
	List<Rent> findAllByDevolutionDateBetween(LocalDate dateAfter, LocalDate dateBefore);
	
	boolean existsByBooksAndReturned(Book books, boolean returned);

	boolean existsByBooksAndClientAndReturned(Book books, Client client, boolean returned);
	
}
