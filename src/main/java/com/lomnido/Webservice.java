package com.lomnido;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Webservice {

    /**
     * returns the output of a website as String
     *
     * @param url
     * @return the website content
     * @throws Exception
     */
    public String getWebpage(String url) throws Exception {
        URLConnection con = new URL(url).openConnection();
        con.connect();

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String strRet = "";
        while (reader.ready()) {
            String line = reader.readLine();
            strRet += line + "\n";
        }
        return strRet;
    }

}
