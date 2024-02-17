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

            if (password.length() != 8) {
                return false;
            }

            return true;

        }

        public ClientModel createClient(ClientModel client) {
            public ClientModel createClient (ClientModel client){
            }

        }

        public List<ClientModel> getAllClients() {
            public ClientModel getAllClients (ClientModel clients){
            }
        }
    }
