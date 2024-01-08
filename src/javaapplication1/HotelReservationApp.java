package javaapplication1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelReservationApp {
    private JFrame frame;
    private JButton clientButton;
    private JButton employeeButton;
    private JButton billButton;
    private String clientInfo;
    private String employeeInfo;
    private String roomInfo;

    public HotelReservationApp() {
        frame = new JFrame("Hotel Reservation System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        clientButton = new JButton("Cliente");
        employeeButton = new JButton("Empleado");
        billButton = new JButton("Factura");

        clientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ventana para ingresar información del cliente
                clientInfo = JOptionPane.showInputDialog(frame, "Ingrese información del cliente:");
            }
        });

        employeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ventana para ingresar información del empleado
                employeeInfo = JOptionPane.showInputDialog(frame, "Ingrese información del empleado:");
            }
        });

        billButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (clientInfo == null || employeeInfo == null || roomInfo == null) {
                    JOptionPane.showMessageDialog(frame, "Complete la información del cliente, empleado y habitación antes de generar la factura.");
                } else {
                    // Muestra la información de la factura
                    String billInfo = "Información del Cliente: " + clientInfo + "\n";
                    billInfo += "Habitación: " + roomInfo + "\n";
                    // Agrega más información según sea necesario

                    JOptionPane.showMessageDialog(frame, billInfo, "Factura", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.add(clientButton);
        frame.add(employeeButton);
        frame.add(billButton);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HotelReservationApp();
            }
        });
    }
}

    
    

