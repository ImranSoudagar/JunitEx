package come.imr.two;

import java.util.HashMap;
import java.util.Map;

public class DefaultController	implements Controller {
	
	@SuppressWarnings("rawtypes")
	private Map requestHandlers =new HashMap();
	
	
	public RequestHandler getRequestHandler(Request request) {
		
		if(!this.requestHandlers.containsKey(request.getName())){
			
			String message="Cannot find handler for request name"+"["+request.getName()+"]";
			
			throw new RuntimeException(message);
		}
		return (RequestHandler)this.requestHandlers.get(request.getName());
	}
	

	@Override
	public Response processRequest(Request request) {
		Response response;
		
		try {
			response=getRequestHandler(request).process(request);
		} catch (Exception e) {
			response=new ErrorResponse(request,e);
		}
		
		return response;
	}

	@Override
	public void addHandler(Request request, RequestHandler requestHandler) {
		// TODO Auto-generated method stub
		
	}

}
