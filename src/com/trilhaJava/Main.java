package com.trilhaJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Categoria categoria = new Categoria(1L,"salário","Salario Nttdata");
        Categoria categoria1 = new Categoria();
        categoria1.setId(2L);
        categoria1.setName("Beneficios");
        categoria1.setDescription("Beneficios referentes ao contrato CLT");
        System.out.println(categoria);
        System.out.println(categoria1);

        Lancamentos lancamentos = new Lancamentos(1L,"Salario","Salario sem desconto","entrada","3200","01/01/2022",true,1L);
        Lancamentos lancamentos1 = new Lancamentos();
        lancamentos1.setId(2L);
        lancamentos1.setName("Vale alimentação");
        lancamentos1.setDescription("Valor do vale alimentação");
        lancamentos1.setAmount("800");
        lancamentos1.setDate("30/12/2021");
        lancamentos1.setPaid(true);
        lancamentos1.setType("entrada");
        lancamentos1.setCategoryId(2L);

        System.out.println(lancamentos);
        System.out.println(lancamentos1);

        Produto p1 = new Produto(1L,"Arroz","Arroz nosso de cada dia",10.00);
        Produto p2 = new Produto(2L,"Feijão","Feijão para acompanhar o arroz",8.00);
        Produto p3 = new Produto(3L,"Refrigerante","Algo para beber com a comida",7.00);
        Produto p4 = new Produto(4L,"Suco","Para quem não gosta de refrigerante",6.50);
        Produto p5 = new Produto(5L,"Carne","Para quem não é vegano",40.00);

        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);
        listaProdutos.add(p5);

        listaProdutos.forEach(produto -> produto.setPrice(produto.getPrice()+10.00));
        System.out.println(listaProdutos);


        List<Produto> listaProdutosMaisCaros = listaProdutos.stream().sorted(Comparator.comparing(Produto::getPrice).reversed()).collect(Collectors.toList());

        System.out.println("Todos os Produtos");
        System.out.println(listaProdutos);
        System.out.println("Produtos mais caros");
        System.out.println(listaProdutosMaisCaros.subList(0,3));

    }
}
