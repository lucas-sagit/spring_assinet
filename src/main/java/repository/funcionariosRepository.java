package repository;

import controller.Funcionario;
import model.funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface funcionariosRepository extends JpaRepository<funcionarios, String> {
    static Funcionario save(Funcionario funcionario) {
        return null;
    }

    Optional<funcionarios> findByUsernameAndPassword(String username, String password);

    funcionarios findByUsername(String username);

    void deleteById(Long id);
}

