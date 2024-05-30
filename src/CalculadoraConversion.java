public class CalculadoraConversion {


    ConsultaConversion consultaConversion;

    public CalculadoraConversion() {
        this.consultaConversion = new ConsultaConversion();
    }

    private double convertirMonedaPrincipalAotraOtraMoneda(double importeMonedaPrincipal1,
                                                           String monedaPrincipal,
                                                           String otraMoneda){

        Conversion conversionesMonedaPrincipal = consultaConversion.buscarConversion(monedaPrincipal);

        double monedaPrincipalPorOtraMoneda = conversionesMonedaPrincipal.conversion_rates().get(otraMoneda);

        return importeMonedaPrincipal1 * monedaPrincipalPorOtraMoneda;

    }

    public double deDolarAPesoArgentino(double importeDolar) {

        return this.convertirMonedaPrincipalAotraOtraMoneda(importeDolar, "USD","ARS");
    }

    public double dePesoArgentinoADolar(double importePeso) {

        return this.convertirMonedaPrincipalAotraOtraMoneda(importePeso, "ARS","USD");
    }

    public double deDolarAPesoChileno(double importeDolar) {

        return this.convertirMonedaPrincipalAotraOtraMoneda(importeDolar, "USD","CLP");
    }

    public double dePesoChilenoADolar(double importePeso) {

        return this.convertirMonedaPrincipalAotraOtraMoneda(importePeso, "CLP","USD");
    }
    public double deDolarARealBRasilenio(double importeDolar) {

        return this.convertirMonedaPrincipalAotraOtraMoneda(importeDolar, "USD","BRL");
    }

    public double deRealBRasilenioADolar(double importePeso) {

        return this.convertirMonedaPrincipalAotraOtraMoneda(importePeso, "BRL","USD");
    }










}
