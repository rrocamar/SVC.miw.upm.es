package es.upm.miw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C21Test {

    private C21 c21 = new C21();

    @Test
    void testM1(){
        assertEquals("m1",c21.m1());
    }

    @Test
    void testM2(){
        assertEquals("m2",c21.m2());
    }
}
