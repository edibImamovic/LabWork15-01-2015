package ba.bitcamp.exercise.csv.database;

public class ReadWriteUser {

	private static String basePath = "./DataBase/";

	public static boolean saveToFile(String fileName, String data) {

		try {
			TextIO.writeFile(basePath + fileName + ".csv");
			TextIO.putln(data);
		} catch (Exception e) {

			return false;
		}
		return true;

	}
}
