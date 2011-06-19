package persistance;

import java.util.Collection;

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

	public LicensedObjectOperatingSystem(String publisher, String name,
			String description, Category category) {
		super(publisher, name, description, category);
		// TODO Auto-generated constructor stub
	}
	
	public LicensedObjectOperatingSystem(String publisher, String name,
			String description, Category category, String servicePackVersion,
			Collection<LicensedObjectVersion> licensedObjectVersions) {
		super(publisher, name, description, licensedObjectVersions, category);
		this.servicePackVersion = servicePackVersion;
	}

	public LicensedObjectOperatingSystem(String publisher, String name,
			String description,
			Collection<LicensedObjectVersion> licensedObjectVersions,
			Category category) {
		super(publisher, name, description, licensedObjectVersions, category);
		// TODO Auto-generated constructor stub
	}

	public LicensedObjectOperatingSystem(String publisher, String name,
			String description,
			Collection<LicensedObjectVersion> licensedObjectVersions) {
		super(publisher, name, description, licensedObjectVersions);
		// TODO Auto-generated constructor stub
	}

	public LicensedObjectOperatingSystem(String publisher, String name,
			String description) {
		super(publisher, name, description);
		// TODO Auto-generated constructor stub
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
