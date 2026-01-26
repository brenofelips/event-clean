-- V1__criar_tabela_eventos

CREATE TABLE IF NOT EXISTS Eventos
(
    id           BIGSERIAL primary key,
    nome         VARCHAR(255) not null,
    descricao    TEXT         not null,
    idenficador  VARCHAR(255) not null unique,
    incio        TIMESTAMP    not null,
    fim          TIMESTAMP    not null,
    local_evento VARCHAR(255) not null,
    capacidade   INTEGER      not null,
    organizador  VARCHAR(255) not null,
    tipoEvento   VARCHAR(50)
)