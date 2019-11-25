package Modules.Dummies;

import java.util.Random;
import Classes.Fecha;
import Modules.Cars.Classes.*;
import Modules.Cars.Utils.functions;

public class generateDummies {
    //////
    private static Random r1 = new Random();
    //////
    public static void generate () {
        //////
        String[] brands = {"Tesla", "Ford", "Toyota", "Audi", "BMW"};
        String[] modelsTesla = {"Model 3", "Model X", "Model Y"};
        String[] modelsFord = {"Fiesta", "Focus", "Mustang"};
        String[] modelsToyota = {"Corolla", "Auris", "GT 86"};
        String[] modelsAudi = {"A1", "A3", "A4", "A5"};
        String[] modelsBMW = {"Serie 1", "Serie 2", "Serie 3", "Serie 4"};
        String[] typeHybrid = {"Electric/Diesel", "Electric/Petrol", "Hydrogen/Diesel", "Hydrogen/Petorl"};
        String[] typeComb = {"Petrol", "Diesel", "Natural Gas"};
        int[] seats = {2, 4, 5, 8};
        int[] doors = {3, 5, 7};
        String brand = "", model = "", hybridChoose = "", combChoose = "";
        int seat = 0, door = 0, typeEngine = 0, battery = 0;
        Fecha dateStart = null;
        Electric electricCar = null;
        Hybrid hybridCar = null;
        Combustion combustionCar = null;
        //////
        /////

        for (int i = 0; i < 30; i++) {
            brand = brands[r1.nextInt(5)];
            if (brand.equals(brands[0]))
                model = modelsTesla[r1.nextInt(3)];
            else if (brand.equals(brands[1]))
                model = modelsFord[r1.nextInt(3)];
            else if (brand.equals(brands[2]))
                model = modelsToyota[r1.nextInt(3)];
            else if (brand.equals(brands[3]))
                model = modelsAudi[r1.nextInt(4)];
            else if (brand.equals(brands[4]))
                model = modelsBMW[r1.nextInt(4)];
            seat = seats[r1.nextInt(4)];
            door = doors[r1.nextInt(3)];
            typeEngine = r1.nextInt(3);
            dateStart = generateDateStart();
            if (typeEngine == 0) {
                battery = r1.nextInt(99);
                electricCar = new Electric(brand, model, seat, true, door, generateCarPlate(), dateStart, generateDateEnd(dateStart), battery);
                Singleton.electricList.add(electricCar);
            }else if (typeEngine == 1) {
                hybridChoose = typeHybrid[r1.nextInt(4)];
                hybridCar = new Hybrid(brand, model, seat, true, door, generateCarPlate(), dateStart, generateDateEnd(dateStart), hybridChoose);
                Singleton.hybridList.add(hybridCar);
            }else if (typeEngine == 2)
                combChoose = typeComb[r1.nextInt(3)];
                combustionCar = new Combustion(brand, model, seat, true, door, generateCarPlate(), dateStart, generateDateEnd(dateStart), combChoose);
                Singleton.combustionList.add(combustionCar);
            }// end_for
    }// end_generate

    private static Fecha generateDateStart() {
        //////
        Fecha returnDate = null;
        boolean resume = false;
        //////
        /////
        do {
            returnDate = new Fecha (Integer.toString(r1.nextInt(2022 - 2020) + 2020) + "/" + (Integer.toString(r1.nextInt(12 - 1) + 1)) + "/" + (Integer.toString(r1.nextInt(31 - 1) + 1)));
            if (returnDate.verDate())
                resume = true;
        }while (resume == false);
        //////
        return returnDate;
    }// end_generateDate
    //////
    /////

    private static Fecha generateDateEnd(Fecha dateStart) {
        //////
        Fecha returnDate = null;
        boolean resume = false;
        //////
        /////
        do {
            returnDate = new Fecha (Integer.toString(r1.nextInt(2022 - 2020) + 2020) + "/" + (Integer.toString(r1.nextInt(12 - 1) + 1)) + "/" + (Integer.toString(r1.nextInt(31 - 1) + 1)));
            if (returnDate.verDate() && returnDate.subtractDates(dateStart) > 0)
                resume = true;
        }while (resume == false);
        //////
        return returnDate;
    }// end_generateDate
    //////
    /////

    private static String generateCarPlate() {
        //////
        String[] charPlate = {"A", "B", "C", "D", "E","F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "Z"};
        String carPlate = "";
        boolean resume = false;
        do {
            carPlate = Integer.toString(r1.nextInt(9)) + Integer.toString(r1.nextInt(9)) + Integer.toString(r1.nextInt(9)) + Integer.toString(r1.nextInt(9)) +
                charPlate[r1.nextInt(25)] + charPlate[r1.nextInt(25)] + charPlate[r1.nextInt(25)];
            if (Singleton.electricList.isEmpty() && Singleton.hybridList.isEmpty() && Singleton.combustionList.isEmpty())
                resume = false;
            else {
                if (functions.verCarPlate(carPlate))
                    resume = false;
            }
        }while (resume == true);
        //////
        return carPlate;
    }// end_generateCarPlate

}// end_generateDummies