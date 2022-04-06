package fonet.emlakci.dto;

public class SearchDto {
	
	private int metrekare;
	private int odaSayisi;
	private String adres;
	
	
	
	public SearchDto() {
	}

	public SearchDto(int metrekare, int odaSayisi, String adres) {
		this.metrekare = metrekare;
		this.odaSayisi = odaSayisi;
		this.adres = adres;
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
	
	
	
	
	
	
	

}
