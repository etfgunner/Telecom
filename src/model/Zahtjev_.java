package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-02T09:47:10.454+0200")
@StaticMetamodel(Zahtjev.class)
public class Zahtjev_ {
	public static volatile SingularAttribute<Zahtjev, Integer> id;
	public static volatile SingularAttribute<Zahtjev, Date> datumPodnosenja;
	public static volatile SingularAttribute<Zahtjev, Integer> korisnikId;
	public static volatile SingularAttribute<Zahtjev, Integer> uslugaId;
	public static volatile SingularAttribute<Zahtjev, String> statusZahtjeva;
}
