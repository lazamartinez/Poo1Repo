package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class ControladorVistaMain implements Initializable{

        
    @FXML
    private TextField campoTextoEjercicio1;

    @FXML
    private TextField campotexto2;

    @FXML
    private TextField campotexto3;

    @FXML
    private TextField campotexto4;

    @FXML
    private RadioButton radioBoton1;

    @FXML
    private RadioButton radioBoton2;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private ImageView fxImagenLaFuerza; 
    
    @FXML
    private GridPane panelMenu;
    @FXML
    private GridPane panelEjercicios;
    @FXML
    private GridPane panelRendimientos;
    @FXML
    private GridPane panelGrupoMuscular;
    @FXML
    private GridPane panelEntrenamientos;
    
    @FXML
    private HBox panelDatosFondo1;
    
    @FXML
    private VBox panelDatosFondo2;

    @FXML
    private Button btnMenu;

    @FXML
    private Button btnEjercicios;

    @FXML
    private Button btnGruposMusculares;

    @FXML
    private Button btnRendimientos;

    @FXML
    private Button btnEntrenamientos;

    @FXML
    private Button btnInfo;

    @FXML
    private Label lblInfo;       

    @FXML
    private Label lblMenu;

    @FXML
    private Button btnAñadirCliente;

    @FXML
    private Button btnAsignarTutor; 
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {         
        //Image fxImagenLaFuerza = new Image("/materiales/logo_lafuerza.png");
        //ImageView imageView = new ImageView();
        //imageView.setImage(fxImagenLaFuerza);  
    }

    @FXML
    private void hacerClick(ActionEvent event){

        if(event.getSource() ==btnMenu)
        {
            lblInfo.setText("Registrar clientes al sistema");
            panelDatosFondo1.setBackground(new Background(new BackgroundFill(Color.rgb(167, 66, 245), CornerRadii.EMPTY, Insets.EMPTY)));
            panelDatosFondo2.setBackground(new Background(new BackgroundFill(Color.rgb(167, 66, 245), CornerRadii.EMPTY, Insets.EMPTY)));
            panelMenu.toFront();
            
        }
        else 
        if(event.getSource() ==btnEjercicios)
        {            
            lblInfo.setText("Control y gestión de ejercicios por cliente");
            panelDatosFondo1.setBackground(new Background(new BackgroundFill(Color.rgb(25, 227, 190), CornerRadii.EMPTY, Insets.EMPTY)));
            panelDatosFondo2.setBackground(new Background(new BackgroundFill(Color.rgb(25, 227, 190), CornerRadii.EMPTY, Insets.EMPTY)));
            panelEjercicios.toFront();
        }
        else 
        if(event.getSource() ==btnGruposMusculares)
        {
            //pnlDatosVista2.setBackground(new Background(new BackgroundFill(Color.rgb(115, 9, 41), CornerRadii.EMPTY, Insets.EMPTY)));
            lblInfo.setText("Control y gestión de grupos musculares cargados en el sistema");
            panelDatosFondo1.setBackground(new Background(new BackgroundFill(Color.rgb(199, 36, 145), CornerRadii.EMPTY, Insets.EMPTY)));
            panelDatosFondo2.setBackground(new Background(new BackgroundFill(Color.rgb(199, 36, 145), CornerRadii.EMPTY, Insets.EMPTY)));
            panelGrupoMuscular.toFront();

        }
        else 
        if(event.getSource() ==btnRendimientos)
        {
            //pnlDatosVista2.setBackground(new Background(new BackgroundFill(Color.rgb(115, 9, 41), CornerRadii.EMPTY, Insets.EMPTY)));
            lblInfo.setText("Evaluacion de rendimientos por cliente");
            panelDatosFondo1.setBackground(new Background(new BackgroundFill(Color.rgb(26, 67, 150), CornerRadii.EMPTY, Insets.EMPTY)));
            panelDatosFondo2.setBackground(new Background(new BackgroundFill(Color.rgb(26, 67, 150), CornerRadii.EMPTY, Insets.EMPTY)));
            panelRendimientos.toFront();
        } 
        else 
        if(event.getSource() ==btnEntrenamientos)
        {
            //pnlDatosVista2.setBackground(new Background(new BackgroundFill(Color.rgb(115, 9, 41), CornerRadii.EMPTY, Insets.EMPTY)));
            lblInfo.setText("Asignacion de entrenamiento por cliente");
            panelDatosFondo1.setBackground(new Background(new BackgroundFill(Color.rgb(150, 26, 71), CornerRadii.EMPTY, Insets.EMPTY)));
            panelDatosFondo2.setBackground(new Background(new BackgroundFill(Color.rgb(150, 26, 71), CornerRadii.EMPTY, Insets.EMPTY)));
            panelEntrenamientos.toFront();
        }
        else 
        if(event.getSource() ==btnInfo)
        {
            //pnlDatosVista2.setBackground(new Background(new BackgroundFill(Color.rgb(115, 9, 41), CornerRadii.EMPTY, Insets.EMPTY)));
            lblInfo.setText("Detalles del sistema");
        }           
    }
    
}