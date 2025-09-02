package inatel.cdg.jogador;

import inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public String getNome() {
        return nome;
    }
    public double getVida() {
        return vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(ast.getTipoAsteroide() == "Grande"){
            if(this.tipoTiro == "Explosivo"){
                ast.destruir();
            }
            //Se não for explosivo, o asteróide não explode.
        }
        else{
            ast.destruir();
        }
    }
}
