package persistance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SOFT")
public class LicensedObjectSoftware extends LicensedObject {

	@Column
	private int activationsLimit;

	public int getActivationsLimit() {
		return activationsLimit;
	}

	public void setActivationsLimit(int activationsLimit) {
		this.activationsLimit = activationsLimit;
	}
	
}
