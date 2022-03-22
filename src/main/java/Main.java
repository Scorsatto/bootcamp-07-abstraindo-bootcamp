import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFabiano = new Dev();
        devFabiano.setNome("Fabiano");
        devFabiano.increverBootcamp(bootcamp);
        devFabiano.progredir();

        Dev devMiriam = new Dev();
        devMiriam.setNome("Miriam");
        devMiriam.increverBootcamp(bootcamp);
        devMiriam.progredir();
        devMiriam.progredir();

        System.out.println(devFabiano.getConteudosInscritos());
        System.out.println(devFabiano.getConteudosConcluidos());
        System.out.println(devFabiano.calcularTotalXP());

        System.out.println(devMiriam.getConteudosInscritos());
        System.out.println(devMiriam.getConteudosConcluidos());
        System.out.println(devMiriam.calcularTotalXP());
    }
}
