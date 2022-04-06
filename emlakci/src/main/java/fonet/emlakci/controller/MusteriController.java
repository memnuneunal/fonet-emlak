package fonet.emlakci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fonet.emlakci.entity.Musteri;
import fonet.emlakci.service.MusteriService;

@RestController
@RequestMapping("/musteri")
public class MusteriController {
	
	@Autowired
	public MusteriService musteriService;
	
	@PostMapping
	public Musteri save(@RequestBody Musteri musteri) {
		return musteriService.save(musteri);
	}
	
	

}
