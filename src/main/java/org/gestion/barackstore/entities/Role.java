package org.gestion.barackstore.entities;

import java.util.Collection;

public class Role {
	private long IdRole;
	private String Libelle;
	private Collection<User>Users; 

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(long idRole, String libelle) {
		super();
		IdRole = idRole;
		Libelle = libelle;
	}

	public long getIdRole() {
		return IdRole;
	}

	public void setIdRole(long idRole) {
		IdRole = idRole;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	@Override
	public String toString() {
		return "Role [IdRole=" + IdRole + ", Libelle=" + Libelle + "]";
	}

}
