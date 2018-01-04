import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MapFrame extends JFrame {

	private MapPanel _mp;
	private MapSnowPanel _msp;
	private MapMoutainsPanel _mmp;
	private MapCityPanel _mcp;
	private MapJunglePanel _mjp;
	private MapSavanaPanel _msap;
	public MapFrame()
	{
		super();

		_mp = new MapPanel();
		_msp = new MapSnowPanel();
		_mmp = new MapMoutainsPanel();
		_mcp = new MapCityPanel();
		_mjp = new MapJunglePanel();
		_msap = new MapSavanaPanel();

		//add(_mp);
		//add(_msp);
		//add(_mmp);
		//add(_mcp);
		add(_mjp);
		//add(_msap);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 700);
		setVisible(true);
	}
	public void showLoader(){
		URL url = this.getClass().getResource("images\\Moutains\\BackgroundMoutains.gif");
		Icon icon = new ImageIcon(url);
		JLabel label = new JLabel(icon);
		//super.setUndecorated(true);
		super.getContentPane().add(label);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.pack();
		super.setLocationRelativeTo(null);
		super.setVisible(true);
	}

}
