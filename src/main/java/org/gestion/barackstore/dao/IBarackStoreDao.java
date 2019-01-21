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

public Rack addRack(Rack r);
public Barrique addBarrique(Barrique b);
public Entrepot addEntrepot(Entrepot e);
public Etiquette addEtiquette(Etiquette et);
public Mouvement addMouvement(Mouvement mv);
public TypeMouvement addTypeMouvement(TypeMouvement tmv);
public Role addRole(Role r);
public User addUser(User u);

public List<Barrique> getBarriques(); 
public List<Entrepot>getEntrepots();
public List<Rack>getRacks();
	
}
