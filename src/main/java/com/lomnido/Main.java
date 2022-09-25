package com.lomnido;

public class Main {
    
    public static final String URL = "https://orf.at/";

    public static void main(String[] args) throws Exception {
        BusinessService businessService = new BusinessService();
        System.out.println("Tax for food: " + businessService.getTax("food"));

        Webservice webservice = new Webservice();
        String content = webservice.getWebpage(URL);
        System.out.println("Page Content\n: " + content);
    }

}