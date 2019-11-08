package app;

/**
 Modifier
 */

 class Modifier {
     void defaultMethod(){
         System.out.println("ini adalah default method");
     }

     public void publicMethod(){
         System.out.println("Ini adalah public method");
     }

     private String privateMethod(){
         return "ini adalah private method";
     }

     protected void protectedMethod(){
         System.out.println("ini adalah protected method");
     }

     final void finalMethod(){
         System.out.println("ini adalah dinal method");
     }

     static void staticMethod(){
         System.out.println("Ini adalah static method");
     }
 }