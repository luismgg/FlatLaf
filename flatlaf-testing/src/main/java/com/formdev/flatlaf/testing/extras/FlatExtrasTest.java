/*
 * Copyright 2019 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf.testing.extras;

import javax.swing.*;
import com.formdev.flatlaf.extras.*;
import com.formdev.flatlaf.testing.*;
import net.miginfocom.swing.*;

/**
 * @author Karl Tauber
 */
public class FlatExtrasTest
	extends FlatTestPanel
{
	public static void main( String[] args ) {
		SwingUtilities.invokeLater( () -> {
			FlatTestFrame frame = FlatTestFrame.create( args, "FlatExtrasTest" );
			frame.showFrame( FlatExtrasTest::new );
		} );
	}

	public FlatExtrasTest() {
		initComponents();

		triStateLabel1.setText( triStateCheckBox1.getState().toString() );
		triStateLabel2.setText( triStateCheckBox2.getState().toString() );

		addSVGIcon( "actions/copy.svg" );
		addSVGIcon( "actions/colors.svg" );
		addSVGIcon( "actions/execute.svg" );
		addSVGIcon( "actions/suspend.svg" );
		addSVGIcon( "actions/intentionBulb.svg" );
		addSVGIcon( "actions/quickfixOffBulb.svg" );

		addSVGIcon( "objects/abstractClass.svg" );
		addSVGIcon( "objects/abstractMethod.svg" );
		addSVGIcon( "objects/annotationtype.svg" );
		addSVGIcon( "objects/annotationtype.svg" );
		addSVGIcon( "objects/css.svg" );
		addSVGIcon( "objects/javaScript.svg" );
		addSVGIcon( "objects/xhtml.svg" );

		addSVGIcon( "errorDialog.svg" );
		addSVGIcon( "informationDialog.svg" );
		addSVGIcon( "warningDialog.svg" );
	}

	private void addSVGIcon( String name ) {
		svgIconsPanel.add( new JLabel( new FlatSVGIcon( "com/formdev/flatlaf/demo/extras/svg/" + name ) ) );
	}

	private void triStateCheckBox1Changed() {
		triStateLabel1.setText( triStateCheckBox1.getState().toString() );
	}

	private void triStateCheckBox2Changed() {
		triStateLabel2.setText( triStateCheckBox2.getState().toString() );
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		triStateCheckBox1 = new TriStateCheckBox();
		triStateLabel1 = new JLabel();
		triStateCheckBox2 = new TriStateCheckBox();
		triStateLabel2 = new JLabel();
		label2 = new JLabel();
		svgIconsPanel = new JPanel();
		label3 = new JLabel();

		//======== this ========
		setLayout(new MigLayout(
			"ltr,insets dialog,hidemode 3",
			// columns
			"[]" +
			"[]" +
			"[left]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("TriStateCheckBox:");
		add(label1, "cell 0 0");

		//---- triStateCheckBox1 ----
		triStateCheckBox1.setText("three states");
		triStateCheckBox1.addActionListener(e -> triStateCheckBox1Changed());
		add(triStateCheckBox1, "cell 1 0");

		//---- triStateLabel1 ----
		triStateLabel1.setText("text");
		triStateLabel1.setEnabled(false);
		add(triStateLabel1, "cell 2 0,gapx 30");

		//---- triStateCheckBox2 ----
		triStateCheckBox2.setText("third state disabled");
		triStateCheckBox2.setThirdStateEnabled(false);
		triStateCheckBox2.addActionListener(e -> triStateCheckBox2Changed());
		add(triStateCheckBox2, "cell 1 1");

		//---- triStateLabel2 ----
		triStateLabel2.setText("text");
		triStateLabel2.setEnabled(false);
		add(triStateLabel2, "cell 2 1,gapx 30");

		//---- label2 ----
		label2.setText("SVG Icons:");
		add(label2, "cell 0 2");

		//======== svgIconsPanel ========
		{
			svgIconsPanel.setLayout(new MigLayout(
				"insets 0,hidemode 3",
				// columns
				"[fill]",
				// rows
				"[grow,center]"));
		}
		add(svgIconsPanel, "cell 1 2 2 1");

		//---- label3 ----
		label3.setText("The icons may change colors when switching to another theme.");
		add(label3, "cell 1 3 2 1");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private TriStateCheckBox triStateCheckBox1;
	private JLabel triStateLabel1;
	private TriStateCheckBox triStateCheckBox2;
	private JLabel triStateLabel2;
	private JLabel label2;
	private JPanel svgIconsPanel;
	private JLabel label3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
