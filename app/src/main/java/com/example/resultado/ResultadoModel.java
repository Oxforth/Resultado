package com.example.resultado;

public class ResultadoModel implements Main.Model{
    private Main.Presentador presentador;

    public ResultadoModel(Main.Presentador presentador){
        this.presentador =presentador;
    }
    @Override
    public void CalcularResultado(Double n1, Double n2, Double n3) {
        Double total = (n1 + n2 + n3)/3;
        if (total<12){
            presentador.MostrarResultado(total + " < 12 - No logrado");
        } else if (total>=12.5&&total<14){
            presentador.MostrarResultado("12.5 <=" + total + " < 14 - Logro Bajo");
        } else if (total>=15&&total<=17){
            presentador.MostrarResultado("15 <=" + total + " < 17 - Logro Medio");
        } else if (total>=18&&total<=20){
            presentador.MostrarResultado("17 <=" + total + " < 20 - Logro Alto");
        }
    }
}
