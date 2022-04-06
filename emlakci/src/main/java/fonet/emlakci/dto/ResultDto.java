package fonet.emlakci.dto;

public class ResultDto {
	
	private int metrekare;
	private int odaSayisi;
	private String adres;
	private String musteriAdi;
	private String telefonNo;
	
	
	public ResultDto() {
	}



	public ResultDto(int metrekare, int odaSayisi, String adres, String musteriAdi, String telefonNo) {
		this.metrekare = metrekare;
		this.odaSayisi = odaSayisi;
		this.adres = adres;
		this.musteriAdi = musteriAdi;
		this.telefonNo = telefonNo;
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



	public String getMusteriAdi() {
		return musteriAdi;
	}



	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}



	public String getTelefonNo() {
		return telefonNo;
	}



	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	
	
	
	
	
	
}
