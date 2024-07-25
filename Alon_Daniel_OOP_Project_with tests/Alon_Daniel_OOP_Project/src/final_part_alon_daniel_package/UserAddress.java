package final_part_alon_daniel_package;

public class UserAddress {

    private String country;
    private String city;
    private String streetName;
    private int buildingNumber;

    //--------------------------------- ctor --------------------------------------


    public UserAddress(String country, String city, String streetName, int BuildingNumber){
        this.country=country;
        this.city=city;
        this.streetName=streetName;
        this.buildingNumber=BuildingNumber;
    }


    //--------------------------------- toString --------------------------------------

    @Override
    public String toString() {
        return "UserAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                "}\n";
    }
}
