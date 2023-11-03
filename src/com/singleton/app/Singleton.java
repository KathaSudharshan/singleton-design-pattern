package com.singleton.app;

public class Singleton {
	
	public static Singleton singletonObj = null;
	private Singleton() {
		
		//to prevent creating instance using reflection or new instance
		if(singletonObj != null) {
			throw new RuntimeException("Use getInstance method to create ");
		}
		
	}
	
	public static Singleton getInstance() {
		if(singletonObj == null) {
		  singletonObj = new Singleton();
		}
		return singletonObj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj=new Singleton();
		System.out.println("Ref 3 "+obj.hashCode());
		
		System.out.println("ref 1 "+ Singleton.getInstance().hashCode());
		
		System.out.println("Ref 2 "+ Singleton.getInstance().hashCode());
		
		
		
		
		

	}

}
