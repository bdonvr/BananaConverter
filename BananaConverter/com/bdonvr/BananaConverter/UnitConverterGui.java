package com.bdonvr.BananaConverter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class UnitConverterGui extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final String WINDOW_TITLE = "Banana Converter";
	private static final String MEASUREMENT_TYPE = "Measurement to convert";
	private static final String BUTTON_TEXT_CONVERT = "Convert";
	private static final String BUTTON_TEXT_CLEAR = "Clear";	
	private static final int MAIN_WIN_SIZE_X = 800;
	private static final int MAIN_WIN_SIZE_Y = 1000;
	private static final int NUM_LABELS_FIELDS = 10;
	//private static final int TEXT_FIELD_WIDTH=5;

	private boolean initFlag;
	private MeasurementFactory measurementFactory;
	private JComboBox jcbMeasurementType;
	private JButton jbtConvert;
	private JLabel[] jlbLabels;
	private JTextField[] jtfFields;
	private JPanel jplLabels;
	private JPanel jplFields;

	private ComboHandler comboHandler;
	private TextHandler textHandler;
	private ButtonHandler buttonHandler;

	public UnitConverterGui(MeasurementFactory measurementFactory)
	{
		this();
		this.measurementFactory = measurementFactory;
		this.initFlag = false;
	}
	
	public static void ErrorMessage(String error){
		JOptionPane.showMessageDialog(null, error);
	}

	// Disallow the default constructor
	private UnitConverterGui()
	{
	}

	public void init()
	{
		if(initFlag)
		{
			return;
		}
		initFlag = true;

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(WINDOW_TITLE);
		this.setSize(MAIN_WIN_SIZE_X, MAIN_WIN_SIZE_Y);
		this.setResizable(true);

		comboHandler = new ComboHandler();
		textHandler = new TextHandler();
		buttonHandler = new ButtonHandler();

		//
		// Combo box
		//
		jcbMeasurementType = new JComboBox(measurementFactory.getEntries().toArray());
		jcbMeasurementType.addActionListener(comboHandler);

		//
		// Panels and borders
		//
		jplLabels = new JPanel();
		jplFields = new JPanel();
		JPanel jplMain = new JPanel();
		JPanel jplCombo = new JPanel();
		JPanel jplLabelsFields = new JPanel();
		JPanel jplButtons = new JPanel();
		Border spacedBorder = BorderFactory.createEmptyBorder(10,10,10,10);

		//
		// Labels and Fields
		//
		jlbLabels = new JLabel[NUM_LABELS_FIELDS];
		jtfFields = new JTextField[NUM_LABELS_FIELDS];
		jplLabels.setLayout(new BoxLayout(jplLabels, BoxLayout.Y_AXIS));
		jplFields.setLayout(new BoxLayout(jplFields, BoxLayout.Y_AXIS));
		for(int i = 0; i < NUM_LABELS_FIELDS; i++)
		{
			jlbLabels[i] = new JLabel();
			jlbLabels[i].setName("jlbLabel"+i);

			jtfFields[i] = new JTextField();
			jtfFields[i].setName("jtfField"+i);
			jtfFields[i].addActionListener(textHandler);
			//jtfFields[i].addCaretListener(myHandler);
		}
		setLabelsFields((String) jcbMeasurementType.getSelectedItem());
		
		//
		// Buttons
		//
		jbtConvert = new JButton(BUTTON_TEXT_CONVERT);
		jbtConvert.setActionCommand(BUTTON_TEXT_CONVERT);
		jbtConvert.addActionListener(buttonHandler);

		JButton jbtClear = new JButton(BUTTON_TEXT_CLEAR);
		jbtClear.setActionCommand(BUTTON_TEXT_CLEAR);
		jbtClear.addActionListener(buttonHandler);

		//
		// Populate all the panels
		//
		jplCombo.setLayout(new BoxLayout(jplCombo, BoxLayout.Y_AXIS));
		jplCombo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), MEASUREMENT_TYPE));
		jplCombo.add(jcbMeasurementType);

		jplLabelsFields.setLayout(new BoxLayout(jplLabelsFields, BoxLayout.X_AXIS));
		jplLabelsFields.setBorder(spacedBorder);
		jplLabelsFields.add(jplLabels);
		jplLabelsFields.add(Box.createRigidArea(new Dimension(10, 0)));
		jplLabelsFields.add(jplFields);

		//jplButtons.setAlignmentX(Component.CENTER_ALIGNMENT);
		jplButtons.setLayout(new BoxLayout(jplButtons, BoxLayout.X_AXIS));
		jplButtons.setBorder(spacedBorder);
		jplButtons.add(Box.createRigidArea(new Dimension(10, 0)));
		jplButtons.add(jbtConvert);
		jplButtons.add(Box.createRigidArea(new Dimension(15, 0)));
		jplButtons.add(jbtClear);
		jplButtons.add(Box.createRigidArea(new Dimension(10, 0)));

		jplMain.setLayout(new BoxLayout(jplMain, BoxLayout.Y_AXIS));
		jplMain.setBorder(spacedBorder);
		jplMain.add(jplCombo);
		jplMain.add(jplLabelsFields);
		jplMain.add(jplButtons);

		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.getContentPane().add(jplMain);
		this.pack();
		this.setVisible(true);
	}

	private void setLabelsFields(final String measureType)
	{
		// First remove the labels and fields from their panels
		jplLabels.removeAll();
		jplFields.removeAll();

		Measurement meas = measurementFactory.getMeasurement(measureType);
		Set<String> measUnitNames = meas.getMeasurementUnitNames();
		Iterator<String> iter = measUnitNames.iterator();
		int i;
		for(i = 0; iter.hasNext(); i++)
		{
			jlbLabels[i].setText(iter.next());
			jplLabels.add(jlbLabels[i]);
			jplLabels.add(Box.createRigidArea(new Dimension(0, 5)));

			jtfFields[i].setText("");
			jtfFields[i].setEditable(true);
			jplFields.add(jtfFields[i]);
		}

		this.pack();
	}

	private void clearFields(boolean editable)
	{
		for(int i = 0; i < NUM_LABELS_FIELDS; i++)
		{
			jtfFields[i].setText("");
			jtfFields[i].setEditable(editable);
		}
		
		jbtConvert.setEnabled(true);
	}

