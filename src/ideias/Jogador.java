package ideias;
public class Jogador
{
	private String nomeJogador;
	private int player;
    
    Arquivo arq;

	public Jogador(String nome, int player)
	{
		nomeJogador = nome;
		this.player = player;
	}
    
    public Jogador(int player)
    {
        jogador("Computador", player);
    }
    
	public Jogador()
	{
		this.nome = "SemNome";
		this.player = 0;
	}

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setPlayer(int player)
    {
        this.player = player;
    }

    public int getPlayer()
    {
        return player;
    }

    public void posicionarNavios()
    {
        arq = new Arquivo();
        //rever tudo isso que está abaixo
    
        public char orientacaoInsercao()
        {
            char orientacao;
            orientacao = scan.next().charAt(0);
            return orientacao;
        }
    
        public String posicaoInsercao()
        {
            String posicao;
            posicao = scan.next().charAt(0);
            posicao += scan.next().charAt(1);
            return posicao;
        }
        
    }

    public void posicaoJogadas()
    {
        while()
        {
            verificarPosicaoAtaque();
        }
    }
    

    public void verificarPosicaoAtaque()
    {
        boolean fimJogo = arq.verificarFim();
        if(!fimJogo)
        {
            int linha, coluna;
            String posicao;
            boolean achou = arq.buscarPosicao();
            /*Deveria retornar a posição também, verificar se é posivel retornar um boolean e uma String, 
              em caso afirmativo, deve-se pegar a posição que está na String e converter para inteiro.
              Ficando assim com a linha e coluna que deve ser passada ao metodo que irá alterar o caracter.
            */
            if(achou)
            {
                //coverterPosicao no formato String para inteiro em linha e coluna;
                setTabuleiro('X', linha, coluna)
            }    
        }
        else
        {
            String nomeVencedor = arq.nomeVencedor();
            /*colocar o nome do Jogador vencedor na primeira linha do programa.
              Primeiro colocar a frase Derrotado no inicio do arquivo, e apagar todo o restante. 
              Criar o metodo que vai verificar quando a primeira frase for derrotado, quando for derrotado deverá atribuir true para uma variavel auxiliar no metodo verificaFim.
              Em seguida escrever o nome do vencedor no inicio do arquivo e apagar a frase derrotado e retornar a variavel com o boolean.
              Por fim só restará o nome do vencedor no arquivo, e o metodo nomeVencedor deve ler o arquivo e retornar o nome do vencedor. 
            */
            System.out.println("Fim de jogo! Você foi derrotado por: " + nomeVencedor);
        }
        
    }

}