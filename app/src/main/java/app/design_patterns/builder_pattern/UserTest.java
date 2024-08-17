package app.design_patterns.builder_pattern;

public class UserTest {

    String firstName, lastName, phone, address;
    int age;

    public UserTest(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public UserTest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public UserTest(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }


    /*

     Very good. Now what if only firstName and lastName are mandatory,
      and the rest 3 fields are optional.
     Problem !! We need more constructors. This problem is called the telescoping
     constructors problem.

    */

    /*

    public User (String firstName, String lastName, int age, String phone){ ...	}
    public User (String firstName, String lastName, String phone, String address){ ...	}
    public User (String firstName, String lastName, int age){ ...	}
    public User (String firstName, String lastName){ ...	}


    Here, the builder pattern will help you
     to consume additional attributes while retaining the immutability of the User class.

     */


}
