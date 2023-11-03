package pacoteprincipal;
import java.io.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {
        MethodClass m = new MethodClass();
        Estatistica[] estatistica = new Estatistica[10];
        
        for (int i = 0; i < 10; i++){
            estatistica[i] = new Estatistica();
        }
        
        int opc = 0;
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de acidentes em 2020: \n\n1 - Cadastro Estatística. \n2 - Consulta por quantidade de acidentes. \n3 - Consulta por estatísticas de acidentes. \n4 - Acidentes acima da média. \n9 - Sair."));
            switch (opc){
                case 1: 
                    m.CadastrarCity(estatistica);
                    break;
                case 2:
                    m.ConsultarQtd(estatistica);
                    break;
                case 3:
                    m.ConsultarBS(estatistica);
                    break;
                case 4:
                    m.Media(estatistica);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }
    }
}
