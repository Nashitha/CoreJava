package com.javaintroduction;

public class Gc {
    @Override
    protected void finalize() throws Throwable {
    	// TODO Auto-generated method stub
    	System.out.println("hello");
    }
     void hi() {
    	 System.out.println("hi");
    	 Gc g5 = new Gc();
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Gc g1 = new Gc();
        Gc g2 = new Gc();
        Gc g3 = new Gc();
        Gc g4 = new Gc();
        
        g1 = null;
        g2 = g3;
        
        new Gc().hi();
        System.gc();
        
        
        
        
        
	}

}
