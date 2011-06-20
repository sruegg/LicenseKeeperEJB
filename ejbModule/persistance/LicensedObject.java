package persistance;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING, length = 4)
public class LicensedObject implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Column(length = 45)
	private String publisher;

	@Column(length = 45)
	private String name;
	
	@Lob
	private String description;
	
	@OneToMany (mappedBy = "licensedObject")
	private Collection<LicensedObjectVersion> licensedObjectVersions;
	
	@ManyToOne
	@JoinColumn
	private Category category;
	
	@Override
	public String toString() {
		return "LicensedObject [id=" + id + ", publisher=" + publisher
				+ ", name=" + name + ", description=" + description
				+ ", licensedObjectVersions=" + licensedObjectVersions
				+ ", category=" + category + "]";
	}

	public LicensedObject() {
		super();
	}

	public LicensedObject(int id, String publisher, String name,
			String description) {
		super();
		this.id = id;
		this.publisher = publisher;
		this.name = name;
		this.description = description;
	}

	public LicensedObject(String publisher, String name, String description) {
		super();
		this.publisher = publisher;
		this.name = name;
		this.description = description;
	}

	public LicensedObject(String publisher, String name, String description,
			Collection<LicensedObjectVersion> licensedObjectVersions) {
		super();
		this.publisher = publisher;
		this.name = name;
		this.description = description;
		this.licensedObjectVersions = licensedObjectVersions;
	}

	public LicensedObject(String publisher, String name, String description,
			Category category) {
		super();
		this.publisher = publisher;
		this.name = name;
		this.description = description;
		this.category = category;
	}

	public LicensedObject(String publisher, String name, String description,
			Collection<LicensedObjectVersion> licensedObjectVersions,
			Category category) {
		super();
		this.publisher = publisher;
		this.name = name;
		this.description = description;
		this.licensedObjectVersions = licensedObjectVersions;
		this.category = category;
	}

	public LicensedObject(int id, String publisher, String name,
			String description, Category category) {
		this.id = id;
		this.publisher = publisher;
		this.name = name;
		this.description = description;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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

	public Collection<LicensedObjectVersion> getLicensedObjectVersions() {
		return licensedObjectVersions;
	}

	public void setLicensedObjectVersions(
			Collection<LicensedObjectVersion> licensedObjectVersions) {
		this.licensedObjectVersions = licensedObjectVersions;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}
	
}
