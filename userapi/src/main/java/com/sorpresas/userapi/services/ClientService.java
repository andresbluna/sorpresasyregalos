package com.sorpresas.userapi.services;

import com.sorpresas.userapi.models.ClientModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class ClientService {
        public static boolean isValidPassword(String password) {
            if (password == null || password.isEmpty()) {
                return false;
            }

            return password.length() == 8;

        }

        public ClientModel createClient(ClientModel client) {
            return client;

            }


            public static boolean getClientById(Long clientId){

            return getClientById(clientId);

            }

    public List<ClientModel> getAllClients() {
            return getAllClients();
    }

    public ClientModel updateClient(Long clientId, ClientModel updatedClient) {
            return updatedClient;
    }

    public ClientModel deleteClient(Long clientId){
            return deleteClient(clientId);
    }
}
