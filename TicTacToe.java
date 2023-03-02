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
        square1.setIcon(O);
        square1.addMouseListener(this);

        square2.setSize(100,100);
        square2.setLocation(120,0);

        square3.setSize(100,100);
        square3.setLocation(220,0);

        square4.setSize(100,100);
        square4.setLocation(0,120);

        square5.setSize(100,100);
        square5.setLocation(120,120);
        square5.setIcon(O);

        square6.setSize(100,100);
        square6.setLocation(220,120);

        square7.setSize(100,100);
        square7.setLocation(0,240);
        square7.setIcon(O);

        square8.setSize(100,100);
        square8.setLocation(120,240);
        square8.setIcon(O);

        square9.setSize(100,100);
        square9.setLocation(240,240);
        square9.setIcon(O);

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

}
