import javax.swing.*;
import java.awt.*;

public class Chronometre extends JFrame implements Runnable {

    Thread t;
    int mm;
    int ss;
    int ds;

    public Chronometre() {
        this.mm = 0;
        this.ss = 0;
        this.ds = 0;

        t= new Thread(this);
        t.start();
        setSize(500,500);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(100,150,250,200);
    }

    @Override
    public void run() {
        for(int i=0; i<=60; i++){
            mm++;
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            repaint();
        }
    }

    public static void main(String [] args){
        Chronometre chronometre = new Chronometre();
    }

}
