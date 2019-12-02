package Utils.Test;

import Modules.Cars.Utils.functions;
import Modules.Cars.Utils.functionsRegularExp;

public class testLogIn {
    //////
    public static void main (String[] args) {
        //////
        //boolean test = functionsLogIn.LogIn();
        if (functionsRegularExp.verRegExPassword(functions.verString("hi", "hi")))
            System.out.println("hi");
    }// end_main
}// end_testLogIn