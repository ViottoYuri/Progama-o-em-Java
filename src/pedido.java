import java.util.Date;

public class pedido {

    private int id;
    private Date data;
    private Cliente cliente; //associação todo-parte

    public pedido() {
    }

    //O cliente veio pronto, mostrando sua independencia do pedido
    public pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    //O cliente veio pronto, mostrando sua independencia do pedido
    public Cliente getCliente() {
        return cliente;
    }

    //O cliente veio pronto, mostrando sua independencia do pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                '}';
    }
}
