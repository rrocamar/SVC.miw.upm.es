package es.upm.miw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class C22Test {
    private C22 c22 = new C22();

    @Test
    void testMA(){
        assertEquals("mA",c22.mA());
    }

}
