package test;

import org.gestion.barackstore.entities.Barrique;
import org.gestion.barackstore.entities.Entrepot;
import org.gestion.barackstore.entities.Etiquette;
import org.gestion.barackstore.entities.Mouvement;
import org.gestion.barackstore.entities.Rack;
import org.gestion.barackstore.entities.Role;
import org.gestion.barackstore.entities.TypeMouvement;
import org.gestion.barackstore.entities.User;
import org.gestion.barackstore.metier.IBarackStoreMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		IBarackStoreMetier metier = (IBarackStoreMetier) context.getBean("metier");

		// metier.addRole(new Role("STOCKISTE"));

		// metier.addEntrepot(new Entrepot("aaa",3000, "20/04/2019", true));
		// metier.addEtiquette(new Etiquette("A", "20/01/2019", true));
		// metier.addBarrique(new Barrique("aa", 16, 12, c, "", "", "", true), 1,
		// IdRack);

		// metier.addBarrique(new Barrique("AAA", 3, 10, "D", "", "20/01/2019", "",
		// true), 1, 6);
		// metier.ModifEntrepot(1, "bbb", 5000);

		// metier.addRack(new Rack(10, "gauche", 10, 20, 30, "20/01/2019"), 2);
		// metier.addRole(new Role("ADMIN"));

		// metier.ModifRole(1, "aaaa");

		 metier.addUser(new User("bbbbb", "bbbbb", "Admin", "3", "azelarab",
		 "20/03/2018", true), 1);
		// metier.addTypeMouvement(new TypeMouvement("entrant", "20/05/2019", true));
		// metier.addMouvement(new Mouvement("05/02/2019", "fuite", true),1, 1, 1);
		// metier.getUsers();
		// metier.getRoles();

		metier.RechercherBarrique(2);
		metier.RechercherEntrepot("bbb");
		metier.RechercherRack(1);
		metier.RechercherUser(5);
		metier.AlerteMaturite();
		// metier.ChangerMonPassword(7, "Admin1", "Admin001", "333");

		// metier.PasswordOublier(7, "Admin1");

	}

}
