package ATB;

public class Test1 {
    public static void main(String[] args) {
        User stasik = new User("vladic");
        //stasik.name = "stasik";

        User newUser = new User("Stanislav");

        String username = newUser.getName();
        System.out.println(username); // Stanislav

        newUser.setName("I am not Stanislav");


        User userAge = new User("Oleg", 23);
        System.out.println(newUser.getName()); //I am not Stanislav
        System.out.println(userAge.getName() + " " + userAge.getAge());

        User userFriend = new User("Tymur", 23, "Oleg");
        String friendname = userFriend.getBestFriend();
        System.out.println(friendname); // Oleg

        userFriend.setBestFriedn("Uzhe ne Oleg");

        System.out.println(userFriend.getBestFriend());





    }


}

class User {

    public boolean getInfo;
    private String name;
    private int age;
    private String bestFriend;
    static String description = "ЭТО КЛАСС ПРО USER";

    User(String name) {
        this.name = name;
    }

    User(String name, int age) {
        this(name);
        this.age = age;
        //this.name = name;
    }

    User(String name, int age, String bestFriend) {
        this(name,age);
        this.bestFriend = bestFriend;
    }
    public String getName() {

        return name;
    }
    public User setName(String newName) {
        name = newName;
        return this;
    }
    public String toString() {

        return super.toString();
    }
    public String getBestFriend() {

        return this.bestFriend;
    }
    public User setBestFriedn(String newFriend) {
        bestFriend = newFriend;
        return this;
    }
     public int getAge () {
        return age;
     }



    static String getNameStatic() {
        return description;
    }
}

