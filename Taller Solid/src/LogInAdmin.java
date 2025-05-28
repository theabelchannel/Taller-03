public class LogInAdmin implements ILogin {
    private IDatabase database;

    public LogInAdmin(IDatabase database) {
        this.database = database;
    }

    private boolean verifyIfAdmin(User user) {
        // lógica para verificar si es admin
        return true;
    }

    @Override
    public boolean authenticate(User user) {
        if (!verifyIfAdmin(user)) {
            return false;
        }
        database.insertUser(user);
        return true;
    }
}
