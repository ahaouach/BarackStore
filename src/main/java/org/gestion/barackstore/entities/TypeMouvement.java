package org.gestion.barackstore.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class TypeMouvement implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int IdTypeMouvement;
	private String Libelle;
	private String DateOperation;
	private boolean Etat=true;

	@OneToMany
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
	

	
}
