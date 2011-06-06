package persistance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SOFT")
public class LicensedObjectSoftware extends LicensedObject {

	private static final long serialVersionUID = 1L;

	@Column
	private int activationsLimit;

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
