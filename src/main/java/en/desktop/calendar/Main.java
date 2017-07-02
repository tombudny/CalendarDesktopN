package en.desktop.calendar;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Admin on 2017-05-31.
 */
public class Main extends Application {

    public static final String FXML_BORDER_PANE_MAIN = "/fxml/BorderPaneMain.fxml";
    public static final String ICONS_CALENDAR_DESKTOP_ICON_PNG = "/icons/calendarDesktopIcon.png";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception { //Stage->Scene->Layout(ex.BorderPane)->Controls(ex.Text, Button, Checkbox)

        Locale.setDefault(new Locale("en")); // set default language for bundles (english), other and for now the second working language is "pl"
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(FXML_BORDER_PANE_MAIN)); // create FXMLLoader, get fxml file from folder resources
        loader.setResources(bundle);
        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane);



        primaryStage.setScene(scene);
        primaryStage.setTitle("CalendarDesktop");
        primaryStage.getIcons().add(new Image(ICONS_CALENDAR_DESKTOP_ICON_PNG)); // adding icon to app bar near title
        primaryStage.show();

        System.out.println("Hello world !");

    }
}
