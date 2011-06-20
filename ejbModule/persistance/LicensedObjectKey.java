package persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class LicensedObjectKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Lob
	private String licenseKey;

	public LicensedObjectKey() {
		super();
	}

	public LicensedObjectKey(String key) {
		super();
		this.licenseKey = key;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "LicensedObjectKey [id=" + id + ", licenseKey=" + licenseKey
				+ "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String key) {
		this.licenseKey = key;
	}
	
}
