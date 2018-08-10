package com.aravinda.app;

import org.json.simple.JSONObject;

public class sample {
    public static void main(String[] args) {
        JSONObject a = new AddressServicesImpl().input(" asdasda asdasd 3424");
        System.out.println(a.toString());
    }
}