import junit.framework.TestCase;

public class Test extends TestCase {
    private calculadora myCalcu;

    public void esenario(){
        myCalcu = new calculadora();
    }
    public void testsuma(){
        esenario();
        assertTrue(myCalcu.suma(2,9) == (2+9));
        assertTrue(myCalcu.suma(7,2) == (7+2));
    }

    public void testresta(){
        esenario();
        assertTrue(myCalcu.resta(2,6) == (2-6));
        assertTrue(myCalcu.resta(7,2) == (7-2));
    }

    public void testdivision(){
        esenario();
        assertTrue(myCalcu.division(2,6) == (2/6));
        assertTrue(myCalcu.division(7,2) == (7/2));
    }

    public void testmulti(){
        esenario();
        assertTrue(myCalcu.multi(2,6) == (2*6));
        assertTrue(myCalcu.multi(7,2) == (7*2));
    }

}
