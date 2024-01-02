/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/* Name: Group 19
 Member names 
Đinh Hữu Tiến	 ITCSIU21111
Nguyễn Quốc Hưng ITITIU21211
Ông Chí Viễn	 ITITIU21344

*/
package Canvas;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

public class BoardGraphics extends JLayeredPane {
	GridLayout grid;
	
	public BoardGraphics(GridLayout grid) {
		this.grid=grid;
		this.setLayout(grid);

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		 Graphics2D g2d = (Graphics2D) g;
		Stroke stroke1 = new BasicStroke(5f);
		g2d.setStroke(stroke1);
		
        int x = 10;
//        g2d.drawRect(x, x, this.getWidth()-x, this.getHeight()-x);
        int widthCell = (int)((this.getWidth()-20)/3);
        int heightCell =(int)((this.getHeight()-20)/3);
        for (int i = x+widthCell; i <= this.getWidth()-20; i += widthCell) {
            g2d.drawLine(i, x, i, this.getHeight()-20+x);
        }

        for (int i = x+heightCell; i <= this.getHeight()-20; i += heightCell) {
            g2d.drawLine(x, i, this.getWidth()-20+x, i);
        }
    }
	
public static void main(String[] args) {

}

}
