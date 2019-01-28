package org.gestion.barackstore.metier;

import java.util.List;

import org.gestion.barackstore.dao.IBarackStoreDao;
import org.gestion.barackstore.entities.Barrique;
import org.gestion.barackstore.entities.Entrepot;
import org.gestion.barackstore.entities.Etiquette;
import org.gestion.barackstore.entities.Mouvement;
import org.gestion.barackstore.entities.Rack;
import org.gestion.barackstore.entities.Role;
import org.gestion.barackstore.entities.TypeMouvement;
import org.gestion.barackstore.entities.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BarackStoreMetierImpl implements IBarackStoreMetier {
	private IBarackStoreDao dao;

	public void setDao(IBarackStoreDao dao) {
		this.dao = dao;
	}

	@Override
	public Barrique addBarrique(Barrique b, long IdEtiquette, long IdRack) {

		return dao.addBarrique(b, IdEtiquette, IdRack);
	}

	@Override
	public Entrepot addEntrepot(Entrepot e) {

		return dao.addEntrepot(e);
	}

	@Override
	public Etiquette addEtiquette(Etiquette et) {

		return dao.addEtiquette(et);
	}

	@Override
	public Mouvement addMouvement(Mouvement mv, long IdBarrique, long IdTypeMouvement, long IdUser) {

		return dao.addMouvement(mv, IdBarrique, IdTypeMouvement, IdUser);
	}

	@Override
	public TypeMouvement addTypeMouvement(TypeMouvement tmv) {

		return dao.addTypeMouvement(tmv);
	}

	@Override
	public Role addRole(Role r) {

		return dao.addRole(r);
	}

	@Override
	public User addUser(User u, long IdRole) {

		return dao.addUser(u, IdRole);
	}

	@Override
	public List<Barrique> getBarriques() {

		return dao.getBarriques();
	}

	@Override
	public List<Entrepot> getEntrepots() {

		return dao.getEntrepots();
	}

	@Override
	public List<Rack> getRacks() {

		return dao.getRacks();
	}

	@Override
	public Role ModifRole(long IdRole, String Libelle) {
		return dao.ModifRole(IdRole, Libelle);
	}

	@Override
	public List<Role> getRoles() {
		return dao.getRoles();
	}

	@Override
	public Etiquette ModifEttiquette(long IdEtiquette, String code) {
		return dao.ModifEttiquette(IdEtiquette, code);
	}

	@Override
	public Entrepot ModifEntrepot(long IdEntrepot, String ReferenceEntrepot, float Superficie) {
		return dao.ModifEntrepot(IdEntrepot, ReferenceEntrepot, Superficie);
	}

	@Override
	public Rack ModifRack(long IdRack, int Numero, String Emplacement, int NbreLigne, int NbreColonne,
			int NbrePronfondeur) {
		return dao.ModifRack(IdRack, Numero, Emplacement, NbreLigne, NbreColonne, NbrePronfondeur);
	}

	@Override
	public Rack addRack(Rack r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rack addRack(Rack r, long IdEntrepot) {
		return dao.addRack(r, IdEntrepot);
	}

	@Override
	public List<User> getUsers() {
		return dao.getUsers();
	}

	@Override
	public Barrique ModifBarrique(long IdBarrique, String CodeBarre, int XLigne, int YColonne, String ZEtiquette,
			String DateFabricaVin, String DateMaturaVin) {

		return dao.ModifBarrique(IdBarrique, CodeBarre, XLigne, YColonne, ZEtiquette, DateFabricaVin, DateMaturaVin);
	}

	@Override
	public User ModifUser(long IdUser, String Nom, String Prenom, String Fonction, String Login, String PassWord) {
		return dao.ModifUser(IdUser, Nom, Prenom, Fonction, Login, PassWord);
	}

	@Override
	public List<Barrique> RechercherBarrique(long IdEntrepot) {
		return dao.RechercherBarrique(IdEntrepot);
	}

	@Override
	public List<Entrepot> RechercherEntrepot(String ReferenceEntrepot) {
		return dao.RechercherEntrepot(ReferenceEntrepot);
	}

	@Override
	public List<Rack> RechercherRack(int Numero) {
		return dao.RechercherRack(Numero);
	}

	@Override
	public List<User> RechercherUser(long IdUser) {
		return dao.RechercherUser(IdUser);
	}

	@Override
	public List<Barrique> AlerteMaturite() {
		return dao.AlerteMaturite();
	}

	

}
