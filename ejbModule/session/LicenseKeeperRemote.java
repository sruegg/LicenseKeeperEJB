package session;

import java.util.List;
import javax.ejb.Remote;

import persistance.Category;
import persistance.LicensedObject;
import persistance.LicensedObjectKey;
import persistance.LicensedObjectOperatingSystem;
import persistance.LicensedObjectVersion;
import persistance.User;
import persistance.UserGroup;

@Remote
public interface LicenseKeeperRemote {
	
	public List<Category> getCategories() throws PersistException;
	public void saveCategory(Category contact) throws PersistException;
	public Category getCategory(int id) throws PersistException;
	
	public List<User> getUsers() throws PersistException;
	public void saveUser(User user) throws PersistException;
	public User getUser(int id) throws PersistException;
	public User getUser(String username) throws PersistException;
	
	public List<UserGroup> getUserGroups() throws PersistException;
	public void saveUserGroup(UserGroup usergroup) throws PersistException;
	public UserGroup getUserGroup(int id) throws PersistException;
	
	public List<LicensedObject> getLicensedObjects() throws PersistException;
	public void saveLicensedObject(LicensedObject licensedObject) throws PersistException;
	public LicensedObject getLicensedObject(int id) throws PersistException;
	
	public List<LicensedObjectVersion> getLicensedObjectVersions() throws PersistException;
	public void saveLicensedObjectVersion(LicensedObjectVersion licensedObjectVersion) throws PersistException;
	public LicensedObjectVersion getLicensedObjectVersion(int id) throws PersistException;
	
	public List<LicensedObjectKey> getLicensedObjectKeys() throws PersistException;
	public void saveLicensedObjectKey(LicensedObjectKey licensedObjectKey) throws PersistException;
	public LicensedObjectKey getLicensedObjectKey(int id) throws PersistException;
	
}