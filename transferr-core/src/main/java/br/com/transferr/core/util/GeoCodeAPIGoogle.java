package br.com.transferr.core.util;

import java.io.IOException;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.AddressComponent;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

import br.com.transferr.core.model.Place;

public class GeoCodeAPIGoogle {


	public static Place getPlaceByCoordinates(double longitude, double latitude) {
		GeoApiContext context = new GeoApiContext.Builder().apiKey("AIzaSyBuhyqZxszWMSzSN2c9Ja5C6kth7G2k1tQ").build();
		GeocodingResult[] results 	= null;
		LatLng location = new LatLng(latitude, longitude);
		try {
			results = GeocodingApi.reverseGeocode(context, location).await();
			if(results != null && results.length > 0){
				Place place = new Place();
				GeocodingResult geom = results[0];
				System.out.println(geom.formattedAddress);
				AddressComponent[] addressComponents = geom.addressComponents;
				for (AddressComponent addressComponent : addressComponents) {
					if(addressComponent.types[0].name().equals("ADMINISTRATIVE_AREA_LEVEL_2")){
						place.setCity(addressComponent.longName); 
					}else if(addressComponent.types[0].name().equals("ADMINISTRATIVE_AREA_LEVEL_1")){
						place.setState(addressComponent.longName); 
					}else if(addressComponent.types[0].name().equals("COUNTRY")){
						place.setCountry(addressComponent.longName); 
					}
				}
				return place;
			}else{
				return null;
			}
		} catch (ApiException | InterruptedException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Integer zipCodeAsInteger(String zipCode) {
		Integer result = 0;
		if(zipCode != null && !zipCode.trim().isEmpty()) {
			try {
				zipCode = zipCode.replace("-", "").replace("", "");
				result = Integer.parseInt(zipCode);
			}catch (Exception e) {}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Place place = new GeoCodeAPIGoogle().getPlaceByCoordinates(-38.48113775, -3.80490711);
		if(place != null) {
			System.out.println(place.getCity());
			System.out.println(place.getCountry());
			System.out.println(place.getState());
		}
	}

}
