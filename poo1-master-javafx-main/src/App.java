import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    // creación del manejador de la conexión y creación del manejador de entidades
    // EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaFXproyectoPoo");
    // EntityManager em = emf.createEntityManager(); 
    
    @Override
    public void start(Stage stage) throws Exception {
        // cambio forma de cargar
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/MainMenu.fxml"));     
        Parent root = (Parent)fxmlLoader.load();
        Scene scene = new Scene(root);        
        stage.setScene(scene);
        stage.setTitle("LA FUERZA");
        stage.show();
    }       
}
