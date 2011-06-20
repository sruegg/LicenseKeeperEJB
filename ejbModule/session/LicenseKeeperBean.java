package session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import persistance.*;

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
			return em.createQuery("SELECT c FROM Category c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	public void saveCategory(Category category) {
		em.merge(category);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() throws PersistException {
		try {
			return em.createQuery("SELECT c FROM User c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	public void saveUser(User user) throws PersistException {
		em.merge(user);
	}

	@Override
	public User getUser(int id) throws PersistException {
		return em.find(User.class, id);
	}
	
	@Override
	public User getUser(String username) throws PersistException{
		try {
			return (User) em.createQuery("SELECT c FROM User c WHERE username='" + username + "'").getResultList().get(0);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserGroup> getUserGroups() throws PersistException {
		try {
			return em.createQuery("SELECT c FROM UserGroup c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	@Override
	public void saveUserGroup(UserGroup usergroup) throws PersistException {
		em.merge(usergroup);
	}

	@Override
	public UserGroup getUserGroup(int id) throws PersistException {
		return em.find(UserGroup.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LicensedObject> getLicensedObjects() throws PersistException {
		try {
			return em.createQuery("SELECT c FROM LicensedObject c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LicensedObjectOperatingSystem> getLicensedObjectsOperatingSystem()
			throws PersistException {
		try {
			return em.createQuery("SELECT c FROM LicensedObjectOperatingSystem c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LicensedObjectSoftware> getLicensedObjectsSoftware()
			throws PersistException {
		try {
			return em.createQuery("SELECT c FROM LicensedObjectSoftware c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	@Override
	public void saveLicensedObject(LicensedObject licensedObject)
			throws PersistException {
		em.merge(licensedObject);
	}

	@Override
	public LicensedObject getLicensedObject(int id) throws PersistException {
		return em.find(LicensedObject.class, id);
	}

	@Override
	public LicensedObjectOperatingSystem getLicensedObjectOperatingSystem(int id)
			throws PersistException {
		return em.find(LicensedObjectOperatingSystem.class, id);
	}

	@Override
	public LicensedObjectSoftware getLicensedObjectSoftware(int id)
			throws PersistException {
		return em.find(LicensedObjectSoftware.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LicensedObjectVersion> getLicensedObjectVersions()
			throws PersistException {
		try {
			return em.createQuery("SELECT c FROM LicensedObjectVersion c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	@Override
	public void saveLicensedObjectVersion(
			LicensedObjectVersion licensedObjectVersion)
			throws PersistException {
		em.merge(licensedObjectVersion);
	}

	@Override
	public LicensedObjectVersion getLicensedObjectVersion(int id)
			throws PersistException {
		return em.find(LicensedObjectVersion.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LicensedObjectKey> getLicensedObjectKeys()
			throws PersistException {
		try {
			return em.createQuery("SELECT c FROM LicensedObjectKey c").getResultList();
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new PersistException();
		}
	}

	@Override
	public void saveLicensedObjectKey(LicensedObjectKey licensedObjectKey)
			throws PersistException {
		em.merge(licensedObjectKey);
	}

	@Override
	public LicensedObjectKey getLicensedObjectKey(int id)
			throws PersistException {
		return em.find(LicensedObjectKey.class, id);
	}

}
