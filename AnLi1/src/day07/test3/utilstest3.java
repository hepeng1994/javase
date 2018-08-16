package day07.test3;

import ch.hsr.geohash.GeoHash;



public class utilstest3 {

	public static String geohash(double latx, double laty) {
		String base32 = GeoHash.withCharacterPrecision(laty, latx, 8).toBase32();
		return base32;
	}

}
