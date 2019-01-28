package org.gestion.barackstore.dao;

import java.util.List;

import org.gestion.barackstore.entities.Barrique;
import org.gestion.barackstore.entities.Entrepot;
import org.gestion.barackstore.entities.Etiquette;
import org.gestion.barackstore.entities.Mouvement;
import org.gestion.barackstore.entities.Rack;
import org.gestion.barackstore.entities.Role;
import org.gestion.barackstore.entities.TypeMouvement;
import org.gestion.barackstore.entities.User;

public interface IBarackStoreDao {

	public Barrique addBarrique(Barrique b, long IdEtiquette, long IdRack);

	public Entrepot addEntrepot(Entrepot e);

	public Etiquette addEtiquette(Etiquette et);

	public Mouvement addMouvement(Mouvement mv, long IdBarrique, long IdTypeMouvement, long IdUser);

	public TypeMouvement addTypeMouvement(TypeMouvement tmv);

	public Role addRole(Role r);

	public User addUser(User u, long IdRole);

	public Rack addRack(Rack r, long IdEntrepot);

	public List<Barrique> getBarriques();

	public List<Entrepot> getEntrepots();

	public List<Rack> getRacks();

	public List<Etiquette> getEtiquettes();

	public List<Role> getRoles();

	public List<User> getUsers();

	public Etiquette ModifEttiquette(long IdEtiquette, String code);

	public Role ModifRole(long IdRole, String Libelle);

	public Entrepot ModifEntrepot(long IdEntrepot, String ReferenceEntrepot, float Superficie);

	public Rack ModifRack(long IdRack, int Numero, String Emplacement, int NbreLigne, int NbreColonne,
			int NbrePronfondeur);

	public User ModifUser(long IdUser, String Nom, String Prenom, String Fonction, String Login, String PassWord);

	public Barrique ModifBarrique(long IdBarrique, String CodeBarre, int XLigne, int YColonne, String ZEtiquette,
			String DateFabricaVin, String DateMaturaVin);

	public List<Barrique> RechercherBarrique(long IdEntrepot);

	public List<Entrepot> RechercherEntrepot(String ReferenceEntrepot);

	public List<Rack> RechercherRack(int Numero);

	public List<User> RechercherUser(long IdUser);
	
	public List<Barrique> AlerteMaturite();

	//public String ChangerMonPassword(long IdUser, String Login, String Password, String NewPassword);
	
	
}
