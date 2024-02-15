package com.sorpresas.userapi.services;

import com.sorpresas.userapi.models.ClientModel;
import org.springframework.stereotype.Service;

    @Service
    public class ClientService {
        public static boolean isValidPassword(String password) {
            if (password == null || password.isEmpty()) {
                return false;
            }

            if (password.length() != 8) {  // Aquí puedes poner cualquier longitud que desees
                return false;
            }

            return true;  // Si llega hasta aquí, la contraseña tiene la longitud correcta y se retorna true
        }
}
