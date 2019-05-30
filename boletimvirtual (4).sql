SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE DATABASE IF NOT EXISTS `boletimvirtual` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `boletimvirtual`;

DROP TABLE IF EXISTS `boletim`;
CREATE TABLE IF NOT EXISTS `boletim` (
  `id` int(11) NOT NULL,
  `id_aluno` int(11) NOT NULL,
  `id_disciplina` int(11) NOT NULL,
  `nota1` decimal(11,2) DEFAULT NULL,
  `nota2` decimal(11,2) DEFAULT NULL,
  `media` decimal(11,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_aluno` (`id_aluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `cadastrar_aluno`;
CREATE TABLE IF NOT EXISTS `cadastrar_aluno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `nome_da_mae` varchar(60) NOT NULL,
  `nome_do_pai` varchar(60) NOT NULL,
  `celular` varchar(32) NOT NULL,
  `cpf` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

INSERT INTO `cadastrar_aluno` (`id`, `nome`, `endereco`, `nome_da_mae`, `nome_do_pai`, `celular`, `cpf`) VALUES
(1, 'Matheus de Sousa Alves', 'Rua Ignacy GoldField Qd. 33 Lt.17 - Jd. Canedo 1, S. Canedo', 'Sidinei Teixeira Alves', 'Sidinei Teixeira Alves', '(62) 99632-3360', '766.999.191-15'),
(2, 'ANDRE DE PAULA', 'RUA B3', 'MARIA DAS DORES', 'JOSÉ', '(62) 99165-2315', '007.854.021-60'),
(3, 'Silny N de Sousa Alves ', 'Rua Ignacy GoldField Qd. 33 Lt.17 - Jd. Canedo 1, S. Canedo', ' Iraci N. de Sousa', '', '(62) 99201-3639', '516.198.166-12'),
(5, 'Ismair Dos Reis Silva Junior', 'Rua B4 ess. B5', 'Maria dos Reis', 'Ismair Silva ', '(62)98138-6588', '705.649.143-15'),
(6, 'Paulo Cesar Pereira Dias', 'rua B2 qd.15 Nº615 Ap.59', 'Vilma Dias ', 'Marcos Pereira da Silva', '(62) 99105-9764', '469.156.116-15'),
(7, 'MIKAEL DE SOUSA ALVES', 'RUA IGNACY GOLDFILD QD.33 LT.27 JD. CANEDO1 - S.CANEDO', 'SILNY N. DE SOUSA ALVES', 'SIDINEI TEIXEIRA ALVES', '(62)99102-7895', '987.464.621-32'),
(9, 'bkbvsdkbvk', 'kbsjkdv kk', 'bsdkjvbjkb\'kbjkwdvbkj\'\'', 'kjb kbsjkb', '(  )     -    ', '312.313.132-13');

DROP TABLE IF EXISTS `cursos`;
CREATE TABLE IF NOT EXISTS `cursos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomedocurso` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

INSERT INTO `cursos` (`id`, `nomedocurso`) VALUES
(1, 'Administração'),
(2, 'Ciências Contábeis'),
(3, 'Direito'),
(4, 'Enfermagem'),
(5, 'Jornalismo'),
(6, 'Odontologia'),
(7, 'Pedagogia'),
(8, 'Publicidade e Propaganda'),
(9, 'Relações Públicas'),
(10, 'Sistemas de Informação');

DROP TABLE IF EXISTS `disciplina`;
CREATE TABLE IF NOT EXISTS `disciplina` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomedisciplina` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;

INSERT INTO `disciplina` (`id`, `nomedisciplina`) VALUES
(1, 'INTRODUÇÃO À PROGRAMAÇÃO'),
(2, 'LÍNGUA PORTUGUESA'),
(3, 'LÓGICA COMPUTACIONAL'),
(4, 'MATEMÁTICA'),
(5, 'SISTEMAS DE INFORMAÇÃO'),
(6, 'TEORIAS DA ADMINISTRAÇÃO'),
(7, 'ARQUITETURA DE COMPUTADORES'),
(8, 'CÁLCULO DIFERENCIAL E INTEGRAL'),
(9, 'INGLÊS INSTRUMENTAL'),
(11, 'LEGISLAÇÃO EM INFORMÁTICA'),
(12, 'METODOLOGIA DO TRABALHO CIENTÍFICO'),
(14, 'PROGRAMAÇÃO ORIENTADA A OBJETOS '),
(15, 'BANCO DE DADOS'),
(16, 'ESTRUTURA DE DADOS'),
(17, 'MODELAGEM DE SISTEMAS'),
(18, 'PROBABILIDADE E ESTATÍSTICA'),
(19, 'SISTEMAS OPERACIONAIS'),
(20, 'TEORIA DA COMPUTAÇÃO'),
(21, 'ENGENHARIA DE SOFTWARE'),
(22, 'ÉTICA E FILOSOFIA'),
(23, 'GERENCIA DE PROJETOS '),
(24, 'INTERFACE HOMEM-MÁQUINA'),
(25, 'ORGANIZAÇÃO, SISTEMAS E MÉTODOS'),
(26, 'PRÁTICA DE BANCO DE DADOS'),
(27, 'ANÁLISE E PROJETO DOS SISTEMAS DE INFORMAÇÃO '),
(28, 'PROGRAMAÇÃO PARA INTERNET '),
(29, 'QUALIDADE DE TESTE DE SOFTWARE'),
(30, 'REDES DE COMPUTADORES'),
(31, 'SISTEMAS INTELIGENTES'),
(32, 'TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE '),
(33, 'ADMINISTRAÇÃO DE SISTEMAS DE INFORMAÇÃO'),
(34, 'APLICAÇÕES MÓVEIS '),
(35, 'COMPUTAÇÃO GRÁFICA'),
(36, 'PADRÕES DE PROJETO DE SOFTWARE'),
(37, 'PARADIGMAS DE PROGRAMAÇÃO'),
(38, 'SISTEMAS DISTRIBUÍDOS '),
(39, 'EMPREENDEDORISMO DIGITAL'),
(40, 'ESTÁGIO SUPERVISIONADO I'),
(41, 'GERÊNCIA DE REDES DE COMPUTADORES'),
(42, 'SEGURANÇA E AUDITORIA DE SISTEMAS DE INFORMAÇÃO'),
(43, 'TÓPICOS ESPECIAIS I'),
(44, 'TRABALHO DE CONCLUSÃO DE CURSO I'),
(45, 'ESTÁGIO SUPERVISIONADO II'),
(46, 'GOVERNANÇA DE T.I.'),
(47, 'OPTATIVA I'),
(48, 'TÓPICOS ESPECIAIS II'),
(49, 'TRABALHO DE CONCLUSÃO DE CURSO II');

DROP TABLE IF EXISTS `login_professor`;
CREATE TABLE IF NOT EXISTS `login_professor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(15) DEFAULT NULL,
  `senha` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

INSERT INTO `login_professor` (`id`, `login`, `senha`) VALUES
(1, 'master', '123'),
(2, 'paulocesar', '123');

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeUsuario` varchar(15) DEFAULT NULL,
  `senha` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

INSERT INTO `usuario` (`id`, `nomeUsuario`, `senha`) VALUES
(1, 'msalves', '14122000'),
(2, 'adps', '123'),
(3, 'silny', '123'),
(4, 'maria ', '123'),
(5, 'ismair', '123'),
(6, '', ''),
(7, 'mikael', '123'),
(8, 'teste', '123'),
(9, 'lsm', '21124'),
(10, 'Teso', '6894');


ALTER TABLE `boletim`
  ADD CONSTRAINT `id_aluno` FOREIGN KEY (`id_aluno`) REFERENCES `cadastrar_aluno` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
