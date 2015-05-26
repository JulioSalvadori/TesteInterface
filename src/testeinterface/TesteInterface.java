/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

/**
 *
 * @author uilian
 */
public class TesteInterface {
     private Caixa venda;
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TesteInterface teste= new TesteInterface();
        Caixa venda= new Caixa();
        
    }
    
   
    public TesteInterface(){
        venda= new Caixa(this);
        venda.setVisible(true);
    }
        public void enviarDados(String cod, String produto, String preco){
        
        System.out.println("cod= "+venda.cod);
        System.out.println("produto= "+venda.produto);
        System.out.println("preco= "+venda.preco);
        // TODO code application logic here
    }
    
}