package org.gestion.barackstore.entities;

import java.util.Date;

public class Barrique {
	   private long IdBarique;
	   private long IdEtiquette;
	   private long IdRack ;
	   private String CodeBarre;
	   private int XLigne; 
	   private int YColone;
	   private int ZEtiquette;
	   private Date DateFabricaVin ; 
	   private Date DateMaturaVin;
	   private Date DateOperation;
	   private boolean Etat= true;
	public Barrique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Barrique(long idBarique, long idEtiquette, long idRack, String codeBarre, int xLigne, int yColone,
			int zEtiquette, Date dateFabricaVin, Date dateMaturaVin, Date dateOperation, boolean etat) {
		super();
		IdBarique = idBarique;
		IdEtiquette = idEtiquette;
		IdRack = idRack;
		CodeBarre = codeBarre;
		XLigne = xLigne;
		YColone = yColone;
		ZEtiquette = zEtiquette;
		DateFabricaVin = dateFabricaVin;
		DateMaturaVin = dateMaturaVin;
		DateOperation = dateOperation;
		Etat = etat;
	}
	public long getIdBarique() {
		return IdBarique;
	}
	public void setIdBarique(long idBarique) {
		IdBarique = idBarique;
	}
	public long getIdEtiquette() {
		return IdEtiquette;
	}
	public void setIdEtiquette(long idEtiquette) {
		IdEtiquette = idEtiquette;
	}
	public long getIdRack() {
		return IdRack;
	}
	public void setIdRack(long idRack) {
		IdRack = idRack;
	}
	public String getCodeBarre() {
		return CodeBarre;
	}
	public void setCodeBarre(String codeBarre) {
		CodeBarre = codeBarre;
	}
	public int getXLigne() {
		return XLigne;
	}
	public void setXLigne(int xLigne) {
		XLigne = xLigne;
	}
	public int getYColone() {
		return YColone;
	}
	public void setYColone(int yColone) {
		YColone = yColone;
	}
	public int getZEtiquette() {
		return ZEtiquette;
	}
	public void setZEtiquette(int zEtiquette) {
		ZEtiquette = zEtiquette;
	}
	public Date getDateFabricaVin() {
		return DateFabricaVin;
	}
	public void setDateFabricaVin(Date dateFabricaVin) {
		DateFabricaVin = dateFabricaVin;
	}
	public Date getDateMaturaVin() {
		return DateMaturaVin;
	}
	public void setDateMaturaVin(Date dateMaturaVin) {
		DateMaturaVin = dateMaturaVin;
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
	@Override
	public String toString() {
		return "Barrique [IdBarique=" + IdBarique + ", IdEtiquette=" + IdEtiquette + ", IdRack=" + IdRack
				+ ", CodeBarre=" + CodeBarre + ", XLigne=" + XLigne + ", YColone=" + YColone + ", ZEtiquette="
				+ ZEtiquette + ", DateFabricaVin=" + DateFabricaVin + ", DateMaturaVin=" + DateMaturaVin
				+ ", DateOperation=" + DateOperation + ", Etat=" + Etat + "]";
	} 
	   
}
