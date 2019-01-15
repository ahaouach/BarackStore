package org.gestion.barackstore.entities;

import java.util.Collection;
import java.util.Date;

public class Mouvement {
	  private long  IdMouv;
	  private long IdBarique;
	   private int IdTypeMouv;
	  private long IdUser;
	  private Date DateOperation;
	  private String Observation;
	  private boolean Etat=true ; 
	  private Collection<Mouvement> Mouvements;
	public Mouvement(long IdMouv , long idBarique, int idTypeMouv, long idUser, Date dateOperation, String observation,
			boolean etat, Collection<Mouvement> mouvements) {
		super();
		IdMouv  = IdMouv ;
		IdBarique = idBarique;
		IdTypeMouv = idTypeMouv;
		IdUser = idUser;
		DateOperation = dateOperation;
		Observation = observation;
		Etat = etat;
		Mouvements = mouvements;
	}
	public Mouvement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdMouv () {
		return IdMouv ;
	}
	public void setIdMouv (long IdMouv ) {
		IdMouv  = IdMouv ;
	}
	public long getIdBarique() {
		return IdBarique;
	}
	public void setIdBarique(long idBarique) {
		IdBarique = idBarique;
	}
	public int getIdTypeMouv() {
		return IdTypeMouv;
	}
	public void setIdTypeMouv(int idTypeMouv) {
		IdTypeMouv = idTypeMouv;
	}
	public long getIdUser() {
		return IdUser;
	}
	public void setIdUser(long idUser) {
		IdUser = idUser;
	}
	public Date getDateOperation() {
		return DateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		DateOperation = dateOperation;
	}
	public String getObservation() {
		return Observation;
	}
	public void setObservation(String observation) {
		Observation = observation;
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
		return "Mouvement [IdMouv =" + IdMouv  + ", IdBarique=" + IdBarique + ", IdTypeMouv=" + IdTypeMouv + ", IdUser="
				+ IdUser + ", DateOperation=" + DateOperation + ", Observation=" + Observation + ", Etat=" + Etat
				+ ", Mouvements=" + Mouvements + "]";
	}
	  
}
