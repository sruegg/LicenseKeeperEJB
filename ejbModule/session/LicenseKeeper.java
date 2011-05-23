package session;

import java.util.List;

import javax.ejb.Local;

import persistance.Category;

@Local
public interface LicenseKeeper {
  public List<Category> getContacts() throws PersistException;
  public void saveContact(Category contact) throws PersistException;
  public Category getContact(int id) throws PersistException;
}