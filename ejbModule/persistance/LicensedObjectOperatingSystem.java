package persistance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("OS")
public class LicensedObjectOperatingSystem extends LicensedObject {

	private static final long serialVersionUID = 1L;

	@Column(length = 45)
	private String servicePackVersion;

	public LicensedObjectOperatingSystem() {
		super();
	}

	public LicensedObjectOperatingSystem(String servicePackVersion) {
		super();
		this.servicePackVersion = servicePackVersion;
	}

	public String getServicePackVersion() {
		return servicePackVersion;
	}

	public void setServicePackVersion(String servicePackVersion) {
		this.servicePackVersion = servicePackVersion;
	}
	
}
