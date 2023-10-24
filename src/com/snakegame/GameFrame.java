package com.snakegame;

import javax.swing.*;

public class GameFrame extends JFrame {

    public static final String TITLE = "Snake";

    GameFrame() {
        GamePanel panel = new GamePanel();

        this.add(panel);
        this.setTitle(TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

}
