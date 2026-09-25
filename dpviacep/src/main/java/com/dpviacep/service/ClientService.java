package com.dpviacep.service;

import com.dpviacep.model.Cliente;

public interface ClientService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    Cliente inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
