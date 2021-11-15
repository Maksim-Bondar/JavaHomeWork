package com.pb.bondar.hw6;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VetСlinic {
    public static void main(String[] args) throws Exception{
        Animal animals1 = new Animal();
        animals1.setName("Dog");
        animals1.setFood("meet");
        animals1.setLocation("Kiev");

        Animal animals2 = new Animal();
        animals2.setName("Cat");
        animals2.setFood("Fish");
        animals2.setLocation("Dnepr");

        Animal animals3 = new Animal();
        animals3.setName("Horse");
        animals3.setFood("Appal");
        animals3.setLocation("Kharkov");

        Dog dog1 = new Dog();
        dog1.setName(animals1.getName()+" Sharic");
        dog1.setFood("Kosti");

        Cat cat1 = new Cat();
        cat1.setName(animals2.getName()+" Murka");
        cat1.setFood("Fish");

        Horse horse1 = new Horse();
        horse1.setName(animals3.getName()+" Uragan");
        horse1.setFood("Appal");

        Animal [] priym = new Animal[] {animals1,animals2,animals3};
        Animal [] anim = new Animal[] {dog1,cat1,horse1};
        int k=0;
        for(Animal a: anim){
            for(int i=k;i< priym.length;i++){
                Class animClazz = Class.forName("com.pb.bondar.hw6.Veterinarian");
                Constructor constr = animClazz.getConstructor(new Class[]{});
                Object obj = animClazz.newInstance();
//                Method []c = animClazz.getDeclaredMethods();
//                for (Method m : c){
//                    String mname = m.getName();
//
//                }
                if (obj instanceof Veterinarian){
                    ((Veterinarian) obj).treatAnimal(priym[i]);
                }
                break;
            }
            k++;
            System.out.println("на прием к ветеринару отправляется: " + a.getName());
            System.out.println(a.getName() + " вышел(a)..." );

        }
        }


    }

