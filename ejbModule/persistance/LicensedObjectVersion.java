package persistance;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn
	private LicensedObject licensedObject;
	
	public LicensedObjectVersion() {
		super();
	}

	@Override
	public String toString() {
		return "LicensedObjectVersion [id=" + id + ", major=" + major
				+ ", minor=" + minor + ", build=" + build
				+ ", licensedObjectKeys=" + licensedObjectKeys + "]";
	}

	public LicensedObjectVersion(int major, int minor, int build) {
		super();
		this.major = major;
		this.minor = minor;
		this.build = build;
		this.licensedObjectKeys = null;
	}

	public LicensedObjectVersion(int major, int minor, int build,
			Collection<LicensedObjectKey> licensedObjectKeys, LicensedObject licensedObject) {
		super();
		this.major = major;
		this.minor = minor;
		this.build = build;
		this.licensedObjectKeys = licensedObjectKeys;
		this.licensedObject = licensedObject;
	}

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

	public void setLicensedObject(LicensedObject licensedObject) {
		this.licensedObject = licensedObject;
	}

	public LicensedObject getLicensedObject() {
		return licensedObject;
	}
	
}
