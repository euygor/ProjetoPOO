package projetopoo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ygor
 */
public class Consultas implements Cadastros{

    @Override
    public void cadastrofinalizado() {
        System.out.println("Cadastro finalizado com sucesso!");
    }

    @Override
    public void consultarcadastro() {
        System.out.println("Consulta realizada com sucesso!");
    }

    @Override
    public void excluircadastro() {
        System.out.println("Operação finalizada com sucesso!");
    }

    @Override
    public void consultartodoscadastros() {
        System.out.println("Consulta realizada com sucesso!");
    }

    @Override
    public void iniciarcadastro() {
    
        ArrayList<Pessoa> familia = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        Consultas c1 = new Consultas();



        int ct = 0;
        do {
            System.out.println("=========CADASTRO FAMILIAR==========");
            System.out.println("1 - Realizar Cadastro");
            System.out.println("2 - Buscar Cadastro");
            System.out.println("3 - Editar Cadastro");
            System.out.println("4 - Excluir Cadastro");
            System.out.println("5 - Imprimir todos os Cadastros");
            System.out.println("6 - Sair");
            
            System.out.println("====================================");
            
            int menu = entrada.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("====================================");
                    System.out.print("Nome: "); 
                    String nome = entrada.next();
                    System.out.print("Sobrenome: ");
                    String sobrenome = entrada.next();
                    System.out.print("CPF: "); 
                    int cpf = entrada.nextInt();
                    System.out.print("Data de Nascimento");
                    System.out.println("");
                    System.out.print("Dia: ");
                    int dia = entrada.nextInt();
                    System.out.print("Mês: ");
                    int mes = entrada.nextInt();
                    System.out.print("Ano: ");
                    int ano = entrada.nextInt();
                    System.out.println("");

                    familia.add(new Pessoa(nome,cpf,dia,mes,ano,sobrenome));
                    
                    c1.cadastrofinalizado();
                    System.out.println("====================================");
                    
                break;
                case 2:
                    System.out.println("====================================");
                    if(familia.size() == 1){
                    System.out.println("Tem "+familia.size()+" cadastro no sistema");
                    }else {
                    System.out.println("Tem "+familia.size()+" cadastros no sistema");
                    }
                    
                    if (familia.isEmpty()) {
                        System.out.println("...");
                    }else{
                    
                        System.out.print("Qual cadastro você deseja buscar? "); 
                        String buscar = entrada.next();
                        
                        for (int i = 0; i <familia.size(); i++) {
                            Pessoa idPessoa =  familia.get(i);
                            if (idPessoa.getNome().equalsIgnoreCase(buscar)) {
                                familia.get(i);
    System.out.println("Nome: " +idPessoa.getNome()+" "+idPessoa.getSobrenome()+ " CPF: "+idPessoa.getCpf()+" Data Nascimento: "+idPessoa.getDia()+"/"
    +idPessoa.getMes()+"/"+idPessoa.getAno());
                            }
                        }
                    }
                    System.out.println("");
                    c1.consultarcadastro();
                    System.out.println("====================================");
 
                break;
                case 3:
                    System.out.println("====================================");
                    if(familia.isEmpty()){
                        System.out.println("Não tem cadastros no sistema!");

                        break;
                        }
                    
                    System.out.print("Digite o nome da pessoa que deseja editar: ");
                    String buscar2;
                    buscar2 = entrada.next();
                    for(int i = 0; i < familia.size(); i++){
                        Pessoa idPessoa = familia.get(i);
                        if(idPessoa.getNome().equalsIgnoreCase(buscar2)){
                        int subMenu = 0;
                        
                        do{
                        System.out.println("================MENU================");
                        idPessoa = familia.get(i);    
                        System.out.println("1 - Alterar dados");
                        System.out.println("2 - Voltar para o Menu Principal");
                                
                        subMenu = entrada.nextInt();
                        switch (subMenu){
                            case 1:
                                int MenuDoSubMenu = 0;
                                do{
                                    System.out.println("================MENU================");
                                    idPessoa = familia.get(i);    
                                    System.out.println("1 - Alterar Nome e Sobrenome");
                                    System.out.println("2 - Alterar CPF");
                                    System.out.println("3 - Alterar Data de Nascimento");
                                    System.out.println("4 - Voltar para o Menu Anterior");                                    
                                    MenuDoSubMenu = entrada.nextInt();
                                    switch (MenuDoSubMenu){
                                        case 1:
                                        System.out.print("Digite o novo nome: ");
                                        String novoNome = entrada.next();
                                        System.out.print("Digite o novo sobrenome: ");
                                        String novoSobrenome = entrada.next();
                                        System.out.println("O nome será atualizado para: " + novoNome + " "+ novoSobrenome + ". Confirmar?");
                                        System.out.print("1 - Sim ");
                                        System.out.print("2 - Não");
                                        int op = 0;
                                        op = entrada.nextInt();
                                        switch(op){
                                            case 1:
                                                idPessoa.setNome(novoNome); idPessoa.setSobrenome(novoSobrenome);
                                                System.out.println("Cadastro atualizado com sucesso!");
                                                break;
                                            case 2:
                                                System.out.println("Operação cancelada!");
                                                break;
                                        }
                                        break;
                                        case 2:
                                        System.out.print("Digite o novo CPF: ");
                                        int novoCpf = entrada.nextInt();
                                        System.out.println("O CPF será atualizado para: " + novoCpf +". Confirmar?");
                                        System.out.print("1 - Sim ");
                                        System.out.print("2 - Não");
                                        int op2 = 0;
                                        op2 = entrada.nextInt();
                                        switch(op2){
                                            case 1:
                                                idPessoa.setCpf(novoCpf);
                                                System.out.println("Cadastro atualizado com sucesso!");
                                                break;
                                            case 2:
                                                System.out.println("Operação cancelada!");
                                                break;
                                        }    
                                        break;
                                        case 3:
                                        System.out.println("Digite nova Data de Nascimento: ");
                                        System.out.print("Dia: ");
                                        int novoDia = entrada.nextInt();
                                        System.out.print("Mês: ");
                                        int novoMes = entrada.nextInt();
                                        System.out.print("Ano: ");
                                        int novoAno = entrada.nextInt();
                                            
                                        System.out.println("A data de Nascimento será atualizado para: "+novoDia+"/"+novoMes+"/"+novoAno+". Confirmar?");
                                        System.out.print("1 - Sim ");
                                        System.out.print("2 - Não");
                                        int op3 = 0;
                                        op3 = entrada.nextInt();
                                        switch(op3){
                                            case 1:
                                                idPessoa.setDia(novoDia);idPessoa.setMes(novoMes);idPessoa.setAno(novoAno);
                                                System.out.println("Cadastro atualizado com sucesso!");
                                                break;
                                            case 2:
                                                System.out.println("Operação cancelada!");
                                                break;
                                        }
                                        break;
                                        case 4:
                                        MenuDoSubMenu = 4;
                                        break;
                                        default:
                                        MenuDoSubMenu = 0;
                                        break;
                                    }
                                }while(MenuDoSubMenu < 4);
                            break;
                            case 2:
                            subMenu = 2;
                            break;
                            default:
                            subMenu = 0;
                            break;
                        }  
                        }while(subMenu < 2);
                          
                        }
                    }
                    System.out.println("====================================");
                    break;
                case 4:
                    System.out.println("====================================");
                    if(familia.isEmpty()){
                        System.out.println("Não tem cadastros no sistema!");
                    break;
                    }
                    System.out.print("Qual cadastro deseja remover: ");
                    String rem= entrada.next();
                   
                    for (int i = 0; i <familia.size(); i++) {
                        Pessoa idCadastro =  familia.get(i);
                        if (idCadastro.getNome().equalsIgnoreCase(rem)) {
                            familia.remove(i);
                            System.out.println("O cadastro de " +idCadastro.getNome()+" "+idCadastro.getSobrenome()+" foi removido.");
                        }
                    }
                    System.out.println("");
                    c1.excluircadastro();
                    System.out.println("====================================");
                    
                break;
                case 5:
                    
                    System.out.println("====================================");
                    System.out.println("Nº    Nome    CPF    Data Nascimento");
                    System.out.println("");
                    if(familia.isEmpty()){
                        System.out.println("Não tem cadastros no sistema!");
                    break;
                    }

                    int n = 0;
                   
                    for(Pessoa p : familia){
                        n++;
System.out.println(n+" - "+p.getNome()+" "+p.getSobrenome()+"     "+p.getCpf()+"     "+p.getDia()+"/"
    +p.getMes()+"/"+p.getAno());
                    }
                    System.out.println("");
                    c1.consultartodoscadastros();
                    System.out.println("====================================");
                    
                break;
                case 6:
                    ct = 6;
                break;
                default:
                    ct = 0;
                break;
            }
            
        } while (ct<6);
    }
    
}
