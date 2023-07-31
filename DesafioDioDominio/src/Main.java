import Dominio.Curso;
import Dominio.Mentoria;
import Dominio.Bootcamp;
import Dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java Atualziado");
        curso1.setDescricao("descrição  do curso java feito em madasgascar ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascipt");
        curso2.setDescricao("descrição curso javascript feito em madasgascar");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java feito em madasgascar");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer feito em madasgascar");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Camila");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carlos:" + devCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());

        System.out.println("-------");

        Dev devBuk = new Dev();
        devBuk.setNome("Joao");
        devBuk.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Buk:" + devBuk.getConteudosInscritos());
        devBuk.progredir();
        devBuk.progredir();
        devBuk.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Buk:" + devBuk.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Buk:" + devBuk.getConteudosConcluidos());
        System.out.println("XP:" + devBuk.calcularTotalXp());

    }

}
