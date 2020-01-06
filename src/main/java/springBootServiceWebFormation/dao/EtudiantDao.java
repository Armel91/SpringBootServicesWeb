package springBootServiceWebFormation.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springBootServiceWebFormation.domaine.Etudiant;

@Transactional
@Repository
public interface EtudiantDao extends JpaRepository <Etudiant, Long>{

	
}// fin EtudiantDao
