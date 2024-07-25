package final_part_alon_daniel_package;

public class UserAccount {

    private String userName;
    private String UserPassword;


    //--------------------------------- ctor --------------------------------------

    public UserAccount(String userName,String UserPassword) {
        this.userName = userName;
        this.UserPassword = UserPassword;

    }

    //------------------------------ getters --------------------------------------

    public String getUserName() {
        return userName;
    }

    //------------------------------ toString --------------------------------------

    @Override
    public String toString() {
        return "UserAccount{" +
                "userName='" + userName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                "}\n";
    }

}
