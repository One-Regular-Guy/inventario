package intraer.ccabr.inventario.bancodedados.repositories;

import intraer.ccabr.inventario.bancodedados.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
