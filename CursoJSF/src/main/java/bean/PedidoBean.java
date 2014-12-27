/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import model.EnderecoEntrega;
import model.ItemPedido;
import model.Pedido;

/**
 *
 * @author Moises
 */
@Named
@ViewScoped
public class PedidoBean  implements Serializable{
    private Pedido pedido;
    
    private List<ItemPedido> itensPedido;
    public PedidoBean() {
        pedido = new Pedido();
        pedido.setEnderecoEntrega(new EnderecoEntrega());
        itensPedido = new ArrayList<>();
    }
    
    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

   

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
    
}
