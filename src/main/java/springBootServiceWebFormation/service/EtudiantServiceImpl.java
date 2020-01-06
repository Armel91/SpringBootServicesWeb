package springBootServiceWebFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootServiceWebFormation.dao.EtudiantDao;
import springBootServiceWebFormation.domaine.Etudiant;

@Service
public class EtudiantServiceImpl implements EtudiantService{

	@Autowired
	private EtudiantDao etudiantDao;
	
	public EtudiantDao getEtudiantDao() {
		return etudiantDao;
	}

	public void setEtudiantDao(EtudiantDao etudiantDao) {
		this.etudiantDao = etudiantDao;
	}
	
		
	
	@Override
	public void create(Etudiant p) {
		etudiantDao.save(p);
		
	}

	@Override
	public void update(Etudiant p) {
		etudiantDao.save(p);
		
	}

	@Override
	public void delete(Etudiant p) {
		etudiantDao.delete(p);
		
	}

	@Override
	public List<Etudiant> getAll() {
		
		return etudiantDao.findAll();
	}

	@Override
	public Etudiant getById(Long id) {
		return etudiantDao.getOne(id);
	}

}
