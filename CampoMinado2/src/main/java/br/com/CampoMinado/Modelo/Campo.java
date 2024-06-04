package br.com.CampoMinado.Modelo;

public class Campo {
    private boolean mine = false;
    private boolean open = false;
    private boolean markup = false;

    private final int row;
    private final int column;

    public Campo(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
