-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 23-Maio-2019 às 03:36
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
  `n1Arquitetura` double NOT NULL,
  `n2Arquitetura` double NOT NULL,
  `n1Calculo` double NOT NULL,
  `n2Calculo` double NOT NULL,
  `n1Ingles` double NOT NULL,
  `n2Ingles` double NOT NULL,
  `n1Legislacao` double NOT NULL,
  `n2Legislacao` double NOT NULL,
  `n1Mtc` double NOT NULL,
  `n2Mtc` double NOT NULL,
  `n1Poo` double NOT NULL,
  `n2Poo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `boletim`
--

INSERT INTO `boletim` (`id`, `n1Arquitetura`, `n2Arquitetura`, `n1Calculo`, `n2Calculo`, `n1Ingles`, `n2Ingles`, `n1Legislacao`, `n2Legislacao`, `n1Mtc`, `n2Mtc`, `n1Poo`, `n2Poo`) VALUES
(1, 100, 0, 62, 0, 75, 0, 75, 0, 85, 0, 86, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrar_aluno`
--

CREATE TABLE `cadastrar_aluno` (
  `id` int(11) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `nome_da_mae` varchar(60) NOT NULL,
  `nome_do_pai` varchar(60) NOT NULL,
  `celular` varchar(32) NOT NULL,
  `cpf` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastrar_aluno`
--

INSERT INTO `cadastrar_aluno` (`id`, `nome`, `endereco`, `nome_da_mae`, `nome_do_pai`, `celular`, `cpf`) VALUES
(1, 'Matheus de Sousa Alves', 'Rua Ignacy GoldField Qd. 33 Lt.17 - Jd. Canedo 1, S. Canedo', 'Sidinei Teixeira Alves', 'Sidinei Teixeira Alves', '(62) 99632-3360', '766.999.191-15'),
(2, 'ANDRE', 'RUA B3', 'MARIA', 'JOSÉ', '6299165-2315', '00785402160'),
(3, 'Silny N de Sousa Alves ', 'Rua Ignacy GoldField Qd. 33 Lt.17 - Jd. Canedo 1, S. Canedo', ' Iraci N. de Sousa', '', '(62) 99201-3639', '003.511.518.62'),
(4, 'Maria das Dores Silva', 'Rua 32B, Qd.36 Lt.15a - jd. Nova Esperança, S. Canedo-GO', 'Divina das Dores dos Santos', 'Joaquim Pereira da Silva ', '(62)99546-1560', '501.954.355-65');

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
(4, 'maria ', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `boletim`
--
ALTER TABLE `boletim`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `cadastrar_aluno`
--
ALTER TABLE `cadastrar_aluno`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login_professor`
--
ALTER TABLE `login_professor`
  ADD PRIMARY KEY (`id`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `cadastrar_aluno`
--
ALTER TABLE `cadastrar_aluno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `login_professor`
--
ALTER TABLE `login_professor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
