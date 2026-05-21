package com.example.nika.controller;

import com.example.nika.model.ClienteModel;
import com.example.nika.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteModel salvar(@RequestBody ClienteModel cliente) {
        return clienteService.salvar(cliente);
    }

    @GetMapping("/{id}")
    public ClienteModel buscar(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    @GetMapping
    public List<ClienteModel> listar() {
        return clienteService.listarTodos();
    }
}