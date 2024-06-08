#Aplicacion control
Esta es una aplicaciónsimple que permite a los usuarios seleccionar una fecha y un color. La fecha y el color seleccionados se muestran luego en un área de texto. El color del contenido del área de texto cambiará al color seleccionado.

#Características
Selección de Fecha: Los usuarios pueden seleccionar una fecha usando un spinner.
Selección de Color: Los usuarios pueden seleccionar un color usando un diálogo de selección de color.
Confirmación: Al hacer clic en el botón de confirmación, se muestran la fecha y el color seleccionados en un área de texto. El color del texto coincide con el color seleccionado.

#Resumen del Código
Clase: control
La clase control extiende JFrame e implementa la interfaz de usuario y la lógica para la aplicación.

#Componentes
- dateLabel: JLabel para solicitar al usuario que seleccione una fecha.
- dateSpinner: JSpinner para la selección de fecha.
- colorLabel: JLabel para solicitar al usuario que seleccione un color.
- colorButton: JButton para abrir el diálogo de selección de color.
- confirmButton: JButton para confirmar las selecciones y mostrar los resultados.
- resultText: JTextArea para mostrar la fecha y el color seleccionados.
#Constructor
El constructor inicializa los componentes, configura el diseño y agrega action listeners para los botones.

#RESULTADO
[![Captura-de-pantalla-223.png](https://i.postimg.cc/wBSSNtP7/Captura-de-pantalla-223.png)](https://postimg.cc/2q7cR5CD)
[![Captura-de-pantalla-226.png](https://i.postimg.cc/6qhSFMQv/Captura-de-pantalla-226.png)](https://postimg.cc/1VfJqcwm)
