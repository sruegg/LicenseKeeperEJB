package session;

import java.util.List;

import javax.ejb.Local;

import persistance.Category;

@Local
public interface LicenseKeeper {
	public List<Category> getCategories() throws PersistException;

	public void saveCategory(Category contact) throws PersistException;

	public Category getCategory(int id) throws PersistException;
}