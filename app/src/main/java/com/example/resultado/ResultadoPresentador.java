package com.example.resultado;

public class ResultadoPresentador implements Main.Presentador{
    private Main.Model model;
    private Main.Vista vista;
    public ResultadoPresentador(Main.Vista vista){
        this.vista = vista;
        model = new ResultadoModel(this);
    }

    @Override
    public void MostrarResultado(String r) {
        if (vista!=null){
            vista.MostrarResultado(r);
        }
    }

    @Override
    public void CalcularResultado(Double n1, Double n2, Double n3) {
        if (vista!=null){
            model.CalcularResultado(n1, n2, n3);
        }
    }
}
