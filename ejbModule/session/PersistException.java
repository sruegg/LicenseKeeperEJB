package session;

public class PersistException extends Exception {
	private static final long serialVersionUID = 1L;

	public PersistException() {
		super("Pb d'acc�s � la base de donn�e");
	}
}
