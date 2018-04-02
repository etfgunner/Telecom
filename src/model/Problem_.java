package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-02T09:45:35.283+0200")
@StaticMetamodel(Problem.class)
public class Problem_ {
	public static volatile SingularAttribute<Problem, Integer> id;
	public static volatile SingularAttribute<Problem, Date> datumIniciranja;
	public static volatile SingularAttribute<Problem, String> sadrzaj;
	public static volatile SingularAttribute<Problem, Integer> korisnikId;
}
