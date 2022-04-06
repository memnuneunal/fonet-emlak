package fonet.emlakci.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString(exclude = "emlakci")
@EqualsAndHashCode(exclude = "emlakci")
public class Ev {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private int metrekare;
   // @Column(nullable = false)
    @Column(name = "oda_sayisi",nullable = false)
    private int odaSayisi;
    @Column(length = 1000,nullable = false)
    private String adres;
    @ManyToOne
    private Emlakci emlakci;
    @ManyToOne()
    @JoinColumn(name = "musteri_id", nullable = true)
    
    
    
    private Musteri musteri;
	public Ev(long id, int metrekare, int odaSayisi, String adres, Emlakci emlakci, Musteri musteri) {
		super();
		this.id = id;
		this.metrekare = metrekare;
		this.odaSayisi = odaSayisi;
		this.adres = adres;
		this.emlakci = emlakci;
		this.musteri = musteri;
	}
	public Ev() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMetrekare() {
		return metrekare;
	}
	public void setMetrekare(int metrekare) {
		this.metrekare = metrekare;
	}
	public int getOdaSayisi() {
		return odaSayisi;
	}
	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public Emlakci getEmlakci() {
		return emlakci;
	}
	public void setEmlakci(Emlakci emlakci) {
		this.emlakci = emlakci;
	}
	public Musteri getMusteri() {
		return musteri;
	}
	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	
    
    
    
	
    
    
    
    
    
    
}
