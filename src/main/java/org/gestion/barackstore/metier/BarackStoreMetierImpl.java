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
	public Rack addRack(Rack r) {
		
		return dao.addRack(r);
	}

	@Override
	public Barrique addBarrique(Barrique b) {
		
		return dao.addBarrique(b);
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
	public Mouvement addMouvement(Mouvement mv) {
	
		return dao.addMouvement(mv);
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
	public User addUser(User u) {
		
		return dao.addUser(u);
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

}
