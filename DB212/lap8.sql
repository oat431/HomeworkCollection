CREATE TABLE `company_version_two`.`employee` (
  `Emp_no` INT NOT NULL AUTO_INCREMENT,
  `birth_date` DATE NOT NULL,
  `frist_name` VARCHAR(14) NOT NULL,
  `last_name` VARCHAR(16) NOT NULL,
  `sex` VARCHAR(1) NOT NULL,
  `hire_date` DATE NOT NULL,
  PRIMARY KEY (`Emp_no`));
  
  
CREATE TABLE `company_version_two`.`departments` (
  `dept_no` VARCHAR(4) NOT NULL,
  `dept_name` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`dept_no`));
 
 CREATE TABLE `company_version_two`.`manger_table` (
  `Emp_no` INT NOT NULL,
  `manger_no` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`manger_no`),
  CONSTRAINT `Emp_no`
    FOREIGN KEY (`Emp_no`)
    REFERENCES `company_version_two`.`employee` (`Emp_no`));
    
CREATE TABLE `company_version_two`.`labor` (
  `Emp_no` INT NOT NULL,
  `labor_id` INT NOT NULL AUTO_INCREMENT,
  `repositbilty` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`labor_id`),
  CONSTRAINT `Emp_no`
    FOREIGN KEY (`Emp_no`)
    REFERENCES `company_version_two`.`employee` (`Emp_no`));

CREATE TABLE `company_version_two`.`dept_manger` (
  `dept_no` VARCHAR(4) NOT NULL,
  `manger_no` INT NOT NULL,
  `from_date` DATE NOT NULL,
  `to_date` DATE NOT NULL,
  PRIMARY KEY (`dept_no`),
  CONSTRAINT `manager_no`
    FOREIGN KEY (`manger_no`)
    REFERENCES `company_version_two`.`manger_table` (`manger_no`));

CREATE TABLE `company_version_two`.`dept_emp` (
  `dept_no` VARCHAR(4) NOT NULL,
  `labor_no` INT NOT NULL,
  `from_date` DATE NOT NULL,
  `to_date` DATE NOT NULL,
  PRIMARY KEY (`dept_no`),
  CONSTRAINT `labor_no`
    FOREIGN KEY (`labor_no`)
    REFERENCES `company_version_two`.`labor` (`labor_id`));

CREATE TABLE `company_version_two`.`title` (
  `emp_no` INT NOT NULL,
  `title` VARCHAR(50) NOT NULL,
  `from_date` DATE NOT NULL,
  `to_date` DATE NOT NULL,
  PRIMARY KEY (`title`),
  CONSTRAINT `emp_no`
    FOREIGN KEY (`emp_no`)
    REFERENCES `company_version_two`.`employee` (`Emp_no`));
    
 CREATE TABLE `company_version_two`.`salary` (
  `emp_no` INT NOT NULL,
  `salary` INT NOT NULL,
  `from_date` DATE NOT NULL,
  `to_date` DATE NOT NULL,
  PRIMARY KEY (`emp_no`, `from_date`, `to_date`),
  CONSTRAINT `emp_no`
    FOREIGN KEY (`emp_no`)
    REFERENCES `company_version_two`.`employee` (`Emp_no`));

  