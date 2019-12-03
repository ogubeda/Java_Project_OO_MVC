package Modules.Cars.Dummies;

import java.util.Random;
import Classes.Fecha;
import Modules.Cars.Classes.*;
import Modules.Cars.Utils.functions;

public class generateDummies {
    //////
    private static Random r1 = new Random();
    private static String[] brands = {"Tesla", "Ford", "Toyota", "Audi", "BMW"};
    private static String[] modelsTesla = {"Model 3", "Model X", "Model Y"};
    private static String[] modelsFord = {"Fiesta", "Focus", "Mustang"};
    private static String[] modelsToyota = {"Corolla", "Auris", "GT 86"};
    private static String[] modelsAudi = {"A1", "A3", "A4", "A5"};
    private static String[] modelsBMW = {"Serie 1", "Serie 2", "Serie 3", "Serie 4"};
    private static String[] typeHybrid = {"Electric/Diesel", "Electric/Petrol", "Hydrogen/Diesel", "Hydrogen/Petorl"};
    private static String[] typeComb = {"Petrol", "Diesel", "Natural Gas"};
    private static int[] seats = {2, 4, 5, 8};
    private static int[] doors = {3, 5, 7};
    //////
    public static int generate (int type) {
        //////
        String brand = "", model = "", hybridChoose = "", combChoose = "";
        int seat = 0, door = 0, typeEngine = type, battery = 0;
        Fecha dateStart = null;
        Electric electricCar = null;
        Hybrid hybridCar = null;
        Combustion combustionCar = null;
        //////
        /////
        brand = generateBrand();
        model = generateModel(brand);
    seat = generateSeats();
        door = generateDoors();
        dateStart = generateDateStart();
        if (type == -1)
            typeEngine = r1.nextInt(3);
        if (typeEngine == 0) {
            battery = generateBattery();
            electricCar = new Electric(brand, model, seat, generateParkingHelp(), door, generateCarPlate(), dateStart, generateDateEnd(dateStart), battery);
            Singleton.electricList.add(electricCar);
            return 1;
        }else if (typeEngine == 1) {
            hybridChoose = generateTypeHyb();
            hybridCar = new Hybrid(brand, model, seat, generateParkingHelp(), door, generateCarPlate(), dateStart, generateDateEnd(dateStart), hybridChoose);
            Singleton.hybridList.add(hybridCar);
            return 1;
        }else if (typeEngine == 2) {
            combChoose = generateTypeComb();
            combustionCar = new Combustion(brand, model, seat, generateParkingHelp(), door, generateCarPlate(), dateStart, generateDateEnd(dateStart), combChoose);
            Singleton.combustionList.add(combustionCar);
            return 1;
        }
        //////
        return 0;
    }// end_generate
    //////
    /////

    public static String generateBrand() {
        //////
        return brands[r1.nextInt(brands.length)];
    }// end_generateBrand
    //////
    /////

    public static String generateModel(String brand) {
        //////
        if (brand.equals(brands[0]))
            return modelsTesla[r1.nextInt(modelsTesla.length)];
        else if (brand.equals(brands[1]))
            return modelsFord[r1.nextInt(modelsFord.length)];
        else if (brand.equals(brands[2]))
            return modelsToyota[r1.nextInt(modelsToyota.length)];
        else if (brand.equals(brands[3]))
            return modelsAudi[r1.nextInt(modelsAudi.length)];
        else if (brand.equals(brands[4]))
            return modelsBMW[r1.nextInt(modelsBMW.length)];
        //////
        return null;
    }// end_generateModel
    //////
    /////

    public static int generateSeats() {
        //////
        return seats[r1.nextInt(seats.length)];
    }// end_generateSeats
    //////
    /////

    public static boolean generateParkingHelp() {
        //////
        if (r1.nextInt(2) == 0)
            return false;
        else
            return true;
    }// end_generateParkingHelp
    //////
    /////

    public static int generateDoors() {
        //////
        return doors[r1.nextInt(doors.length)];
    }// end_generateDoors
    //////
    /////

    public static int generateBattery() {
        //////
        return r1.nextInt((99 - 66) + 66);

    }// end_generateBattery
    //////
    /////

    public static String generateTypeHyb() {
        //////
        return typeHybrid[r1.nextInt(typeHybrid.length)];
    }// end_generateTypeHyb
    //////
    /////

    public static String generateTypeComb() {
        //////
        return typeComb[r1.nextInt(typeComb.length)];
    }// end_generateTypeComb
    //////
    /////

    public static Fecha generateDateStart() {
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

    public static Fecha modifyDateStart(Fecha dateEnd) {
        //////
        Fecha returnDate = null;
        boolean resume = false;
        //////
        /////
        do {
            returnDate = new Fecha (Integer.toString(r1.nextInt(2022 - 2020) + 2020) + "/" + (Integer.toString(r1.nextInt(12 - 1) + 1)) + "/" + (Integer.toString(r1.nextInt(31 - 1) + 1)));
            if ((returnDate.verDate()) && (returnDate.subtractDates(dateEnd) < 0))
                resume = true;
        }while (resume == false);
        //////
        return returnDate;
    }// end_modifyDateStart
    //////
    /////

    public static Fecha generateDateEnd(Fecha dateStart) {
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

    public static String generateCarPlate() {
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
                if (functions.verCarPlate(carPlate) == 1)
                    resume = false;
            }
        }while (resume == true);
        //////
        return carPlate;
    }// end_generateCarPlate

}// end_generateDummies