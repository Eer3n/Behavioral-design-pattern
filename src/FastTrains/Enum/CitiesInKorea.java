package FastTrains.Enum;

public enum CitiesInKorea {

    Seoul("서울"),
    Busan("부산"),
    Daegu("대구"),
    Incheon("인천"),
    Gwangju("광주"),
    Daejeon("대전"),
    Ulsan("울산"),
    Suwonsi("수원시");


    private final String cityName;

    CitiesInKorea(String cityName){
        this.cityName=cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                '}';
    }
}
