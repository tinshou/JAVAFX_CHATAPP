import javafx.stage.Stage;
import login.ui.ILoginMethod;
import login.ui.LoginController;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ILoginMethod login = new LoginController((username, password) -> {
            System.out.println("用户名："+username+" ,密码："+password);
        });
        login.doShow();
    }

    public static void main(String[] args) throws Exception{
        launch(args);
    }
}
