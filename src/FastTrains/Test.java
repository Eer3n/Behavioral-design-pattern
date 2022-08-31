package FastTrains;

import FastTrains.Enum.CitiesInKorea;
import FastTrains.TrainFirms.KTXTransportation;

public class Test {
    public static void main(String[] args) {
        Transportation myTransportation = KTXTransportation.getNextTrain();
        myTransportation.moveTransportation(CitiesInKorea.Incheon);
    }
}
