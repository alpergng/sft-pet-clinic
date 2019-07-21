package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Ag on 21.7.2019
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet bet);

    Set<Vet> findAll();
}
