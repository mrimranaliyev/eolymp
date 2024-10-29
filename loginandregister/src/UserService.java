public class UserService {


    public void register(User user){

        UserValidation userValidation = new UserValidation();

        if(!userValidation.userValidation(user)){
            System.out.println("Invalid username");
            return;
        }

        System.out.println("Registr successfully");
    }
}
