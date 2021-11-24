package com.pb.bondar.hw10;

import java.util.Random;

public class NumBox<T extends  Number>{
    private T[] maschisel;

    public NumBox(int maxsize){
        maschisel = (T[]) new Number[maxsize];
    }


    public void add(int f,T num){
        this.maschisel[f] = num;
    }

    public T get(int index){
        return maschisel[index];
    }
    public int length(){
        int kolvo = 0;
        for(T mas: maschisel){
            if(mas==null){
                break;
            }
            kolvo++;
        }
        return kolvo;
    }
    public double average(){
        double sred = sum()/length();
        return sred;
    }
    public double sum(){
        double sum1=0;
        for (T elmasiv : maschisel)
        {
            if(elmasiv==null){
                break;
            }
            sum1+= elmasiv.doubleValue();
        }
        return sum1;
    }
    public T max(){
        T maxzn=get(0);
        for (T elmas : maschisel)
        {
            if(elmas==null){
                break;
            }
            if(elmas.doubleValue()>maxzn.doubleValue()){
                maxzn=elmas;
            }
        }
        return maxzn;
    }

}
