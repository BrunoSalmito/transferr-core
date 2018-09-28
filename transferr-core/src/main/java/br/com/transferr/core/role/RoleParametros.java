package br.com.transferr.core.role;

import java.util.List;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.transferr.core.dao.DAOParametros;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Parametros;
import br.com.transferr.core.util.HelperDataTypeConverter;

@Service
public class RoleParametros extends RoleSuperClass<Parametros>{

	public static final int CHAVE_URL_FOTO 		        = 1;
	public static final int CHAVE_PORTA_EMAIL		    = 2;
	public static final int CHAVE_HOST_EMAIL		    = 3;
	public static final int CHAVE_UNAME_EMAIL		    = 4;
	public static final int CHAVE_PWS_EMAIL		     	= 5;
	public static final int CHAVE_ENDERECO_EMAIL	    = 6;
	public static final int CHAVE_PATH_REPO_IMAGENS		= 7;
	public static final int CHAVE_CONTACT_NUMBER		= 8;	
	public static final int CHAVE_SOFTWARE_DESCRIPTION	= 9;	
	//----------------------------------------------------------------------------------------
	//Os parametros serao carregados em memória para evitar inumeros acessos ao bando de dados
	//----------------------------------------------------------------------------------------
	public static String paramUrlFoto		        = "";
	public static String paramHostEmail		    	= "";
	public static String paramUNameEmail		    = "";
	public static String paramPwsEmail		     	= "";
	public static String paramEnderecoEmail	    	= "";
	public static int paramPortaEmail		    	= 0;
	public static String paramPathRepoImagens		= "";
	public static String paramServerVersion			= "1.7";
	public static String paramSoftDescriptor		= "Transffer";
	public static String paramContactNumber			= "(85)3255-2022";	
	public static String patterSeparator 			= Pattern.quote("|");
	public static String defaultSeparator 			= "|";
	
	public RoleParametros() {
		System.out.println(this.getClass().getName());
	}
	
	@Autowired
	private DAOParametros daoParametros;
	
	@Override
	public Parametros insert(Parametros entidade) throws ValidationException {
		 Parametros parametros = daoParametros.insert(entidade);
		 loadParametersFromDatabaseToMemory();
		 return parametros;
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		daoParametros.delete(codigo);
	}

	@Override
	public Parametros update(Parametros entidade) throws ValidationException {
		 Parametros parametros = daoParametros.update(entidade);
		 loadParametersFromDatabaseToMemory();
		 return parametros;
	}

	@Override
	public Parametros find(long codigo) throws ValidationException {
		return daoParametros.find(codigo);
	}
	
	public Parametros getParametroByChave(int chave) {
		Parametros parametros = this.daoParametros.getParametroByChave(chave);
		if(parametros != null){
			return parametros;
		}else{
			return new Parametros();
		}

	}
	
	
	public static String getURLBaseFotos() {
		try {
			return paramUrlFoto;
		}catch (Exception e) {
			return "";
		}
	}
	
	public int getPortHostEmail() {
		try {
			return paramPortaEmail;
		}catch (Exception e) {
			return 0;
		}
	}
	
	public String getEnderecoEnvioEmail() {
		try {
			return paramEnderecoEmail;
		}catch (Exception e) {
			return "";
		}
	}
	
	public String getHostEmail() {
		try {
			return paramHostEmail;
		}catch (Exception e) {
			return "";
		}
	}
	
	public String getSenhaEmail() {
		try {
			return paramPwsEmail;
		}catch (Exception e) {
			return "";
		}
	}
	
	public String getUsuarioEmail() {
		try {
			return paramUNameEmail;
		}catch (Exception e) {
			return "";
		}
	}
	
	public void insertAndLoadMainParameters() throws ValidationException {
		insertInitialParameters();
		loadParametersFromDatabaseToMemory();
	}
	
	public void loadParametersFromDatabaseToMemory() {
		paramUNameEmail			= getParametroByChave(CHAVE_UNAME_EMAIL).getValor();
		paramPwsEmail			= getParametroByChave(CHAVE_PWS_EMAIL).getValor();
		paramHostEmail			= getParametroByChave(CHAVE_HOST_EMAIL).getValor();
		paramEnderecoEmail		= getParametroByChave(CHAVE_ENDERECO_EMAIL).getValor();
		paramPortaEmail			= HelperDataTypeConverter.parseInt(getParametroByChave(CHAVE_PORTA_EMAIL).getValor()) ;
		paramUrlFoto			= getParametroByChave(CHAVE_URL_FOTO).getValor();
		paramPathRepoImagens	= getParametroByChave(CHAVE_PATH_REPO_IMAGENS).getValor();
		paramContactNumber  	= getParametroByChave(CHAVE_CONTACT_NUMBER).getValor();
		paramSoftDescriptor    	= getParametroByChave(CHAVE_SOFTWARE_DESCRIPTION).getValor();
	}
	
