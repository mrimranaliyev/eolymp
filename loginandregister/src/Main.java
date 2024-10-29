public class Main {
    public static void main(String[] args) {

        User user = new User("imran324","324567867");
        UserService userService = new UserService();

        userService.register(user);

    }
}