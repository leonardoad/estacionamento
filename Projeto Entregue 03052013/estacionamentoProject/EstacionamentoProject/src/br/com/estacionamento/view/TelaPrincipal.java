package br.com.estacionamento.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import br.com.estacionamento.controller.Usuarios;
import br.com.estacionamento.model.Cargo;
import br.com.estacionamento.model.Usuario;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel_pagamentos;
	private JTextField textFTicket;
	private JTextField textFHoraEntrada;
	private JTextField textFvalorHora;
	private JTextField textFdata;
	private JTextField textFHoraSaida;
	private JTextField textFpermanencia;
	private JTextField textFvalorTotal;
	private JTextField textFvalorRecebido;
	private JTextField textFtroco;
	private JTextField textFSenha;
	private JTextField textFUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("BETTER PARKING - Controle de Estacionamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 688);
		JPanel PanelPrincipal = new JPanel();
		PanelPrincipal.setBackground(Color.WHITE);
		PanelPrincipal.setMaximumSize(new Dimension(800000, 400000));
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);

		JLabel lblBeteerParking = new JLabel("BETTER PARKING");
		lblBeteerParking.setBounds(417, 11, 287, 46);
		lblBeteerParking.setForeground(Color.BLUE);
		lblBeteerParking.setBackground(Color.LIGHT_GRAY);
		lblBeteerParking.setFont(new Font("Arial Black", Font.BOLD, 24));
		PanelPrincipal.add(lblBeteerParking);

		JSeparator separator1 = new JSeparator();
		separator1.setOrientation(SwingConstants.VERTICAL);
		separator1.setBounds(190, 88, 36, 483);
		PanelPrincipal.add(separator1);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSenha.setBounds(24, 160, 46, 14);
		PanelPrincipal.add(lblSenha);

		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setBounds(24, 118, 58, 14);
		PanelPrincipal.add(lblUsuario);

		final JButton btn_pagamento = new JButton("Pagamento");
		btn_pagamento.setEnabled(false);
		btn_pagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				panel_pagamentos.setVisible(true);
			}
		});
		btn_pagamento.setBounds(51, 264, 100, 28);
		PanelPrincipal.add(btn_pagamento);

		final JButton btn_tarifas = new JButton("Tarifas");
		btn_tarifas.setEnabled(false);
		btn_tarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_pagamentos.setVisible(false);
			}
		});
		btn_tarifas.setBounds(51, 314, 100, 28);
		PanelPrincipal.add(btn_tarifas);

		final JButton btnRelatrios = new JButton("Relat\u00F3rios");
		btnRelatrios.setEnabled(false);
		btnRelatrios.setBounds(51, 367, 100, 28);
		PanelPrincipal.add(btnRelatrios);

		panel_pagamentos = new JPanel();
		panel_pagamentos.setBackground(new Color(64, 224, 208));
		panel_pagamentos.setVisible(false);
		panel_pagamentos.setName("Pagamentos");
		panel_pagamentos.setBounds(216, 88, 879, 483);
		PanelPrincipal.add(panel_pagamentos);
		panel_pagamentos.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(348, 27, 183, 31);
		panel_pagamentos.add(panel);

		JLabel lblPagamentos = new JLabel("PAGAMENTOS");
		lblPagamentos.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblPagamentos.setForeground(new Color(255, 255, 255));
		panel.add(lblPagamentos);

		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTicket.setBounds(182, 112, 46, 14);
		panel_pagamentos.add(lblTicket);

		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblData.setBounds(477, 112, 31, 14);
		panel_pagamentos.add(lblData);

		JLabel lblHoraEntrada = new JLabel("Hora Entrada");
		lblHoraEntrada.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoraEntrada.setBounds(142, 153, 86, 14);
		panel_pagamentos.add(lblHoraEntrada);

		JLabel lblHoraSada = new JLabel("Hora Sa\u00EDda");
		lblHoraSada.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoraSada.setBounds(437, 153, 74, 14);
		panel_pagamentos.add(lblHoraSada);

		JLabel lblValorHora = new JLabel("Valor / Hora");
		lblValorHora.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblValorHora.setBounds(142, 199, 86, 14);
		panel_pagamentos.add(lblValorHora);

		JLabel lblPermanencia = new JLabel("Permanencia");
		lblPermanencia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPermanencia.setBounds(427, 199, 84, 14);
		panel_pagamentos.add(lblPermanencia);

		JLabel lblValorTotal = new JLabel("VALOR TOTAL");
		lblValorTotal.setForeground(new Color(0, 128, 0));
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblValorTotal.setBounds(242, 262, 145, 22);
		panel_pagamentos.add(lblValorTotal);

		JLabel lblValorRecebido = new JLabel("Valor Recebido");
		lblValorRecebido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblValorRecebido.setBounds(131, 319, 97, 14);
		panel_pagamentos.add(lblValorRecebido);

		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTroco.setBounds(472, 319, 36, 14);
		panel_pagamentos.add(lblTroco);

		JButton btnEfetuarPagamento = new JButton("Pagamento");
		btnEfetuarPagamento.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnEfetuarPagamento.setBounds(270, 396, 117, 28);
		panel_pagamentos.add(btnEfetuarPagamento);

		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStatus.setBounds(426, 410, 60, 14);
		panel_pagamentos.add(lblStatus);

		JLabel lblPendente = new JLabel("PENDENTE");
		lblPendente.setForeground(new Color(255, 0, 0));
		lblPendente.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPendente.setBounds(493, 396, 109, 38);
		panel_pagamentos.add(lblPendente);

		textFTicket = new JTextField();
		textFTicket.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFTicket.setBounds(254, 110, 86, 20);
		panel_pagamentos.add(textFTicket);
		textFTicket.setColumns(10);

		textFHoraEntrada = new JTextField();
		textFHoraEntrada.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFHoraEntrada.setBounds(254, 147, 86, 20);
		panel_pagamentos.add(textFHoraEntrada);
		textFHoraEntrada.setColumns(10);

		textFvalorHora = new JTextField();
		textFvalorHora.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFvalorHora.setBounds(254, 193, 86, 20);
		panel_pagamentos.add(textFvalorHora);
		textFvalorHora.setColumns(10);

		textFdata = new JTextField();
		textFdata.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFdata.setBounds(539, 110, 86, 20);
		panel_pagamentos.add(textFdata);
		textFdata.setColumns(10);

		textFHoraSaida = new JTextField();
		textFHoraSaida.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFHoraSaida.setBounds(539, 147, 86, 20);
		panel_pagamentos.add(textFHoraSaida);
		textFHoraSaida.setColumns(10);

		textFpermanencia = new JTextField();
		textFpermanencia.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFpermanencia.setBounds(539, 193, 86, 20);
		panel_pagamentos.add(textFpermanencia);
		textFpermanencia.setColumns(10);

		textFvalorTotal = new JTextField();
		textFvalorTotal.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFvalorTotal.setBounds(400, 246, 145, 38);
		panel_pagamentos.add(textFvalorTotal);
		textFvalorTotal.setColumns(10);

		textFvalorRecebido = new JTextField();
		textFvalorRecebido.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFvalorRecebido.setBounds(254, 317, 86, 20);
		panel_pagamentos.add(textFvalorRecebido);
		textFvalorRecebido.setColumns(10);

		textFtroco = new JTextField();
		textFtroco.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFtroco.setBounds(539, 317, 86, 20);
		panel_pagamentos.add(textFtroco);
		textFtroco.setColumns(10);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuarios userConctroller = new Usuarios();
				Usuario usuario = userConctroller.retornaUsuario(textFUsuario.getText(), textFSenha.getText());
				String cargo = usuario.getCargo().name();
				if(cargo.equals("FUNCIONARIO")){
					
					btn_pagamento.setEnabled(true);
					textFUsuario.setText("");
					textFSenha.setText("");
				}
				else if(cargo.equals("GERENTE")){
					btn_pagamento.setEnabled(true);
					btn_tarifas.setEnabled(true);
					btnRelatrios.setEnabled(true);
					textFUsuario.setText("");
					textFSenha.setText("");
				}
			}
		});
		btnEntrar.setBounds(81, 185, 89, 23);
		PanelPrincipal.add(btnEntrar);

		textFSenha = new JPasswordField();
		textFSenha.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		textFSenha.setBounds(80, 158, 86, 20);
		PanelPrincipal.add(textFSenha);
		textFSenha.setColumns(10);

		textFUsuario = new JTextField();
		textFUsuario.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textFUsuario.setBounds(81, 116, 86, 20);
		PanelPrincipal.add(textFUsuario);
		textFUsuario.setColumns(10);

		/*
		 * Eventos
		 */
		textFvalorTotal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				textFtroco.setText(Float.toString(calcularTroco(
						textFvalorTotal, textFvalorRecebido)));
			}
		});

		textFvalorRecebido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				textFtroco.setText(Float.toString(calcularTroco(
						textFvalorTotal, textFvalorRecebido)));
			}
		});

	}

	// Método de calcular troco
	private float calcularTroco(JTextField editValorTotal,
			JTextField editValorRecebido) {
		String valorRecebido = editValorRecebido.getText();
		String valorTotal = editValorTotal.getText();

		if (valorRecebido.equals("") || valorTotal.equals("")) {
			return 0;
		}
		return Float.parseFloat(valorRecebido) - Float.parseFloat(valorTotal);
	}


}
