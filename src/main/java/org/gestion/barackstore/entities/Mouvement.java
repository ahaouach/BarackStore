package org.gestion.barackstore.entities;

import java.util.Collection;
import java.util.Date;

public class Mouvement {
	  private long  IdMouvement;
	  private String DateOperation;
	  private String Observation;
	  private boolean Etat=true ; 
	  private Long IdBarrique;
	  private Barrique Barriques;
	  private Long IdUser;
	  private User Users;
	  private Long IdTypeMouvement;
	  private TypeMouvement Typemouvements;
	public long getIdMouvement() {
		return IdMouvement;
	}
	public void setIdMouvement(long idMouvement) {
		IdMouvement = idMouvement;
	}
	public String getDateOperation() {
		return DateOperation;
	}
	public void setDateOperation(String dateOperation) {
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
	public Long getIdBarrique() {
		return IdBarrique;
	}
	public void setIdBarrique(Long idBarrique) {
		IdBarrique = idBarrique;
	}
	public Barrique getBarriques() {
		return Barriques;
	}
	public void setBarriques(Barrique barriques) {
		Barriques = barriques;
	}
	public Long getIdUser() {
		return IdUser;
	}
	public void setIdUser(Long idUser) {
		IdUser = idUser;
	}
	public User getUsers() {
		return Users;
	}
	public void setUsers(User users) {
		Users = users;
	}
	public Long getIdTypeMouvement() {
		return IdTypeMouvement;
	}
	public void setIdTypeMouvement(Long idTypeMouvement) {
		IdTypeMouvement = idTypeMouvement;
	}
	public TypeMouvement getTypemouvements() {
		return Typemouvements;
	}
	public void setTypemouvements(TypeMouvement typemouvements) {
		Typemouvements = typemouvements;
	}
	public Mouvement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mouvement(String dateOperation, String observation, boolean etat) {
		super();
		DateOperation = dateOperation;
		Observation = observation;
		Etat = etat;
	}
	@Override
	public String toString() {
		return "Mouvement [IdMouvement=" + IdMouvement + ", DateOperation=" + DateOperation + ", Observation="
				+ Observation + ", Etat=" + Etat + ", IdBarrique=" + IdBarrique + ", Barriques=" + Barriques
				+ ", IdUser=" + IdUser + ", Users=" + Users + ", IdTypeMouvement=" + IdTypeMouvement
				+ ", Typemouvements=" + Typemouvements + "]";
	}
	
	 
	
	  
}
