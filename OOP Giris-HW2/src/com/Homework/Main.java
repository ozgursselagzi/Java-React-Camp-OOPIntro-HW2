package com.company;

public class Main {

    public static void main(String[] args) {

        Patient patient1 = new Patient("Özgür SELAĞZI", 20,
                "erkek","Baş ağrısı"); // Referans oluşturma.


        Patient patient2 = new Patient("Engin Demiroğ",35,
                "erkek","Yüksek ateş"); // Referans oluşturma.

        Patient[] patients = {patient1,patient2};

        for (Patient patient : patients){
            System.out.println("Hasta Adı: "+patient.patientName +"\n"+"Hasta Yaşı: "+patient.patientAge +"\n"+"Hastanın Cinsiyeti: "
                    +patient.patientGender +"\n"+"Hastanın Şikayeti: "+patient.patientComplaint);
        }
        System.out.println("-----------------------------------------------------");

        PatientManager patientManager = new PatientManager(); // Referans oluşturma.

        // Method çağırma.
        patientManager.addToSystem(patient1.patientName);
        patientManager.removeFromSystem(patient1.patientName);
        patientManager.updateInSystem(patient1.patientName);

        System.out.println("-----------------------------------------------------");

        patientManager.addToSystem(patient2.patientName);
        patientManager.removeFromSystem(patient2.patientName);
        patientManager.updateInSystem(patient2.patientName);

    }
}
