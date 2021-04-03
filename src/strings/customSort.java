package strings;

public class customSort {

	private String password;
	private String name;

	public customSort(String password, String name) {
		this.password = password;
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "customSort{" +
				"password='" + password + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}



}
