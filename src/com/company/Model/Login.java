package mplogin;
import java.io.*;
import java.util.HashMap;

/*Estructura del fichero:
username1
password1
rol1
username2
password2
rol2
...
*/

public class Login {

	private final String fileName = "userInfo.txt";
	private HashMap<String,User> data;

	public Login() {
            data = new HashMap<>();
	}

	public boolean checkUser(String name) {
			readDataFromFile();
			if (data.containsKey(name)) {
				System.out.println("Correct.");
				return true;
			}
			System.out.println("Username doesn't exist.");
			return false;

	}

	public boolean authUser(String name, String pass) {
			if (!checkUser(name)) {
				return false;
			}
			if (data.get(name).getPassword().equals(pass)) {
				System.out.println("Correct password.");
				return true;
			}
			System.out.println("Wrong password.");
			return false;
	}

	public String checkUserRol(String name) {
            if (!checkUser(name)) {
                System.out.println("No existe el usuario.");
                return null;
            }
            readDataFromFile();
            return data.get(name).getRol();
	}

	public boolean updateByName(String name, String newPass) {
		try {
			if (!checkUser(name)) {
				return false;
			}
			data.get(name).setPassword(newPass);
			writeDataToFile();
			System.out.println("Password changed successfully.");
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	public boolean addUser(String name, String pass) {
		try {
			if (checkUser(name)) {
				System.out.println("User already exists.");
				return false;
			}
			User userAux = new User(name,pass,"normal");
			data.put(userAux.getUserName(),userAux);
			writeDataToFile();
			System.out.println("User added successfully.");
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	private void readDataFromFile() {
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			data = new HashMap<>();
			String userNameAux;
			String passwordAux;
			String rolAux;
			User userAux;
			while ((userNameAux = br.readLine()) != null) {
				passwordAux = br.readLine();
				rolAux = br.readLine();
				userAux = new User(userNameAux,passwordAux,rolAux);
				data.put(userNameAux,userAux);
			}
		}
		catch (IOException e) {
			System.out.println("Reading data from file failed.");
		}
	}

	private void writeDataToFile() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			for (User u : data.values()) {
				bw.write(u.getUserName());
				bw.newLine();
				bw.write(u.getPassword());
				bw.newLine();
				bw.write(u.getRol());
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Writing data to file failed.");
		}
	}
}