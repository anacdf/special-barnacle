package pucrs.qp.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;

public class AppTest 
{
    @Test
    public void testCalculaMediaDuasNotas() {
	    String actual = App.scoreValidation(10, 10);
	    String expected = "media = " + 10.0;
	    assertEquals(expected, actual);
    }

    @Test
    public void testValidaNotasEntre0e10() {
        String actualn1 = App.scoreValidation(2, 50);
        String actualn2 = App.scoreValidation(-3.5, 10);

        String expected = "nota invalida";
        assertEquals(expected, actualn1);
        assertEquals(expected, actualn2);
    }
}









