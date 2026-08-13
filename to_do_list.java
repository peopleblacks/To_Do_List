package To_do_list;
import java.util.Scanner;
import java.util.ArrayList;

public class to_do_list {

public static void main (String[] args){

ArrayList <String> lista = new ArrayList<>();
Scanner entrada = new Scanner(System.in);


System.out.println("=== Essa é sua lista pessoal de afazeres ===");
System.out.println("=== Você poderá adicionar, listar como feita e excluir tarefas da sua lista ===");
System.out.println("=== Para começar, insira a primeira tarefa ===");

String item_lista = entrada.nextLine().trim().toLowerCase();
lista.add(item_lista);


System.out.println("=== Ótimo, caso deseje adicionar mais tarefas, continue, caso deseje encerrar o programa, digite sair");

String pos_item = "";

do{

pos_item = entrada.nextLine().trim().toLowerCase();

if(!pos_item.equals("sair")){

    lista.add(pos_item);
}

}while(!pos_item.equals("sair") );

System.out.println("=== Caso deseje ver a lista completa, digite 1 ===");

int i = entrada.nextInt();

if ( i == 1){

System.out.println(lista);

}

System.out.println("=== Agora, caso deseje exlcuir uma tarefa, digite 2 ===");

int excluir = entrada.nextInt();

if(excluir == 2){

for(int b = 0; b < lista.size(); b++){

System.out.println(b + "" + lista.get(b));

}

}


entrada.close();
}
   
}
