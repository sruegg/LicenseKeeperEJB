package session;

public class PersistException extends Exception {
	private static final long serialVersionUID = 1L;

	public PersistException() {
		super("Pb d'accès à la base de donnée");
	}
}
