package come.imr.two;

public class ErrorResponse implements Response{
	
	@SuppressWarnings("unused")
	private Request originalRequest;
	@SuppressWarnings("unused")
	private Exception originalException;
	
	public ErrorResponse(Request request,Exception exception){
		this.originalException=exception;
		this.originalRequest=request;
	}
	
	

}
