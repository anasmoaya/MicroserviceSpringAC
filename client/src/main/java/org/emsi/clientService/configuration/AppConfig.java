package org.emsi.clientService.configuration;

import org.emsi.clientService.entities.Client;
import org.emsi.clientService.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean

    public CommandLineRunner initialiserBaseH2(ClientRepository clientRepository){

        return args -> {
            clientRepository.save(new Client(Long.parseLong("1") , "Rabab Fahssi" , Float.parseFloat("22")));
            clientRepository.save(new Client(Long.parseLong("2") , "Khlid tarrou" , Float.parseFloat("20")));
            clientRepository.save(new Client(Long.parseLong("3") , "Amellal zakaria" , Float.parseFloat("80")));
        };

    }
}
