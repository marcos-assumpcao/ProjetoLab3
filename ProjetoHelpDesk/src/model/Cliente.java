/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Marcos Assumpcao, Ubirajara, Vinicius
 * 
 * 
 */
public class Cliente extends Usuario{
    int idCliente;
    String setor;
    int telefone;
    int celular;
    int ramal;
    String email;
    
    public Cliente(){
    
    }

    public int getIdCliente() {
        return idCliente;
    }
    
    public String getSetor() {
        return setor;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getCelular() {
        return celular;
    }

    public int getRamal() {
        return ramal;
    }

    public String getEmail() {
        return email;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}