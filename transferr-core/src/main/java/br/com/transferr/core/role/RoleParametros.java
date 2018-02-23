package br.com.transferr.core.role;

import org.springframework.stereotype.Service;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Parametro;

@Service
public class RoleParametros extends RoleSuperClass<Parametro>{

	
	public static String paramPathRepoImagens = ".";
	
	public RoleParametros() {
		System.out.println(this.getClass().getName());
	}
	

	
	
	
	public int getPortHostEmail() {
		try {
			return 0;
		}catch (Exception e) {
			return 0;
		}
	}
	
	public String getEnderecoEnvioEmail() {
		try {
			return "";
		}catch (Exception e) {
			return "";
		}
	}
	
	public String getHostEmail() {
		try {
			return "";
		}catch (Exception e) {
			return "";
		}
	}
	
	public String getSenhaEmail() {
		try {
			return "";
		}catch (Exception e) {
			return "";
		}
	}
	
	public String getUsuarioEmail() {
		try {
			return "";
		}catch (Exception e) {
			return "";
		}
	}
	public String getEnderecoEmailSuporte() {
		try {
			return "";
		}catch (Exception e) {
			return "";
		}
	}





	@Override
	public Parametro insert(Parametro entidade) throws ValidationException {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public void delete(long codigo) throws ValidationException {
		// TODO Auto-generated method stub
		
	}





	@Override
	public Parametro update(Parametro entidade) throws ValidationException {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public Parametro find(long codigo) throws ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

}