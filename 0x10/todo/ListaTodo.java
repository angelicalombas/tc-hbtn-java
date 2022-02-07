import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaTodo {
    public List<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        for (Tarefa tarefas : tarefas) {
            if (tarefas.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
            if (tarefa.getDescricao() == null || tarefa.getDescricao() == "") {
                throw new IllegalArgumentException("Descricao de tarefa invalida");
            }
        }
        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        boolean tarefaFeita = false;
        for (Tarefa tarefas : tarefas) {
            if (tarefas.getIdentificador() == identificador) {
                tarefas.setEstahFeita(true);
                tarefaFeita = true;
            } else {
                tarefaFeita = false;
            }
        }
        return tarefaFeita;
    }

    public boolean desfazerTarefa(int identificador) {
        boolean tarefaFeita = false;
        for (Tarefa tarefas : tarefas) {
            if (tarefas.getIdentificador() == identificador) {
                tarefas.setEstahFeita(false);
                tarefaFeita = true;
            } else {
                tarefaFeita = false;
            }
        }
        return tarefaFeita;
    }

    public void desfazerTodas() {
        for (Tarefa tarefas : tarefas) {
            tarefas.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefas : tarefas) {
            tarefas.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefas : tarefas) {
            if (tarefas.isEstahFeita() == true) {
                System.out.println("[X]  Id: " + tarefas.getIdentificador() + " - Descricao: " + tarefas.getDescricao());
            } else {
                System.out.println("[ ]  Id: " + tarefas.getIdentificador() + " - Descricao: " + tarefas.getDescricao());
            }
        }
    }

}
