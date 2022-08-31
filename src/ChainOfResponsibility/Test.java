package ChainOfResponsibility;

import ChainOfResponsibility.CargoFirms.UPSCargo;
import ChainOfResponsibility.Enum.City;

public class Test {

    public static void main(String[] args) {
        Cargo myCargo = UPSCargo.getCargo();
        myCargo.shipCargo(City.GaziAntep);
    }
}
