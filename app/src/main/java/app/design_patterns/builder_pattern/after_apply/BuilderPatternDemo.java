package app.design_patterns.builder_pattern.after_apply;

import app.design_patterns.builder_pattern.UserTest;

public class BuilderPatternDemo {


    public static void main(String[] args) {

        User user1 = new  User.UserBuilder("Omar" , "Alaa")
                .age(27)
                .phone("01000000000")
                .address("giza")
                .build();



        User user2 = new User.UserBuilder("Mo7kk", "Konan")
                .age(40)
                .phone("5655")
                //no address
                .build();


        User user3 = new User.UserBuilder("Capten", "Maged")
                //No age
                //No phone
                //no address
                .build();


        System.out.println("user1 --> " + user1.getFirstName() + "\t" +  user1.getLastName() + "\t" + user1.getAge());
        System.out.println("user2 --> " + user2.getFirstName() + "\t" + user2.getLastName() + "\t" + user2.getAddress());
        System.out.println("user3 --> " + user3.getFirstName() + "\t" + user3.getLastName() + "\t" + user3.getAddress());


        UserTest user = new UserTest("omar" , "aa");
        UserTest user_1 = new UserTest(10);
        System.out.println("user --> " + user.getFirstName() + "\t" +  user.getLastName() + "\t" + user.getPhone());
        System.out.println("user_1 --> " + user.getFirstName() + "\t" +  user_1.getLastName() + "\t" + user_1.getPhone());



    }


}
