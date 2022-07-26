package bg.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso JAVA");
		curso1.setDescricao("Inscrição 100% gratuita.");
		curso1.setCargaHoraria(30);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso Angular");
		curso2.setDescricao("Inscrição com 70% de desconto.");
		curso2.setCargaHoraria(30);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Soft Skills");
		mentoria.setDescricao("Inscrições abertas.");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Spring Boot Experience");
		bootcamp.setDescricao("Matrículas abertas");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGuilherme = new Dev();
		devGuilherme.setNome("Guilherme");
		devGuilherme.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos - Guilherme: " + devGuilherme.getConteudosInscritos());
		devGuilherme.progredir();
		System.out.println("Conteúdos concluídos - Guilherme: " + devGuilherme.getConteudosConcluidos());
		System.out.println("XP - Guilherme: " + devGuilherme.calcularTotalXp());
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos - João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteúdos concluídos - João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP - João: " + devJoao.calcularTotalXp());
		
		
		
		/*
		 * System.out.println(curso1.getTitulo() + " - " + curso1.getDescricao() + " - " + curso1.getCargaHoraria());
		System.out.println(curso2.getTitulo() + " - " + curso2.getDescricao() + " - " + curso2.getCargaHoraria());
		System.out.println(mentoria.getTitulo() + " - " + mentoria.getDescricao() + " - " + mentoria.getData());
		*/
	}

}
