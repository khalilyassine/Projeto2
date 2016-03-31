package visao;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;



public class Screen extends JPanel  {

	private static final long serialVersionUID = 1L;

	private int width;
	private int height;


	public Screen (){
		this.width = 700;
		this.height = 700;
		
		setPreferredSize(new Dimension(this.width,this.height));
	}
	
}