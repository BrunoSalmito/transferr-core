package br.com.transferr.core.role;


public class RoleParametros {

	
	public static String paramPathRepoImagens = "";
	
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

}