package pe.edu.adra.biaticos.oauth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import pe.edu.adra.biaticos.entities.Login.Usuario;
import pe.edu.adra.biaticos.service.UsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {
	
	@Autowired
	private UsuarioService unser;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Usuario usi=unser.findByUsername(authentication.getName());
		Map<String, Object> info = new HashMap<>();	
		info.put("Info_adiccional", "Hola Mundo".concat(authentication.getName()));
		
		info.put("usu_id",  usi.getIdUsuario());
		info.put("username", usi.getUsername());
		info.put("per_id", usi.getPersona());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}
