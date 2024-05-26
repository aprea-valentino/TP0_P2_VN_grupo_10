package Ej_2_3.model;



public class QueueOfQueue implements IQoQ{

    private Object[] elementos;
    private int count;
    private int MAX = 10000;
    public QueueOfQueue() {
        elementos = new Object[MAX];
        count = 0;
    }

    @Override
    public void add(IQueve queve) {
        if(this.count == MAX){
            throw new RuntimeException("Muchos elementos");
        }
        elementos[count] = queve;
        count++;
    }

    @Override
    public void remove() {
        if(count == 0) {
            throw new RuntimeException("No se puede desapilar una pila vacia");
        }else{
            for(int i = 0; i < this.elementos.length - 1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
        }
        this.count--;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public IQueve getFirts() {
        return (IQueve) this.elementos[0];
    }

    @Override
    public void concatenate(IQoQ queve) {
        while(!queve.isEmpty()){
            IQueve qo = new QueveGenerico<>();
            qo = queve.getFirts();
            add(qo);
            queve.remove();
        }

    }

    @Override
    public void flat() {
        IQueve<Object> aux = new QueveGenerico<>();
        while(!isEmpty()){
            while(!getFirts().isEmpty()){
                aux.add(getFirts().getFirts());
                getFirts().remove();
            }
            remove();
        }
        add(aux);

        return;
    }

    @Override
    public void reverseWithDepth() {

    }
}
