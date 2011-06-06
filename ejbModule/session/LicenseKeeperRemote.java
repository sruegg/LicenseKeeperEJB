package session;

import java.util.List;
import javax.ejb.Remote;

import persistance.Category;

@Remote
public interface LicenseKeeperRemote {
	public List<Category> getCategories() throws PersistException;

	public void saveCategory(Category contact) throws PersistException;

	public Category getCategory(int id) throws PersistException;
}