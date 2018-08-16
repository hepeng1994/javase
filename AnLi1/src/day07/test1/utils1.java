package day07.test1;

import ch.hsr.geohash.GeoHash;

public class utils1 {

	public static String geohash(double loy, double lox) {
	 String base32 = GeoHash.withCharacterPrecision(loy, lox, 8).toBase32();
	 return base32;
	}

	
}
