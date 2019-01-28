package org.gestion.barackstore.dao;

import java.awt.RenderingHints.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import org.hibernate.ejb.criteria.ValueHandlerFactory.IntegerValueHandler;

public class BarackStoreDaoImpl implements IBarackStoreDao {
	@PersistenceContext
	private EntityManager em;
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Entrepot addEntrepot(Entrepot e) {
		em.persist(e);
		return e;
	}

	@Override
	public Barrique addBarrique(Barrique b, long IdEtiquette, long IdRack) {
		Etiquette e = em.find(Etiquette.class, IdEtiquette);
		b.setEtiquettes(e);
		Rack r = em.find(Rack.class, IdRack);
		b.setRacks(r);
		em.persist(b);
		System.out.println("****************************  Barrique numero :" + b.getIdBarique()
				+ " est ajouté avec succés dans l'emplacement " + b.getXLigne() + b.getYColone() + b.getZEtiquette()
				+ ":) " + "*************************");

		return b;
	}

	@Override
	public Etiquette addEtiquette(Etiquette et) {
		em.persist(et);
		System.out.println("****************************  " + "Etiquette numero :" + et.getIdEtiquette()
				+ " est ajouté avec succés !! :) " + "*************************");

		return et;
	}

	@Override
	public Mouvement addMouvement(Mouvement mv, long IdBarique, long IdTypeMouvement, long IdUser) {
		Barrique b = em.find(Barrique.class, IdBarique);
		mv.setBarriques(b);
		TypeMouvement tmv = em.find(TypeMouvement.class, IdTypeMouvement);
		mv.setTypemouvements(tmv);
		User u = em.find(User.class, IdUser);
		mv.setUsers(u);
		em.persist(mv);
		System.out.println("****************************  Mouvement numero :" + mv.getIdMouvement()
				+ " est ajouté avec succés !! :) *************************");

		return mv;
	}

	@Override
	public TypeMouvement addTypeMouvement(TypeMouvement tmv) {
		em.persist(tmv);
		System.out.println("****************************  TypeMouvement de libelle :" + tmv.getLibelle()
				+ " est ajouté avec succés !! :) *************************");

		return tmv;
	}

	@Override
	public Role addRole(Role r) {
		em.persist(r);
		System.out.println("****************************  Role numero :" + r.getIdRole()
				+ " est ajouté avec succés !! :) *************************");

		return r;
	}

	@Override
	public User addUser(User u, long IdRole) {
		Role r = em.find(Role.class, IdRole);
		u.setRoles(r);
		MessageDigest digester = null;
	        try {
	            digester = MessageDigest.getInstance("MD5");
	        }
	        catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        if (u.getPassWord() == null || u.getPassWord().length() == 0) {
	            throw new IllegalArgumentException("String to encript cannot be null or zero length");
	        }
	        digester.update(u.getPassWord().getBytes());
	        byte[] hash = digester.digest();
	        StringBuffer hexString = new StringBuffer();
	        for (int i = 0; i < hash.length; i++) {
	            if ((0xff & hash[i]) < 0x10) {
	                hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
	            }
	            else {
	                hexString.append(Integer.toHexString(0xFF & hash[i]));
	            }
	        }
	        u.setPassWord(hexString.toString()); ;  
		em.persist(u);
		System.out.println("****************************  User numero :" + u.getIdUser()
				+ " est ajouté avec succés !! :) *************************");
		return u;
		}

		
	

	@Override
	public List<Barrique> getBarriques() {
		Query req = em.createQuery("select b from Barrique b");
		return req.getResultList();
	}

	@Override
	public List<Entrepot> getEntrepots() {

		Query req = em.createQuery("select e from Entrepot e where Etat = 1");
		return req.getResultList();
	}

	@Override
	public List<Rack> getRacks() {
		Query req = em.createQuery("select r from Rack e where Etat = 1");
		return req.getResultList();

	}

	@Override
	public Etiquette ModifEttiquette(long IdEtiquette, String code) {
		Etiquette e = em.find(Etiquette.class, IdEtiquette);
		em.createQuery("update Etiquette set Code = '" + code + "' where IdEtiquette = '" + IdEtiquette + "'")
				.executeUpdate();
		em.refresh(e);
		return e;

	}

	@Override
	public List<Etiquette> getEtiquettes() {
		Query req = em.createQuery("select e from Etiquette e where Etat = 1");
		return req.getResultList();
	}

	@Override
	public Role ModifRole(long IdRole, String Libelle) {
		Role r = em.find(Role.class, IdRole);
		em.createQuery("update Role set Libelle = '" + Libelle + "' where IdRole = '" + IdRole + "'").executeUpdate();
		em.refresh(r);
		return r;

	}

	@Override
	public List<Role> getRoles() {
		Query req = em.createQuery("select r from Role r");
		return req.getResultList();
	}

	@Override
	public Entrepot ModifEntrepot(long IdEntrepot, String ReferenceEntrepot, float Superficie) {
		Entrepot e = em.find(Entrepot.class, IdEntrepot);
		em.createQuery("update Entrepot set ReferenceEntrepot = '" + ReferenceEntrepot + "' , Superficie = '"
				+ Superficie + "' where IdEntrepot = '" + IdEntrepot + "'").executeUpdate();
		em.refresh(e);
		return e;
	}

