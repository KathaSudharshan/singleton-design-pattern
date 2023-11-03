package com.singleton.app;

public class EarlyLoadingSingleton {
	static EarlyLoadingSingleton earlyLoadingobj=null;
	public static boolean instantiated=false;
	static {
	try {
		earlyLoadingobj=new EarlyLoadingSingleton();
		instantiated=true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	private EarlyLoadingSingleton() throws Exception{
		    if(instantiated) {
			 throw new Exception("Restricted creating an object from the same class and use get instance method to create an object ");
		    }
	}
	
	public static EarlyLoadingSingleton getEarlyLoadingInstance() {
		return earlyLoadingobj;
		
	}
  
	public static void main(String[] args) throws Exception {
		
		System.out.println("Ref 1 "+ getEarlyLoadingInstance().hashCode());
		
		System.out.println("Ref 2 "+ getEarlyLoadingInstance().hashCode());
		
		//Here will get an error due to object creating restriction using constructor from the same class
		EarlyLoadingSingleton obj= new EarlyLoadingSingleton();
		
			System.out.println("Ref 3 "+ obj.hashCode());
		
	}
}
