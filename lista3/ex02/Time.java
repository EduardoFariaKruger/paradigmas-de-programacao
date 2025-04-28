public class Time
{
    private int hora;
    private int minuto;

    public int getHora()
    {
        return this.hora;
    }
    public int getMinuto()
    {
        return this.minuto;
    }
    public void setHora(int hora)
    {
        if(hora >= 0 && hora <= 23)
        {
            this.hora = hora;
        }
    }
    public void setMinuto(int minuto)
    {
        if(minuto >= 0 && minuto < 60)
        {
            this.minuto = minuto;
        }
    }
    public Time(int hora, int minuto)
    {
        setHora(hora);
        setMinuto(minuto);
    }
    public boolean anterior(int hora, int minuto)
    {
        if(hora > this.hora) return false;
        if(hora < this.hora) return true;
        if(minuto < this.minuto) return true;
        return false;
    }
    public boolean equals(int hora, int minuto)
    {
        if(hora == this.hora && minuto == this.minuto)
        {
            return true;
        }
        return false;
    }
    public boolean posterior(int hora, int minuto)
    {
        if(!anterior(hora, minuto) && !equals(hora, minuto))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return String.format("%d:%d", hora, minuto);
    }
}
