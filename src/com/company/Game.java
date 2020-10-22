package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, welcomeTextPanel, startButtonPanel, exitButtonPanel, mainTextPanel, nameTextPanel, enterButtonPanel, inputPanel;
    JLabel titleNameLabel, welcomeTextLabel, nameTextLabel;
    JButton startButton, exitButton, enterButton;
    JTextArea mainTextArea;
    JTextField inputNameField;

    Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);
    Font mediumFont = new Font("Times New Roman", Font.PLAIN, 30);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ExitScreenHandler exHandler = new ExitScreenHandler();

    public static void main(String[] args) {

        new Game();
    }

    public Game() {
        // --------------------------------------------- FRAME ---------------------------------------------------------
        window = new JFrame();
        window.setSize(820, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setResizable(false);
        window.setVisible(true);

        con = window.getContentPane();

        // --------------------------------------------- TITLE ---------------------------------------------------------
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 10, 600, 50);
        titleNamePanel.setBackground(Color.black);

        titleNameLabel = new JLabel("WARRIORS & MONSTERS");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        // --------------------------------------------- WELCOME -------------------------------------------------------
        welcomeTextPanel = new JPanel();
        welcomeTextPanel.setBounds(200, 70, 400, 25);
        welcomeTextPanel.setBackground(Color.black);

        welcomeTextLabel = new JLabel("Welcome to the Game! By: Spetzim & Dyno992");
        welcomeTextLabel.setForeground(Color.white);
        welcomeTextLabel.setFont(normalFont);

        // ------------------------------------------ ENTER YOUR NAME --------------------------------------------------
        // Text Panel
        nameTextPanel = new JPanel();
        nameTextPanel.setBounds(300, 130, 210, 40);
        nameTextPanel.setBackground(Color.blue);

        // Text Label
        nameTextLabel = new JLabel("Enter your name:");
        nameTextLabel.setForeground(Color.white);
        nameTextLabel.setFont(mediumFont);

        // -------------------------------------------- ENTER BUTTON ---------------------------------------------------
        // Panel
        enterButtonPanel = new JPanel();
        enterButtonPanel.setBounds(350, 350, 100, 40);
        enterButtonPanel.setBackground(Color.blue);

        // Button
        enterButton = new JButton("ENTER");
        enterButton.setBackground(Color.black);
        enterButton.setForeground(Color.white);
        enterButton.setFocusPainted(false);
        enterButton.setFont(normalFont);

        //------------Button Function-------------//

        // code

        //---------------------------------//

        // ----------------------------------------- Name Input Panel Field --------------------------------------------
        // Panel
        inputPanel = new JPanel();
        inputPanel.setBounds(300, 230, 210, 40);
        inputPanel.setBackground(Color.blue);


        // Field
//        inputNameField = new JTextField(8);
//        inputNameField.setBounds(300, 230, 210, 40);



        /// -------------------------------------------- START BUTTON --------------------------------------------------
        // Panel
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(350, 500, 100, 40);
        startButtonPanel.setBackground(Color.black);

        // Button
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.green);
        startButton.setFocusPainted(false);
        startButton.setFont(normalFont);

        //------------Button Function-------------//

        startButton.addActionListener(tsHandler);

        //---------------------------------//

        // -------------------------------------------- EXIT BUTTON ----------------------------------------------------
        // Panel
        exitButtonPanel = new JPanel();
        exitButtonPanel.setBounds(690, 500, 100, 40);
        exitButtonPanel.setBackground(Color.black);

        // Button
        exitButton = new JButton("EXIT");
        exitButton.setBackground(Color.black);
        exitButton.setForeground(Color.red);
        exitButton.setFocusPainted(false);
        exitButton.setFont(normalFont);

        //------------Button Function-------------//

        exitButton.addActionListener(exHandler);

        //---------------------------------//

        // ------------------------------------------------ ADDS -------------------------------------------------------
        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);

        welcomeTextPanel.add(welcomeTextLabel);
        con.add(welcomeTextPanel);

        nameTextPanel.add(nameTextLabel);
        con.add(nameTextPanel);

//        inputPanel.add(inputNameField);
        con.add(inputPanel);

        enterButtonPanel.add(enterButton);
        con.add(enterButtonPanel);

        startButtonPanel.add(startButton);
        con.add(startButtonPanel);

        exitButtonPanel.add(exitButton);
        con.add(exitButtonPanel);



    }

    public void createGameScreen() {

        welcomeTextPanel.setVisible(false);
        startButtonPanel.setVisible(false);
        enterButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.blue);

        con.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);

        mainTextPanel.add(mainTextArea);
    }

    public void exitGame() {
        System.exit(0);
    }

    public class TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {

            createGameScreen();
        }
    }

    public class ExitScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {

            exitGame();
        }
    }


}
