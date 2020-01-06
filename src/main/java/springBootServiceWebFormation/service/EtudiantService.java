package springBootServiceWebFormation.service;

import java.util.List;

import springBootServiceWebFormation.domaine.Etudiant;

public interface EtudiantService {

	public void create(Etudiant p);
	public void update(Etudiant p);
	public void delete(Etudiant p);
	public List<Etudiant> getAll();
	public Etudiant getById(Long id);
}