	@Override
	public Rack ModifRack(long IdRack, int Numero, String Emplacement, int NbreLigne, int NbreColonne,
			int NbrePronfondeur) {
		Rack r = em.find(Rack.class, IdRack);
		em.createQuery("update Entrepot set Numero = '" + Numero + "' , Emplacement = '" + Emplacement
				+ "' , NbreLigne = '" + NbreLigne + "', NbreColonne = '" + NbreColonne + "' , NbrePronfondeur = '"
				+ NbrePronfondeur + "' where IdRack = '" + IdRack + "'").executeUpdate();
		em.refresh(r);
		return r;
	}

	@Override
	public Rack addRack(Rack r, long IdEntrepot) {
		Entrepot e = em.find(Entrepot.class, IdEntrepot);
		r.setEntrepot(e);
		em.persist(r);

		System.out.println("****************************  rack numero :" + r.getIdRack()
				+ " est ajouté avec succés !! :) *************************");
		return r;
	}

	@Override
	public List<User> getUsers() {
		Query req = em.createQuery("select u from User u where Etat = 1");
		return req.getResultList();
	}

	@Override
	public Barrique ModifBarrique(long IdBarrique, String CodeBarre, int XLigne, int YColonne, String ZEtiquette,
			String DateFabricaVin, String DateMaturaVin) {
		Barrique b = em.find(Barrique.class, IdBarrique);
		em.createQuery("update Barrique set CodeBarre = '" + CodeBarre + "' , XLigne = '" + XLigne + "' , YColonne = '"
				+ YColonne + "', ZEtiquette = '" + ZEtiquette + "' , DateFabricaVin = '" + DateFabricaVin
				+ "' , DateMaturaVin = '" + DateMaturaVin + "' where IdBarrique = '" + IdBarrique + "'")
				.executeUpdate();
		em.refresh(b);
		return b;
	}

	@Override
	public User ModifUser(long IdUser, String Nom, String Prenom, String Fonction, String Login, String PassWord) {
		User u = em.find(User.class, IdUser);
		em.createQuery("update User set Nom = '" + Nom + "' , Prenom = '" + Prenom + "' , Fonction = '" + Fonction
				+ "', Login = '" + Login + "' , PassWord = '" + PassWord + "' where IdBarrique = '" + IdUser + "'")
				.executeUpdate();
		em.refresh(u);
		return u;
	}

	@Override
	public List<Barrique> RechercherBarrique(long IdEntrepot) {

		// Entrepot e = em.find(Entrepot.class, IdEntrepot);
		Query req = em.createNativeQuery("SELECT b.IdBarique " + "From Barrique b "
				+ "INNER JOIN Rack r ON r.IdRack = b.IdRack " + "INNER JOIN Entrepot e ON e.IdEntrepot = r.IdEntrepot "
				+ "WHERE e.IdEntrepot = '" + IdEntrepot + "'");
		List<String> a = req.getResultList();
		System.out.println("" + a);
		return req.getResultList();

	}

	@Override
	public List<Entrepot> RechercherEntrepot(String ReferenceEntrepot) {
		Query req = em.createNativeQuery(
				"SELECT IdEntrepot " + "From Entrepot e " + "WHERE ReferenceEntrepot = '" + ReferenceEntrepot + "'");
		List<String> en = req.getResultList();
		System.out.println("" + en);
		return req.getResultList();

	}

	@Override
	public List<Rack> RechercherRack(int Numero) {
		Query req = em.createNativeQuery("SELECT IdRack " + "From Rack r " + "WHERE Numero = '" + Numero + "'");
		List<String> r = req.getResultList();
		System.out.println("" + r);
		return req.getResultList();
	}

	@Override
	public List<User> RechercherUser(long IdUser) {
		Query req = em.createNativeQuery("SELECT u.Nom " + "From User u " + "WHERE IdUser = '" + IdUser + "'");
		List<String> r = req.getResultList();
		System.out.println("" + r.toString());
		return req.getResultList();
	}

	@Override
	public List<Barrique> AlerteMaturite() {
		final Date date = new Date();
		String Dates = new SimpleDateFormat("dd/MM/yyyy").format(date);
		Query req = em.createNativeQuery("SELECT * FROM barrique b WHERE CONVERT(b.DateMaturaVin, DATETIME) <= NOW() ");
		List<String> a = req.getResultList();
		System.out.println(""+a);
		/*SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < a.size(); i++) {
			Date dateMaturVin = null;
			try {
				dateMaturVin = format.parse(a.get(i));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Date Datesys = null;
			try {
				Datesys = format.parse(Dates);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if (dateMaturVin.compareTo(Datesys) <= 0) {
				String dateConversion = new SimpleDateFormat("dd/MM/yyyy").format(dateMaturVin);
				Query lesDates = em.createNativeQuery(
						"SELECT IdBarique FROM Barrique b WHERE b.DateMaturaVin = '" + dateConversion + "'");
				List<String> listesDates = lesDates.getResultList();
				System.out.println("***********   ALERTE !!  ************* Barriques qui ont eu leur maturité sont : "
						+ listesDates+" à la date :"+dateConversion);
			}
		}*/
		return null;
	}

	@Override
	public List<Mouvement> MouvementsDates(String Libelle, String DateDebut, String DateFin) {
		Query req = em.createNativeQuery("\r\n" + 
				"\r\n" + 
				"SELECT * FROM mouvement m INNER JOIN typemouvement tp ON tp.IdTypeMouvement = m.IdTypeMouvement WHERE tp.Libelle = '"+Libelle+"'  AND CONVERT(m.DateOperation, DATETIME) BETWEEN"
				+ " CONVERT('"+DateDebut+"', DATETIME)  AND CONVERT('"+DateFin+"', DATETIME)");
		List<String> res = req.getResultList();
		System.out.println(""+res);
		return req.getResultList();
	}


	
}
