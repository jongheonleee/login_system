public class LoginSystem {
    public static void main(String[] args) {
        IdAndPasswords idAndPasswords = new IdAndPasswords();

        LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());

    }
}