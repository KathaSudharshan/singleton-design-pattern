package com.singleton.app;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Early Loading Singleton Class");
		System.out.println("Ref 1 "+EarlyLoadingSingleton.getEarlyLoadingInstance().hashCode());
		
		System.out.println("Ref 1 "+EarlyLoadingSingleton.getEarlyLoadingInstance().hashCode() + "\n");
		
		System.out.println("Lazy Loading Singleton Class");
		Singleton obj=Singleton.getInstance();
		System.out.println("Ref 1 "+obj.hashCode());
		
		System.out.println("ref 2 "+ Singleton.getInstance().hashCode());
		
		System.out.println("Ref 3 "+ Singleton.getInstance().hashCode());
	}

}
