package com.aravinda.app;

import java.util.ArrayList;

public class AddressServicesImpl implements AddressServices {

    private String street = null;
    private String houseNumber = null;
    private int length = 0;
    private int intBlocks = 0;
    private String[] splittedAddress;
    private String tempHouseNumber;
    private ArrayList<String> houseNumberArray = new ArrayList<String>();
    private ArrayList<String> streetArray = new ArrayList<String>();


    @Override
    public String input(String address) {

        intChecker(address);
        //Multi parts address with street and house number e.g.:Winterallee 3,Auf der Vogelwiese 23 b
        if (intBlocks == 1) {
            singleIntBlock(address);
        }
        //Multi parts address with street and house number including a character e.g.:"Blaufeldweg 123B"
        else if (intBlocks == 0) {
            for (String x : streetArray) {
                if (x.matches("([0-9])\\w+([a-z,A-Z])")) {
                    houseNumber = x;
                }
            }
            String[] part = address.split(houseNumber);
            if (houseNumber.equals(splittedAddress[0])) {
                street = part[1];
            } else {
                street = part[0];

            }
        }else {
//            try with more than 3 int blockes
        }

        return "{\"street\": \"" + street.trim() + "\", \"houseNumber\": \"" + houseNumber.trim() + "\"}";
    }

    private void intChecker(String adrs) {
        String address = adrs.replace(",", "").trim();
        splittedAddress = address.split(" ");
        length = splittedAddress.length;
        for (String x : splittedAddress) {
            try {
                Integer.parseInt(x);
                houseNumberArray.add(x);
                tempHouseNumber = x;
                intBlocks = houseNumberArray.size();
            } catch (NumberFormatException e) {
                streetArray.add(x);
            }
        }
    }

    private void singleIntBlock(String address) {
        houseNumber = houseNumberArray.get(0);
        street = streetArray.get(0);
        if ((splittedAddress[0].equals(tempHouseNumber)) && streetArray.size() > 1) {
            String[] part = address.split(tempHouseNumber);
            houseNumber = tempHouseNumber;
            street = part[1];
        } else if ((splittedAddress[length - 2].equals(tempHouseNumber)) && streetArray.size() > 1) {
            houseNumber = houseNumberArray.get(0) + " " + splittedAddress[length - 1];
            String[] part = address.split(tempHouseNumber);
            street = part[0];
        } else if ((splittedAddress[length - 1].equals(tempHouseNumber)) && streetArray.size() > 1) {
            String[] part = address.split(tempHouseNumber);
            houseNumber = tempHouseNumber.replace(",", "").trim();
            street = part[0];
        }

    }
}
