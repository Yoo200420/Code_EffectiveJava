package userTest;

import java.awt.Color;
import java.util.List;

public class User 
{
	private String userId;
    private String name;
    private boolean manOrWoman;
    private int age;

    private String nickName;
    private String category;
    private String statusMessage;
    private String region;

    private Color backGroundColor;
    private List<String> listOfInspector;

    private static class ElementarySchool extends User
    {
        public ElementarySchool(String userId, String name, boolean manOrWoman, int age, String nickName, String category, String region) 
        {
        	super(userId, name,  manOrWoman,  age,  nickName,  category,  region);
        }

		@Override
		public String toString() 
		{
			return "ElementarySchool [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}
        
    }

    private static class MiddleSchool_1 extends User{ }
    private static class MiddleSchool_2 extends User{ }
    private static class MiddleSchool_3 extends User{ }

    private static class HighSchool_1 extends User{ }
    private static class HighSchool_2 extends User{ }
    private static class HighSchool_3 extends User{ }
    private static class HighSchool_N extends User{ }

    private static class University extends User{ }
    private static class GraduateSchool extends User{ }

    public User() {}

    public User(
            String userId,
            String name,
            boolean manOrWoman,
            int age,
            String nickName,
            String category,
            String region
    )
    {
        this.userId = userId;
        this.name = name;
        this.manOrWoman = manOrWoman;
        this.age = age;
        this.nickName = nickName;
        this.category = category;
        //this.statusMessage = statusMessage;
        this.region = region;
        //this.backGroundColor = backGroundColor;
        //this.listOfInspector = listOfInspector;
    }

    public static User newInstance
            (String userId,
             String name,
             boolean manOrWoman,
             int age,
             String nickName,
             String category,
             String region
            )
    {
        if (category=="ElementarySchool")
            return new ElementarySchool(userId,name,manOrWoman,age,nickName,category,region);
        else
            return new User();
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", manOrWoman=" + manOrWoman +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                ", category='" + category + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", region='" + region + '\'' +
                ", backGroundColor=" + backGroundColor +
                ", listOfInspector=" + listOfInspector +
                '}';
    }

}
