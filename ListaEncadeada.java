public class ListaEncadeada {
    class No {
        int dado;
        No proximo;

        public No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    No head;

    public ListaEncadeada() {
        this.head = null;
    }

    public void inserirNoInicio(int dado) {
        No newNo = new No(dado);
        newNo.proximo = head;
        head = newNo;
    }

    public void inserirNoFim(int dado) {
        No newNo = new No(dado);
        if (head == null) {
            head = newNo;
            return;
        }
        No ultimo = head; 
        while (ultimo.proximo != null) {
            ultimo = ultimo.proximo;
        }
        ultimo.proximo = newNo;
    }

    public void remover(int key) {
        No temp = head, prev = null;

        if (temp != null && temp.dado == key) {
            head = temp.proximo;
            return;
        }

        while (temp != null && temp.dado != key) {
            prev = temp;
            temp = temp.proximo;
        }

        if (temp == null) {
            return;
        }

        prev.proximo = temp.proximo;
    }

    public boolean buscar(int dado) {
        No current = head;
        while (current != null) {
            if (current.dado == dado) {
                return true;
            }
            current = current.proximo;
        }
        return false;
    }

    public void imprimir() {
        No currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.dado + " -> ");
            currentNode = currentNode.proximo;
        }
        System.out.println("null");
    }
}


