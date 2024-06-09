## Aplicacion control

Esta es una aplicaciónsimple que permite a los usuarios seleccionar una fecha y un color. La fecha y el color seleccionados se muestran luego en un área de texto. El color del contenido del área de texto cambiará al color seleccionado.

## Características

Selección de Fecha: Los usuarios pueden seleccionar una fecha usando un spinner.
Selección de Color: Los usuarios pueden seleccionar un color usando un diálogo de selección de color.
Confirmación: Al hacer clic en el botón de confirmación, se muestran la fecha y el color seleccionados en un área de texto. El color del texto coincide con el color seleccionado.

## Resumen del Código

Clase: control
La clase control extiende JFrame e implementa la interfaz de usuario y la lógica para la aplicación.

## Componentes

- dateLabel: JLabel para solicitar al usuario que seleccione una fecha.
- dateSpinner: JSpinner para la selección de fecha.
- colorLabel: JLabel para solicitar al usuario que seleccione un color.
- colorButton: JButton para abrir el diálogo de selección de color.
- confirmButton: JButton para confirmar las selecciones y mostrar los resultados.
- resultText: JTextArea para mostrar la fecha y el color seleccionados.

# Constructor

El constructor inicializa los componentes, configura el diseño y agrega action listeners para los botones.


## RESULTADO

[![Captura-de-pantalla-223.png](https://i.postimg.cc/wBSSNtP7/Captura-de-pantalla-223.png)](https://postimg.cc/2q7cR5CD)
[![Captura-de-pantalla-226.png](https://i.postimg.cc/6qhSFMQv/Captura-de-pantalla-226.png)](https://postimg.cc/1VfJqcwm)

## codigo

package controles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Control extends Application {

    public void start(Stage primaryStage) {
        // Crear los controles
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();
        
        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();
        
        Button confirmButton = new Button("Confirmar");
        
        Text resultText = new Text();
        
        // Configurar la acción del botón
        confirmButton.setOnAction(e -> {
            // Obtener la fecha y el color seleccionados, manejando casos null
            String selectedDate = (datePicker.getValue() != null) ? datePicker.getValue().toString() : "No seleccionada";
            Color selectedColor = (colorPicker.getValue() != null) ? colorPicker.getValue() : Color.BLACK;
            
            // Mostrar la fecha y el color seleccionados en el texto resultante
            resultText.setText("Fecha seleccionada: " + selectedDate + "\nColor seleccionado: " + selectedColor);
            resultText.setFill(selectedColor); // Cambiar el color del texto al color seleccionado
        });
        
        // Crear el layout y añadir los controles
        VBox vbox = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, confirmButton, resultText);
        vbox.setSpacing(10);
        
        // Crear la escena y añadir el layout
        Scene scene = new Scene(vbox, 300, 250);
        
        // Configurar el escenario
        primaryStage.setTitle("Seleccionar Fecha y Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
