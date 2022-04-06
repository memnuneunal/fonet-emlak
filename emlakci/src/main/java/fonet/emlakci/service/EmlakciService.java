package fonet.emlakci.service;

import fonet.emlakci.entity.Emlakci;
import fonet.emlakci.repository.EmlakciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmlakciService {
	
		
    @Autowired
    private EmlakciRepository emlakciRepository;
    
    public List<Emlakci> getEmlakcilar() {
        return emlakciRepository.findAll();
    }
    
    public Emlakci save(Emlakci emlak) {
    	return this.emlakciRepository.save(emlak);
    }

}
