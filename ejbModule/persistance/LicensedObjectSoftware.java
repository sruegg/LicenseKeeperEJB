package persistance;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SOFT")
public class LicensedObjectSoftware extends LicensedObject {

	private static final long serialVersionUID = 1L;

	@Column
	private int activationsLimit;

	public LicensedObjectSoftware(String publisher, String name,
			String description, Category category) {
		super(publisher, name, description, category);
		// TODO Auto-generated constructor stub
	}
	
	public LicensedObjectSoftware(String publisher, String name,
			String description, Category category, int activationsLimit,
			Collection<LicensedObjectVersion> licensedObjectVersions) {
		super(publisher, name, description, licensedObjectVersions, category);
		this.activationsLimit = activationsLimit;
	}

	public LicensedObjectSoftware(String publisher, String name,
			String description,
			Collection<LicensedObjectVersion> licensedObjectVersions,
			Category category) {
		super(publisher, name, description, licensedObjectVersions, category);
		// TODO Auto-generated constructor stub
	}

	public LicensedObjectSoftware(String publisher, String name,
			String description,
			Collection<LicensedObjectVersion> licensedObjectVersions) {
		super(publisher, name, description, licensedObjectVersions);
		// TODO Auto-generated constructor stub
	}

	public LicensedObjectSoftware(String publisher, String name,
			String description) {
		super(publisher, name, description);
		// TODO Auto-generated constructor stub
	}

	public LicensedObjectSoftware() {
		super();
	}

	public LicensedObjectSoftware(int activationsLimit) {
		super();
		this.activationsLimit = activationsLimit;
	}

	public int getActivationsLimit() {
		return activationsLimit;
	}

	public void setActivationsLimit(int activationsLimit) {
		this.activationsLimit = activationsLimit;
	}
	
}
