package controller;

import java.util.ArrayList;
import java.util.List;
import model.Contato;

public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    public boolean adicionarContato(Contato contato) {
        for (Contato c : contatos) {
            if (c.getIdentificador().equals(contato.getIdentificador())) {
                return false; // Duplicado
            }
        }
        contatos.add(contato);
        return true;
    }

    public List<Contato> listarContatos() {
        return contatos;
    }

    public boolean removerContato(String id) {
        return contatos.removeIf(c -> c.getIdentificador().equals(id));
    }

    public Contato buscarContato(String id) {
        for (Contato c : contatos) {
            if (c.getIdentificador().equals(id)) return c;
        }
        return null;
    }
}
