package com.devsuperior.bds04.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.services.exceptions.ResourceNotFoundException;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;

	/* A lógica aqui é assim: 
	 * Para que as mensagens saiam tabelas, criamos a Classe Field message, que possui campo e descrição. 
	 * Aqui "instanciamos" os fields com errors
	 * Observe que ele é um EXTENDS do StandError, logo só precisamos tratar o getErrros e o addError. 
	 * Veja também: O [City/Event]Service.java chama o  ResourceExceptionsHandler.java
	 * Por exemplo: 
	 * O chama  CityService.java chama :City entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
	 *  que por sua vez: chama o ResourceExceptionsHandler.java
	 *  	@ExceptionHandler( ResourceNotFoundException.class )

	 *  que por sua vez chamaria aqui, mas neste projeto não fizemos isto.  
	 */
	private List<FieldMessage> errors = new ArrayList<>();
	// observe que não tem construct porque herdou da classe StandarError que 
	// já possui. 
	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
}
