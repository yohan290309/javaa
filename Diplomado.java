
package semana5;


public class Diplomado 
{
    private double valor;
    private double docente;
    private double plataforma;
    private double administracion;
    private int grupos;

    public Diplomado() {
    }

    public Diplomado(double valor, double docente, double plataforma, double administracion, int grupos) {
        this.valor = valor;
        this.docente = docente;
        this.plataforma = plataforma;
        this.administracion = administracion;
        this.grupos = grupos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDocente() {
        return docente;
    }

    public void setDocente(double docente) {
        this.docente = docente;
    }

    public double getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(double plataforma) {
        this.plataforma = plataforma;
    }

    public double getAdministracion() {
        return administracion;
    }

    public void setAdministracion(double administracion) {
        this.administracion = administracion;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }
    public double calrcular_ingreso()
    {   
        double ingresos;
        ingresos =  this.valor * this.grupos * 8;             
        return ingresos;
    }
     public double calrcular_costos()
    {
        double costos;
        costos = (this.docente + this.plataforma + this.administracion) * this.grupos;
        return costos;
    }
}
