package persistance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("OS")
public class LicensedObjectOperatingSystem extends LicensedObject {

	@Column(length = 45)
	private String servicePackVersion;

	public String getServicePackVersion() {
		return servicePackVersion;
	}

	public void setServicePackVersion(String servicePackVersion) {
		this.servicePackVersion = servicePackVersion;
	}
	
}
