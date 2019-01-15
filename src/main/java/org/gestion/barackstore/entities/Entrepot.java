package org.gestion.barackstore.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Entrepot implements Serializable{
	 private long IdEntrepot;
	  private String Reference; 
	  private float Superficie;
	  private Date DateOperation;
	  private boolean Etat=true;
      private Collection<Rack> Racks;
	public Entrepot(long idEntrepot, String reference, float superficie, Date dateOperation, boolean etat,
			Collection<Rack> racks) {
		super();
		IdEntrepot = idEntrepot;
		Reference = reference;
		Superficie = superficie;
		DateOperation = dateOperation;
		Etat = etat;
		Racks = racks;
	}
	public Entrepot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdEntrepot() {
		return IdEntrepot;
	}
	public void setIdEntrepot(long idEntrepot) {
		IdEntrepot = idEntrepot;
	}
	public String getReference() {
		return Reference;
	}
	public void setReference(String reference) {
		Reference = reference;
	}
	public float getSuperficie() {
		return Superficie;
	}
	public void setSuperficie(float superficie) {
		Superficie = superficie;
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
	public Collection<Rack> getRacks() {
		return Racks;
	}
	public void setRacks(Collection<Rack> racks) {
		Racks = racks;
	}
	@Override
	public String toString() {
		return "Entrepot [IdEntrepot=" + IdEntrepot + ", Reference=" + Reference + ", Superficie=" + Superficie
				+ ", DateOperation=" + DateOperation + ", Etat=" + Etat + ", Racks=" + Racks + "]";
	}
      
}
