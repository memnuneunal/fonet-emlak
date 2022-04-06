package fonet.emlakci.dto;

public class EmlakSaveRequest {
	
	private int metrekare;
	private int odaSayisi;
	private String adres;
	private Long emlakci_id;
	private Long musteri_id;
	
	
	
	public EmlakSaveRequest() {
	}



	public EmlakSaveRequest(int metrekare, int odaSayisi, String adres, Long emlakci_id, Long musteri_id) {
		this.metrekare = metrekare;
		this.odaSayisi = odaSayisi;
		this.adres = adres;
		this.emlakci_id = emlakci_id;
		this.musteri_id = musteri_id;
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



	public Long getEmlakci_id() {
		return emlakci_id;
	}



	public void setEmlakci_id(Long emlakci_id) {
		this.emlakci_id = emlakci_id;
	}



	public Long getMusteri_id() {
		return musteri_id;
	}



	public void setMusteri_id(Long musteri_id) {
		this.musteri_id = musteri_id;
	}
	
	
	
	
	
	

}
