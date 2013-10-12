/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.entidade;

/**
 *
 * @author andrematos
 */
public enum EnumTipoProduto {
    R("Roupas"),
    RM("Remédios"),
    AN("Anticoncepcionais"),
    B("Brinquedos"),
    H("Produtos para higiene"),
    RAB("Rações e Biscoitos"),
    OUT("Outros");
    
    private final String nome;

    
    EnumTipoProduto(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }
}
