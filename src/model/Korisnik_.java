package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-02T09:45:35.184+0200")
@StaticMetamodel(Korisnik.class)
public class Korisnik_ {
	public static volatile SingularAttribute<Korisnik, Integer> id;
	public static volatile SingularAttribute<Korisnik, String> ime;
	public static volatile SingularAttribute<Korisnik, String> prezime;
	public static volatile SingularAttribute<Korisnik, Date> datumRodjenja;
	public static volatile SingularAttribute<Korisnik, Integer> admin;
	public static volatile SingularAttribute<Korisnik, Integer> superAdmin;
}
