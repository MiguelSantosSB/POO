package teste;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
//		atribui dataok com falso
		boolean dataok = false;
//		o while só irá parar quando 'dataok' for true
		while (dataok == false) {
		
		try {
//			irá pedir o dado
			String result = JOptionPane.showInputDialog("Informe o dia do seu nascimento");
//			verifica se o dado que foi dado e um número
			int dia = Integer.parseInt(result);
//			coloca true em 'dataok'
			dataok = true;
//				verifica se o número e existente em um mês de 31 dias
				if(dia < 1 || dia > 31) {
//					cria uma exceção para caso não exista o número no mês
					throw new NumberFormatException("Você precisa digitar um número do mês existente."); 
				}
			JOptionPane.showMessageDialog(null, "Você nasceu no dia "+dia);
//		exceção caso o dado entregue n seja um número
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Você precisa digitar apenas caracteres númericos.");
			}
		}
	}
}
