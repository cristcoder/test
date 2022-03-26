package com.tdea.parcial;

import org.junit.jupiter.api.Test;

import javax.rmi.CORBA.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTests {

    @Test
    public void shouldReturnNightBetweenZeroAndSix(){
        int hora = 3;
        assertEquals("Night",Utils.getTimeOfDay(hora));
    }


    @Test
    public void shouldReturnMorningBetweenSixAndTwelve(){
        int hora = 9;
        assertEquals("Morning",Utils.getTimeOfDay(hora));
    }


    @Test
    public void shouldReturnAfternoonBetweenTwelveAndEighteen(){
        int hora = 14;
        assertEquals("Afternoon",Utils.getTimeOfDay(hora));
    }


    @Test
    public void shouldReturnNightHigherEighteen(){
        int hora = 19;
        assertEquals("Evening",Utils.getTimeOfDay(hora));
    }


    @Test
    public void shouldReturnInvalidHourOutOfHourFormat(){
        int hora = 50;
        assertEquals("Invalid hour",Utils.getTimeOfDay(hora));
    }


}
