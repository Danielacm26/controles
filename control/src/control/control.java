package control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class control extends JFrame {

    private JLabel dateLabel;
    private JSpinner dateSpinner;
    private JLabel colorLabel;
    private JButton colorButton;
    private JButton confirmButton;
    private JTextArea resultText;
    private Color selectedColor;

    public control() {
        // Configuración de la ventana
        setTitle("Seleccionar Fecha y Color");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1, 10, 10));

        // Crear y configurar los componentes
        dateLabel = new JLabel("Selecciona una fecha:");
        dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(dateEditor);

        colorLabel = new JLabel("Selecciona un color:");
        colorButton = new JButton("Selecciona Color");
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColor = JColorChooser.showDialog(null, "Selecciona un color", Color.BLACK);
            }
        });

        confirmButton = new JButton("Confirmar");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDate selectedDate = LocalDate.parse(dateEditor.getFormat().format(dateSpinner.getValue()), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                resultText.setText("Fecha seleccionada: " + selectedDate + "\nColor seleccionado: " + selectedColor);
                resultText.setForeground(selectedColor);
            }
        });

        resultText = new JTextArea();
        resultText.setEditable(false);

        // Añadir componentes al layout
        add(dateLabel);
        add(dateSpinner);
        add(colorLabel);
        add(colorButton);
        add(confirmButton);
        add(new JScrollPane(resultText));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new control());
    }
}