package pacoteprincipal;

import java.io.*;
import javax.swing.JOptionPane;

public class MethodClass {
    
    public Estatistica[] CadastrarCity(Estatistica[] estatistica) throws IOException {
        String FileName = "ArquivoEstatistica.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(FileName));

        for (int i = 0; i < 10; i++) {
            estatistica[i].CityCode = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade."));

            gravar.write(Integer.toString(estatistica[i].CityCode));
            gravar.newLine();

            estatistica[i].CityName = JOptionPane.showInputDialog("Digite o nome da cidade.");

            gravar.write(estatistica[i].CityName);
            gravar.newLine();

            estatistica[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes na cidade"));
            gravar.write(Integer.toString(estatistica[i].QtdAcidentes));
            gravar.newLine();
            
        }
        gravar.close();
        return estatistica;
    }

    public void ConsultarQtd(Estatistica[] estatistica) throws IOException {
        String FileName = "ArquivoEstatistica.txt";
        BufferedReader ler = new BufferedReader(new FileReader(FileName));

        System.out.println("=============== Consultar Quantidade ===============");
        for (int i = 0; i < 10; i++) {
            estatistica[i].CityCode = Integer.parseInt(ler.readLine());
            estatistica[i].CityName = ler.readLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(ler.readLine());
            
            if ((estatistica[i].QtdAcidentes > 100) & (estatistica[i].QtdAcidentes < 500)) {
                System.out.println("\nCódigo: " + estatistica[i].CityCode + "\nNome: " + estatistica[i].CityName + "\nQuantidade de acidentes: " + estatistica[i].QtdAcidentes);
            }
        }
        ler.close();
    }

    public void ConsultarBS(Estatistica[] estatistica) throws IOException {
        String FileName = "ArquivoEstatistica.txt";
        BufferedReader ler = new BufferedReader(new FileReader(FileName));
        System.out.println("\n\n=============== Consultar Maior e Menor ===============");

        int bigger = 0, smaller = 0, j = 0, k = 0;

        for (int i = 0; i < 10; i++) {
            estatistica[i].CityCode = Integer.parseInt(ler.readLine());
            estatistica[i].CityName = ler.readLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(ler.readLine());
            
            if (i == 0){
                bigger = estatistica[i].QtdAcidentes;
                smaller = estatistica[i].QtdAcidentes;
            }
            
            if (bigger < estatistica[i].QtdAcidentes) {
                bigger = estatistica[i].QtdAcidentes;
                j = i;
            } else if (smaller > estatistica[i].QtdAcidentes) {
                smaller = estatistica[i].QtdAcidentes;
                k = i;
            }
        }
        ler.close();
        System.out.println("\n\n- MAIOR\n\nCódigo: " + estatistica[j].CityCode + "\nNome:" + estatistica[j].CityName + "\nQuantidade: " + estatistica[j].QtdAcidentes + "\n\n- MENOR:\n\nCódigo: " + estatistica[k].CityCode + "\nNome: " + estatistica[k].CityName + "\nQuantidade: " + estatistica[k].QtdAcidentes);
    }

    public void Media(Estatistica[] estatistica) throws IOException {
        String FileName = "ArquivoEstatistica.txt";
        BufferedReader ler = new BufferedReader(new FileReader(FileName));
        System.out.println("\n\n=============== Cidades acima da média ===============");

        double media = 0, c = 0;
        for (int i = 0; i < 10; i++) {
            estatistica[i].CityCode = Integer.parseInt(ler.readLine());
            estatistica[i].CityName = ler.readLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(ler.readLine());

            media = media + estatistica[i].QtdAcidentes;
            c++;
        }
        ler.close();

        for (int i = 0; i < 10; i++) {
            if (estatistica[i].QtdAcidentes > (media / c)) {
                System.out.println("\nCódigo: " + estatistica[i].CityCode + "\nNome: " + estatistica[i].CityName + "\nQuantidade: " + estatistica[i].QtdAcidentes);
            }
        }
    }
}