package com.pluralsight;

public class Main2 {
    public static void main(String args){

        String trackingCode = "USA - 12981-Y-22";
                            //0123456789A1234

        char hasShipped = trackingCode.charAt(10);
        // hasShipped contains 'Y'

        String productCode = "ACME-12213";
        //                  0123456789
        int dashPosition = productCode.indexOf("-");
// dashPosition contains 4


    }
}
