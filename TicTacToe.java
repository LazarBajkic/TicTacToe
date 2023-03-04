import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class TicTacToe extends JFrame implements MouseListener{
    
    ImageIcon O=new ImageIcon("O.png");
    ImageIcon X=new ImageIcon("X.png");
    ImageIcon row=new ImageIcon("Row.png");
    ImageIcon column=new ImageIcon("Column.png");

    JPanel background=new JPanel();

    JLabel square1=new JLabel();
    JLabel square2=new JLabel();
    JLabel square3=new JLabel();
    JLabel square4=new JLabel();
    JLabel square5=new JLabel();
    JLabel square6=new JLabel();
    JLabel square7=new JLabel();
    JLabel square8=new JLabel();
    JLabel square9=new JLabel();
    JLabel row1=new JLabel();
    JLabel row2=new JLabel();
    JLabel column1=new JLabel();
    JLabel column2=new JLabel();
    JLabel score = new JLabel();
    
    int turnCounter=0;
    int checkRowX=0;
    int checkColumnX=0;
    int checkDiagonalX=0;

    TicTacToe(){
        
        this.setSize(355,400);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        background.setSize(360, 400);
        background.setLocation(0, 0);
        background.setBackground(Color.GRAY);

        column1.setSize(20, 340);
        column1.setLocation(100,0);
        column1.setIcon(column);

        column2.setSize(20, 340);
        column2.setLocation(220,0);
        column2.setIcon(column);

        row1.setSize(340,20);
        row1.setLocation(0, 100);
        row1.setIcon(row);

        row2.setSize(340,20);
        row2.setLocation(0, 220);
        row2.setIcon(row);

        square1.setSize(100, 100);
        square1.setLocation(0,0);
        square1.addMouseListener(this);

        square2.setSize(100,100);
        square2.setLocation(120,0);
        square2.addMouseListener(this);

        square3.setSize(100,100);
        square3.setLocation(220,0);
        square3.addMouseListener(this);

        square4.setSize(100,100);
        square4.setLocation(0,120);
        square4.addMouseListener(this);

        square5.setSize(100,100);
        square5.setLocation(120,120);
        square5.addMouseListener(this);

        square6.setSize(100,100);
        square6.setLocation(220,120);
        square6.addMouseListener(this);

        square7.setSize(100,100);
        square7.setLocation(0,240);
        square7.addMouseListener(this);

        square8.setSize(100,100);
        square8.setLocation(120,240);
        square8.addMouseListener(this);

        square9.setSize(100,100);
        square9.setLocation(240,240);
        square9.addMouseListener(this);

        score.setSize(200, 30);
        score.setLocation(100, 320);
        score.setText("Turn number: "+turnCounter);

        this.add(score);
        this.add(column1);
        this.add(column2);
        this.add(row1);
        this.add(row2);
        this.add(square1);
        this.add(square2);
        this.add(square3);
        this.add(square4);
        this.add(square5);
        this.add(square6);
        this.add(square7);
        this.add(square8);
        this.add(square9);
        this.add(background);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource()==square1&&turnCounter % 2 == 0){
            square1.setIcon(O);
           }
           else if(e.getSource()==square1&&turnCounter % 2 == 1){
            square1.setIcon(X);
           }

           if(e.getSource()==square2&&turnCounter % 2 == 0){
            square2.setIcon(O);
           }
           else if(e.getSource()==square2&&turnCounter % 2 == 1){
            square2.setIcon(X);
           }

           if(e.getSource()==square3&&turnCounter % 2 == 0){
            square3.setIcon(O);
           }
           else if(e.getSource()==square3&&turnCounter % 2 == 1){
            square3.setIcon(X);
           }

           if(e.getSource()==square4&&turnCounter % 2 == 0){
            square4.setIcon(O);
           }
           else if(e.getSource()==square4&&turnCounter % 2 == 1){
            square4.setIcon(X);
           }          

           if(e.getSource()==square5&&turnCounter % 2 == 0){
            square5.setIcon(O);
           }
           else if(e.getSource()==square5&&turnCounter % 2 == 1){
            square5.setIcon(X);
           }    

           if(e.getSource()==square6&&turnCounter % 2 == 0){
            square6.setIcon(O);
           }
           else if(e.getSource()==square6&&turnCounter % 2 == 1){
            square6.setIcon(X);
           }

           if(e.getSource()==square7&&turnCounter % 2 == 0){
            square7.setIcon(O);
           }
           else if(e.getSource()==square7&&turnCounter % 2 == 1){
            square7.setIcon(X);
           }

           if(e.getSource()==square8&&turnCounter % 2 == 0){
            square8.setIcon(O);
           }
           else if(e.getSource()==square8&&turnCounter % 2 == 1){
            square8.setIcon(X);
           }

           if(e.getSource()==square9&&turnCounter % 2 == 0){
            square9.setIcon(O);
           }
           else if(e.getSource()==square9&&turnCounter % 2 == 1){
            square9.setIcon(X);
           }

           turnCounter=turnCounter+1;
           score.setText("Turn number: "+turnCounter);

           throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
           
    }

}
