package com.company;

public class PatientManager {

    public void addToSystem(String patientName){
        System.out.println(patientName+" isimli hastanın bilgileri eklendi.");
    }

    public void removeFromSystem(String patientName){

        System.out.println(patientName+" isimli hastanın bilgileri silindi.");
    }

    public void updateInSystem(String patientName){

        System.out.println(patientName+" isimli hastanın bilgileri güncellendi.");
    }
}
