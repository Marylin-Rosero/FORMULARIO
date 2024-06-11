
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public class App extends Application {

    @Override
    public void init() {
        System.out.println("METODO INIT()");
    }

    @Override
    public void start(Stage primaryStage) {
    
        // Botón
        Label label = new Label("BOTON: ");
        Button btn = new Button("CLICKEA");
        btn.setStyle("-fx-background-color: lightblue;");

        // Checkbox
        Label label1 = new Label("CHECKBOX: ");
        CheckBox checkbx = new CheckBox("CHEXBOX");
        checkbx.setStyle("-fx-text-fill: darkblue;");

        // Hiperlink
        Label label2 = new Label("HYPERLINK: ");
        Hyperlink link = new Hyperlink("HYPERLINK:");
        link.setStyle("-fx-text-fill: darkred;");

        // ToggleButton
        Label label3 = new Label("TOGGLEBUTTON: :");
        ToggleButton toggbutton = new ToggleButton("TOGGLEBUTTON: ");
        toggbutton.setStyle("-fx-background-color: lightgreen;");

        // RadioButton
        Label label4 = new Label("RADIOBUTTON: :");
        RadioButton rdbutton = new RadioButton("RADIOBUTTON");
        rdbutton.setStyle("-fx-text-fill: purple;");

        // Label
        Label label5 = new Label("LABEL: :");
        Label Lb = new Label("LABEL");
        Lb.setStyle("-fx-text-fill: orange;");

        // TextField
        Label label6 = new Label("TEXTFIELD: ");
        TextField textf = new TextField("SOME TEXT");
        textf.setStyle("-fx-background-color: lightyellow;");

        // PasswordField
        Label label7 = new Label("PASSWORDFIELD: ");
        PasswordField contra = new PasswordField();
        contra.setStyle("-fx-background-color: lightgray;");

        // TextArea
        Label lbl = new Label("TEXTAREA: ");
        TextArea areaTexto = new TextArea();
        areaTexto.setStyle("-fx-background-color: lightpink;");

        // ProgressIndicator
        Label label8 = new Label("PROGRESSINDICATOR: ");
        double i = 0.27;
        ProgressIndicator prossindicador = new ProgressIndicator(i);

        // ProgressBar
        Label label9 = new Label("PROGRESSBAR: ");
        ProgressBar prossbar = new ProgressBar(i);

        // Slider
        Label lbl1 = new Label("SLIDER: ");
        Slider slider = new Slider();

        // Crea los HBox
        HBox botonBox = new HBox(100);
        botonBox.setAlignment(Pos.CENTER_LEFT);
        botonBox.getChildren().addAll(label, btn);

        HBox checkBox = new HBox(80);
        checkBox.setAlignment(Pos.CENTER_LEFT);
        checkBox.getChildren().addAll(label1, checkbx);

        HBox hyperlink = new HBox(80);
        hyperlink.setAlignment(Pos.CENTER_LEFT);
        hyperlink.getChildren().addAll(label2, link);

        HBox togglebtn = new HBox(50);
        togglebtn.setAlignment(Pos.CENTER_LEFT);
        togglebtn.getChildren().addAll(label3, toggbutton);

        HBox radioButton = new HBox(60);
        radioButton.setAlignment(Pos.CENTER_LEFT);
        radioButton.getChildren().addAll(label4, rdbutton);

        HBox lab = new HBox(110);
        lab.setAlignment(Pos.CENTER_LEFT);
        lab.getChildren().addAll(label5, Lb);

        HBox textfield = new HBox(85);
        textfield.setAlignment(Pos.CENTER_LEFT);
        textfield.getChildren().addAll(label6, textf);

        HBox passwordfield = new HBox(50);
        passwordfield.setAlignment(Pos.CENTER_LEFT);
        passwordfield.getChildren().addAll(label7, contra);

        HBox textArea = new HBox(95);
        textArea.setAlignment(Pos.CENTER_LEFT);
        textArea.getChildren().addAll(lbl, areaTexto);

        HBox ProgressIndicator = new HBox(120);
        ProgressIndicator.setAlignment(Pos.CENTER_LEFT);
        ProgressIndicator.getChildren().addAll(label8, prossindicador);

        HBox ProgressBar = new HBox(60);
        ProgressBar.setAlignment(Pos.CENTER_LEFT);
        ProgressBar.getChildren().addAll(label9, prossbar);

        HBox Slider = new HBox(100);
        Slider.setAlignment(Pos.CENTER_LEFT);
        Slider.getChildren().addAll(lbl1, slider);

        // Crea un VBox
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.TOP_LEFT);
        vbox.setPadding(new Insets(20));
        // Establece varios estilos para el VBox
        vbox.setStyle("-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: green;");
        vbox.setPrefSize(700, 200);
        vbox.getChildren().addAll(botonBox, checkBox, hyperlink, togglebtn, radioButton, lab, textfield, passwordfield, textArea, ProgressIndicator, ProgressBar, Slider);

        // Crea la Scene
        Scene scene = new Scene(vbox, 700, 700);
        // Agrega la Scene al Stage
        primaryStage.setScene(scene);

        // Titulo del Stage
        primaryStage.setTitle("FORMULARIO");

        // Muestra el Stage
        primaryStage.show();
    }
    @Override
    public void stop() {
        System.out.println("METODO STOP()");
    }
    public static void main(String[] args) {
        launch(args);
    }
}