package ba.bitcamp.exercise.csv.database;

public class User {

	private String name;
	private String lastName;
	private int age;
	private boolean driversLicences;

	public User(String name, String lastName, int age, boolean driversLicences) {

		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.driversLicences = driversLicences;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the driversLicences
	 */
	public boolean isDriversLicences() {
		return driversLicences;
	}

	/**
	 * @param driversLicences
	 *            the driversLicences to set
	 */
	public void setDriversLicences(boolean driversLicences) {
		this.driversLicences = driversLicences;
	}

	public String toCSVString(String delimiter) {

		return name + delimiter + lastName + delimiter + age + delimiter
				+ driversLicences;

	}

}
