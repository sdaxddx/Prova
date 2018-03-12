package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private List<String> elenco;
		
	public Parole() {
		elenco = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		elenco.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(this.elenco);
		return this.elenco;
	}
	
	public void reset() {
		elenco.clear();
	}

	public void deleteParola(String text) {
		while(elenco.remove(text) == true) {
			}
	}
	 
}
