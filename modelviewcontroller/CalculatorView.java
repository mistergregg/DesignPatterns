package com.collabera.modelviewcontroller;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame
{
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calcualate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView()
	{
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	}
	
	public int getFirstNumber()
	{
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSecondNumber()
	{
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcSolution()
	{
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(int soluiton)
	{
		calcSolution.setText(Integer.toString(soluiton));
	}
	
	void addCalculationListener(ActionListener listenerForCalcButton)
	{
		calculateButton.addActionListener(listenerForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage)
	{
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
