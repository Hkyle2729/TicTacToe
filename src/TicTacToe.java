
import javax.swing.JApplet;
import java.awt.Graphics;

public class TicTacToe extends JApplet {
    public void paint(Graphics canvas) {
      canvas.drawLine(80,0,80,240);
      canvas.drawLine(170,0,170,240);
      canvas.drawLine(0,70,270,70);
      canvas.drawLine(0,160,270,160);
      canvas.drawLine(0,0,79,69);
      canvas.drawLine(80,0,0,69);
      canvas.drawLine(79,160,171,69);
      canvas.drawLine(80,70,170,160);
      canvas.drawLine(180,250,260,160);
      canvas.drawLine(250,250,200,170);
      canvas.drawOval(0,80,70,70);
      canvas.drawOval(0,180,70,70);
      canvas.drawOval(90,180,70,70);
      canvas.drawOval(180,0,70,70);
      canvas.drawLine(0,0,260,250);

    }

}
