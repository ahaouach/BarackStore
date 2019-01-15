package org.gestion.barackstore.entities;

import java.util.Collection;
import java.util.Date;

public class TypeMouvement {
	private int IdMouv;
	private String Libelle;
	private Date DateOperation;
	private boolean Etat;
	private Collection<Mouvement> Mouvements;

	public TypeMouvement(int idMouv, String libelle, Date dateOperation, boolean etat,
			Collection<Mouvement> mouvements) {
		super();
		IdMouv = idMouv;
		Libelle = libelle;
		DateOperation = dateOperation;
		Etat = etat;
		Mouvements = mouvements;
	}

	public TypeMouvement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdMouv() {
		return IdMouv;
	}

	public void setIdMouv(int idMouv) {
		IdMouv = idMouv;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
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

	public Collection<Mouvement> getMouvements() {
		return Mouvements;
	}

	public void setMouvements(Collection<Mouvement> mouvements) {
		Mouvements = mouvements;
	}

	@Override
	public String toString() {
		return "TypeMouvement [IdMouv=" + IdMouv + ", Libelle=" + Libelle + ", DateOperation=" + DateOperation
				+ ", Etat=" + Etat + ", Mouvements=" + Mouvements + "]";
	}

}
