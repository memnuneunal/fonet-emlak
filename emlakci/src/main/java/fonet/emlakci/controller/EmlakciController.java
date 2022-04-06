package fonet.emlakci.controller;

import fonet.emlakci.dto.EmlakDTO;
import fonet.emlakci.entity.Emlakci;
import fonet.emlakci.service.EmlakciService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/emlak")
public class EmlakciController {
    @Autowired
    private EmlakciService emlakciService;
    @Autowired
    private ModelMapper modelMapper;
    
    
    @PostMapping
    public Emlakci save(@RequestBody Emlakci emlak) {
    	return emlakciService.save(emlak);
    }

    @GetMapping
    public List<EmlakDTO> getTumEmlakcilar() {
//		List<Emlakci> emlakcilar = emlakciService.getEmlakcilar();
//		List<EmlakDTO> sonuc = new ArrayList<EmlakDTO>();
//		for (Emlakci emlakci : emlakcilar) {
//			EmlakDTO dto = new EmlakDTO();
//			dto.setAdi(emlakci.getAdi());
//			dto.setSoyadi(emlakci.getSoyadi());
//			sonuc.add(dto);
//		}
//		return sonuc;
        return emlakciService.getEmlakcilar().stream().map(this::cevir)
                .collect(Collectors.toList());
    }

    public EmlakDTO cevir(Emlakci emlakci) {
        return modelMapper.map(emlakci, EmlakDTO.class);
//		EmlakDTO dto = new EmlakDTO();
//		dto.setAdi(emlakci.getAdi());
//		dto.setSoyadi(emlakci.getSoyadi());
//		return dto;
    }
  
}