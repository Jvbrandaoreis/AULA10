

	import java.awt.BorderLayout;
	import java.awt.Container;
	import java.awt.FlowLayout;	
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;
	

	public class TelaPrincipal extends JFrame implements ActionListener{

		private JTextField textoField;
		private JLabel tituloLabel,textoLabel;
		private JButton mostrarBtn, limparBtn, sairBtn;
		
		
		public TelaPrincipal() {
			super("Aula 01");
			
			JPanel painelTitulo = new JPanel(new FlowLayout());
			tituloLabel = new JLabel("Digite um texto e aperte o botão de sua escolha");
			
			painelTitulo.add(tituloLabel);
			
			JPanel painelTexto = new JPanel(new FlowLayout());
			textoLabel = new JLabel("Texto:");
			textoField = new JTextField(30);
			
			
			painelTexto.add(textoLabel);
			painelTexto.add(textoField);
			
			JPanel painelBotoes = new JPanel(new FlowLayout());
			
			mostrarBtn = new JButton("Mostar");
			mostrarBtn.addActionListener(this);
			
			limparBtn  = new JButton("Limpar");
			limparBtn.addActionListener(this);
			
			sairBtn = new JButton("Sair");
			sairBtn.addActionListener(this);
			
			
			painelBotoes.add(mostrarBtn);
			painelBotoes.add(limparBtn);
			painelBotoes.add(sairBtn);
				
			Container painelConteudo = getContentPane();
			
			painelConteudo.setLayout(new BorderLayout());
			
			painelConteudo.add(painelTitulo, BorderLayout.NORTH);
			painelConteudo.add(painelTexto, BorderLayout.CENTER);
			painelConteudo.add(painelBotoes, BorderLayout.SOUTH);
			
			setSize (500, 150);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);
		}
		
		public static void main(String [] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new TelaPrincipal();
				}
			});
		}
		
		public void actionPerformed (ActionEvent e) {
			if(e.getSource() == mostrarBtn) {
				JOptionPane.showMessageDialog(null, textoField);
			}else if(e.getSource() == limparBtn) {
				textoField.setText(null);								
			}else if(e.getSource() == sairBtn) {
				System.exit(0);
			}
		}
	}

