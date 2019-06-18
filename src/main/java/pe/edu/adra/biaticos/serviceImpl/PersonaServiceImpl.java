package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.PersonaDao;
import pe.edu.adra.biaticos.entities.Login.Persona;
import pe.edu.adra.biaticos.service.PersonaService;


@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDao personaDao;
	
	@Override
	public Persona savePersona(Persona persona) {
		return this.personaDao.save(persona);
	}

	@Override
	public List<Persona> findContactoByNombre(String nombre) {
		return this.personaDao.FindPersonaByNombre(nombre);
	}

	

}
