package com.lomnido;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class BusinessService {

    public BusinessService() {
    }

    /**
     * returns the tax rate for different kinds of goods
     *
     * @param type
     * @return int - tax rate
     * @throws Exception when type is unknown
     */
    public int getTax(String type) throws Exception {
        switch (type) {
            case "beverages":
                return 10;
            case "food":
                return 5;
            case "luxury":
                return 30;
        }
        throw new Exception("Unknown tax type");
    }

}
