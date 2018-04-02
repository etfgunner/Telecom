package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-02T09:45:35.285+0200")
@StaticMetamodel(Rezultatproblema.class)
public class Rezultatproblema_ {
	public static volatile SingularAttribute<Rezultatproblema, Integer> id;
	public static volatile SingularAttribute<Rezultatproblema, Date> datumZavrsetka;
	public static volatile SingularAttribute<Rezultatproblema, String> objasnjenje;
	public static volatile SingularAttribute<Rezultatproblema, Integer> problemId;
}
