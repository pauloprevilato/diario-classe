-- CREATE DATABASE
CREATE DATABASE diarioclasse
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'C'
       LC_CTYPE = 'C'
       CONNECTION LIMIT = -1;

-- CONNECT TO DATABASE
\c diarioclasse

-- CREATE TABLE disciplina
CREATE TABLE disciplina
(
  id bigserial NOT NULL,
  nome text,
  CONSTRAINT disciplina_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE disciplina
  OWNER TO postgres;

-- CREATE TABLE estudante
CREATE TABLE estudante
(
  id bigserial NOT NULL,
  nome text,
  CONSTRAINT estudante_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE estudante
  OWNER TO postgres;

-- CREATE TABLE presenca
CREATE TABLE presenca
(
  id bigserial NOT NULL,
  id_disciplina bigint NOT NULL,
  id_estudante bigint NOT NULL,
  CONSTRAINT presenca_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE presenca
  OWNER TO postgres;

 ALTER TABLE presenca ADD CONSTRAINT estudante_fkey FOREIGN KEY (id_estudante) REFERENCES estudante (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
 ALTER TABLE presenca ADD CONSTRAINT disciplina_fkey FOREIGN KEY (id_disciplina) REFERENCES disciplina (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
