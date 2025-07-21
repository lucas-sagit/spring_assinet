package services;

import model.funcionarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import repository.UsuarioRepository; fazendo teste com funcionario
import repository.funcionariosRepository;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private funcionariosRepository funcionariosRepository;

    public funcionarios authenticate(String username, String password) {
        funcionarios funcionario = funcionariosRepository.findByUsername(username);
        if (funcionario != null && funcionario.getPassword().equals(password) && Boolean.TRUE.equals(funcionario.getStatus())) {
            return funcionario;
        }
        return null;
    }
}
