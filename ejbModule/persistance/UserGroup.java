package persistance;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class UserGroup implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Column(length = 45)
	private String name;
	
	@ManyToMany
	@JoinTable(
			name = "GroupCategory",
			joinColumns = @JoinColumn(name = "usergroup", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "category", referencedColumnName = "id")
			)
	private Collection<Category> categories;
	
	@OneToMany(mappedBy = "usergroup")
	private Collection<User> users;
	
	@Override
	public String toString() {
		return "UserGroup [id=" + id + ", name=" + name + "]";
	}

	public UserGroup() {
		super();
		this.name = null;
		this.categories = null;
	}

	public UserGroup(String name) {
		super();
		this.name = name;
		this.categories = null;
	}

	public UserGroup(String name, Collection<Category> categories) {
		super();
		this.name = name;
		this.categories = categories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategories(Collection<Category> categories) {
		this.categories = categories;
	}

	public Collection<Category> getCategories() {
		return categories;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public Collection<User> getUsers() {
		return users;
	}
}
