package com.goit.client;

import java.util.List;

public interface ClientDaoService {
    Client create(Client client);

    Client getById(Long id);

    Client update(Client client);

    void deleteById(Long id);

    List<Client> getAll();
}
