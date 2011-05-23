package persistance;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
	
	@OneToMany
	@JoinColumn
	private Collection<LicensedObjectVersion> licensedObjectVersions;

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
	
}
