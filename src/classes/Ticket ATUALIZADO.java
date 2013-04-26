
import java.util.Calendar;
import java.math.BigDecimal;
import java.util.Random;

public class Ticket {
    
    private String codBarra;
    private Calendar dataEntrada, horaEntrada, dataSaida, horaSaida;
    private boolean status;
    private BigDecimal valorTotal;

    public String getCodBarra() {
        return codBarra;
    }

    public void criaCodBarra() {
        Random r = new Random();
        this.codBarra = ""+r.nextLong();
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada() {
        this.dataEntrada = Calendar.getInstance();
    }

    public Calendar getHoraEntrada() {
        return horaEntrada;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida() {
        this.dataSaida = Calendar.getInstance();
    }

    public Calendar getHoraSaida() {
        return horaSaida;
    }

    public boolean isLiberado() {
        return status;
    }

    public void atualizaStatus(boolean status) {
        this.status = status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    
}
