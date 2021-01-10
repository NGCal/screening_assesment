/*
CREATE TABLE countries (
code CHAR(2) NOT NULL,
year INT NOT NULL,
gdp_per_capita DECIMAL(10, 2) NOT NULL,
govt_debt DECIMAL(10, 2) NOT NULL
); */

Select code, round(avg(govt_debt) * 100/sum(gdp_per_capita)) as " average government debts in percent of the gdp_per_capita" from countries where year between year(current_date()) - 4 and year(current_date()) group by code having min(gdp_per_capita) > 39999.99 ORDER by 2 DESC limit 3;