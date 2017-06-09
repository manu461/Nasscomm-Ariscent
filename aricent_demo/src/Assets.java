import java.util.UUID;

/**
 * Created by staLker on 06-06-2017.
 */
public class Assets  {
    UUID id;
    String assetName;

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public void setAssetSize(int assetSize) {
        this.assetSize = assetSize;
    }

    public void setAssetWeight(int assetWeight) {
        this.assetWeight = assetWeight;
    }

    public UUID getId() {

        return id;
    }

    public String getAssetName() {
        return assetName;
    }

    public int getAssetSize() {
        return assetSize;
    }

    public int getAssetWeight() {
        return assetWeight;
    }

    public Address getSourceAddress() {
        return sourceAddress;
    }

    public Address getDestinationAddress() {
        return destinationAddress;
    }

    public Location getSourceLocation() {
        return sourceLocation;
    }

    public Location getDestinationLocation() {
        return DestinationLocation;
    }

    int assetSize;
    int assetWeight;
    Address sourceAddress;
    Address destinationAddress;
    Location sourceLocation;
    Location DestinationLocation;

    public Assets(String assetName, int assetSize, int assetWeight) {
        this.id = UUID.randomUUID();
        this.assetName = assetName;
        this.assetSize = assetSize;
        this.assetWeight = assetWeight;
        this.sourceLocation = new Location(sourceAddress);
        this.DestinationLocation = new Location(destinationAddress);
    }

    public void setSourceAddress(int houseNo, String streetName, String district, int postalCode, String state) {
        Address src = new Address(houseNo,streetName,district,postalCode,state);
        this.sourceAddress = src;
    }

    public void setDestinationAddress(int houseNo, String streetName, String district, int postalCode, String state) {
        Address dst = new Address(houseNo,streetName,district,postalCode,state);
        this.destinationAddress = dst;
    }

}
