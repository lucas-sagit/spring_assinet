create table usuarios (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        nome_completo VARCHAR(255),
        cpf VARCHAR(14),
        data_nascimento DATE,
        endereco VARCHAR(255),
        bairro VARCHAR(100),
        cep INT,
        status BOOLEAN,
        password VARCHAR(255),
        cargo VARCHAR(100),
        salario VARCHAR(50),
        email VARCHAR(255)
);