package org.gestion.barackstore.entities;

import java.util.Collection;
import java.util.Date;

public class User {
	private long IdUser;
	private long IdRole;
	  private String Nom;
	  private String Prenom;
	  private String Fonction;
	  private String Login;
	  private String PassWord;
	  private Date DateOperation;
	  private boolean Etat= true ;
	  private Collection<Mouvement> Mouvements;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public User(long idUser, long idRole, String nom, String prenom, String fonction, String login, String passWord,
			Date dateOperation, boolean etat, Collection<Mouvement> mouvements) {
		super();
		IdUser = idUser;
		IdRole = idRole;
		Nom = nom;
		Prenom = prenom;
		Fonction = fonction;
		Login = login;
		PassWord = passWord;
		DateOperation = dateOperation;
		Etat = etat;
		Mouvements = mouvements;
	}
	public long getIdUser() {
		return IdUser;
	}
	public void setIdUser(long idUser) {
		IdUser = idUser;
	}
	public long getIdRole() {
		return IdRole;
	}
	public void setIdRole(long idRole) {
		IdRole = idRole;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getFonction() {
		return Fonction;
	}
	public void setFonction(String fonction) {
		Fonction = fonction;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
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
		return "User [IdUser=" + IdUser + ", IdRole=" + IdRole + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Fonction="
				+ Fonction + ", Login=" + Login + ", PassWord=" + PassWord + ", DateOperation=" + DateOperation
				+ ", Etat=" + Etat + ", Mouvements=" + Mouvements + "]";
	}



	  
	  
	  
}
