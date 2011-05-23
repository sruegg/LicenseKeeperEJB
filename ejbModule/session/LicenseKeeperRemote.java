package session;

import java.util.List;
import javax.ejb.Remote;

import persistance.Category;

@Remote
public interface LicenseKeeperRemote {
  public List<Category> getContacts() throws PersistException;
  public void saveContact(Category contact) throws PersistException;
  public Category getContact(int id) throws PersistException;
}