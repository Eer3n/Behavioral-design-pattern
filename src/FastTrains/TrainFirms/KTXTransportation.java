package FastTrains.TrainFirms;

import FastTrains.Stations.*;
import FastTrains.Transportation;

public class KTXTransportation {

    public static Transportation getNextTrain(){
        SeoulStation seoulStation = new SeoulStation();
        BusanStation busanStation = new BusanStation();
        DaeguStation daeguStation = new DaeguStation();
        IncheonStation incheonStation = new IncheonStation();
        GwangjuStation gwangjuStation = new GwangjuStation();
        DaejeonStation daejeonStation = new DaejeonStation();
        UlsanStation ulsanStation = new UlsanStation();
        SuwonsiStation suwonsiStation = new SuwonsiStation();

        Transportation transportation = seoulStation
                .setNextTrain(busanStation
                        .setNextTrain(daeguStation
                                .setNextTrain(incheonStation
                                        .setNextTrain(gwangjuStation
                                                .setNextTrain(daejeonStation
                                                        .setNextTrain(ulsanStation
                                                                .setNextTrain(suwonsiStation)))))));
                                                        return transportation;
    }
}
