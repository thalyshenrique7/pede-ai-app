package com.api.pedeai.services;

import com.api.pedeai.models.ClienteModel;
import com.api.pedeai.repositories.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteService {
    final ClienteRepository clienteRepository;
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Optional<ClienteModel> findById(Integer id){
        return clienteRepository.findById(id);
    }

    @Transactional
    public ClienteModel save(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

    @Transactional
    public void delete(ClienteModel clienteModel){
        clienteRepository.delete(clienteModel);
    }
}