import chat.ChatInit;
import javafx.stage.Stage;
import login.bussiness.LoginService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Application extends javafx.application.Application {

    private LoginService loginService = new LoginService();

    @Override
    public void start(Stage primaryStage) throws Exception {
        //  登录窗口
//        LoginController login = new LoginController(loginService);
//        login.doShow();
        ChatInit chat = new ChatInit();
        chat.show();
    }

    public static void main(String[] args) throws Exception{
        launch(args);
    }
}
