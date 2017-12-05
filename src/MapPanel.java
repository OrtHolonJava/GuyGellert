
import java.awt.Graphics;

import javax.swing.JPanel;

import images.Img;
public class MapPanel extends JPanel {

	private int _line;
	private int _cols;
	private int _size;
	private Img _imgBackground;
	private Img _blockImg;
	private Img _floor;
	private  Img _rock;
	private  Img _water;
	private Map _map;
	public MapPanel()
	{
		super();
		_line =15;
		_cols =37;
		_size = 50;
		_imgBackground = new Img("images\\Sand.jpg", 0, 0, 1500, 1500);
		_blockImg = new Img("images\\tree.png", 0, 0, 50,50 );
		_floor = new Img("images\\SandFloor.jpg", 0, 0, 50, 50);
		_rock = new Img("images\\Rock.jpg", 0, 0, 50, 50);
		_water = new Img("images\\water.jpg", 0, 0, 50, 50);
		_map = new Map(_line, _cols, "map\\file1.xml");
		_map.get_map();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		_imgBackground.drawImg(g);
		for (int i=0; i< _line; i++)
		{
			for(int j=0; j<_cols; j++)
			{
				if (_map.get_map()[i][j]  == 1) // BrownBlock
				{
					_blockImg.setImgCords((j * _size), (i) * _size);
					_blockImg.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 2)
				{
					_floor.setImgCords((j * _size), (i) * _size);
					_floor.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 3)
				{
					_rock.setImgCords((j * _size), (i) * _size);
					_rock.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 4)
				{
					_water.setImgCords((j * _size), (i) * _size);
					_water.drawImg(g);
				}
			}
		}
	}
	
	
}
