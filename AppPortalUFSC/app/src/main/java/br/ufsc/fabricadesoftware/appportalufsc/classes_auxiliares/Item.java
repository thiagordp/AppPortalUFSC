package br.ufsc.fabricadesoftware.appportalufsc.classes_auxiliares;

/**
 * Created by Thiago on 09/12/2014.
 */
public class Item {
    private final String nome;
    private final int drawableId;

    public Item(String nome, int drawableId) {
        this.nome = nome;
        this.drawableId = drawableId;
    }

    public String getNome() {
        return nome;
    }

    public int getDrawableId() {
        return drawableId;
    }
}
