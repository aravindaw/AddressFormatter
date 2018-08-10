package com.aravinda.app;

import org.junit.Assert;
import org.junit.Test;


public class AddressTypeTests {

    @Test
    public void addressType1() {
        String address = "Winterallee 3";
        String formattedAddress = "{\"street\": \"Winterallee\", \"housenumber\": \"3\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress, result);
    }

    @Test
    public void addressType2() {
        String address = "Musterstrasse 45";
        String formattedAddress = "{\"street\": \"Musterstrasse\", \"housenumber\": \"45\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress, result);
    }

    @Test
    public void addressType3() {
        String address = "Blaufeldweg 123B";
        String formattedAddress = "{\"street\": \"Blaufeldweg\", \"housenumber\": \"123B\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress, result);
    }

    @Test
    public void addressType4() {
        String address = "Am Bächle 23";
        String formattedAddress = "{\"street\": \"Am Bächle\", \"housenumber\": \"23\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress, result);
    }

    @Test
    public void addressType5() {
        String address = "Auf der Vogelwiese 23 b";
        String formattedAddress = "{\"street\": \"Auf der Vogelwiese\", \"housenumber\": \"23 b\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress, result);
    }

    @Test
    public void addressType6() {
        String address = "4, rue de la revolution";
        String formattedAddress = "{\"street\": \"rue de la revolution\", \"housenumber\": \"4\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress, result);
    }

    @Test
    public void addressType7() {
        String address = "200 Broadway Av";
        String formattedAddress = "{\"street\": \"Broadway Av\", \"housenumber\": \"200\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress, result);
    }

    @Test
    public void addressType8() {
        String address = "Calle Aduana, 29";
        String formattedAddress = "{\"street\": \"Calle Aduana\", \"housenumber\": \"29\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress, result);
    }
    @Test
    public void addressType9() {
        String address = "Calle 39 No 1540";
        String formattedAddress = "{\"street\": \"Calle 39\", \"housenumber\": \"No 1540\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress,result);
    }
    @Test
    public void addressType10() {
        String address = "Number 8, somapah av";
        String formattedAddress = "{\"street\": \"somapah av\", \"housenumber\": \"Number 8\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress,result);
    }
    @Test
    public void addressType11() {
        String address = "#8, somapah av";
        String formattedAddress = "{\"street\": \"somapah av\", \"housenumber\": \"#8\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress,result);
    }
    @Test
    public void addressType12() {
        String address = "# 8, somapah av";
        String formattedAddress = "{\"street\": \"somapah av\", \"housenumber\": \"# 8\"}";
        String result = new AddressServicesImpl().input(address);
        Assert.assertEquals(formattedAddress,result);
    }

}
