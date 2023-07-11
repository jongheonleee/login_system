import java.util.HashMap;

public class IdAndPasswords {

    HashMap<String, String> loginInfo = new HashMap<>();

    IdAndPasswords() {

        loginInfo.put("yeonuel", "apple");
        loginInfo.put("Bro", "pizza");
        loginInfo.put("happy", "abc123");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
