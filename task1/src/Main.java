public class Main {
    public static void main(String[] args) {
        UserReader userReader = new UserReader("Aidos");
        userReader.orderBook();
        userReader.takeBook();
        UserAdministrator userAdministrator = new UserAdministrator("Zhandos");
        userAdministrator.overdueNotification(userReader);
        userAdministrator.returnBook();
    }
}