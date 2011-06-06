package persistance;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Column(length = 45)
	private String name;
	
	@Lob
	private String description;
	
	@ManyToMany(mappedBy="categories")
	private Collection<UserGroup> usergroups;
	
	public Category() {
		super();
	}
	
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Category(String name, String description, Collection<UserGroup> groups) {
		super();
		this.name = name;
		this.description = description;
		this.usergroups = groups;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<UserGroup> getGroups() {
		return usergroups;
	}

	public void setGroups(Collection<UserGroup> groups) {
		this.usergroups = groups;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

}
