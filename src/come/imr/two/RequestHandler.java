package come.imr.two;

public interface RequestHandler {
	
	Response process(Request request) throws Exception;

}
