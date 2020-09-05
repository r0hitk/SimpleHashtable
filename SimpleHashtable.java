package simpleHashtable;

public class SimpleHashtable {

	private Person[] hashTable;

	SimpleHashtable(int size) {
		hashTable = new Person[size];
	}

	public void put(String key, Person value) {

		int hashedKey = hashKey(key);

		if (hashTable[hashedKey] == null) {
			hashTable[hashedKey] = value;
			System.out.println("Added : " + value.getName());
		} else
			System.out.println("Unable to add : " + value.getName());

	}

	private int hashKey(String key) {

		// Used division method to create
		// a simple hash function(dividing the key by a prime number not near to pow(2))
		return (key.length() % 7);

	}

	public String get(String key) {

		int hashedKey = hashKey(key);

		if (hashTable[hashedKey].getName() == key) {
			String data = hashTable[hashedKey].getName() + " " + hashTable[hashedKey].getCity() + " "
					+ hashTable[hashedKey].getAge();

			return "Details for the provided key : " + data;
		}

		else
			return "No person named \"" + key +"\" exists in the Hashtable";

	}

	public void printHashTable() {
		for (Person i : hashTable) {
			System.out.println(i);
		}
	}

}
