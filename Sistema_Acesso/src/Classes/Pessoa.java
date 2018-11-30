package Classes;

import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author marcos.sbrito2
 */

// Classe pessoa criada com seus atributos 
public class Pessoa {
    private Integer identificador;
    private String nome;
    private String numerorg;
    private String numerocpf;
    private Date datadenascimento;
    private String email;
    private Timestamp horaentrada;  
    
    
    public Integer getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNumerorg() {
        return numerorg;
    }
    
    public void setNumerorg(String numerorg) {
        this.numerorg = numerorg;
    }

    
    public String getNumerocpf() {
        return numerocpf;
    }
    
    public void setNumerocpf(String numerocpf) {
        this.numerocpf = numerocpf;
    }
    
    public Date getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }
    
    public String getEmail() {
        return email;
    }
    
     public void setEmail(String email) {
        this.email = email;
    }
    
    public Timestamp getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(Timestamp horaentrada) {
        this.horaentrada = horaentrada;
    }
             
}
