package fr.insa.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName="analyzer")
public class AnalyserChaineWS {
	@WebMethod(operationName="compare")
	public int analyser(@WebParam(name="chain")String chaine) {
		return chaine.length();
	}
}
