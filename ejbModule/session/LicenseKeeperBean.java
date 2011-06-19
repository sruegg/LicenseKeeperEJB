package session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import persistance.Category;
import persistance.LicensedObject;
import persistance.LicensedObjectKey;
import persistance.LicensedObjectOperatingSystem;
import persistance.LicensedObjectVersion;
import persistance.User;
import persistance.UserGroup;

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

	@Override
	public void saveLicensedObject(LicensedObject licensedObject)
			throws PersistException {
		em.merge(licensedObject);
	}

	@Override
	public LicensedObject getLicensedObject(int id) throws PersistException {
		return em.find(LicensedObject.class, id);
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
