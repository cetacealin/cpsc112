//The Location class is implemented as below. It has three attributes and one method:

//address: String
//latitude: double
//longitude: double
//distanceTo(): distance to another location

public class Location
{
    private String      address;
    private double      latitude;
    private double      longitude;
 
    public Location(String _address, double _latitude, double _longitude)
    {
        address = _address;
        latitude = _latitude;
        longitude = _longitude;
    }
 
    // Compute the distance in meters
    // Reference http://stackoverflow.com/a/837957
    public double distanceTo(Location loc)
    {
        double earthRadius = 3958.75;
        double dLat = Math.toRadians(latitude - loc.latitude);
        double dLng = Math.toRadians(longitude - loc.longitude);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                   Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(latitude)) *
                   Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = earthRadius * c;
 
        int meterConversion = 1609;
 
        return dist * meterConversion;
    }
 
    public String toString()
    {
        return address + " (" + latitude + ", " + longitude + ")";
    }
 
}
