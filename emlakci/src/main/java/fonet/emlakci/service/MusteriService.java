package fonet.emlakci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fonet.emlakci.entity.Musteri;
import fonet.emlakci.repository.MusteriRepository;

@Service
public class MusteriService {
	
	@Autowired
    private MusteriRepository musteriRepo;
	
	public Musteri save(Musteri musteri) {
		return musteriRepo.save(musteri);
	}

}
