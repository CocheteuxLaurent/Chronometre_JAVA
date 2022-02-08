import javax.swing.*;
import java.awt.*;

public class Calculatrice extends JFrame implements Runnable {

    Thread t;
    int mm;
    int ss;
    int ds;

    public Calculatrice() {
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
        g.drawRect(100,150,150,200);
        g.drawRect(115,170,120,40);
        g.drawRect(115,220,120,120);
        g.drawString("1",120,250);
        g.drawString("2",150,250);
        g.drawString("3",185,250);
        g.drawString("4",220,250);
        g.drawString("5",120,280);
        g.drawString("6",150,280);
        g.drawString("7",185,280);
        g.drawString("8",220,280);
        g.drawString("9",120,310);
        g.drawString("+",150,310);
        g.drawString("-",185,310);





        //ligne horizontale
        g.drawLine(145,340,145,220);
        g.drawLine(175,340,175,220);
        g.drawLine(210,340,210,220);

        // premiere ligne verticale
        g.drawLine(115,250,235,250);

        // deuxième ligne verticale
        g.drawLine(115,280,235,280);

        // troisième ligne verticale
        g.drawLine(115,310,235,310);

    }

    @Override
    public void run() {

            repaint();

    }

    public static void main(String [] args){
        Calculatrice calculatrice = new Calculatrice();
    }

}
