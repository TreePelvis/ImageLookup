package ss.simpleimagelookup;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageView implements ImageObserver, ActionListener {

	ImageLookupModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	JLabel imageLabel;
	JFrame controlFrame;
	JPanel controlPanel;
	JTextField imageTextField;
	JButton setImageButton;
	
	
	public ImageView(ControllerInterface controller, ImageLookupModelInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver(this);
	}
	
	public void creatView() {
		viewPanel = new JPanel();
		viewFrame = new JFrame("View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(new Dimension(300,300));
		imageLabel = new JLabel("", SwingConstants.CENTER);
		viewPanel.add(imageLabel);	
		viewFrame.add(viewPanel, BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}
	
	public void createControls() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		controlFrame = new JFrame("Controls");
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.setSize(new Dimension(300,300));
		controlPanel = new JPanel(new GridLayout(2,1));
		imageTextField = new JTextField(20);
		setImageButton = new JButton("Look Up!");
		setImageButton.addActionListener(this);
		controlPanel.add(imageTextField);
		controlPanel.add(setImageButton);
		controlFrame.add(controlPanel, BorderLayout.CENTER);
		controlFrame.pack();
		controlFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == setImageButton)
			controller.setImage(imageTextField.getText());
	}
	
	@Override
	public void updateImage() {
		String imageName = model.getImageName();
		
		
	}

}
