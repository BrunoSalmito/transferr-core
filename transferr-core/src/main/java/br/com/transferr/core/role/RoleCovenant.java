package br.com.transferr.core.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transferr.core.dao.DAOCovenant;
import br.com.transferr.core.exceptions.ValidationException;
import br.com.transferr.core.model.Covenant;


@Service
public class RoleCovenant extends RoleSuperClass<Covenant> {

	
	public RoleCovenant() {
		System.out.println(this.getClass().getName());
	}
	@Autowired
	private DAOCovenant daoCovenant;
	@Override
	public Covenant insert(Covenant entidade) throws ValidationException {
		return daoCovenant.insert(entidade);
	}

	@Override
	public void delete(long codigo) throws ValidationException {
		daoCovenant.delete(codigo);
	}

	@Override
	public Covenant update(Covenant entidade) throws ValidationException {
		return daoCovenant.update(entidade);
	}

	@Override
	public Covenant find(long codigo) throws ValidationException {
		return daoCovenant.find(codigo);
	}
	
	public List<Covenant> findOnlyActiveOnes() {
		return daoCovenant.findOnlyActiveOnes();
	}
	
	/*
	  var covenant = Covenant()
        with(covenant){
            description = "Covenio Padre Cícero Auto-peças"
            category = EnumCategory.AUTOPARTS
            urlLogo = "https://media.licdn.com/dms/image/C4D0BAQGqZFO3y7mE1Q/company-logo_200_200/0?e=2159024400&v=beta&t=Nca71jPdX0aiVPrtyVdlk516Apneb5YwTJrxXoq1qxE"
            message = "Tudo em auto peças, voce tem 10% de deconto em qualquer compra"

        }
        var covenant1 = Covenant()
        with(covenant1){
            description = "Covenio Bezerra Oliveira"
            category = EnumCategory.AUTOPARTS
            urlLogo = "http://bezerraoliveira.com.br/wp/wp-content/uploads/2016/09/logo-bezerra-oliveira-autopecas@2x.png"
            message = "Tudo em auto peças, voce tem 10% de deconto em qualquer compra"
        }

        var covenant2 = Covenant()
        with(covenant2){
            description = "Chico do caranguejo"
            category = EnumCategory.FOOD
            urlLogo = "https://www.chicodocaranguejo.com.br/wp-content/uploads/logo-chico-.png"
            message = "10% de desconto em pratos a Lacarte e 20% em pratos executivo. Por favor autorizar os clientes primeiro"
        }
	 */

}
