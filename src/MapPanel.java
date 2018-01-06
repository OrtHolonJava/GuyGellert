
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
	private Img _pyramid;
	private Img _sphinx;
	private Img _gate;
	private Img _torch;
	private Img _statu;
	private Map _map;
	public MapPanel()
	{
		super();
		_line =15;
		_cols =37;
		_size = 50;
		_imgBackground = new Img("images\\Desert\\Sand.jpg", 0, 0, 1700, 1700);
		_blockImg = new Img("images\\Desert\\tree.png", 0, 0, 100,100 );
		_floor = new Img("images\\Desert\\SandFloor.jpg", 0, 0, 50, 50);
		_rock = new Img("images\\Desert\\rock.png", 0, 0, 150, 150);
		_water = new Img("images\\Desert\\water.jpg", 0, 0, 50, 50);
		_pyramid = new Img("images\\Desert\\pyramid2.png", 0, 0, 300, 300);
		_sphinx = new Img("images\\Desert\\sphinx.png", 0, 0, 200, 200);
		_gate = new Img("images\\Desert\\gate.png", 0, 0, 500, 500);
		_torch = new Img("images\\Desert\\torch.png", 0, 0, 200, 200);
		_statu = new Img("images\\Desert\\statu.png", 0, 0, 150, 150);
		_map = new Map(_line, _cols, "map\\Desert\\file1.xml");
		
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
