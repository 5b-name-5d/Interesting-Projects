

import java.util.*;
import java.lang.*;
import java.io.*;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;



class Main extends JFrame{
    public Main(){
        initUI();
    }
    private void initUI(){
        
        JButton exit = new JButton("Exit");
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        
        JButton logIn = new JButton("Sign In");
        logIn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                
            }
        });
        createLayout(logIn);
        
        JButton switchUser = new JButton("Switch User");
        switchUser.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                
            }
        });
        JButton guest = new JButton("Use Guest Account");
        guest.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                
            }
        });
        
        setTitle("OS V.1");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void createLayout(JComponent... arg){
        
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
        );
        gl.setVerticalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
        );
    }
    public static void main(String[] args)throws java.lang.Exception{
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                Main mn = new Main();
                mn.setVisible(true);
            }
        });
    }
}
