-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 05-Jun-2019 às 04:53
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `boletimvirtual`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `boletim`
--

CREATE TABLE `boletim` (
  `id` int(11) NOT NULL,
  `id_aluno` int(11) NOT NULL,
  `id_disciplina` int(11) NOT NULL,
  `nota1` decimal(11,2) DEFAULT NULL,
  `nota2` decimal(11,2) DEFAULT NULL,
  `media` decimal(11,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `boletim`
--

INSERT INTO `boletim` (`id`, `id_aluno`, `id_disciplina`, `nota1`, `nota2`, `media`) VALUES
(1, 1, 2, '8.00', '8.00', '4.00'),
(2, 7, 1, '10.00', '6.00', NULL),
(3, 7, 2, '8.00', '9.00', NULL),
(4, 1, 1, '6.00', '9.00', NULL),
(5, 8, 4, '9.00', '8.00', NULL),
(6, 9, 4, '1.00', '10.00', NULL),
(7, 6, 17, '10.00', NULL, NULL),
(8, 1, 30, '9.00', NULL, NULL),
(9, 5, 5, '9.50', NULL, NULL),
(10, 2, 12, '10.00', '6.00', NULL),
(11, 7, 7, '8.00', NULL, NULL),
(12, 7, 7, '8.00', NULL, NULL),
(13, 11, 2, '8.00', NULL, NULL),
(14, 2, 3, '8.00', NULL, NULL),
(15, 5, 6, '8.00', NULL, NULL),
(16, 10, 2, '9.00', NULL, NULL),
(17, 2, 29, '8.00', '0.00', NULL),
(18, 10, 7, '8.00', '1.00', NULL),
(19, 7, 8, '8.20', '7.90', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cursos`
--

CREATE TABLE `cursos` (
  `id` int(11) NOT NULL,
  `nomedocurso` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cursos`
--

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

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `id` int(11) NOT NULL,
  `nomedisciplina` varchar(255) DEFAULT NULL,
  `idcurso` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`id`, `nomedisciplina`, `idcurso`) VALUES
(1, 'INTRODUÇÃO À PROGRAMAÇÃO', 10),
(2, 'LÍNGUA PORTUGUESA', 10),
(3, 'LÓGICA COMPUTACIONAL', 10),
(4, 'MATEMÁTICA', 10),
(5, 'SISTEMAS DE INFORMAÇÃO', 10),
(6, 'TEORIAS DA ADMINISTRAÇÃO', 10),
(7, 'ARQUITETURA DE COMPUTADORES', 10),
(8, 'CÁLCULO DIFERENCIAL E INTEGRAL', 10),
(9, 'INGLÊS INSTRUMENTAL', 10),
(10, 'LEGISLAÇÃO EM INFORMÁTICA', 10),
(11, 'METODOLOGIA DO TRABALHO CIENTÍFICO', 10),
(12, 'PROGRAMAÇÃO ORIENTADA A OBJETOS ', 10),
(13, 'BANCO DE DADOS', 10),
(14, 'ESTRUTURA DE DADOS', 10),
(15, 'MODELAGEM DE SISTEMAS', 10),
(16, 'PROBABILIDADE E ESTATÍSTICA', 10),
(17, 'SISTEMAS OPERACIONAIS', 10),
(18, 'TEORIA DA COMPUTAÇÃO', 10),
(19, 'ENGENHARIA DE SOFTWARE', 10),
(20, 'ÉTICA E FILOSOFIA', 10),
(21, 'GERENCIA DE PROJETOS ', 10),
(22, 'INTERFACE HOMEM-MÁQUINA', 10),
(23, 'ORGANIZAÇÃO, SISTEMAS E MÉTODOS', 10),
(24, 'PRÁTICA DE BANCO DE DADOS', 10),
(25, 'ANÁLISE E PROJETO DOS SISTEMAS DE INFORMAÇÃO ', 10),
(26, 'PROGRAMAÇÃO PARA INTERNET ', 10),
(27, 'QUALIDADE DE TESTE DE SOFTWARE', 10),
(28, 'REDES DE COMPUTADORES', 10),
(29, 'SISTEMAS INTELIGENTES', 10),
(30, 'TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE ', 10),
(31, 'ADMINISTRAÇÃO DE SISTEMAS DE INFORMAÇÃO', 10),
(32, 'APLICAÇÕES MÓVEIS ', 10),
(33, 'COMPUTAÇÃO GRÁFICA', 10),
(34, 'PADRÕES DE PROJETO DE SOFTWARE', 10),
(35, 'PARADIGMAS DE PROGRAMAÇÃO', 10),
(36, 'SISTEMAS DISTRIBUÍDOS ', 10),
(37, 'EMPREENDEDORISMO DIGITAL', 10),
(38, 'ESTÁGIO SUPERVISIONADO I', 10),
(39, 'GERÊNCIA DE REDES DE COMPUTADORES', 10),
(40, 'SEGURANÇA E AUDITORIA DE SISTEMAS DE INFORMAÇÃO', 10),
(41, 'TÓPICOS ESPECIAIS I', 10),
(42, 'TRABALHO DE CONCLUSÃO DE CURSO I', 10),
(43, 'ESTÁGIO SUPERVISIONADO II', 10),
(44, 'GOVERNANÇA DE T.I.', 10),
(45, 'OPTATIVA I', 10),
(46, 'TÓPICOS ESPECIAIS II', 10),
(47, 'TRABALHO DE CONCLUSÃO DE CURSO II', 10);

-- --------------------------------------------------------

--
-- Estrutura da tabela `login_professor`
--

CREATE TABLE `login_professor` (
  `id` int(11) NOT NULL,
  `login` varchar(15) DEFAULT NULL,
  `senha` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `login_professor`
--

INSERT INTO `login_professor` (`id`, `login`, `senha`) VALUES
(1, 'master', '123'),
(2, 'paulocesar', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_aluno`
--

CREATE TABLE `tbl_aluno` (
  `id` int(11) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `nome_da_mae` varchar(60) NOT NULL,
  `nome_do_pai` varchar(60) NOT NULL,
  `celular` varchar(32) NOT NULL,
  `cpf` varchar(32) NOT NULL,
  `idcurso` int(11) NOT NULL,
  `idboletim` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbl_aluno`
--

INSERT INTO `tbl_aluno` (`id`, `nome`, `endereco`, `nome_da_mae`, `nome_do_pai`, `celular`, `cpf`, `idcurso`, `idboletim`) VALUES
(1, 'Matheus de Sousa Alves', 'Rua Ignacy GoldField Qd. 33 Lt.17 - Jd. Canedo 1, S. Canedo', 'Sidinei Teixeira Alves', 'Sidinei Teixeira Alves', '(62) 99632-3360', '766.999.191-15', 10, NULL),
(2, 'ANDRE DE PAULA', 'RUA B3', 'MARIA DAS DORES', 'JOSÉ', '(62) 99165-2315', '007.854.021-60', 10, NULL),
(3, 'Silny N de Sousa Alves ', 'Rua Ignacy GoldField Qd. 33 Lt.17 - Jd. Canedo 1, S. Canedo', ' Iraci N. de Sousa', '', '(62) 99201-3639', '516.198.166-12', 10, NULL),
(4, 'Ismair Dos Reis Silva Junior', 'Rua B4 ess. B5', 'Maria dos Reis', 'Ismair Silva ', '(62)98138-6588', '705.649.143-15', 10, NULL),
(5, 'Paulo Cesar Pereira Dias', 'rua B2 qd.15 Nº615 Ap.59', 'Vilma Dias ', 'Marcos Pereira da Silva', '(62) 99105-9764', '469.156.116-15', 10, NULL),
(6, 'MIKAEL DE SOUSA ALVES', 'RUA IGNACY GOLDFILD QD.33 LT.27 JD. CANEDO1 - S.CANEDO', 'SILNY N. DE SOUSA ALVES', 'SIDINEI TEIXEIRA ALVES', '(62)99102-7895', '987.464.621-32', 10, NULL),
(7, 'Bianca Azevedo', 'Rua da Divisa Qd. 54 Lt 33', 'MARIA DIVINA', 'Francisco dos reis', '(  )      -    ', '312.313.132-13', 10, NULL),
(8, 'Gabriel', 'Rua b5 Qd.69 Lt.', 'nlsnvkladn', 'nvklanl', '(86)74864-6878', '556.484.684-68', 10, NULL),
(9, 'Maike de Sousa dos Santos', '', 'tereza de jesus', '', '(62) 99105-9764', '469.156.116-15', 10, NULL),
(10, 'Marcos de Oliveira', 'Av. da divisa ', 'Andreia', 'Raimundo', '(62)99421-3513', '798.946.542-33', 10, NULL),
(11, '', '', '', '', '(  )     -    ', '   .   .   -  ', 10, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nomeUsuario` varchar(15) DEFAULT NULL,
  `senha` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

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
(10, 'Teso', '6894'),
(11, 'FRANCISCO', '123'),
(12, 'msd', '123'),
(13, 'MAIKE', '123'),
(14, 'marcos', '123'),
(15, '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `boletim`
--
ALTER TABLE `boletim`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_aluno` (`id_aluno`),
  ADD KEY `id_disciplina` (`id_disciplina`);

--
-- Indexes for table `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idcurso` (`idcurso`);

--
-- Indexes for table `login_professor`
--
ALTER TABLE `login_professor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_aluno`
--
ALTER TABLE `tbl_aluno`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_cursos` (`idcurso`),
  ADD KEY `fk_idboletim` (`idboletim`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `boletim`
--
ALTER TABLE `boletim`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `cursos`
--
ALTER TABLE `cursos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `disciplina`
--
ALTER TABLE `disciplina`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `login_professor`
--
ALTER TABLE `login_professor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_aluno`
--
ALTER TABLE `tbl_aluno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `boletim`
--
ALTER TABLE `boletim`
  ADD CONSTRAINT `boletim_ibfk_1` FOREIGN KEY (`id_disciplina`) REFERENCES `disciplina` (`id`),
  ADD CONSTRAINT `id_aluno` FOREIGN KEY (`id_aluno`) REFERENCES `tbl_aluno` (`id`);

--
-- Limitadores para a tabela `disciplina`
--
ALTER TABLE `disciplina`
  ADD CONSTRAINT `disciplina_ibfk_1` FOREIGN KEY (`idcurso`) REFERENCES `cursos` (`id`);

--
-- Limitadores para a tabela `tbl_aluno`
--
ALTER TABLE `tbl_aluno`
  ADD CONSTRAINT `fk_cursos` FOREIGN KEY (`idcurso`) REFERENCES `cursos` (`id`),
  ADD CONSTRAINT `tbl_aluno_ibfk_1` FOREIGN KEY (`idcurso`) REFERENCES `cursos` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