/* Use this to capture mouse selection, etc
	private class MyHandler implements CaretListener
	{
		public void caretUpdate(CaretEvent arg0)
		{
			System.out.println("myHandler called");
		}
	}
*/

	private class ComboHandler implements ActionListener
	{
		String lastCmbType = null;

		public void actionPerformed(ActionEvent e)
		{
			JComboBox jcmbType = (JComboBox) e.getSource();
			String cmbType = (String) jcmbType.getSelectedItem();

			// Dont do anything if the selection didnt change
			if(lastCmbType != null)
			{
				if(cmbType.equals(lastCmbType))
				{
					return;
				}
			}
			lastCmbType = cmbType;
			setLabelsFields(cmbType);
			jbtConvert.setEnabled(true);
		}
	}

	private class TextHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Do the same as though the Convert button were pressed
			ActionEvent event = new ActionEvent(e.getSource(), e.getID(), BUTTON_TEXT_CONVERT);
			buttonHandler.actionPerformed(event);
		}
	}

	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(BUTTON_TEXT_CLEAR.equals(e.getActionCommand()))
			{
				clearFields(true);
			}
			else if(BUTTON_TEXT_CONVERT.equals(e.getActionCommand()))
			{
				String unitName = null;
				String value = null;
				
				jbtConvert.setEnabled(false);

				for(int i = 0; i < NUM_LABELS_FIELDS; i++)
				{
					jtfFields[i].setEditable(false);
					String str = jtfFields[i].getText();
					if(str != null && value == null)
					{
						if(str.length() > 0)
						{
							value = str;
							unitName = jlbLabels[i].getText();
						}
					}
				}

				if(unitName == null || value == null)
				{
					// Nothing was entered, set all fields editable again
					clearFields(true);
					return;
				}

				Measurement meas = 
					measurementFactory.getMeasurement(
							(String) jcbMeasurementType.getSelectedItem());
				MeasurementUnit unit = meas.findUnit(unitName);
				double refValue = 0.0;
				try {
					refValue = unit.convertToReference(Double.parseDouble(value));
				}
				catch(NumberFormatException ex) {
					ErrorMessage("A valid number must be entered: " + ex.getMessage());
					clearFields(true);
					return;
				}

				// Now Iterate over the MeasurementUnits in 
				// the Measurement and set the field values
				Set<String> unitsSet = meas.getMeasurementUnitNames();
				Iterator<String> unitsIter = unitsSet.iterator();
				
				for(int i = 0; unitsIter.hasNext(); i++)
				{
					MeasurementUnit mu = meas.findUnit(unitsIter.next());
					jlbLabels[i].setName(mu.getName());
					jtfFields[i].setText(
							meas.formatUnitValue(
									mu.convertFromReference(refValue)));
				}
			}
		}
	}
}
