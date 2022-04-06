package fonet.emlakci.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@ToString(exclude = "evler")
@EqualsAndHashCode(exclude = "evler")
public class Emlakci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30,nullable = false)
    private String adi;
    @Column(length = 30,nullable = false)
    private String soyadi;
	public Emlakci(Long id, String adi, String soyadi) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
	}
	public Emlakci() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public int getAmount() {
		
		return 0;
	}
	public String getItemType() {
	
		return null;
	}
    
    
    
}
