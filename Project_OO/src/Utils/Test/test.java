package Utils.Test;

import Modules.Cars.Classes.Singleton;
import Modules.Cars.Utils.*;

public class test {

	public static void main(String[] args) {
		int select = 0;

		select = filterCars.filterAllElectric(Singleton.electricList);
	}// end_main
}// end_test
