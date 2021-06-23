package userTest;

public class Main {

	public static void main(String[] args) 
	{
		User user = 
		User.newInstance("ID", "Yoo", true, 0, "yoo", "ElementarySchool", "South Korea");
		//new User("ID", "Yoo", true, 0, "yoo", "ElementarySchool", "South Korea");
		System.out.println(user.toString());
	}

}
