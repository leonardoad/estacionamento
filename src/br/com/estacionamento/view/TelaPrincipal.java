package br.com.estacionamento.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel_pagamentos;

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

		JTextField usuario_text = new JTextField();
		usuario_text.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.GRAY, null, null, null));
		usuario_text.setBounds(80, 118, 90, 20);
		PanelPrincipal.add(usuario_text);

		JSeparator separator1 = new JSeparator();
		separator1.setOrientation(SwingConstants.VERTICAL);
		separator1.setBounds(190, 88, 36, 430);
		PanelPrincipal.add(separator1);

		JTextField senha_text = new JTextField();
		senha_text.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.GRAY, null, null, null));
		senha_text.setBounds(80, 154, 90, 20);
		PanelPrincipal.add(senha_text);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSenha.setBounds(24, 160, 46, 14);
		PanelPrincipal.add(lblSenha);

		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setBounds(24, 118, 58, 14);
		PanelPrincipal.add(lblUsuario);

		JButton btn_pagamento = new JButton("Pagamento");
		btn_pagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				panel_pagamentos.setVisible(true);
			}
		});
		btn_pagamento.setBounds(51, 219, 100, 28);
		PanelPrincipal.add(btn_pagamento);

		JButton btn_tarifas = new JButton("Tarifas");
		btn_tarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_pagamentos.setVisible(false);
			}
		});
		btn_tarifas.setBounds(51, 269, 100, 28);
		PanelPrincipal.add(btn_tarifas);

		JButton btnRelatrios = new JButton("Relat\u00F3rios");
		btnRelatrios.setBounds(51, 322, 100, 28);
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

		JLabel lblHoraEntrada = new JLabel("Hora Entrada");
		lblHoraEntrada.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoraEntrada.setBounds(142, 153, 86, 14);
		panel_pagamentos.add(lblHoraEntrada);

		JLabel lblHoraSada = new JLabel("Hora Sa\u00EDda");
		lblHoraSada.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHoraSada.setBounds(437, 153, 74, 14);
		panel_pagamentos.add(lblHoraSada);

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

		JTextField textP_ticket = new JTextField();
		textP_ticket.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textP_ticket.setBounds(254, 106, 82, 20);
		panel_pagamentos.add(textP_ticket);

		JTextField textP_horaEntrada = new JTextField();
		textP_horaEntrada.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textP_horaEntrada.setBounds(254, 147, 82, 20);
		panel_pagamentos.add(textP_horaEntrada);

		JTextField textP_horaSaida = new JTextField();
		textP_horaSaida.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textP_horaSaida.setBounds(539, 147, 74, 20);
		panel_pagamentos.add(textP_horaSaida);

		JTextField textP_permanencia = new JTextField();
		textP_permanencia.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textP_permanencia.setBounds(539, 193, 74, 20);
		panel_pagamentos.add(textP_permanencia);

		final JTextField textP_valorTotal = new JTextField();
		textP_valorTotal.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textP_valorTotal.setBackground(Color.WHITE);
		textP_valorTotal.setBounds(397, 252, 145, 38);
		panel_pagamentos.add(textP_valorTotal);

		final JTextField textP_valorRecebido = new JTextField();
		textP_valorRecebido.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textP_valorRecebido.setBounds(254, 313, 86, 20);
		panel_pagamentos.add(textP_valorRecebido);

		final JTextField textP_troco = new JTextField();
		textP_troco.setEditable(false);
		textP_troco.setBorder(new SoftBevelBorder(BevelBorder.LOWERED,
				Color.LIGHT_GRAY, null, null, null));
		textP_troco.setBounds(539, 313, 74, 20);
		panel_pagamentos.add(textP_troco);
		
		/*
		 * Eventos
		 */
		textP_valorTotal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				textP_troco.setText( Float.toString(calcularTroco(textP_valorTotal, textP_valorRecebido)) );
			}
		});
		
		textP_valorRecebido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				textP_troco.setText( Float.toString(calcularTroco(textP_valorTotal, textP_valorRecebido)) );
			}
		});
	}
	
	private float calcularTroco(JTextField editValorTotal, JTextField editValorRecebido) {
		String valorRecebido = editValorRecebido.getText();
		String valorTotal = editValorTotal.getText();

		if( valorRecebido.equals("") || valorTotal.equals("")) {
			return 0;
		}
		return Float.parseFloat(valorRecebido) - Float.parseFloat(valorTotal);
	}
}
