package day07;

import ch.hsr.geohash.GeoHash;

public class utils {
	/**
	 * 
	 * @param lx
	 * @param ly
	 * @return
	 */
	public static String geohash(double lx, double ly) {
		 String base32 = GeoHash.withCharacterPrecision(ly, lx,8).toBase32();
		 return base32;
	}
}
