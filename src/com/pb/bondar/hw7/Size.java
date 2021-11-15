package com.pb.bondar.hw7;

public enum Size {
    XXS("XXS"),
    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL");

    private Size size;
    private String name;
    private String Discription;
    private int EuroSize;


    public String getName() {
        return name;
    }

    Size(String name) {
        this.name = name;
    }
    Size(String getDiscription,int getEuroSize){
        this.Discription=getDiscription();
        this.EuroSize=getEuroSize();
    }

    public Size getSize() {
        return size;
    }

    public String getDiscription(){
        if (getName()=="XXS"){
            return  name + ": Детский размер";
        }
        else {
            return name + ": Взрослый размер";
        }
    }
    public int getEuroSize(){
        switch (getName()){
            case "XXS":return 32;
            case "XS":return 34;
            case "S": return 36;
            case "M":return 38;
            case "L":return 40;
            case "XL":return 42;
        }
        return 0;
    }
}
