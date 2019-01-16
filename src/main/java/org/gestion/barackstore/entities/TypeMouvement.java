package org.gestion.barackstore.entities;

import java.util.Collection;
import java.util.Date;

public class TypeMouvement {
	private int IdTypeMouvement;
	private String Libelle;
	private String DateOperation;
	private boolean Etat=true;
	private Collection<Mouvement> Mouvements;
	public int getIdTypeMouvement() {
		return IdTypeMouvement;
	}
	public void setIdTypeMouvement(int idTypeMouvement) {
		IdTypeMouvement = idTypeMouvement;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public String getDateOperation() {
		return DateOperation;
	}
	public void setDateOperation(String dateOperation) {
		DateOperation = dateOperation;
	}
	public boolean isEtat() {
		return Etat;
	}
	public void setEtat(boolean etat) {
		Etat = etat;
	}
	public Collection<Mouvement> getMouvements() {
		return Mouvements;
	}
	public void setMouvements(Collection<Mouvement> mouvements) {
		Mouvements = mouvements;
	}
	public TypeMouvement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeMouvement(String libelle, String dateOperation, boolean etat) {
		super();
		Libelle = libelle;
		DateOperation = dateOperation;
		Etat = etat;
	}
	@Override
	public String toString() {
		return "TypeMouvement [IdTypeMouvement=" + IdTypeMouvement + ", Libelle=" + Libelle + ", DateOperation="
				+ DateOperation + ", Etat=" + Etat + ", Mouvements=" + Mouvements + "]";
	}

	
}
