package fr.insa.soap;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import fr.insa.soap.wsdltojava.AnalyserChaineWS;
import fr.insa.soap.wsdltojava.Analyzer;

public class ClientOfAnalyzer {

	public static void main(String [] args) throws MalformedURLException {
		final String adresse="http://localhost:8089/analyzer";
		
		final URL url =URI.create(adresse).toURL();
		
		final Analyzer service= new Analyzer(url);
		
		final AnalyserChaineWS port = service.getPort(AnalyserChaineWS.class);
	
		String chaine = "aaaa";
		System.out.println("La taille de la chaine " +chaine+" est " +port.compare("aaaa"));
	}
	
}
