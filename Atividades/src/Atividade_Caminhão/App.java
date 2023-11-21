package Atividade_Caminhão;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Caminhao> caminhoes = new ArrayList<>();

        CaminhaoBau caminhao1 = new CaminhaoBau(11, "Volvo", 2020, 2000, 'T', 10, 2.20f, 3.50f, 2.20f);
        CaminhaoBau caminhao2 = new CaminhaoBau(12, "WV Turbo", 2021, 1800, 'T', 12, 2.20f, 3.50f, 2.20f);
        CaminhaoBau caminhao3 = new CaminhaoBau(13, "WV T1000", 2022, 2200, 'T', 14, 2.20f, 3.80f, 3.80f);
        
        caminhoes.add(caminhao1);
        caminhoes.add(caminhao2);
        caminhoes.add(caminhao3);
        
        CaminhaoTanque caminhao4 = new CaminhaoTanque(22, "MB 2000", 2021, 2500, 'L', "Combustível");
        CaminhaoTanque caminhao5 = new CaminhaoTanque(21, "Iveco Day", 2019, 3000, 'L', "Água");
        
        caminhoes.add(caminhao4);
        caminhoes.add(caminhao5);

        for (Caminhao caminhao : caminhoes) {
            System.out.println("Nr: " + caminhao.getNrCaminhao());
            System.out.println("Modelo: " + caminhao.getModelo());
            System.out.println("Ano de Fabricação: " + caminhao.getAnoFabricacao());
            System.out.println("Capacidade Total: " + caminhao.getCapacidadeTotal() + " " + caminhao.getUnidade());
        }
    }
}
