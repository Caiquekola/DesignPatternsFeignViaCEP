package com.dpviacep.service.imp;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dpviacep.controller.dto.EnderecoDTO;
import com.dpviacep.model.Cliente;
import com.dpviacep.model.ClienteRepository;
import com.dpviacep.model.Endereco;
import com.dpviacep.model.EnderecoRepository;
import com.dpviacep.service.ClientService;
import com.dpviacep.service.ViaCepService;

@Service
public class ClienteServiceImp implements ClientService {

    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;
    private final ViaCepService viaceCepService;

    

    public ClienteServiceImp(ClienteRepository clienteRepository, EnderecoRepository enderecoRepository,
            ViaCepService viaceCepService) {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
        this.viaceCepService = viaceCepService;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get(); 
    }

    @Override
    public void inserir(Cliente cliente) {
        String cepCliente = cliente.getEndereco().getCep();
        Endereco enderecoCliente = enderecoRepository.findById(cepCliente).orElseGet(()->
        {
            EnderecoDTO enderecoDTO = viaceCepService.consultarCep(cepCliente);
            Endereco endereco = Endereco.toEntity(enderecoDTO);
            enderecoRepository.save(endereco);
            return endereco;
        });
        cliente.setEndereco(enderecoCliente);
        clienteRepository.save(cliente);
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
