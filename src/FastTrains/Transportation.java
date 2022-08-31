package FastTrains;

import FastTrains.Enum.CitiesInKorea;

public abstract class Transportation {

    private final CitiesInKorea citiesInKorea;

    private Transportation nextTrain;

    public Transportation(CitiesInKorea citiesInKorea) {
        this.citiesInKorea = citiesInKorea;
    }

    public CitiesInKorea getCity() {
        return citiesInKorea;
    }

    public Transportation getNextTrain() {
        return nextTrain;
    }

    public Transportation setNextTrain(Transportation nextTrain) {
        this.nextTrain = nextTrain;
        return this;
    }

    public void moveTransportation(CitiesInKorea citiesInKorea){
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
        System.out.println(citiesInKorea.getCityName()+" arrived to the wanted location.");
    }

    private void arrivedMessage(CitiesInKorea citiesInKorea){
        System.out.println(citiesInKorea.getCityName()+" passenger moved to the " + getCity().getCityName()+" train.");
    }

    private void arrivalIsNotPossible(){
        System.out.println("Impossible to go by train.");
    }
}
