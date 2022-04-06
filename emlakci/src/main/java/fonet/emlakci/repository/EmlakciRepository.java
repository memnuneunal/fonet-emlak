package fonet.emlakci.repository;

import fonet.emlakci.entity.Emlakci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;


public interface EmlakciRepository extends JpaRepository<Emlakci, Long> {
		 
  //public Set<Emlakci> findByAdi(String adi);

  //public Set<Emlakci> findByEvlerOdaSayisiGreaterThanEqualOrderByAdi(int odaSayisi);
}
