import java.util.HashMap;
import javax.swing.JOptionPane;

public class EstruturaDeDadosAtvFinal {

    public static void main(String[] args) {
        // Criando uma tabela hash para armazenar CPFs e seus respectivos nomes
        HashMap<String, String> tabelaCPF = new HashMap<>();

        // Inserindo alguns CPFs e nomes na tabela hash (exemplo)
        tabelaCPF.put("445.199.258-00", "Alice Maria do Nascimento");
        tabelaCPF.put("744.288.975-85", "José da Silva Júnior");
        tabelaCPF.put("258.852.456-14", "Carlos de Oliveira Sousa");
        tabelaCPF.put("174.123.321-00", "Antônio José Gomes");
        tabelaCPF.put("111..888.999-77", "Maria José Guimarães");
        tabelaCPF.put("963.852.741-23", "Luma Castro Ribeiro");

        //System.out.print("Digite um CPF (formato xxx.xxx.xxx-xx): ");
        String cpfDigitado = JOptionPane.showInputDialog("Digite um CPF (formato xxx.xxx.xxx-xx): ");

        // Buscando o nome associado ao CPF digitado
        String nome = tabelaCPF.get(cpfDigitado);
        if (nome != null) {
            JOptionPane.showMessageDialog(null,
                    "Nome associado ao CPF " + cpfDigitado + ": " + nome,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "CPF não encontrado na tabela.",
                    "Resultado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
