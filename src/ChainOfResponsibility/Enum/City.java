package ChainOfResponsibility.Enum;

public enum City {
    Istanbul("Istanbul"),
    Ankara("Ankara"),
    Izmir("Izmir"),
    KusAdasi("KusAdasi"),
    Datca("Datca"),
    GaziAntep("GaziAntep");

    private final String cityName;

    City(String cityName){this.cityName=cityName;}

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return "ChainOfResponsibility.Enum.City{" +
                "cityName='" + cityName + '\'' +
                '}';
    }
}
