package fonet.emlakci.repository;

import fonet.emlakci.dto.SearchDto;
import fonet.emlakci.entity.Emlakci;
import fonet.emlakci.entity.Ev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public interface EvRepository extends JpaRepository<Ev, Long> {
   // @Query(value = "from Ev e where e.odaSayisi>=?1 and e.odaSayisi<=?1 +1")
    //public Set<Ev> getEvlerByOdaSayisi(int odaSayisi);
	
	@Query(value = "SELECT * FROM ev e WHERE e.oda_sayisi=?1 and e.metrekare=?2 and e.adres=?3", nativeQuery = true)
	public ArrayList<Ev> getEvler (int odaSayisi, int metrekare, String adres);
	
	public ArrayList<Ev> getByMusteriId(Long id);
	
	public ArrayList<Ev> findAll();
		
		



}
