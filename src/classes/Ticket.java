package classes;

/**
 * Classe para os tíquetes emitidos pelo sistema
 * 
 * @author Fernando Ortiz
 *
 */
import java.util.Calendar;
import java.math.BigDecimal;
import java.util.Random;

public class Ticket {
    
    private String codBarra;
    private Calendar dataEntrada, dataSaida;
    private boolean status;
    private BigDecimal valorTotal;

    public String getCodBarra() {
        return codBarra;
    }

    public void criaCodBarra() {
        Random r = new Random();
        this.codBarra = ""+r.nextLong();
        while (Long.parseLong(codBarra)<=0) {
            this.codBarra = ""+r.nextLong();
        }
    }

    public String getDataEntrada() {
        return dataEntrada.get(Calendar.DAY_OF_MONTH)+":"
              +dataEntrada.get(Calendar.MONTH)+":"
              +dataEntrada.get(Calendar.YEAR);
    }

    public void setDataEntrada() {
        this.dataEntrada = Calendar.getInstance();
    }

    public String getHoraEntrada() {
        return dataEntrada.get(Calendar.HOUR_OF_DAY)+":"
              +dataEntrada.get(Calendar.MINUTE)+":"
              +dataEntrada.get(Calendar.SECOND);
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida() {
        this.dataSaida = Calendar.getInstance();
    }

    public String getHoraSaida() {
        return dataSaida.get(Calendar.HOUR_OF_DAY)+":"
              +dataSaida.get(Calendar.MINUTE)+":"
              +dataSaida.get(Calendar.SECOND);
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
    
    public Ticket() {
        setDataEntrada();
        criaCodBarra();
        atualizaStatus(false);
    }
    
    
}
