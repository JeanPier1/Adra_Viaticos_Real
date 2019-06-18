package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.UsuarioDao;
import pe.edu.adra.biaticos.entities.Login.Persona;
import pe.edu.adra.biaticos.entities.Login.Usuario;
import pe.edu.adra.biaticos.service.UsuarioService;


@Service
@Transactional
public class UsuarioServiceImpl implements UserDetailsService,UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public Usuario crear(Usuario p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario editar(Usuario p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona buscarPersona(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object buscarDataUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

	@Override
	public Object prueba(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class); 


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario user=usuarioDao.findByUsername(username);

		
		if(user == null) {
			logger.error("ERROR LOGIN" + username);
			throw new UsernameNotFoundException("ERROR LOGIN "+ username);
		}
		List<GrantedAuthority> authorities = user.getRoles()
				.stream()
				.map(rol -> new SimpleGrantedAuthority(rol.getNombre()))
				.peek(authority -> logger.info("Rol: "+ authority.getAuthority()))
				.collect(Collectors.toList());
		return new User(user.getUsername(), user.getPassword(), user.getEnable(),true, true, true, authorities);
	}

	@Override
	public Object findDataByIdUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> lista(long id) {
		// TODO Auto-generated method stub
		return usuarioDao.lista(id);
	}


	

}
