package org.gestion.barackstore.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Entrepot implements Serializable{
	 private long IdEntrepot;
	  private String ReferenceEntrepot; 
	  private float Superficie;
	  private String DateOperation;
	  private boolean Etat=true;
      private Collection<Rack> Racks;
	public long getIdEntrepot() {
		return IdEntrepot;
	}
	public void setIdEntrepot(long idEntrepot) {
		IdEntrepot = idEntrepot;
	}
	public String getReferenceEntrepot() {
		return ReferenceEntrepot;
	}
	public void setReferenceEntrepot(String referenceEntrepot) {
		ReferenceEntrepot = referenceEntrepot;
	}
	public float getSuperficie() {
		return Superficie;
	}
	public void setSuperficie(float superficie) {
		Superficie = superficie;
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
	public Collection<Rack> getRacks() {
		return Racks;
	}
	public void setRacks(Collection<Rack> racks) {
		Racks = racks;
	}
	public Entrepot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entrepot(String referenceEntrepot, float superficie, String dateOperation, boolean etat) {
		super();
		ReferenceEntrepot = referenceEntrepot;
		Superficie = superficie;
		DateOperation = dateOperation;
		Etat = etat;
	}
	@Override
	public String toString() {
		return "Entrepot [IdEntrepot=" + IdEntrepot + ", ReferenceEntrepot=" + ReferenceEntrepot + ", Superficie="
				+ Superficie + ", DateOperation=" + DateOperation + ", Etat=" + Etat + ", Racks=" + Racks + "]";
	}
	
      
}
