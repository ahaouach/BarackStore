package org.gestion.barackstore.entities;

import java.util.Collection;
import java.util.Date;

public class Rack {
	private long IdRack;
	private long IdEntrepot;
	private int Numero;
	private String Emplacement;
	private int NbreLigne;
	private int NbreColonne;
	private int NbrePronfondeur;
	private Date DateOperation;
	private boolean Etat= true ; 
	private Collection<Barrique> Barriques;
	public Rack(long idRack, long idEntrepot, int numero, String emplacement, int nbreLigne, int nbreColonne,
			int nbrePronfondeur, Date dateOperation, boolean etat, Collection<Barrique> barriques) {
		super();
		IdRack = idRack;
		IdEntrepot = idEntrepot;
		Numero = numero;
		Emplacement = emplacement;
		NbreLigne = nbreLigne;
		NbreColonne = nbreColonne;
		NbrePronfondeur = nbrePronfondeur;
		DateOperation = dateOperation;
		Etat = etat;
		Barriques = barriques;
	}
	public Rack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdRack() {
		return IdRack;
	}
	public void setIdRack(long idRack) {
		IdRack = idRack;
	}
	public long getIdEntrepot() {
		return IdEntrepot;
	}
	public void setIdEntrepot(long idEntrepot) {
		IdEntrepot = idEntrepot;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getEmplacement() {
		return Emplacement;
	}
	public void setEmplacement(String emplacement) {
		Emplacement = emplacement;
	}
	public int getNbreLigne() {
		return NbreLigne;
	}
	public void setNbreLigne(int nbreLigne) {
		NbreLigne = nbreLigne;
	}
	public int getNbreColonne() {
		return NbreColonne;
	}
	public void setNbreColonne(int nbreColonne) {
		NbreColonne = nbreColonne;
	}
	public int getNbrePronfondeur() {
		return NbrePronfondeur;
	}
	public void setNbrePronfondeur(int nbrePronfondeur) {
		NbrePronfondeur = nbrePronfondeur;
	}
	public Date getDateOperation() {
		return DateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		DateOperation = dateOperation;
	}
	public boolean isEtat() {
		return Etat;
	}
	public void setEtat(boolean etat) {
		Etat = etat;
	}
	public Collection<Barrique> getBarriques() {
		return Barriques;
	}
	public void setBarriques(Collection<Barrique> barriques) {
		Barriques = barriques;
	}
	@Override
	public String toString() {
		return "Rack [IdRack=" + IdRack + ", IdEntrepot=" + IdEntrepot + ", Numero=" + Numero + ", Emplacement="
				+ Emplacement + ", NbreLigne=" + NbreLigne + ", NbreColonne=" + NbreColonne + ", NbrePronfondeur="
				+ NbrePronfondeur + ", DateOperation=" + DateOperation + ", Etat=" + Etat + ", Barriques=" + Barriques
				+ "]";
	}  
	
}
