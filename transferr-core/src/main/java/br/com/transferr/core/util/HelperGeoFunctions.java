package br.com.transferr.core.util;

public class HelperGeoFunctions {
	
	/**
	 * Get the distance between to points in km.
	 * @param latPoint1
	 * @param lngPoint1
	 * @param latPoint2
	 * @param lngPoint2
	 * @return
	 */
	public static float distanceFromPointsInKm(float latPoint1, float lngPoint1, float latPoint2, float lngPoint2) {
		float dist = distanceFromPointsInMeters(latPoint1, lngPoint1, latPoint2, lngPoint2);
		return dist/1000;
	}
	/**
	 * Get the distance between to points in meters.
	 * @param latPoint1
	 * @param lngPoint1
	 * @param latPoint2
	 * @param lngPoint2
	 * @return
	 */
	public static float distanceFromPointsInMeters(float latPoint1, float lngPoint1, float latPoint2, float lngPoint2) {
		double earthRadius = 6371000; //meters
		double dLat = Math.toRadians(latPoint2-latPoint1);
		double dLng = Math.toRadians(lngPoint2-lngPoint1);
		double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
				Math.cos(Math.toRadians(latPoint1)) * Math.cos(Math.toRadians(latPoint2)) *
				Math.sin(dLng/2) * Math.sin(dLng/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		float dist = (float) (earthRadius * c);
		return dist;
	}

}
