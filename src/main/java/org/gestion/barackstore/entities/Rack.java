package org.gestion.barackstore.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.OneToMany;

public class Rack implements Serializable{
	private long IdRack;
	private int Numero;
	private String Emplacement;
	private int NbreLigne;
	private int NbreColonne;
	private int NbrePronfondeur;
	private String DateOperation;
	private Long IdEntrepot;
	private Entrepot Entrepot;
	private boolean Etat= true ; 
	@OneToMany
	private Collection<Barrique> Barriques;
	public long getIdRack() {
		return IdRack;
	}
	public void setIdRack(long idRack) {
		IdRack = idRack;
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
	public String getDateOperation() {
		return DateOperation;
	}
	public void setDateOperation(String dateOperation) {
		DateOperation = dateOperation;
	}
	public Long getIdEntrepot() {
		return IdEntrepot;
	}
	public void setIdEntrepot(Long idEntrepot) {
		IdEntrepot = idEntrepot;
	}
	public Entrepot getEntrepot() {
		return Entrepot;
	}
	public void setEntrepot(Entrepot entrepot) {
		Entrepot = entrepot;
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
	public Rack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rack(int numero, String emplacement, int nbreLigne, int nbreColonne, int nbrePronfondeur,
			String dateOperation) {
		super();
		Numero = numero;
		Emplacement = emplacement;
		NbreLigne = nbreLigne;
		NbreColonne = nbreColonne;
		NbrePronfondeur = nbrePronfondeur;
		DateOperation = dateOperation;
	}
	@Override
	public String toString() {
		return "Rack [IdRack=" + IdRack + ", Numero=" + Numero + ", Emplacement=" + Emplacement + ", NbreLigne="
				+ NbreLigne + ", NbreColonne=" + NbreColonne + ", NbrePronfondeur=" + NbrePronfondeur
				+ ", DateOperation=" + DateOperation + ", IdEntrepot=" + IdEntrepot + ", Entrepot=" + Entrepot
				+ ", Etat=" + Etat + ", Barriques=" + Barriques + "]";
	}
	
	
}
