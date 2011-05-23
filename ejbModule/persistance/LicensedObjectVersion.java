package persistance;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class LicensedObjectVersion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Column
	private int major;

	@Column
	private int minor;

	@Column
	private int build;
	
	@OneToMany
	@JoinColumn
	private Collection<LicensedObjectKey> licensedObjectKeys;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public int getMinor() {
		return minor;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public int getBuild() {
		return build;
	}

	public void setBuild(int build) {
		this.build = build;
	}

	public Collection<LicensedObjectKey> getLicensedObjectKeys() {
		return licensedObjectKeys;
	}

	public void setLicensedObjectKeys(
			Collection<LicensedObjectKey> licensedObjectKeys) {
		this.licensedObjectKeys = licensedObjectKeys;
	}
	
}
