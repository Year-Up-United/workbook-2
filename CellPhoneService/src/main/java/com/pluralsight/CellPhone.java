package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

public CellPhone(){
    this.serialNumber = 0;
    this.model = "";
    this.carrier= "";
    this.phoneNumber = "";
    this.owner = "";
}
//public void dial(String phoneNumber){
  //  System.out.printf()

public int getSerialNumber(){
    return this.serialNumber;
}
public void getSerialNumber(int serialNumber){
    this.serialNumber = serialNumber;
}
public String getModel(){
    return this.model;
}
public void setModel(String model){
    this.model = model;
}
public String getCarrier(){
    return this.carrier;
}
public void setCarrier(String carrier){
    this.carrier = carrier;
}
public String getOwner(){
    return  this.owner;
}
public void setOwner(String owner){
    this.owner = owner;
}
}
