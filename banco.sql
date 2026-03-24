CREATE TABLE eventos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data DATE NOT NULL,
    local VARCHAR(100) NOT NULL,
    descricao TEXT,

    CONSTRAINT chk_nome CHECK (CHAR_LENGTH(nome) > 3)
);

CREATE INDEX idx_nome_evento ON eventos(nome);
