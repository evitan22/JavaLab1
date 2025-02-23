import java.util.*;
public class Cities {
    public String nameCity, nameStreet;
    public int numberHouse, postalCode, peopleCount = 2;

    private int numberFlat;

    public static int count = 0;
    private static final Map Map;
    
    static {
        Map = new HashMap();
        Map.put("Kyiv", 1001);
        Map.put("Lviv", 39853);
        Map.put("Harkiv", 94830);
    }

    public Cities(String nameCity) {
        this.nameCity = nameCity;
        count++;
    }
    public Cities(String nameCity, String nameStreet) {
        this.nameCity = nameCity;
        this.nameStreet = nameStreet;
        count++;
    }
    public Cities(String nameCity, String nameStreet, int numberHouse) {
        this.nameCity = nameCity;
        this.nameStreet = nameStreet;
        this.numberHouse = numberHouse;
        count++;
    }
    public Cities(String nameCity, String nameStreet, int numberHouse, int numberFlat) {
        this.nameCity = nameCity;
        this.nameStreet = nameStreet;
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
        count++;
    }
    public Cities(String nameCity, String nameStreet, int numberHouse, int numberFlat, int postalCode) {
        this.nameCity = nameCity;
        this.nameStreet = nameStreet;
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
        this.postalCode = postalCode;
        count++;
    }
    public Cities(String nameCity, String nameStreet, int numberHouse, int numberFlat, int postalCode, int peopleCount) {
        this.nameCity = nameCity;
        this.nameStreet = nameStreet;
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
        this.postalCode = postalCode;
        this.peopleCount = peopleCount;
        count++;
    }

    public String getAddress(String askPerson) {
        String checkUp = "City - " + this.nameCity;
        if (this.nameStreet != null) {
            checkUp += "," + " Street - " + this.nameStreet;
        }
        if (this.numberHouse != 0) {
            checkUp += "," + " House number - " + this.numberHouse;
        }
        if (this.numberFlat != 0 && askPerson == "notary") {
            checkUp += "," + " Flat number - " + this.numberFlat;
        }
        if (this.postalCode != 0) {
            checkUp += "," + " Postal code - " + this.postalCode;
        }
        return checkUp;
    }

    public int getPeopleCount() {
        return this.peopleCount;
    }

    public void deregisterPeople(int count) {
        this.peopleCount -= count;
    }
    public void deregisterPeople() {
        this.peopleCount = 0;
    }

    public static Object createTimes(String cityName) {
        return Map.get(cityName);
    }
}
