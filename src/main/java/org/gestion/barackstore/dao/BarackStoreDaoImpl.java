package org.gestion.barackstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.gestion.barackstore.entities.Barrique;
import org.gestion.barackstore.entities.Entrepot;
import org.gestion.barackstore.entities.Etiquette;
import org.gestion.barackstore.entities.Mouvement;
import org.gestion.barackstore.entities.Rack;
import org.gestion.barackstore.entities.Role;
import org.gestion.barackstore.entities.TypeMouvement;
import org.gestion.barackstore.entities.User;

public class BarackStoreDaoImpl implements IBarackStoreDao {
	 @PersistenceContext
	private EntityManager em;
	 @PersistenceUnit
	 private EntityManagerFactory entityManagerFactory;
   

	@Override
	public Rack addRack(Rack r) {
		em.persist(r);
		return r;
	}

	@Override
	public Barrique addBarrique(Barrique b) {
		em.persist(b);
		return b;
	}

	@Override
	public Entrepot addEntrepot(Entrepot e) {
		em.persist(e);
		return e;
	}

	@Override
	public Etiquette addEtiquette(Etiquette et) {
		em.persist(et);
		return et;
	}

	@Override
	public Mouvement addMouvement(Mouvement mv) {
		em.persist(mv);
		return mv;
	}

	@Override
	public TypeMouvement addTypeMouvement(TypeMouvement tmv) {
		em.persist(tmv);
		return tmv;
	}

	@Override
	public Role addRole(Role r) {
		em.persist(r);
		return r;
	}

	@Override
	public User addUser(User u) {
		em.persist(u);
		return u;
	}

	@Override
	public List<Barrique> getBarriques() {
		Query req=em.createQuery("select b from Barrique b");		
		return req.getResultList();
	}

	@Override
	public List<Entrepot> getEntrepots() {
		Query req=em.createQuery("select e from Entrepot e");		
		return req.getResultList();
	}

	@Override
	public List<Rack> getRacks() {
		Query req=em.createQuery("select r from Rack e");		
		return req.getResultList();
	}
}
