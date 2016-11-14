package hipster.view;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import hipster.controller.HipsterController;



public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private JButton myButton;
	private JComboBox dropDown;
	private JLabel wordsLabel;
	private SpringLayout baseLayout;
	
	
	public HipsterPanel(HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		myButton = new JButton("Click here!!");
		wordsLabel = new JLabel("such words!");
		baseLayout = new SpringLayout();
		dropDown = new JComboBox(baseController.getHipsters());
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(myButton);
		this.add(wordsLabel);
		this.add(dropDown);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 6, SpringLayout.SOUTH, myButton);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 112, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, 70, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, wordsLabel, 5, SpringLayout.NORTH, myButton);
		baseLayout.putConstraint(SpringLayout.WEST, wordsLabel, 20, SpringLayout.EAST, myButton);
	}
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String selectedText = baseController.getHipsters()[dropDown.getSelectedIndex()].toString();
				wordsLabel.setText(selectedText);
			}
		});
		
	}
}
