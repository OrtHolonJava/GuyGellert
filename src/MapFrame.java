import javax.swing.JFrame;

public class MapFrame extends JFrame {

	private MapPanel _mp;
	private MapSnowPanel _msp;
	private MapMoutainsPanel _mmp;
	public MapFrame()
	{
		super();
		_mp = new MapPanel();
		_msp = new MapSnowPanel();
		_mmp = new MapMoutainsPanel();
		//add(_mp);
		//add(_msp);
		add(_mmp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 700);
		setVisible(true);
	}
	
}
