package control;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;

public class ColorChooserDemo2 extends JPanel implements ActionListener, ChangeListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel banner;
	public JColorChooser tcc;

	public ColorChooserDemo2() {
		super(new BorderLayout());
		banner = new JLabel("Welcome to the Tutorial Zone!", JLabel.CENTER);
		banner.setForeground(Color.yellow);
		banner.setBackground(Color.blue);
		banner.setOpaque(true);
		banner.setFont(new Font("SansSerif", Font.BOLD, 24));
		banner.setPreferredSize(new Dimension(100, 65));

		JPanel bannerPanel = new JPanel(new BorderLayout());
		bannerPanel.add(banner, BorderLayout.CENTER);
		bannerPanel.setBorder(BorderFactory.createTitledBorder("Banner"));
		JPanel panel = new JPanel(); // use FlowLayout
		JButton bcc = new JButton("Show Color Chooser...");
		bcc.addActionListener(this);
		panel.add(bcc);
		panel.setBorder(BorderFactory.createTitledBorder("Choose Background Color"));
		tcc = new JColorChooser();
		tcc.getSelectionModel().addChangeListener(this);
		tcc.setBorder(BorderFactory.createTitledBorder("Choose Text Color"));
		tcc.setPreviewPanel(new JPanel());
		AbstractColorChooserPanel panels[] = { new CrayonPanel() };
		tcc.setChooserPanels(panels);
		tcc.setColor(banner.getForeground());

		add(bannerPanel, BorderLayout.PAGE_START);
		add(panel, BorderLayout.CENTER);
		add(tcc, BorderLayout.PAGE_END);

	}

	public void actionPerformed(ActionEvent e) {
		Color newColor = JColorChooser.showDialog(ColorChooserDemo2.this, "Choose Background Color",
				banner.getBackground());
		if (newColor != null) {
			banner.setBackground(newColor);
		}
	}

	public void stateChanged(ChangeEvent e) {
		Color newColor = tcc.getColor();
		banner.setForeground(newColor);
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("ColorChooserDemo2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane = new ColorChooserDemo2();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}