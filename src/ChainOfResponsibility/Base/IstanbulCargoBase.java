package ChainOfResponsibility.Base;

import ChainOfResponsibility.Cargo;
import ChainOfResponsibility.Enum.City;

public class IstanbulCargoBase extends Cargo {

    public IstanbulCargoBase(){
        super(City.Istanbul);

    }
    public void shipCargo(City city){
        cargoArrivedMessaeg(city);

        if(this.getCity().equals(city)){
            cargoArrivedMessage();
        }else if (this.getNextCargo()!= null){
            getNextCargo().shipCargo(city);

        }else{
            outOfRangeessage();
        }
    }

    private void outOfRangeessage(){
        System.out.println("Servis disi kargo bolgesi");
    }

    private void cargoArrivedMessaeg(City city){
        System.out.println(city.getCityName()+ " iline gideek kargo " + getCity().getCityName() +" ubesine geldi. ");
    }

    private void cargoArrivedMessage(){
        System.out.println(getCity().getCityName() + " kargo alinana ulasti");
    }
}
