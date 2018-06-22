//Now we define a tool class LocationTool. It has the following methods:

//ArrayList loadData(String urlString): reads data from the url

//Location makeLocation(String addr): creates a location object from an address. 
//We use Google’s geocoding services to find the latitude and longitude of an address string.

import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
public class LocationTool 
{
    // Read from URL and return the content in a String
    public static String readURLContent(String urlString) 
        throws IOException
    {
        URL url = new URL(urlString);
        Scanner scan = new Scanner(url.openStream());
        String content = new String();
        while (scan.hasNext())
            content += scan.nextLine();
        scan.close();
        return content;
    }
     
    // Extract the middle part of a string from "open" to "close"
    public static String extractMiddle(String str, 
        String open, String close)
    {
        int begin = str.indexOf(open) + open.length();
        int end = str.indexOf(close, begin);
        return str.substring(begin, end);       
    }
     
    // Extract the middle part of a string from "open" to the end
    public static String extractMiddle(String str, String open)
    {
        int begin = str.indexOf(open) + open.length();
        return str.substring(begin);        
    }

    public static ArrayList<Location> loadData(String urlString) 
throws IOException
{
	ArrayList<Location> stores = new ArrayList<Location>();
	URL url = new URL(urlString);
	Scanner scan = new Scanner(url.openStream());
	while (scan.hasNextLine())
	{
		String line = scan.nextLine();
		String[] arr = line.split(",");
		double lng = Double.parseDouble(arr[0]);
		double lat = Double.parseDouble(arr[1]);
		String addr = arr[2];
		Location loc = new Location(addr, lat, lng);
		stores.add(loc);
	}
	scan.close();
	return stores;
}


	 
    // Make a Location object from a string address
    public static Location makeLocation(String addr) 
        throws IOException
    {
        String url = 
"http://maps.google.com/maps/api/geocode/json?sensor=false&address=";
        url += URLEncoder.encode(addr, "UTF-8");
        String content = readURLContent(url);
        String formatted_address = extractMiddle(content, 
            "\"formatted_address\" : \"", "\",");
        String latlng = extractMiddle(content, 
            "\"location\" : {", "},");
        double lat = Double.parseDouble(extractMiddle(latlng, 
            "\"lat\" :", ","));
        double lng = Double.parseDouble(extractMiddle(latlng, 
            "\"lng\" :"));
        return new Location(formatted_address, lat, lng);
    }
}
