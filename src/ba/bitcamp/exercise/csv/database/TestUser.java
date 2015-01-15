package ba.bitcamp.exercise.csv.database;

public class TestUser {

	public static void main(String[] args) {

		User newUser = new User("Edib", "Imamovic", 30, false);

		System.out.println(newUser.toCSVString(","));

		ReadWriteUser.saveToFile("user", newUser.toCSVString(", "));
	}

}
