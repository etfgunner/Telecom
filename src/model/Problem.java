package model;
// Generated Apr 2, 2018 9:42:01 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Problem generated by hbm2java
 */
@Entity
@Table(name = "problem", catalog = "telecomdb")
public class Problem implements java.io.Serializable {

	private Integer id;
	private Date datumIniciranja;
	private String sadrzaj;
	private int korisnikId;

	public Problem() {
	}

	public Problem(int korisnikId) {
		this.korisnikId = korisnikId;
	}

	public Problem(Date datumIniciranja, String sadrzaj, int korisnikId) {
		this.datumIniciranja = datumIniciranja;
		this.sadrzaj = sadrzaj;
		this.korisnikId = korisnikId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datumIniciranja", length = 10)
	public Date getDatumIniciranja() {
		return this.datumIniciranja;
	}

	public void setDatumIniciranja(Date datumIniciranja) {
		this.datumIniciranja = datumIniciranja;
	}

	@Column(name = "sadrzaj", length = 50)
	public String getSadrzaj() {
		return this.sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	@Column(name = "korisnikId", nullable = false)
	public int getKorisnikId() {
		return this.korisnikId;
	}

	public void setKorisnikId(int korisnikId) {
		this.korisnikId = korisnikId;
	}

}
