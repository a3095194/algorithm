package jp.ditgroup.common;

//String型をint、double型に変換します
public class CastUtil {
	public static int strToInt(String i) {
		return Integer.parseInt(i);
	}

	public static double strToDouble(String j) {
		return Double.parseDouble(j);
	}
}
