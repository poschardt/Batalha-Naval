package ideias;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        public final linhas = 11, colunas = 11;
        Scanner scan = new Scanner();
        
        int jogadores = 0, player = 0;
        String nome;
        
        jogadores = verificaJogadores(scan);
        
        /***********************************************************************************************
         *********************** verificar como melhorar esse trecho **********************************/
        
        if(jogadores == 1)
        {
            while(player!= 1 || player != 3)
            {
                System.out.print("Digite 1 se é o 'Player 1' ou 3 para instanciar o 'Computador': ");
                player = scan.nextInt();
                
                if(player == 1)
                {   
                    System.out.print("Digite o nome do jogador: ");
                    nome = scan.next();
                    JogadorUm playerUm = new JogadorUm(nome, 1);
                }
                else if(player == 3)
                {
                    JogadorPC pc = new JogadorPC();
                }    
            }
        }
        else
        {
            while(player != 1 || player != 2)
            {
                System.out.print("Digite 1 para ser o 'Player 1' ou 2 para ser o 'Player 2': ");
                player = scan.nextInt();
                
                if(player == 1)
                {
                    JogadorUm playerUm = new JogadorUm(nome, 1);     
                }
                else if(player == 2)
                {
                    jogadorDois playerDois = new JogadorDois(nome, 2);
                }
            }
        }
        
        //*********************************************************************************************************************//
    }
    
    public int verificaJogadores(Scanner scan)
    {
        int jogadores = 0;
        while(jogadores != 1 || jogadores != 2)
        {
            System.out.print("Digite 1 para jogar contra o computador ou 2 para jogar contra outro adversario: ");
            jogadores = scan.nextInt();
        }
        return jogadores;
    }
}