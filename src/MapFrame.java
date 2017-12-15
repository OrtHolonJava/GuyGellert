import javax.swing.JFrame;

public class MapFrame extends JFrame {

	private MapPanel _mp;
	private MapSnowPanel _msp;
	public MapFrame()
	{
		super();
		_mp = new MapPanel();
		_msp = new MapSnowPanel();
		//add(_mp);
		add(_msp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 700);
		setVisible(true);
	}
	
}
