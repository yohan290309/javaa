package semana5;


public class Creditos 
{
    private int monto;
    private double interes;
    private int plazo;
    
    public Creditos()
    {
        
    }
    public Creditos(int monto, double interes, int plazo)
    {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
}
//Se crea Subclase que hereda Credito
class CreditoPersonal extends Creditos
{
    public CreditoPersonal()
    {
        
    }
    public CreditoPersonal(int monto, double interes, int plazo)
    {
        super(monto,interes,plazo);
    }
    public double CalcularCuota()
    {
        double cuota;
        cuota = (this.getMonto() + this.getMonto() * (this.getInteres() / 100))/this.getPlazo();
        return cuota;
    }

}
class CreditoEspecial extends Creditos
{
    public CreditoEspecial()
    {
        
    }
    public CreditoEspecial(int monto, double interes, int plazo)
    {
        super(monto, interes, plazo);
    }
    public double CalcularCuota ()
    {
        double cuota;
        cuota = this.getMonto() / this.getPlazo();
        return cuota;
    }
}
class CreditoEmpresarial extends Creditos
{
    private double ValorInteres;
    public CreditoEmpresarial ()
    {
        
    }
    public CreditoEmpresarial (int monto, double interes, int plazo)
    {
        super(monto, interes, plazo);
    }
    public CreditoEmpresarial(double ValorInteres, int monto, double interes, int plazo)
    {
        super(monto, interes, plazo);
        this.ValorInteres = ValorInteres;
    }
    public double CalcularCuota()
    {
        double cuota;
        cuota = (this.getMonto() + this.getValorInteres())/ this.getPlazo();
        return cuota;
    }

    public double getValorInteres() 
    {
        return ValorInteres;
    }

    public void setValorInteres(double ValorInteres) 
    {
        this.ValorInteres = ValorInteres;
    }
}   