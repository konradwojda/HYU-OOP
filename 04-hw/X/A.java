package X;

import Y.C;

public class A {
    public int x;
    private int y;
    protected int z;

    public A objA;
    public C objC;

    public void testAccess() {
        x = 1;
        y = 2;
        z = 3;

        objA.x = 4;
        objA.y = 5; // Error
        objA.z = 6;

        objC.x = 7;
        // objC.y = 8; // Error
        objC.z = 9;
    }
    
}
