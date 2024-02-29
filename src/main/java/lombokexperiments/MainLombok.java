package lombokexperiments;

import lombokexperiments.dto.User;
import lombokexperiments.dto.UserLombok;
import lombokexperiments.dto.UserWith;

public class MainLombok {

    public static void main(String[] args) {
        User user = new User("aaa","dfdgf");
        System.out.println("User:"+user.getName());

        UserWith userWith = new UserWith();
        userWith.withName("aad");
        userWith.withPassword("dfgr");
        System.out.println(userWith.getPassword()+"user with");

        UserWith userWith1 = new UserWith()
                .withName("hhh")
                .withPassword("fsdfsfs");
        System.out.println("userWith1"+ userWith1.getName());

        UserWith userWith2 = new UserWith()
                .withPassword("dgfdgdf");
//---------------------LOMBOK

        UserLombok userLombok = UserLombok.builder()
                .name("ddd")
                .password("fre")
                .build();
        System.out.println("lombok:"+userLombok.getName());

    }


}
