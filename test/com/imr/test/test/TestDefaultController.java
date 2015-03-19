package com.imr.test.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import come.imr.two.DefaultController;
import come.imr.two.Request;
import come.imr.two.RequestHandler;
import come.imr.two.Response;

public class TestDefaultController {
	
	private DefaultController controller;
	
	private class SampleRequest implements Request{
		
		@Override
		public String getName() {
			return "Test";
		}
		
	}//SampleRequest
	
	
	
	private class SampleRequestHandler implements RequestHandler{

	@Override
	public Response process(Request request) throws Exception {
			// TODO Auto-generated method stub
			return new SampleResponse();
		}//process
	}//SampleRequestHandler
	
	
	private class SampleResponse implements Response{
		
	}
	
	@Before
	public void instantiate() throws Exception{
		controller=new DefaultController();	
	}
	
	@Test
	public void testMethod(){
	//	throw new RuntimeException("Implement me");
	}
	
	@Test
	public void testAddHandler(){
		Request request=new SampleRequest();
		RequestHandler handler=new SampleRequestHandler();
		controller.addHandler(request, handler);
		RequestHandler handler2=controller.getRequestHandler(request);
		assertSame("Handler we set should be same as handler we get", handler2, handler);

		
	}

}
