package com.sy.osgiclient;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.sy.helloworld.Hello;

public class MyActivator implements BundleActivator{

	ServiceReference helloServiceReference;
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		helloServiceReference=context.getServiceReference(Hello.class.getName());  
		Hello helloService=(Hello)context.getService(helloServiceReference);  
//		System.out.println();
		helloService.sayHello();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Goodbye World!!");  
		context.ungetService(helloServiceReference);
	}

	
}
