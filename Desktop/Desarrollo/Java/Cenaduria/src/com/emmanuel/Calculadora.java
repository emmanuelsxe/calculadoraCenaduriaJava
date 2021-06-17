package com.emmanuel;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Calculadora extends JFrame {
	
	double ventaSubTotal;
	double ventaTotal;
	double ventaDescuento;
	int aumentar;
	int disminuir;
	
	double cambioDar;
	String cambioS;
	double efectivoS; 
	
	// Variables que contendran el precio final a pagar según la cantidad comprada de cada platillo
	int totalPozoleMini = 0;
	int totalPozoleChico = 0;
	int totalPozoleMediano = 0;
	int totalPozoleGrande = 0;
	int totalBotePozole = 0;

	int totalQuesadillaChSencilla = 0;
	int totalQuesadillaGdeSencilla = 0;
	int totalQuesadillaChCarne = 0;
	int totalQuesadillaGdeCarne = 0;
	
	int totalSopeSencillo = 0;
	int totalSopeCarne = 0;
	
	int totalTacoSencillo = 0;
	int totalTacoCarne = 0;
	
	int totalEnchiladaSencilla = 0;
	int totalEnciladaCarne = 0;
	
	int totalFlautaSencilla = 0;
	int totalFlautaCarne = 0;
	
	int totalTostada = 0;
	
	int totalRefresco = 0;
	int totalAguaMediana = 0;
	int totalAguaGrande = 0;
	
	int totalPatita;
	
	
	// Variables para converitr los String en Int
	int pzMini = 0;
	int pzChico = 0;
	int pzMediano = 0;
	int pzGrande = 0;
	int pzBote = 0;

	int quesaChSen = 0;
	int quesaGdeSen = 0;
	int quesaChCarne = 0;
	int quesaGdeCarne = 0;
	
	int sopeSen = 0;
	int sopeCar = 0;
	
	int tacoS = 0;
	int tacoC = 0;
	
	int enchiladaS = 0;
	int enchiladaC = 0;
	
	int flautaS = 0;
	int flautaC = 0;
	
	int tostadaGDE = 0;
	
	int refrescoS = 0;
	int aguaMedianaS = 0;
	int aguaGrandeS = 0;
	int patitaS = 0;
	
	static final int PRECIO_POZOLE_MINI = 17;
	static final int PRECIO_POZOLE_CHICO = 30;
	static final int PRECIO_POZOLE_MEDIANO = 45;
	static final int PRECIO_POZOLE_GRANDE = 50;
	static final int PRECIO_QUESADILLA_CHICA_SENCILLA = 15;
	static final int PRECIO_QUESADILLA_GRANDE_SENCILLA = 30;
	static final int PRECIO_QUESADILLA_CHICA_CARNE = 20;
	static final int PRECIO_QUESADILLA_GRANDE_CARNE = 35;
	static final int PRECIO_SOPE_SENCILLO = 7;
	static final int PRECIO_SOPE_CARNE = 9;
	static final int PRECIO_TACO_SENCILLO = 5;
	static final int PRECIO_TACO_CARNE = 7;
	static final int PRECIO_ENCHILADA_SENCILLA = 7;
	static final int PRECIO_ENCHILADA_CARNE = 9;
	static final int PRECIO_FLAUTA_SENCILLA = 12;
	static final int PRECIO_FLAUTA_CARNE = 15;
	static final int PRECIO_TOSTADA = 30;
	static final int PRECIO_REFRESCO = 13;
	static final int PRECIO_AGUA_MEDIANA = 10;
	static final int PRECIO_AGUA_GRANDE = 18;
	static final int PRECIO_PATA = 10;
	
	
	private JLabel pozoleMini;
	private JLabel pozoleChico;
	private JLabel pozoleMediano;
	private JLabel pozoleGrande;
	private JLabel pozoleBote;

	private JLabel quesadillaChica;
	private JLabel quesadillaGrande;
	private JLabel quesaChicaCarne;
	private JLabel quesaGrandeCarne;

	private JLabel sopeSencillo;
	private JLabel sopeCarne;

	private JLabel tacoSencillo;
	private JLabel tacoCarne;

	private JLabel enchiladaSencilla;
	private JLabel enchiladaCarne; 
	
	private JLabel flautaCarne;
	private JLabel flautaSencilla; 
	
	private JLabel tostada;

	private JLabel refresco;

	private JLabel aguaMediana;
	private JLabel aguaGrande;
	
	private JLabel patita;

	private JTextField campoPozoleMini;
	private JTextField campoPozoleChico;
	private JTextField campoPozoleMediano;
	private JTextField campoPozoleGrande;
	private JTextField campoPozoleBote;

	private JTextField campoQuesadillaChica;
	private JTextField campoQuesadillaGrande;
	private JTextField campoQuesaChicaCarne;
	private JTextField campoQuesaGdeCarne;

	private JTextField campoSopeSencillo;
	private JTextField campoSopeCarne;

	private JTextField campoTacoSencillo;
	private JTextField campoTacoCarne;

	private JTextField campoEnchiladaSencilla;
	private JTextField campoEnchiladaCarne;
	
	private JTextField campoFlautaSencilla;
	private JTextField campoFlautaCarne;
	
	private JTextField campoTostada;

	private JTextField campoRefresco;


	private JTextField campoAguaMediana;
	private JTextField campoAguaGrande;

	private JTextField campoPatita;
	
	private JButton botonCalcularVenta;
	private JButton botonBorrarDatos;

	
	
	private JLabel textoDescuento; 
	private JRadioButton radioDescuento15;
	private JRadioButton radioDescuento20;
	private JRadioButton radioNinguno;
	private ButtonGroup grupoRadio;
	private JButton botonMas;
	private JButton botonMenos;
	
	private JLabel etiquetaTotalVenta;
	private JLabel totalVenta;
	private JLabel cambio;
	private JLabel pagaCon;
	private JButton calcularCambio;
	private JTextField efectivo;
	private JLabel cambioCliente;

	public Calculadora() {
		setLayout(null);
		inicializarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 1000);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {

		// Pozole Mini
		pozoleMini = new JLabel("Pozole Mini");
		pozoleMini.setBounds(20, 80, 150, 30);
		add(pozoleMini);
		
		campoPozoleMini = new JTextField("0");
		campoPozoleMini.setBounds(270, 80, 50, 30);
		add(campoPozoleMini);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 80, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoPozoleMini.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoPozoleMini.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 80, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoPozoleMini.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoPozoleMini.setText(mas);
			}
		});
		add(botonMas);

		// Pozole Chico
		pozoleChico = new JLabel("Pozole Chico");
		pozoleChico.setBounds(20, 110, 150, 30);
		add(pozoleChico);

		campoPozoleChico = new JTextField("0");
		campoPozoleChico.setBounds(270, 110, 50, 30);
		add(campoPozoleChico);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 110, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoPozoleChico.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoPozoleChico.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 110, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoPozoleChico.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoPozoleChico.setText(mas);
			}
		});
		add(botonMas);

		// Pozole Mediano
		pozoleMediano = new JLabel("Pozole Mediano");
		pozoleMediano.setBounds(20, 140, 150, 30);
		add(pozoleMediano);

		campoPozoleMediano = new JTextField("0");
		campoPozoleMediano.setBounds(270, 140, 50, 30);
		add(campoPozoleMediano);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 140, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoPozoleMediano.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoPozoleMediano.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 140, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoPozoleMediano.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoPozoleMediano.setText(mas);
			}
		});
		add(botonMas);

		// Pozole Grande
		pozoleGrande = new JLabel("Pozole Grande");
		pozoleGrande.setBounds(20, 170, 150, 30);
		add(pozoleGrande);

		campoPozoleGrande = new JTextField("0");
		campoPozoleGrande.setBounds(270, 170, 50, 30);
		add(campoPozoleGrande);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 170, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoPozoleGrande.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoPozoleGrande.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 170, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoPozoleGrande.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoPozoleGrande.setText(mas);
			}
		});
		add(botonMas);

		// Bote de Pozole
		pozoleBote = new JLabel("Bote de Pozole");
		pozoleBote.setBounds(20, 200, 150, 30);
		add(pozoleBote);

		campoPozoleBote = new JTextField("0");
		campoPozoleBote.setBounds(270, 200, 50, 30);
		add(campoPozoleBote);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 200, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoPozoleBote.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoPozoleBote.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 200, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoPozoleBote.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoPozoleBote.setText(mas);
			}
		});
		add(botonMas);

		// Quesadilla Chica Sencilla
		quesadillaChica = new JLabel("Quesadilla Chica Sencilla");
		quesadillaChica.setBounds(20, 230, 180, 30);
		add(quesadillaChica);

		campoQuesadillaChica = new JTextField("0");
		campoQuesadillaChica.setBounds(270, 230, 50, 30);
		add(campoQuesadillaChica);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 230, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoQuesadillaChica.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoQuesadillaChica.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 230, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoQuesadillaChica.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoQuesadillaChica.setText(mas);
			}
		});
		add(botonMas);


		// Quesadilla Grande Sencilla
		quesadillaGrande = new JLabel("Quesadilla Grande Sencilla");
		quesadillaGrande.setBounds(20, 260, 180, 30);
		add(quesadillaGrande);

		campoQuesadillaGrande = new JTextField("0");
		campoQuesadillaGrande.setBounds(270, 260, 50, 30);
		add(campoQuesadillaGrande);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 260, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoQuesadillaGrande.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoQuesadillaGrande.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 260, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoQuesadillaGrande.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoQuesadillaGrande.setText(mas);
			}
		});
		add(botonMas);
		
		// Quesadilla Chica Carne
		quesaChicaCarne = new JLabel("Quesadilla Chica con Carne");
		quesaChicaCarne.setBounds(20, 290, 180, 30);
		add(quesaChicaCarne);
		
		campoQuesaChicaCarne = new JTextField("0");
		campoQuesaChicaCarne.setBounds(270, 290, 50, 30);
		add(campoQuesaChicaCarne);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 290, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoQuesaChicaCarne.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoQuesaChicaCarne.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 290, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoQuesaChicaCarne.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoQuesaChicaCarne.setText(mas);
			}
		});
		add(botonMas);
		
		//QuesadillaGrande Carne
		quesaGrandeCarne = new JLabel("Quesadilla Grande con Carne");
		quesaGrandeCarne.setBounds(20, 320, 190, 30);
		add(quesaGrandeCarne);
		
		campoQuesaGdeCarne = new JTextField("0");
		campoQuesaGdeCarne.setBounds(270, 320, 50, 30);
		add(campoQuesaGdeCarne);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 320, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoQuesaGdeCarne.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoQuesaGdeCarne.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 320, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoQuesaGdeCarne.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoQuesaGdeCarne.setText(mas);
			}
		});
		add(botonMas);
		
		// Sope Sencillo
		sopeSencillo = new JLabel("Sope Sencillo");
		sopeSencillo.setBounds(20, 350, 150, 30);
		add(sopeSencillo);
		
		campoSopeSencillo  = new JTextField("0");
		campoSopeSencillo.setBounds(270, 350, 50, 30);
		add(campoSopeSencillo);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 350, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoSopeSencillo.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoSopeSencillo.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 350, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoSopeSencillo.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoSopeSencillo.setText(mas);
			}
		});
		add(botonMas);
		
		// Sope Carne
		sopeCarne = new JLabel("Sope con Carne");
		sopeCarne.setBounds(20, 380, 130, 30);
		add(sopeCarne);
		
		campoSopeCarne = new JTextField("0");
		campoSopeCarne.setBounds(270, 380, 50, 30);
		add(campoSopeCarne);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 380, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoSopeCarne.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoSopeCarne.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 380, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoSopeCarne.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoSopeCarne.setText(mas);
			}
		});
		add(botonMas);
		
		// Taco Sencillo
		tacoSencillo = new JLabel("Taco Sencillo");
		tacoSencillo.setBounds(20, 410, 130, 30);
		add(tacoSencillo);
		
		campoTacoSencillo = new JTextField("0");
		campoTacoSencillo.setBounds(270, 410, 50, 30);
		add(campoTacoSencillo);
		

		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 410, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoTacoSencillo.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoTacoSencillo.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 410, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoTacoSencillo.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoTacoSencillo.setText(mas);
			}
		});
		add(botonMas);
		
		// Taco Carne
		tacoCarne = new JLabel("Taco con Carne");
		tacoCarne.setBounds(20, 440, 130, 30);
		add(tacoCarne);
		
		campoTacoCarne = new JTextField("0");
		campoTacoCarne.setBounds(270, 440, 50, 30);
		add(campoTacoCarne);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 440, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoTacoCarne.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoTacoCarne.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 440, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoTacoCarne.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoTacoCarne.setText(mas);
			}
		});
		add(botonMas);
		
		// Enchilada Sencilla
		enchiladaSencilla = new JLabel("Enchilada Sencilla");
		enchiladaSencilla.setBounds(20, 470, 130, 30);
		add(enchiladaSencilla);
		
		campoEnchiladaSencilla = new JTextField("0");
		campoEnchiladaSencilla.setBounds(270, 470, 50, 30);
		add(campoEnchiladaSencilla);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 470, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoEnchiladaSencilla.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoEnchiladaSencilla.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 470, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoEnchiladaSencilla.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoEnchiladaSencilla.setText(mas);
			}
		});
		add(botonMas);
		
		//Enchilada con Carne
		enchiladaCarne = new JLabel("Enchilada con Carne");
		enchiladaCarne.setBounds(20, 500, 130, 30);
		add(enchiladaCarne);
		
		campoEnchiladaCarne = new JTextField("0");
		campoEnchiladaCarne.setBounds(270, 500, 50, 30);
		add(campoEnchiladaCarne);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 500, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoEnchiladaCarne.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoEnchiladaCarne.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 500, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoEnchiladaCarne.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoEnchiladaCarne.setText(mas);
			}
		});
		add(botonMas);
		
		//Flauta Sencilla
		flautaSencilla = new JLabel("Flauta Sencilla");
		flautaSencilla.setBounds(20, 530, 130, 30);
		add(flautaSencilla);
		
		campoFlautaSencilla = new JTextField("0");
		campoFlautaSencilla.setBounds(270, 530, 50, 30);
		add(campoFlautaSencilla);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 530, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoFlautaSencilla.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoFlautaSencilla.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 530, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoFlautaSencilla.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoFlautaSencilla.setText(mas);
			}
		});
		add(botonMas);
		
		//Flauta con carne
		flautaCarne = new JLabel("Flauta con Carne");
		flautaCarne.setBounds(20, 560, 130, 30);
		add(flautaCarne);
		
		campoFlautaCarne = new JTextField("0");
		campoFlautaCarne.setBounds(270, 560, 50, 30);
		add(campoFlautaCarne);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 560, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoFlautaCarne.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoFlautaCarne.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 560, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoFlautaCarne.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoFlautaCarne.setText(mas);
			}
		});
		add(botonMas);
		
		//Tostadas
		tostada = new JLabel("Tostada");
		tostada.setBounds(20, 590, 100, 30);
		add(tostada);
		
		campoTostada = new JTextField ("0");
		campoTostada.setBounds(270, 590, 50, 30);
		add(campoTostada);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 590, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoTostada.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoTostada.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 590, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoTostada.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoTostada.setText(mas);
			}
		});
		add(botonMas);
		
		//Refresco
		refresco = new JLabel("Refresco o Boing");
		refresco.setBounds(20, 620, 130, 30);
		add(refresco);
		
		campoRefresco = new JTextField("0");
		campoRefresco.setBounds(270, 620, 50, 30);
		add(campoRefresco);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 620, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoRefresco.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoRefresco.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 620, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoRefresco.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoRefresco.setText(mas);
			}
		});
		add(botonMas);
		
		//Agua Mediana
		aguaMediana = new JLabel("Agua Mediana");
		aguaMediana.setBounds(20, 650, 130, 30);
		add(aguaMediana);
		
		campoAguaMediana = new JTextField("0");
		campoAguaMediana.setBounds(270, 650, 50, 30);
		add(campoAguaMediana);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 650, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoAguaMediana.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoAguaMediana.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 650, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoAguaMediana.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoAguaMediana.setText(mas);
			}
		});
		add(botonMas);
		
		//Agua Grande
		aguaGrande = new JLabel("Agua Grande");
		aguaGrande.setBounds(20, 680, 130, 30);
		add(aguaGrande);
		
		campoAguaGrande = new JTextField("0");
		campoAguaGrande.setBounds(270, 680, 50, 30);
		add(campoAguaGrande);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 680, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoAguaGrande.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoAguaGrande.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 680, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoAguaGrande.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoAguaGrande.setText(mas);
			}
		});
		add(botonMas);
		
		//PATITA
		patita = new JLabel("Pata");
		patita.setBounds(20, 710, 80, 30);
		add(patita);
		
		campoPatita = new JTextField("0");
		campoPatita.setBounds(270, 710, 50, 30);
		add(campoPatita);
		
		botonMenos = new JButton ("-");
		botonMenos.setBounds(220, 710, 50, 30);
		botonMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String menos = campoPatita.getText();
				disminuir = Integer.parseInt(menos);
				disminuir--;
				menos = String.valueOf(disminuir);
				campoPatita.setText(menos);		
			}
		});
		add(botonMenos);
		
		botonMas = new JButton ("+");
		botonMas.setBounds(320, 710, 50, 30);
		botonMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mas = campoPatita.getText();
				aumentar = Integer.parseInt(mas);
				aumentar++;
				mas = String.valueOf(aumentar);
				campoPatita.setText(mas);
			}
		});
		add(botonMas);
		
		// BOTON Calcular Venta
		botonCalcularVenta = new JButton("Calcular Venta");
		botonCalcularVenta.setBounds(450, 150, 200, 30);
		botonCalcularVenta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String datoPozoleMini = campoPozoleMini.getText();
				String datoPozoleChico = campoPozoleChico.getText();
				String datoPozoleMediano = campoPozoleMediano.getText();
				String datoPozoleGrande = campoPozoleGrande.getText();
				String datoPozoleBote = campoPozoleBote.getText();
				String datoQuesadillaChSencilla = campoQuesadillaChica.getText();
				String datoQuesadillaGdeSencilla = campoQuesadillaGrande.getText();
				String datoQuesadillaChCarne = campoQuesaChicaCarne.getText();
				String datoQuesadillaGdeCarne = campoQuesaGdeCarne.getText();
				String datoSopeSencillo = campoSopeSencillo.getText();
				String datoSopeCarne = campoSopeCarne.getText();
				String datoTacoSencillo = campoTacoSencillo.getText();
				String datoTacoCarne = campoTacoCarne.getText();
				String datoEnchiladaSencilla = campoEnchiladaSencilla.getText();
				String datoEnchiladaCarne = campoEnchiladaCarne.getText();
				String datoFlautaSencilla = campoFlautaSencilla.getText();
				String datoFlautaCarne = campoFlautaCarne.getText();
				String datoTostada = campoTostada.getText();
				String datoRefresco = campoRefresco.getText();
				String datoAguaMediana = campoAguaMediana.getText();
				String datoAguaGrande = campoAguaGrande.getText();
				String datoPatita = campoPatita.getText();
				
				// pozole mini
				if (datoPozoleMini.length() == 0 || datoPozoleMini.length() == ' ') {
					totalPozoleMini = 0;

				} else {
					pzMini = Integer.parseInt(datoPozoleMini);
					totalPozoleMini = pzMini * PRECIO_POZOLE_MINI;
				}

				// pozole chico
				if (datoPozoleChico.length() == 0 || datoPozoleChico.length() == ' ') {
					totalPozoleChico = 0;
				} else {
					pzChico = Integer.parseInt(datoPozoleChico);
					totalPozoleChico = pzChico * PRECIO_POZOLE_CHICO;
				}
				// pozole Mediano
				if (datoPozoleMediano.length() == 0  || datoPozoleMediano.length() == ' ') {
					totalPozoleMediano = 0;
				} else {
					pzMediano = Integer.parseInt(datoPozoleMediano);
					totalPozoleMediano = pzMediano * PRECIO_POZOLE_MEDIANO;
				}

				// Pozole Grande
				if (datoPozoleGrande.length() == 0  || datoPozoleGrande.length() == ' ') {
					totalPozoleGrande = 0;
				} else {
					pzGrande = Integer.parseInt(datoPozoleGrande);
					totalPozoleGrande = pzGrande * PRECIO_POZOLE_GRANDE;
				}

				// Bote de Pozole
				if (datoPozoleBote.length() == 0  || datoPozoleBote.length() == ' ') {
					totalBotePozole = 0;
				} else {
					pzBote = Integer.parseInt(datoPozoleBote);
					totalBotePozole = pzBote * 1;
				}

				// Qusadilla Chica Sencilla
				if (datoQuesadillaChSencilla.length() == 0  || datoQuesadillaChSencilla.length() == ' ') {
					totalQuesadillaChSencilla = 0;
				} else {
					quesaChSen = Integer.parseInt(datoQuesadillaChSencilla);
					totalQuesadillaChSencilla = quesaChSen * PRECIO_QUESADILLA_CHICA_SENCILLA;
				}

				// Quesadilla Grande Sencilla
				if (datoQuesadillaGdeSencilla.length() == 0  || datoQuesadillaGdeSencilla.length() == ' ') {
					totalQuesadillaGdeSencilla = 0;
				} else {
					quesaGdeSen = Integer.parseInt(datoQuesadillaGdeSencilla);
					totalQuesadillaGdeSencilla = quesaGdeSen * PRECIO_QUESADILLA_GRANDE_SENCILLA;
				}
				
				// Quesadilla Chica Carne
				if (datoQuesadillaChCarne.length() == 0  || datoQuesadillaChCarne.length() == ' ') {
					totalQuesadillaChCarne = 0;
				} else {
					quesaChCarne = Integer.parseInt(datoQuesadillaChCarne);
					totalQuesadillaChCarne = quesaChCarne * PRECIO_QUESADILLA_CHICA_CARNE ;
				}
				
				// Quesadilla Grande Carne
				if (datoQuesadillaGdeCarne.length() == 0  || datoQuesadillaGdeCarne.length() == ' ') {
					totalQuesadillaGdeCarne = 0;
				} else {
					quesaGdeCarne = Integer.parseInt(datoQuesadillaGdeCarne);
					totalQuesadillaGdeCarne = quesaGdeCarne * PRECIO_QUESADILLA_GRANDE_CARNE;
				}
				
				// Sope Sencillo
				if (datoSopeSencillo.length() == 0  || datoSopeSencillo.length() == ' ') {
					totalSopeSencillo = 0;
					
				} else {
					
					sopeSen = Integer.parseInt(datoSopeSencillo);
					totalSopeSencillo = sopeSen * PRECIO_SOPE_SENCILLO;
				}
				
				//Sope Carne
				if (datoSopeCarne.length() == 0  || datoSopeCarne.length() == ' ') {
					totalSopeCarne = 0;
				} else {
					sopeCar = Integer.parseInt(datoSopeCarne);
					totalSopeCarne = sopeCar * PRECIO_SOPE_CARNE;
				}
				
				// Taco Sencillo
				if (datoTacoSencillo.length() == 0  || datoTacoSencillo.length() == ' ') {
					totalTacoSencillo = 0;
				} else {
					tacoS = Integer.parseInt(datoTacoSencillo);
					totalTacoSencillo = tacoS * PRECIO_TACO_SENCILLO;
				}
				
				// Taco Carne
				if (datoTacoCarne.length() == 0  || datoTacoCarne.length() == ' ') {
					totalTacoCarne = 0;
				} else {
					tacoC = Integer.parseInt(datoTacoCarne);
					totalTacoCarne = tacoC * PRECIO_TACO_CARNE;
				}
				
				// Enchilada Sencilla
				if (datoEnchiladaSencilla.length() == 0 || datoEnchiladaSencilla.length() == ' ') {
					totalEnchiladaSencilla = 0;
				} else {
					enchiladaS = Integer.parseInt(datoEnchiladaSencilla);
					totalEnchiladaSencilla = enchiladaS * PRECIO_ENCHILADA_SENCILLA;
				}
				
				//Enchilada con Carne
				if (datoEnchiladaCarne.length() == 0 || datoEnchiladaCarne.length() == ' ') {
					totalEnciladaCarne = 0;
				} else {
					enchiladaC = Integer.parseInt(datoEnchiladaCarne);
					totalEnciladaCarne = enchiladaC * PRECIO_ENCHILADA_CARNE;
				}
				
				//Flauta Sencilla
				if (datoFlautaSencilla.length() == 0 || datoFlautaSencilla.length() == ' ') {
					totalFlautaSencilla = 0;
				} else {
					flautaS = Integer.parseInt(datoFlautaSencilla);
					totalFlautaSencilla = flautaS * PRECIO_FLAUTA_SENCILLA;
				}
				
				//Flauta Carne
				if (datoFlautaCarne.length() == 0 || datoFlautaCarne.length() == ' ') {
					totalFlautaCarne = 0;
				} else {
					flautaC = Integer.parseInt(datoFlautaCarne);
					totalFlautaCarne = flautaC * PRECIO_FLAUTA_CARNE;
				}
				
				//Tostada
				if (datoTostada.length() == 0 || datoTostada.length() == ' ') {
					totalTostada = 0;
				} else {
					tostadaGDE = Integer.parseInt(datoTostada);
					totalTostada = tostadaGDE * PRECIO_TOSTADA;
				}
				
				//Refresco
				if (datoRefresco.length() == 0 || datoRefresco.length() == ' ') {
					totalRefresco = 0;
				} else {
					refrescoS = Integer.parseInt(datoRefresco);
					totalRefresco = refrescoS * PRECIO_REFRESCO;
					
				}
				
				//Agua Mediana
				if (datoAguaMediana.length()== 0 || datoAguaMediana.length() == ' ') {
					totalAguaMediana = 0;
				} else {
					aguaMedianaS = Integer.parseInt(datoAguaMediana);
					totalAguaMediana = aguaMedianaS * PRECIO_AGUA_MEDIANA;
				}
				
				//Agua Grande
				if (datoAguaGrande.length() == 0 || datoAguaGrande.length() == ' ' ) {
					totalAguaGrande = 0;
				} else {
					aguaGrandeS = Integer.parseInt(datoAguaGrande);
					totalAguaGrande = aguaGrandeS * PRECIO_AGUA_GRANDE;
				}
				
				//Patita
				if (datoPatita.length() == 0 || datoPatita.length() == ' ') {
					totalPatita = 0;
				} else {
					patitaS = Integer.parseInt(datoPatita);
					totalPatita = patitaS * PRECIO_PATA;
				}
				
				// TOTAL de VENTA
				 ventaSubTotal = totalPozoleMini + totalPozoleChico + totalPozoleMediano + totalPozoleGrande
						+ totalBotePozole + totalQuesadillaChSencilla + totalQuesadillaGdeSencilla + totalQuesadillaChCarne 
						+ totalQuesadillaGdeCarne + totalSopeCarne + totalSopeSencillo + totalTacoSencillo 
						+ totalTacoCarne + totalEnchiladaSencilla + totalEnciladaCarne + totalFlautaSencilla + totalFlautaCarne
						+ totalTostada + totalRefresco + totalAguaMediana + totalAguaGrande + totalPatita;
				
				if (radioDescuento15.isSelected()==true) {
					ventaDescuento = ventaSubTotal * .15;
					ventaTotal = ventaSubTotal - ventaDescuento;
				} 
					else if(radioDescuento20.isSelected() == true){
						ventaDescuento = ventaSubTotal * .20;
						ventaTotal = ventaSubTotal - ventaDescuento;
					} else {
							ventaTotal = ventaSubTotal;
						}

				String resultadoEnTexto = String.valueOf(ventaTotal);

				totalVenta.setText("$" + resultadoEnTexto );
			}
		});
		add(botonCalcularVenta);

		botonBorrarDatos = new JButton("Borrar Datos");
		botonBorrarDatos.setBounds(350, 800, 200, 30);
		botonBorrarDatos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				campoPozoleMini.setText("0");
				campoPozoleChico.setText("0");
				campoPozoleMediano.setText("0");
				campoPozoleGrande.setText("0");
				campoPozoleBote.setText("0");
				campoQuesadillaChica.setText("0");
				campoQuesadillaGrande.setText("0");
				campoQuesaChicaCarne.setText("0");
				campoQuesaGdeCarne.setText("0");
				campoSopeSencillo.setText("0");
				campoSopeCarne.setText("0");
				campoTacoSencillo.setText("0");
				campoTacoCarne.setText("0");
				campoEnchiladaSencilla.setText("0");
				campoEnchiladaCarne.setText("0");
				campoFlautaSencilla.setText("0");
				campoFlautaCarne.setText("0");
				campoTostada.setText("0");
				campoRefresco.setText("0");
				campoAguaMediana.setText("0");
				campoAguaGrande.setText("0");
				campoPatita.setText("0");
				radioNinguno.setSelected(true);
				efectivo.setText(null);
				cambioCliente.setText(null);
				
				totalVenta.setText(null);
			}
		});
		add(botonBorrarDatos);

		
        Font fuente = new Font("TIMES NEW ROMAN",1,18);
        
		etiquetaTotalVenta = new JLabel("Total: ");
		etiquetaTotalVenta.setBounds(450, 200, 200, 30);
		etiquetaTotalVenta.setFont(fuente);
		add(etiquetaTotalVenta);
        
		totalVenta = new JLabel();
		totalVenta.setBounds(550, 200, 200, 30);
		totalVenta.setFont(fuente);
		add(totalVenta);
		
		pagaCon = new JLabel("Efectivo: ");
		pagaCon.setBounds(450, 250, 200, 30);
		pagaCon.setFont(fuente);
		add(pagaCon);
		
		efectivo = new JTextField();
		efectivo.setBounds(550, 250, 100, 30);
		add(efectivo);
		
		calcularCambio = new JButton("Calcular Cambio");
		calcularCambio.setBounds(450, 300, 200, 30);
		calcularCambio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cambioS = efectivo.getText();
				efectivoS = Double.parseDouble(cambioS);

				if (efectivoS < ventaTotal) {
					JOptionPane.showMessageDialog(null, "El dinero es menor al total de la venta.");

				} else {
					cambioDar = efectivoS - ventaTotal;
					String resultadoCambio = String.valueOf(cambioDar);
					cambioCliente.setText("$ " + resultadoCambio);
				}

			}
		});
		add(calcularCambio);

		
		cambio = new JLabel("Cambio: ");
		cambio.setBounds(450, 350, 200, 30);
		cambio.setFont(fuente);
		add(cambio);
		
		cambioCliente = new JLabel();
		cambioCliente.setBounds(550, 350, 200, 30);
		cambioCliente.setFont(fuente);
		add(cambioCliente);
		
		// Descuento
		textoDescuento = new JLabel("Descuento");
		textoDescuento.setBounds(20, 750, 200, 30);
		textoDescuento.setFont(fuente);
		add(textoDescuento);
		
		radioNinguno = new JRadioButton("Ninguno",true);
		radioNinguno.setBounds(20, 780, 200, 30);
		add(radioNinguno);
		
		radioDescuento15 = new JRadioButton("15%",false);
		radioDescuento15.setBounds(20, 810, 200, 30);
		add(radioDescuento15);
		
		radioDescuento20 = new JRadioButton("20%", false);
		radioDescuento20.setBounds(20, 840, 200, 30);
		add(radioDescuento20);
		
		grupoRadio = new ButtonGroup();	
		grupoRadio.add(radioNinguno);
		grupoRadio.add(radioDescuento15);
		grupoRadio.add(radioDescuento20);
		
	}
	
	public static void main(String[] args) {
		Calculadora ventana = new Calculadora();
	}
}

