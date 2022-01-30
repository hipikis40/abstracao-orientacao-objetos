public class Visualizacao {

    private Aprendiz espectador;
    private Video filme;

    public Visualizacao(Aprendiz espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.filme.setViews(this.filme.getViews() + 1);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(this.filme.getAvaliacao() + 5);

    }

    public void avaliar(int nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Digite uma nota válida. Entre 0 e 10.");
            System.out.println("");
        } else {
            this.filme.setAvaliacao(nota);
        }
    }

    public void avaliar(float porc) {
        int tot = 0;
        if (porc < 0 || porc > 100) {
            System.out.println("Insira uma porcentagem válida");
            System.out.println("");
        } else if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);

    }

    public Aprendiz getEspectador() {
        return espectador;
    }

    public void setEspectador(Aprendiz espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }

}
