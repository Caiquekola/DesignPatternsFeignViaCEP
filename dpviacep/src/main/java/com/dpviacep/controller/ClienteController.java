package com.dpviacep.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpviacep.model.Cliente;
import com.dpviacep.model.Endereco;
import com.dpviacep.service.imp.ClienteServiceImp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dpviacep.controller.dto.EnderecoDTO;

import org.springframework.web.bind.annotation.PutMapping;





@RestController 
@RequestMapping("clientes")
public class ClienteController {
    
    private final ClienteServiceImp clienteServiceImp;

    public ClienteController(ClienteServiceImp clienteServiceImp) {
        this.clienteServiceImp = clienteServiceImp;
    }

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteServiceImp.buscarTodos());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(clienteServiceImp.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente); 
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> inserir(@PathVariable Long id,@RequestBody Cliente cliente) {
        clienteServiceImp.atualizar(id, cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente); 
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> inserir(@PathVariable Long id) {
        clienteServiceImp.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); 
    }
    

}
