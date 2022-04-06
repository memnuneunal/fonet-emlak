package fonet.emlakci.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fonet.emlakci.dto.EmlakSaveRequest;
import fonet.emlakci.dto.ResultDto;
import fonet.emlakci.dto.SearchDto;
import fonet.emlakci.entity.Ev;
import fonet.emlakci.repository.EvRepository;
import fonet.emlakci.service.EvService;

@RestController
@RequestMapping("/ev")
public class EvController {
	
	@Autowired
	public EvService evService;
	
	@Autowired
	public EvRepository evRepository;
	
	@PostMapping
	public EmlakSaveRequest save(@RequestBody EmlakSaveRequest saveRequest) {
		return evService.save(saveRequest);
	}
	
	@PostMapping("/ara")
	public ArrayList<ResultDto> getEvler(@RequestBody SearchDto search) {
		ArrayList<Ev> evler = this.evRepository.getEvler(search.getOdaSayisi(), search.getMetrekare(), search.getAdres());
		ArrayList<ResultDto> results = evService.evToResultDto(evler);
		return results;
	}
	
	@GetMapping("/{musteriId}")
	public ArrayList<ResultDto> getEvlerByMusteriId(@PathVariable Long musteriId) {
		ArrayList<Ev> evler =  evRepository.getByMusteriId(musteriId);
		ArrayList<ResultDto> results = evService.evToResultDto(evler);
		return results;
	}
	
	@GetMapping
	public ArrayList<ResultDto> getEvler() {
		ArrayList<Ev> evler =  evRepository.findAll();
		ArrayList<ResultDto> results = evService.evToResultDto(evler);
		return results;
		
		
	}
	
	
	
}
