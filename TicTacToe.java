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
    JLabel winner = new JLabel();
    
    int turnCounter=0;
    
    int check1RowX=0;
    int check2RowX=0;
    int check3RowX=0;
    int check1ColumnX=0;
    int check2ColumnX=0;
    int check3ColumnX=0;
    int check1DiagonalX=0;
    int check2DiagonalX=0;
    
    int check1RowO=0;
    int check2RowO=0;
    int check3RowO=0;
    int check1ColumnO=0;
    int check2ColumnO=0;
    int check3ColumnO=0;
    int check1DiagonalO=0;
    int check2DiagonalO=0;
    
    int placedMark=0;

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

        winner.setSize(200, 20);
        winner.setLocation(100, 350);

        this.add(winner);
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
        
         ////////////////////////////////////////////////////////////////////////////////////////////////////

        if(e.getSource()==square1&&turnCounter % 2 == 0){
            square1.setIcon(O);
            placedMark=1;
            square1.removeMouseListener(this);
           }
           else if(e.getSource()==square1&&turnCounter % 2 == 1){
            square1.setIcon(X);
            placedMark=2;
            square1.removeMouseListener(this);
           }

           if(e.getSource()==square1&&placedMark==2){
            check1ColumnX++;
            check1RowX++;
            check1DiagonalX++;
           }else if(e.getSource()==square1&&placedMark==1){
            check1ColumnO++;
            check1RowO++;
            check1DiagonalO++;
           }

            ////////////////////////////////////////////////////////////////////////////////////////////////////

           if(e.getSource()==square2&&turnCounter % 2 == 0){
            square2.setIcon(O);
            placedMark=1;
            square2.removeMouseListener(this);
           }
           else if(e.getSource()==square2&&turnCounter % 2 == 1){
            square2.setIcon(X);
            placedMark=2;
            square2.removeMouseListener(this);
           }

           if(e.getSource()==square2&&placedMark==2){
            check2ColumnX++;
            check1RowX++;
           }
           else if(e.getSource()==square2&&placedMark==1){
            check2ColumnO++;
            check1RowO++;
           }

            ////////////////////////////////////////////////////////////////////////////////////////////////////

           if(e.getSource()==square3&&turnCounter % 2 == 0){
            square3.setIcon(O);
            placedMark=1;
            square3.removeMouseListener(this);
           }
           else if(e.getSource()==square3&&turnCounter % 2 == 1){
            square3.setIcon(X);
            placedMark=2;
            square3.removeMouseListener(this);
           }

           if(e.getSource()==square3&&placedMark==2){
            check3ColumnX++;
            check1RowX++;
            check2DiagonalX++;
           }
           else if(e.getSource()==square3&&placedMark==1){
            check3ColumnO++;
            check1RowO++;
            check2DiagonalO++;
           }

            ////////////////////////////////////////////////////////////////////////////////////////////////////

           if(e.getSource()==square4&&turnCounter % 2 == 0){
            square4.setIcon(O);
            placedMark=1;
            square4.removeMouseListener(this);
           }
           else if(e.getSource()==square4&&turnCounter % 2 == 1){
            square4.setIcon(X);
            placedMark=2;
            square4.removeMouseListener(this);
           }          

           if(e.getSource()==square4&&placedMark==2){
            check1ColumnX++;
            check2RowX++;
           }
           else if(e.getSource()==square4&&placedMark==1){
            check1ColumnO++;
            check2RowO++;
           }

            ////////////////////////////////////////////////////////////////////////////////////////////////////

           if(e.getSource()==square5&&turnCounter % 2 == 0){
            square5.setIcon(O);
            placedMark=1;
            square5.removeMouseListener(this);
           }
           else if(e.getSource()==square5&&turnCounter % 2 == 1){
            square5.setIcon(X);
            placedMark=2;
            square5.removeMouseListener(this);
           }
           
           if(e.getSource()==square5&&placedMark==2){
            check2ColumnX++;
            check2RowX++;
            check1DiagonalX++;
            check2DiagonalX++;
           }
           else if(e.getSource()==square5&&placedMark==1){
            check2ColumnO++;
            check2RowO++;
            check1DiagonalO++;
            check2DiagonalO++;
           }

           ////////////////////////////////////////////////////////////////////////////////////////////////////

           if(e.getSource()==square6&&turnCounter % 2 == 0){
            square6.setIcon(O);
            placedMark=1;
            square6.removeMouseListener(this);
           }
           else if(e.getSource()==square6&&turnCounter % 2 == 1){
            square6.setIcon(X);
            placedMark=2;
            square6.removeMouseListener(this);
           }

           if(e.getSource()==square6&&placedMark==2){
            check3ColumnX++;
            check2RowX++;
           }
           else if(e.getSource()==square6&&placedMark==1){
            check3ColumnO++;
            check2RowO++;
           }

            ////////////////////////////////////////////////////////////////////////////////////////////////////

           if(e.getSource()==square7&&turnCounter % 2 == 0){
            square7.setIcon(O);
            placedMark=1;
            square7.removeMouseListener(this);
           }
           else if(e.getSource()==square7&&turnCounter % 2 == 1){
            square7.setIcon(X);
            placedMark=2;
            square7.removeMouseListener(this);
           }

           if(e.getSource()==square7&&placedMark==2){
            check1ColumnX++;
            check3RowX++;
            check2DiagonalX++;
           }
           else if(e.getSource()==square7&&placedMark==1){
            check1ColumnO++;
            check3RowO++;
            check2DiagonalO++;
           }

            ////////////////////////////////////////////////////////////////////////////////////////////////////


           if(e.getSource()==square8&&turnCounter % 2 == 0){
            square8.setIcon(O);
            placedMark=1;
            square8.removeMouseListener(this);
           }
           else if(e.getSource()==square8&&turnCounter % 2 == 1){
            square8.setIcon(X);
            placedMark=2;
            square8.removeMouseListener(this);
           }

           if(e.getSource()==square8&&placedMark==2){
            check2ColumnX++;
            check3RowX++;
           }
           else if(e.getSource()==square8&&placedMark==1){
            check2ColumnO++;
            check3RowO++;
           }

            ////////////////////////////////////////////////////////////////////////////////////////////////////

           if(e.getSource()==square9&&turnCounter % 2 == 0){
            square9.setIcon(O);
            placedMark=1;
            square9.removeMouseListener(this);
           }
           else if(e.getSource()==square9&&turnCounter % 2 == 1){
            square9.setIcon(X);
            placedMark=2;
            square9.removeMouseListener(this);
           }

           if(e.getSource()==square9&&placedMark==2){
            check3ColumnX++;
            check3RowX++;
            check1DiagonalX++;
           }
           else if(e.getSource()==square9&&placedMark==1){
            check3ColumnO++;
            check3RowO++;
            check1DiagonalO++;
           }

             ////////////////////////////////////////////////////////////////////////////////////////////////////


           if(check1ColumnX==3||check1DiagonalX==3||check1RowX==3||check2ColumnX==3||check2DiagonalX==3||check2RowX==3||check3ColumnX==3||check3RowX==3){
            winner.setText("Player X wins");
            square1.removeMouseListener(this);
            square2.removeMouseListener(this);
            square3.removeMouseListener(this);
            square4.removeMouseListener(this);
            square5.removeMouseListener(this);
            square6.removeMouseListener(this);
            square7.removeMouseListener(this);
            square8.removeMouseListener(this);
            square9.removeMouseListener(this);
           }
           else if(check1ColumnO==3||check1DiagonalO==3||check1RowO==3||check2ColumnO==3||check2DiagonalO==3||check2RowO==3||check3ColumnO==3||check3RowO==3){
            winner.setText("Player O wins");
            square1.removeMouseListener(this);
            square2.removeMouseListener(this);
            square3.removeMouseListener(this);
            square4.removeMouseListener(this);
            square5.removeMouseListener(this);
            square6.removeMouseListener(this);
            square7.removeMouseListener(this);
            square8.removeMouseListener(this);
            square9.removeMouseListener(this);
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
