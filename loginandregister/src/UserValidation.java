public class UserValidation {
    public boolean userValidation(User user){
        if (user.getUsername() == null || user.getUsername().isBlank()|| user.getUsername().length() > 10){
            return false;
        }
        return true;

    }
    public boolean userPassword(User user){
        if (user.getPassword() == null || user.getPassword().length() <= 8){
            return false;
        }
        return true;
    }
    }

