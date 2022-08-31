package ChainOfResponsibility;

import ChainOfResponsibility.Enum.City;

public abstract class Cargo {

    private final City city;
    private Cargo nextCargo;

    public Cargo(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public Cargo setNextCargo(Cargo nextCargo) {
        this.nextCargo = nextCargo;
        return this;
    }

    public Cargo getNextCargo() {
        return nextCargo;
    }

    public void shipCargo(City city) {

        cargoArrivedMessage(city);
        if (this.getCity().equals(city)) {
            cargoArrivedMessage();
        } else if (this.getNextCargo() != null) {
            getNextCargo().shipCargo(city);
        } else {
            outOfRangeMessage();
        }
    }

    private void outOfRangeMessage() {
        System.out.println("servis dışı kargo bölgesi seçildi");
    }

    private void cargoArrivedMessage(City city) {
        System.out.println(city.getCityName() + " iline gidecek kargo " + getCity().getCityName() + " subesine geldi.");
    }

    private void cargoArrivedMessage() {
        System.out.println(getCity().getCityName() + " kargo alanına ulaştı");
    }
}
