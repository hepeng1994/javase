package day07.test2;

import ch.hsr.geohash.GeoHash;

public class utils2 {

	private static String base32;

	public static String getGeoHash(double laty, double latx) {
		base32 = GeoHash.withCharacterPrecision(laty, latx, 8).toBase32();
		return base32;
	}
}
