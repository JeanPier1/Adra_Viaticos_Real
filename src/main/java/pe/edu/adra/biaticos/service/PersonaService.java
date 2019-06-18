package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Login.Persona;


public interface PersonaService {
	
	Persona savePersona(Persona persona);
	
	List<Persona> findContactoByNombre(String nombre);

}
