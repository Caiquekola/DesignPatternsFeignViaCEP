package com.dpviacep.service.imp;

import org.springframework.stereotype.Service;

import com.dpviacep.model.Cliente;
import com.dpviacep.service.ClientService;

@Service
public class ClienteServiceImp implements ClientService {

    @Override
    public Iterable<Cliente> buscarTodos() {

        

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente buscarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void inserir(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deletar(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
