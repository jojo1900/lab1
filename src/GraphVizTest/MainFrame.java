package GraphVizTest;

import java.awt.Component;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener
{
	controler a;
	private static final long serialVersionUID = 1L;
	JButton creatgraph =new JButton("����ͼ");
	JButton show = new JButton("չʾͼ");
	JButton bridge = new JButton("�ŽӴ�");
	JButton creat = new JButton("���ı�");
	JButton shortest = new JButton("���·��");
	JButton creatrandom=new JButton("��������·��");
	JButton random = new JButton("��ʼ�������");
	JButton stop=new JButton("ֹͣ");
    MainFrame() 
    {
    	creatgraph=new JButton("����ͼ");
    	show = new JButton("չʾͼ");
		bridge = new JButton("�ŽӴ�");
		creat = new JButton("���ı�");
		shortest = new JButton("���·��");
		creatrandom=new JButton("��������·��");
		random = new JButton("��ʼ�������");
		stop=new JButton("ֹͣ");
		setLayout(null);
		setVisible(true);
		setSize(1200, 1000);
		creatgraph.setBounds(30, 30, 120, 50);
		show.setBounds(30, 100, 120, 50);
		bridge.setBounds(30, 170, 120, 50);
		creat.setBounds(30, 240, 120, 50);
		shortest.setBounds(30, 310, 120, 50);
		creatrandom.setBounds(30, 380, 120, 50);
		random.setBounds(30, 450, 120, 50);
		stop.setBounds(30, 520, 120, 50);
		creatgraph.addActionListener(this);
		show.addActionListener(this);
		bridge.addActionListener(this);
		creat.addActionListener(this);
		shortest.addActionListener(this);
		creatrandom.addActionListener(this);
		random.addActionListener(this);
		stop.addActionListener(this);
		add(creatgraph);
		add(show);
	    add(bridge);
	    add(creat);
	    add(shortest);
	    add(creatrandom);
	    add(random);
	    add(stop);
	    setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
	}
    
    public void actionPerformed(ActionEvent e) 
   	{
   		Object source = e.getSource();
   		if(source==creatgraph)
   		{
   			a=new controler("creatgraph");
   		}
   		else if (source==show) 
   		{
            new controler("show");
   			ImageIcon image = new ImageIcon("D:\\graph\\gif.gif");
   			JLabel label = new JLabel(image);
   			JScrollPane pane=new JScrollPane(label);
   			pane.setBounds(160,10,1000, 900);
   		    pane.setVisible(true);
   			add(pane);
   			revalidate();
   		    repaint();
   		}
   		else if (source==bridge) 
   		{
   			a.control("bridge");
   		}
   		else if(source==creat)
   		{
   		    a.control("creat");
   		}
   		else if(source==shortest)
   		{
   			 a.control("shortest");
   		}
   		else if(source==creatrandom)
   		{
   			a.control("creatrandom");
   		}
   		else if(source==random)
   		{
   			a.control("random");
   	    }
   		else if(source==stop)
   		{
   		    a.control("stop");
   		}
   	}
	public static void main(String[] args) 
	{
       new MainFrame();
	}
}
