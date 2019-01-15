package org.gestion.barackstore.entities;

import java.util.Collection;
import java.util.Date;

public class Etiquette {
	private long IdEtiquette;
	private char Code;
	private Date DateOperation;
	private boolean Etat = true;
	private Collection<Barrique> Barriques;

	public Etiquette() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etiquette(long idEtiquette, char code, Date dateOperation, boolean etat, Collection<Barrique> barriques) {
		super();
		IdEtiquette = idEtiquette;
		Code = code;
		DateOperation = dateOperation;
		Etat = etat;
		Barriques = barriques;
	}

    public long getIdEtiquette() {
		return IdEtiquette;
	}

	public void setIdEtiquette(long idEtiquette) {
		IdEtiquette = idEtiquette;
	}

	public char getCode() {
		return Code;
	}

	public void setCode(char code) {
		Code = code;
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

	public String toString() {
		return "Etiquette [IdEtiquette=" + IdEtiquette + ", Code=" + Code + ", DateOperation=" + DateOperation
				+ ", Etat=" + Etat + ", Barriques=" + Barriques + "]";
	}

}
