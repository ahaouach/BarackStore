package test;


import org.gestion.barackstore.entities.Role;
import org.gestion.barackstore.metier.IBarackStoreMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"} );
        //IBarackStoreMetier metier=(IBarackStoreMetier)context.getBean("metier");
	//metier.addRole(new Role("STOCKISTE"));
	//metier.addRole(new Role("ADMIN"));
	
	}

}
