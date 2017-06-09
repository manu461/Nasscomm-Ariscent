/**
 * Created by staLker on 06-06-2017.
 */
public class Address {
    int houseNo;
    String streetName;
    String district;
    int postalCode;
    String state;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
////--------------------------->Constructor OverRiding<-----------------------------------////
    public Address(int houseNo, int postalCode) {
        this.houseNo = houseNo;
        this.postalCode = postalCode;
    }

    public Address(int houseNo, String streetName, String district, int postalCode, String state) {

        this.houseNo = houseNo;
        this.streetName = streetName;
        this.district = district;
        this.postalCode = postalCode;
        this.state = state;
    }

}
