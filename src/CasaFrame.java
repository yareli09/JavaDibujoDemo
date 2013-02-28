import javax.swing.JFrame;


public class CasaFrame extends JFrame{

	public static final int DEFAULT_WIDTH =900;
	public static final int DEFAULT_HEIGTH=700;
	
	public CasaFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("Casa");
		this.setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);	
		
		Casa comp=new Casa();
		add(comp);
	}

}