	private void insertInitialParameters() throws ValidationException {
		Parametros paramUNameEmail = getParametroByChave(CHAVE_UNAME_EMAIL);
		if(paramUNameEmail == null || paramUNameEmail.getId() == 0){
			paramUNameEmail = new Parametros();
			paramUNameEmail.setChave(CHAVE_UNAME_EMAIL);
			paramUNameEmail.setValor("transferr.app@gmail.com");
			paramUNameEmail.setDescricao("EMAIL TO RECOVERY PASSWORD.");
			paramUNameEmail.setDetalhe("EMAIL TO RECOVERY PASSWORD.");
			insert(paramUNameEmail);
		}
		Parametros paramPwsEmail = getParametroByChave(CHAVE_PWS_EMAIL);
		if(paramPwsEmail == null || paramPwsEmail.getId() == 0){
			paramPwsEmail = new Parametros();
			paramPwsEmail.setChave(CHAVE_PWS_EMAIL);
			paramPwsEmail.setValor("Transferr@30");
			paramPwsEmail.setDescricao("E-MAIL PASSWORD.");
			paramPwsEmail.setDetalhe("E-MAIL PASSWORD.");
			insert(paramPwsEmail);
		}
		Parametros paramHostEmail = getParametroByChave(CHAVE_HOST_EMAIL);
		if(paramHostEmail == null || paramHostEmail.getId() == 0){
			paramHostEmail = new Parametros();
			paramHostEmail.setChave(CHAVE_HOST_EMAIL);
			paramHostEmail.setValor("transferr.app@gmail.com");
			paramHostEmail.setDescricao("EMAIL SMTP SERVER ADDRESS");
			paramHostEmail.setDetalhe("EMAIL SMTP SERVER ADDRESS");
			insert(paramHostEmail);
		}
		Parametros paramEnderecoEmail = getParametroByChave(CHAVE_ENDERECO_EMAIL);
		if(paramEnderecoEmail == null || paramEnderecoEmail.getId() == 0){
			paramEnderecoEmail = new Parametros();
			paramEnderecoEmail.setChave(CHAVE_ENDERECO_EMAIL);
			paramEnderecoEmail.setValor("transferr.app@gmail.com");
			paramEnderecoEmail.setDescricao("EMAIL ADDRESS TO CONTACT US.");
			paramEnderecoEmail.setDetalhe("EMAIL ADDRESS TO CONTACT US.");
			insert(paramEnderecoEmail);
		}
		Parametros paramPortaEmail = getParametroByChave(CHAVE_PORTA_EMAIL);
		if(paramPortaEmail == null || paramPortaEmail.getId() == 0){
			paramPortaEmail = new Parametros();
			paramPortaEmail.setChave(CHAVE_PORTA_EMAIL);
			paramPortaEmail.setValor("560");
			paramPortaEmail.setDescricao("SMTP HOST PORT");
			paramPortaEmail.setDetalhe("SMTP HOST PORT");
			insert(paramPortaEmail);
		}
		Parametros paramUrlFoto = getParametroByChave(CHAVE_URL_FOTO);
		if(paramUrlFoto == null || paramUrlFoto.getId() == 0){
			paramUrlFoto = new Parametros();
			paramUrlFoto.setChave(CHAVE_URL_FOTO);
			paramUrlFoto.setValor("http://192.168.1.56:8080/");
			paramUrlFoto.setDescricao("ROOT ADDRESS FOR THE IMAGE");
			paramUrlFoto.setDetalhe("ROOT ADDRESS FOR THE IMAGE");
			insert(paramUrlFoto);
		}
		Parametros paramPathRepoImagens = getParametroByChave(CHAVE_PATH_REPO_IMAGENS);
		if(paramPathRepoImagens == null || paramPathRepoImagens.getId() == 0){
			paramPathRepoImagens = new Parametros();
			paramPathRepoImagens.setChave(CHAVE_PATH_REPO_IMAGENS);
			paramPathRepoImagens.setValor("C:\\imagens\\idoctor\\");
			paramPathRepoImagens.setDescricao("ROOT REAL PATH WHERE THE IMAGES COME FROM.");
			paramPathRepoImagens.setDetalhe("ROOT REAL PATH WHERE THE IMAGES COME FROM.");
			insert(paramPathRepoImagens);
		}
		Parametros paramContactNumber = getParametroByChave(CHAVE_CONTACT_NUMBER);
		if(paramContactNumber == null || paramContactNumber.getId() == 0){
			paramContactNumber = new Parametros();
			paramContactNumber.setChave(CHAVE_CONTACT_NUMBER);
			paramContactNumber.setValor("(85)958458-5214");
			paramContactNumber.setDescricao("CONTACT-US PHONE NUMBER");
			paramContactNumber.setDetalhe("CONTACT-US PHONE NUMBER");
			insert(paramContactNumber);
		}
		Parametros paramSoftDescriptor = getParametroByChave(CHAVE_SOFTWARE_DESCRIPTION);
		if(paramSoftDescriptor == null || paramSoftDescriptor.getId() == 0){
			paramSoftDescriptor = new Parametros();
			paramSoftDescriptor.setChave(CHAVE_SOFTWARE_DESCRIPTION);
			paramSoftDescriptor.setValor("Transferr");
			paramSoftDescriptor.setDescricao("NAME OF THE SOFTWARE.");
			paramSoftDescriptor.setDetalhe("NAME OF THE SOFTWARE.");
			insert(paramSoftDescriptor);
		}
	}
	
	public List<Parametros> getAll() {
		return daoParametros.getAll();
	}


}