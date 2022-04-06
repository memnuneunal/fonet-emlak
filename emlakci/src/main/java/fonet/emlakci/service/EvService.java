package fonet.emlakci.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fonet.emlakci.dto.EmlakSaveRequest;
import fonet.emlakci.dto.ResultDto;
import fonet.emlakci.entity.Emlakci;
import fonet.emlakci.entity.Ev;
import fonet.emlakci.entity.Musteri;
import fonet.emlakci.repository.EvRepository;

@Service
public class EvService {
	
	@Autowired
	private EvRepository evRepository;
	
	public EmlakSaveRequest save(EmlakSaveRequest emlak) {
		Ev ev = new Ev();
		Musteri musteri = new Musteri();
		Emlakci emlakci = new Emlakci();
		ev.setAdres(emlak.getAdres());
		ev.setMetrekare(emlak.getMetrekare());
		ev.setOdaSayisi(emlak.getOdaSayisi());
		musteri.setId(emlak.getMusteri_id());
		emlakci.setId(emlak.getEmlakci_id());
		ev.setMusteri(musteri);
		ev.setEmlakci(emlakci);
		evRepository.save(ev);
		
		return emlak;
	}
	
	public ArrayList<ResultDto> evToResultDto(ArrayList<Ev> ev) {
		ArrayList<ResultDto> results = new ArrayList<ResultDto>();
		for (Ev e : ev) {
			results.add(new ResultDto(e.getMetrekare(),e.getOdaSayisi(),e.getAdres(),e.getMusteri().getAdi(),e.getMusteri().getTelefonNo()));
		}
		return results;
		
		
	}

}
