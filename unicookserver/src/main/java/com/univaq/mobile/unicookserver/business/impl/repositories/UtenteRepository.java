package com.univaq.mobile.unicookserver.business.impl.repositories;

import com.univaq.mobile.unicookserver.domain.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {

    Utente findByUsername(String username);

}
