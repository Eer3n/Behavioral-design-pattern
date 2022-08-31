package FastTrains.Stations;

import FastTrains.Enum.CitiesInKorea;
import FastTrains.Transportation;

public class SeoulStation extends Transportation {
    public SeoulStation(){super(CitiesInKorea.Seoul);}

    public void moveTransportation(CitiesInKorea citiesInKorea) {
        arrivedMessage(citiesInKorea);
        if (this.getCity().equals(citiesInKorea)){
            arrivedMessage();
        }else if (this.getNextTrain() != null){
            getNextTrain().moveTransportation(citiesInKorea);
        }else{
            arrivalIsNotPossible();
        }
    }
    private  void arrivedMessage(){
        System.out.println(getCity().getCityName()+" arrived to the wanted location.");
    }

    private void arrivedMessage(CitiesInKorea citiesInKorea){
        System.out.println(citiesInKorea.getCityName()+" passenger moved to the " + getCity().getCityName()+" train.");
    }
    private void arrivalIsNotPossible(){
        System.out.println("Impossible to go by train.");
    }
}
