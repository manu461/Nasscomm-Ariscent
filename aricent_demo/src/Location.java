import java.util.Random;

/**
 * Created by staLker on 06-06-2017.
 */
public class Location {
    int latitude;
    int longitude;
    boolean isGPSEnabled = true;
    private static final String GPS_EXCEPTION_MSG = "GPS of Device disabled exception.";

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }


    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public void checkIfGPSEnabled() throws GPSDisabledException {
        if(!isGPSEnabled){
            throw new GPSDisabledException(GPS_EXCEPTION_MSG);
        }
    }

    public Location(Address address){
        Location location = addressToLocation(address);
        this.latitude = getLatitudeFromLocation(location);
        this.longitude = getLongitudeFromLocation(location);

    }

    private Location addressToLocation(Address address){
        Location location = null;
        //logic yet to be implemented
        return location;
    }

    private int getLatitudeFromLocation(Location location){
        int latitude = 0;
        latitude = new Random().nextInt(90);
        return latitude;
    }
    private int getLongitudeFromLocation(Location location){
        int longitude = 0;
        longitude = new Random().nextInt(180);
        return longitude;
    }
}
