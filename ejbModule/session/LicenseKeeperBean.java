package session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import persistance.Category;

@Stateless
public class LicenseKeeperBean implements LicenseKeeper, LicenseKeeperRemote {

	@PersistenceContext
	private EntityManager em;

	public Category getCategory(int id) {
		return em.find(Category.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Category> getCategories() throws PersistException {
		try {
			return em.createQuery("SELECT c FROM Contact c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	public void saveCategory(Category contact) {
		em.merge(contact);
	}

}
