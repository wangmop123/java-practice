package form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PassengerCheckInSystem extends JFrame {

    public PassengerCheckInSystem() {
        setTitle("Airport Passenger Check-In System");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2, 10, 10));

        // Components
        JLabel nameLabel = new JLabel("Passenger Name:");
        JTextField nameField = new JTextField();

        JLabel surnameLabel = new JLabel("Surname:");
        JTextField surnameField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel locationLabel = new JLabel("Select Destination:");

        String[] countries = {"USA", "Japan", "Canada", "UK", "Australia"};
        String[] states = {"Kathmandu", "Pokhara", "Humla", "Solu", "Surkhet", "Dolakha"};

        JComboBox<String> countryBox = new JComboBox<>(states); // default: domestic

        JCheckBox ticketCheck = new JCheckBox("Is International");

        JButton registerButton = new JButton("Register");

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> passengerList = new JList<>(listModel);

        // Add components
        add(nameLabel);
        add(nameField);

        add(surnameLabel);
        add(surnameField);

        add(genderLabel);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        add(genderPanel);

        add(locationLabel);
        add(countryBox);

        add(new JLabel());
        add(ticketCheck);

        add(new JLabel());
        add(registerButton);

        add(new JLabel("Registered Passengers:"));
        add(new JScrollPane(passengerList));

        // Action to toggle between states/countries
        ticketCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryBox.removeAllItems();
                if (ticketCheck.isSelected()) {
                    for (String country : countries) {
                        countryBox.addItem(country);
                    }
                } else {
                    for (String state : states) {
                        countryBox.addItem(state);
                    }
                }
            }
        });

        // Register Button Logic
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String surname = surnameField.getText().trim();
                String gender = maleButton.isSelected() ? "Male" :
                                (femaleButton.isSelected() ? "Female" : "");

                String location = (String) countryBox.getSelectedItem();
                boolean isInternational = ticketCheck.isSelected();

                // Validation
                if (name.isEmpty() || surname.isEmpty() || gender.isEmpty() || location == null) {
                    showErrorDialog("Please complete all fields correctly.");
                    return;
                }

                // Add passenger info
                String info = name + " " + surname + " - " + gender + ", " +
                              (isInternational ? "International: " : "Domestic: ") + location;

                listModel.addElement(info);

                // Reset form
                nameField.setText("");
                surnameField.setText("");
                genderGroup.clearSelection();
                ticketCheck.setSelected(false);
                countryBox.removeAllItems();
                for (String state : states) {
                    countryBox.addItem(state);
                }
            }
        });

        setVisible(true);
    }

    private void showErrorDialog(String message) {
        JDialog dialog = new JDialog(this, "Validation Error", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new JLabel(message));
        JButton ok = new JButton("OK");
        ok.addActionListener(e -> dialog.dispose());
        dialog.add(ok);
        dialog.setSize(300, 100);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new PassengerCheckInSystem();
    }
}
