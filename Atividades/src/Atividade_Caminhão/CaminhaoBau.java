package Atividade_Caminhão;

public class CaminhaoBau extends Caminhao {
    private int volume;
    private float comprimento;
    private float largura;
    private float altura;
    
    public CaminhaoBau(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade, int volume,
                       float comprimento, float largura, float altura) {
        super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
        this.volume = volume;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public int getVolume() {
        return volume;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void carregaBau(float qtdeQuilos) {
        cargaAtual = getCargaAtual() + (qtdeQuilos / 1000);
    }

    public void descarregaBau(float qtdeQuilos) {
        cargaAtual = getCargaAtual() - (qtdeQuilos / 1000);
    }

    public void calculaVolume() {
        volume = (int) (getAltura() * getLargura() * getComprimento());
    }
}
