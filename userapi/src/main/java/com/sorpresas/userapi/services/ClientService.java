package com.sorpresas.userapi.services;

import com.sorpresas.userapi.models.ClientModel;
import org.springframework.stereotype.Service;

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
}
