package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela PESSOA
 * @generated
 */
@Entity
@Table(name = "\"PESSOA\""


)
@XmlRootElement
public class Pessoa implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1907817549l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
   * @generated
   */
  @Column(name = "cpf", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String cpf;
  
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_cidade", referencedColumnName = "id", insertable=true, updatable=true)
  private Cidade cidade;
  
  
  /**
   * Construtor
   * @generated
   */
  public Pessoa(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Pessoa setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nome
   * @param nome nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Pessoa setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém cpf
   * @param cpf cpf
   * return cpf
   * @generated
   */
  public java.lang.String getCpf(){
    return this.cpf;
  }
  
  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public Pessoa setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }
  
  /**
   * Obtém cidade
   * @param cidade cidade
   * return cidade
   * @generated
   */
  public Cidade getCidade(){
    return this.cidade;
  }
  
  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Pessoa setCidade(Cidade cidade){
    this.cidade = cidade;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof Pessoa))
        return false;
      
      Pessoa other = (Pessoa)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
