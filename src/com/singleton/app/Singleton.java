package com.singleton.app;

public class Singleton {
	
	public static Singleton singletonObj = null;
	public static boolean instantiated=true;
	
	private Singleton() {
		//to prevent creating instance using reflection or new instance
		if(instantiated) {
			throw new RuntimeException("Use getInstance method to create object");
		}
		
	}
	
	//lazy loading singleton method
	public static Singleton getInstance() {
		if(singletonObj == null) {
			//for thread safe singleton object,
			//create a synchronized block along with condition for further verification.
			synchronized(Singleton.class) {
				if(singletonObj == null) {
					instantiated=false;
					singletonObj = new Singleton();
				}
			}
		}
		instantiated=true;
		return singletonObj;
	}
	
	public static void main(String[] args) {
		
		System.out.println("get instance 1 " + Singleton.getInstance().hashCode());
		System.out.println("get instance 2 " + Singleton.getInstance().hashCode());
		System.out.println(new Singleton().hashCode());
		
	}

}
