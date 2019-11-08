package app;

/**
 * child modifier
 */

 class ChildModifier extends Modifier{

    static int count = 0;

    void testChild(){
        super.defaultMethod();
        System.out.println("ini adalah method dari child modifier");
    }

    @Override
    void defaultMethod() {
        System.out.println("ini adalah override dari default method");
    }
 }