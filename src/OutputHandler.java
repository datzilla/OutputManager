import java.io.Closeable;

public abstract class OutputHandler {
	public abstract void writeOutput (Outputable pOutputable) throws Exception;
	public abstract void reset () throws Exception;
	public abstract void close () throws Exception;
	public abstract static Outputable getHandler() throws Exception;
}
