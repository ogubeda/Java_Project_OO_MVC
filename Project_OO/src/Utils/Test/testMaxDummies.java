package Utils.Test;

import java.util.ArrayList;

import Modules.Cars.Classes.*;
import Modules.Cars.Classes.Singleton;
import Modules.Cars.Dummies.generateDummies;

public class testMaxDummies {
    //////
    public static void main (String[] args) {
        //////
        Singleton.electricList = new ArrayList<Electric>();
        Singleton.hybridList = new ArrayList<Hybrid>();
        Singleton.combustionList = new ArrayList<Combustion>();
        for (int i = 0; i < 10000; i++) {
            //System.out.println(generateDummies.generateBrand()); // Test Brand
            //System.out.println(generateDummies.generateDateStart()); // Test Date
            System.out.println(generateDummies.generateCarPlate() + " " + i);
        }
    }// end_main
}// end_testMaxDummies