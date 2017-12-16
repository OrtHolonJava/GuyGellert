
import java.awt.Graphics;

import javax.swing.JPanel;

import images.Img;
public class MapMoutainsPanel extends JPanel {

	private int _line;
	private int _cols;
	private int _size;
	private Img _imgBackground;
	private Img _blockImg;
	private Img _floor;
	private  Img _snowman;
	private  Img _water;
	private Img _pyramid;
	private Img _sphinx;
	private Img _gate;
	private Img _torch;
	private Img _statu;
	private Map _map;
	public MapMoutainsPanel()
	{
		super();
		_line =15;
		_cols =37;
		_size = 50;
		_imgBackground = new Img("images\\Moutains\\Moutain.jpg", 0, 0, 1700, 750);
		/**
		_floor = new Img("images\\Moutains\\IceFloor.jpg", 0, 0, 50, 50);
		
		
		_blockImg = new Img("images\\Moutains\\tree.png", 0, 0, 100,100 );
		
		_snowman = new Img("images\\Moutains\\Snowman.png", 0, 0, 50, 50);
		
		_water = new Img("images\\Moutains\\water.jpg", 0, 0, 50, 50);
		_pyramid = new Img("images\\Moutains\\pyramid.png", 0, 0, 300, 300);
		_sphinx = new Img("images\\Moutains\\sphinx.png", 0, 0, 200, 200);
		_gate = new Img("images\\Moutains\\gate.png", 0, 0, 100, 100);
		_torch = new Img("images\\Moutains\\torch.png", 0, 0, 200, 200);
		_statu = new Img("images\\Moutains\\statu.png", 0, 0, 100, 100);
		**/
		_map = new Map(_line, _cols, "map\\Moutains\\file1.xml");
		
		
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
					_snowman.setImgCords((j * _size), (i) * _size);
					_snowman.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 4)
				{
					_water.setImgCords((j * _size), (i) * _size);
					_water.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 5)
				{
					_pyramid.setImgCords((j * _size), (i) * _size);
					_pyramid.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 6)
				{
					_sphinx.setImgCords((j * _size), (i) * _size);
					_sphinx.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 7)
				{
					_gate.setImgCords((j * _size), (i) * _size);
					_gate.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 8)
				{
					_torch.setImgCords((j * _size), (i) * _size);
					_torch.drawImg(g);
				}
				else if(_map.get_map()[i][j]  == 9)
				{
					_statu.setImgCords((j * _size), (i) * _size);
					_statu.drawImg(g);
				}
			}
		}
	}
	
	
}
