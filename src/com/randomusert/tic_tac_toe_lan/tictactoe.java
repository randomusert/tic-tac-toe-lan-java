package com.randomusert.tic_tac_toe_lan;

import java.util.Scanner;

import javax.swing.JFrame;
import java.lang.Thread;

public class tictactoe implements Runnable {
    //vars
    private String ip = "1300.1.0.3";
    private int port = 30000;
    private Scanner scanner = new Scanner(System.in);
    private JFrame frame;
    private final int WIDTH = 500;
    private final int HEIGHT = 590;
    private Thread thread;

    private Painter painter;
    public tictactoe() {

    }
    public void run() {

    }
    @SuppressWarnings("unused")
     public static void main(String[] args) {
        tictactoe tictactoe = new tictactoe();
    }
}
