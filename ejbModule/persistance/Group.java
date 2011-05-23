package persistance;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Group implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Column(length = 45)
	private String name;
	
	@ManyToMany
	@JoinTable(
			name = "GroupCategory",
			joinColumns = @JoinColumn(name = "group", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "category", referencedColumnName = "id")
			)
	private Collection<Category> categories;

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
}
