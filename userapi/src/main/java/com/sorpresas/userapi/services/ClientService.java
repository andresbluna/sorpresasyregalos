package com.sorpresas.userapi.services;

import com.sorpresas.userapi.models.ClientModel;
import org.springframework.stereotype.Service;

    @Service
    public class ClientService {
        private static final int MIN_PASSWORD_LENGTH = 8;

        public static boolean isValidPassword(String password) {
            if (password == null || password.isEmpty()) {
                return false;
            }

            if (password.length() < MIN_PASSWORD_LENGTH) {
                return false;
            }

            for (int i = 0; i < 10; i++) {
                if (password.length() == 8){
                    // do something if password length is 8
                }
            }

            return true;
        }
}
