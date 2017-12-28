import javax.swing.JFrame;

public class MapFrame extends JFrame {

	private MapPanel _mp;
	private MapSnowPanel _msp;
	private MapMoutainsPanel _mmp;
	private MapCityPanel _mcp;
	private MapJunglePanel _mjp;
	public MapFrame()
	{
		super();
		
		_mp = new MapPanel();
		_msp = new MapSnowPanel();
		_mmp = new MapMoutainsPanel();
		_mcp = new MapCityPanel();
		_mjp = new MapJunglePanel();
		//add(_mp);
		//add(_msp);
		//add(_mmp);
		//add(_mcp);
		add(_mjp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 700);
		setVisible(true);
	}
	
}
