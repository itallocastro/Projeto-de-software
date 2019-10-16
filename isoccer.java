/**
 * isoccer
 */
import java.util.Scanner;

 public class isoccer 
{
    static void clearsoccer()
    {
        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    static void inicializar_matriz(String[][] matriz)
    {
        for(int i=0;i<matriz.length;i++)
        {
            for(int j=0;j<matriz[0].length;j++)
            {
                matriz[i][j]="-1";
            }
        }
    }
    static void add_simples(String[][] matriz, int escolha, int[]array_qnt)
    {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<matriz.length;i++)
        {
            
            if("1".equals(matriz[i][0]) && escolha==1)
            {
                System.out.printf("JÁ EXISTE UM PRESIDENTE\n");
                return;

            }
            else if("4".equals(matriz[i][0]) && escolha==4)
            {
                System.out.printf("JÁ EXISTE UM TÉCNICO\n");
                return;   
            }
        }
        for(int i=0;i<matriz.length;i++)
        {
            
            if("-1".equals(matriz[i][0]))
            {
                if(escolha==1)
                {
                    array_qnt[1]++;
                    matriz[i][0] = "1";
                }
                else if(escolha==3)
                {
                    array_qnt[3]++;
                    matriz[i][0] = "3";
                }
                else if(escolha==4)
                {
                    array_qnt[4]++;
                    matriz[i][0] = "4";

                }
                else if(escolha==5)
                {
                    array_qnt[5]++;
                    matriz[i][0] = "5";

                }
                else if(escolha==7)
                {
                    array_qnt[7]++;
                    matriz[i][0] = "7";
                }
                System.out.printf("DIGITE O NOME: "); 
                matriz[i][1] = input.nextLine(); //nome
                System.out.println();

                System.out.printf("DIGITE O CPF: ");
                matriz[i][2] = input.nextLine(); // cpf
                System.out.println();

                System.out.printf("DIGITE O E-MAIL: ");
                matriz[i][3] = input.nextLine(); // email
                System.out.println();

                System.out.printf("DIGITE O TELEFONE: ");
                matriz[i][4] = input.nextLine(); // telefone
                System.out.println();

                System.out.printf("DIGITE O SALÁRIO: ");
                matriz[i][5] = input.nextLine(); // salario
                System.out.println();

                System.out.println("ADICIONADO COM SUCESSO!");
                break;

            }
        }
    }
    static void add_composto(String[][] matriz,int escolha,int[] array_qnt)
    {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<matriz.length;i++)
        {
            
            if("-1".equals(matriz[i][0]))
            {

                System.out.printf("DIGITE O NOME: ");
                matriz[i][1] = input.nextLine(); //nome
                System.out.println();

                System.out.printf("DIGITE O CPF: ");
                matriz[i][2] = input.nextLine(); // cpf
                System.out.println();

                System.out.printf("DIGITE O E-MAIL: ");
                matriz[i][3] = input.nextLine(); // email
                System.out.println();

                System.out.printf("DIGITE O TELEFONE: ");
                matriz[i][4] = input.nextLine(); // telefone
                System.out.println();

                System.out.printf("DIGITE O SALÁRIO: ");
                matriz[i][5] = input.nextLine(); // salario
                System.out.println();

                if(escolha==2)
                {
                    array_qnt[2]++;
                    matriz[i][0] = "2"; 
                    System.out.printf("DIGITE O CRM: ");
                    matriz[i][6] = input.nextLine(); // crm
                    System.out.println();
                }
                else if(escolha==6)
                {
                    array_qnt[6]++;
                    matriz[i][0] = "6"; 
                    System.out.printf("DIGITE O NÚMERO DA HABILITAÇÃO: ");
                    matriz[i][7] = input.nextLine(); // habilitacao
                    System.out.println();
                }
                else
                {
                    array_qnt[8]++;
                    matriz[i][0] = "8"; 
                    System.out.printf("DIGITE A POSIÇÃO DO JOGADOR: ");
                    matriz[i][8] = input.nextLine(); // posicao
                    System.out.println();

                    System.out.printf("DIGITE 'A',PARA APTO, OU 'I', PARA INAPTO, PARA SITUAÇÃO DO JOGADOR: ");
                    matriz[i][9] = input.nextLine(); // apto ou nao
                    System.out.println();
                }
                System.out.println("ADICIONADO COM SUCESSO!");
                break;

            }
        }

    }
    static void adicionar_socio(String[][] matriz, Float[] categorias_socio)
    {
        Scanner input = new Scanner(System.in);
        int digito;
        float cast;

        for(int i=0;i<matriz.length;i++)
        {
            
            if("-1".equals(matriz[i][1]))
            {
                
                System.out.printf("DIGITE O NOME: ");
                matriz[i][1] = input.nextLine(); //nome

                System.out.printf("\nDIGITE O CPF: ");
                matriz[i][2] = input.nextLine(); // cpf

                System.out.printf("\nDIGITE O E-MAIL: ");
                matriz[i][3] = input.nextLine(); // email

                System.out.printf("\nDIGITE O TELEFONE: ");
                matriz[i][4] = input.nextLine(); // telefone

                System.out.printf("\nDIGITE O ENDEREÇO: ");
                matriz[i][5] = input.nextLine(); // endereco

                System.out.printf("DIGITE O VALOR DO SÓCIO-TORCEDOR : [1] %.2f [2] %.2f [3] %.2f\n", categorias_socio[0], categorias_socio[1], categorias_socio[2]);
                digito = input.nextInt();
                input.nextLine();

                if(digito==1)
                {
                    matriz[i][6] = String.valueOf(categorias_socio[0]);// valor de contribuicao

                }
                else if(digito==2)
                {
                    matriz[i][6] = String.valueOf(categorias_socio[1]);
                }
                else if(digito==3)
                {
                    matriz[i][6] = String.valueOf(categorias_socio[2]);
                }
                cast = Float.parseFloat(matriz[i][6]);
                if(cast>=categorias_socio[0] && cast<categorias_socio[1])
                {
                 matriz[i][7] = "Júnior"; // tipo socio     
                }
                else if(cast >=categorias_socio[1] && cast < categorias_socio[2])
                {
                    matriz[i][7] = "Sênior";
                }
                else
                {
                    matriz[i][7] = "Elite";
                }
                System.out.printf("\nDIGITE A ADIMPLÊNCIA, 'A' PARA ADIMPLENTE E 'N' PARA NÃO ADIMPLENTE:");
                matriz[i][8] = input.nextLine(); // adimplente ou não
                


                
                System.out.println("ADICIONADO COM SUCESSO!");
                break;

            }
        }
    }
    static void editar_socio(String[][] matriz,String cpf_busca,int escolha)
    {
        Scanner input = new Scanner(System.in);
        int indice_do_nome=-1;
        for(int i=0;i<matriz.length;i++)
        {
            if(matriz[i][2].equals(cpf_busca))
            {
                indice_do_nome = i;
            }
        }
        if(indice_do_nome==-1)
        {
            System.out.printf("CPF NÃO CONSTA\n");
            return;

        }
        System.out.printf("NOVA SITUAÇÃO,'A' OU 'N': ");
        matriz[indice_do_nome][8] = input.nextLine();

        System.out.println("SITUAÇÃO ATUALIZADA:");

        for(int i=1;i<=8;i++)
        {
            System.out.printf("%s ", matriz[indice_do_nome][i]);           
        }
        System.out.println();
    }
    static void atualiza_categorias(String[][] matriz, Float[] categorias_socio)
    {
        Float cast;
        for(int i=0;i<matriz.length;i++)
        {
                cast = Float.parseFloat(matriz[i][6]);
                if(cast>=categorias_socio[0] && cast<categorias_socio[1])
                {
                 matriz[i][7] = "Júnior"; // tipo socio     
                }
                else if(cast >=categorias_socio[1] && cast < categorias_socio[2])
                {
                    matriz[i][7] = "Sênior";
                }
                else
                {
                    matriz[i][7] = "Elite";
                }
        }
    }
    static void valorcategorias(String[][] matriz, Float[] categorias_contribuicao)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("NOVO VALOR PARA A CATEGORIA JÚNIOR: ");
        categorias_contribuicao[0] = input.nextFloat();
        System.out.println();

        System.out.printf("NOVO VALOR PARA A CATEGORIA SÊNIOR: ");
        categorias_contribuicao[1] = input.nextFloat();
        System.out.println();

        System.out.printf("NOVO VALOR PARA A CATEGORIA ELITE: ");
        categorias_contribuicao[2] = input.nextFloat();
        System.out.println();

        atualiza_categorias(matriz,categorias_contribuicao);
    }
    static void dados_estadio(String[][] estadio_dados)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("DIGITE O NOME DO ESTÁDIO: ");
        estadio_dados[0][0] = input.nextLine();
        System.out.println();

        System.out.printf("DIGITE A CAPACIDADE DO ESTÁDIO: ");
        estadio_dados[0][1] = input.nextLine();
        System.out.println();

        System.out.printf("DIGITE A QUANTIDADE DE BANHEIROS DO ESTÁDIO: ");
        estadio_dados[0][2] = input.nextLine();
        System.out.println();

        System.out.printf("DIGITE A QUANTIDADE DE LANCHONETES DO ESTÁDIO: ");
        estadio_dados[0][3] = input.nextLine();
        System.out.println();
       
    }
    static void editar_dados_estadio(String[][] estadio_dados)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("DIGITE A NOVA CAPACIDADE DO ESTÁDIO: ");
        estadio_dados[0][1] = input.nextLine();
        System.out.println();

        System.out.printf("DIGITE A NOVA QUANTIDADE DE BANHEIROS DO ESTÁDIO: ");
        estadio_dados[0][2] = input.nextLine();
        System.out.println();

        System.out.printf("DIGITE A NOVA QUANTIDADE DE LANCHONETES DO ESTÁDIO: ");
        estadio_dados[0][3] = input.nextLine();
        System.out.println();

        System.out.printf("DADOS ATUALIZADOS!\n");
        System.out.printf("NOME DO ESTÁDIO: %s\nCAPACIDADE: %s\nNÚMERO DE BANHEIROS: %s\nNÚMERO DE LANCHONETES: %s\n", estadio_dados[0][0],estadio_dados[0][1],estadio_dados[0][2],estadio_dados[0][3]); 

    }
    static void dados_ct(String[][] ct_DADOS)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("DIGITE O NOME DO CT: ");
        ct_DADOS[0][0] = input.nextLine();
        System.out.println();

        System.out.printf("DIGITE A QUANTIDADE DE DORMITÓRIOS DO CT ");
        ct_DADOS[0][1] = input.nextLine();
        System.out.println();
    }
    static void editar_dados_CT(String[][] ct_DADOS)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("DIGITE A NOVA QUANTIDADE DE DORMITÓRIOS DO CT: ");
        ct_DADOS[0][1] = input.nextLine();
        System.out.println();

        System.out.printf("DADOS ATUALIZADOS!\n");
        System.out.printf("NOME DO CT: %s\nQUANTIDADE DE DORMITÓRIOS: %s\n", ct_DADOS[0][0],ct_DADOS[0][1]); 

    }
    static void relatorio_time(String[][] matriz_time,int opcao)
    {
        int flag = -1,flag2=-1;
       for(int i=0;i<matriz_time.length;i++)
       {
           if(matriz_time[i][0].equals("4") && opcao!=2)
           {
               System.out.printf("TÉCNICO = %s // %s // %s // %s // %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5]);
               flag=1;
               break;
           }
       }
       if(flag==-1)
       {
           System.out.printf("ESTAMOS SEM TÉCNICO\n");
           
       }
       for(int i=0;i<matriz_time.length;i++)
       {
           if(matriz_time[i][0].equals("8"))
           {
               if(opcao==2)
               {
                   if(matriz_time[i][9].equals("A"))
                   {
                        System.out.printf("JOGADOR = NOME: %s //CPF: %s //EMAIL: %s //TELEFONE: %s //SALÁRIO: R$ %s //POSIÇÃO: %s //APTO: %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5],matriz_time[i][8],matriz_time[i][9]);

                   }
               }
               else
               {
                 System.out.printf("JOGADOR = NOME: %s //CPF: %s //EMAIL: %s //TELEFONE: %s //SALÁRIO: R$ %s //POSIÇÃO: %s //APTO OU NÃO: %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5],matriz_time[i][8],matriz_time[i][9]);

               }

               flag2=1;
           }
       }
       if(flag2==-1)
       {
           System.out.printf("ESTAMOS SEM JOGADORES\n");
       }
    }
    static void relatorio_funcionarios(String[][] matriz_time)
    {
        int flag=-1;
        for(int j=1;j<=8;j++)
        {
            for(int i=0;i<matriz_time.length;i++)
            {
                if(j==1)
                {
                    if(matriz_time[i][0].equals("1") && flag==-1)
                    {
                        System.out.printf("PRESIDENTE = NOME: %s // CPF: %s //EMAIL: %s //TELEFONE: %s //SALÁRIO: R$ %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5]);
                        flag = 1;
                    }
                   
                }
                else if(j==2)
                {
                    if(matriz_time[i][0].equals("2"))
                    {
                        System.out.printf("MÉDICO = NOME: %s //CPF: %s //EMAIL: %s //TELEFONE: %s //SALÁRIO: R$ %s //CRM: %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5],matriz_time[i][6]);

                    }
                }
                else if(j==3)
                {
                    if(matriz_time[i][0].equals("3"))
                    {
                        System.out.printf("ADVOGADO = NOME: %s //CPF: %s //EMAIL: %s //TELEFONE: %s //SALÁRIO: R$ %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5]);
                        
                    }
                }
                else if(j==5)
                {
                    if(matriz_time[i][0].equals("5"))
                    {
                        System.out.printf("PREPARADOR FÍSICO = NOME: %s //CPF: %s //EMAIL: %s //TELEFONE: %s //SALÁRIO: R$ %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5]);

                    }
                }
                else if(j==6)
                {
                    if(matriz_time[i][0].equals("6"))
                    {
                        System.out.printf("MOTORISTA = NOME: %s //CPF: %s //EMAIL %s //TELEFONE: %s //SALÁRIO: R$ %s //NÚMERO DA HABILITAÇÃO: %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5],matriz_time[i][7]);


                    }
                }
                else if(j==7)
                {
                    if(matriz_time[i][0].equals("7"))
                    {
                        System.out.printf("COZINHEIRO = NOME: %s //CPF: %s //EMAIL: %s //TELEFONE: %s //SALÁRIO: R$ %s\n", matriz_time[i][1], matriz_time[i][2],matriz_time[i][3],matriz_time[i][4],matriz_time[i][5]);
                    }
                }
            }
        }
    }
    static void relatorio_recursos(String[][] estadio_dados, String[][] ct_DADOS, int onibus)
    {
        System.out.printf("NOME DO CT: %s\nQUANTIDADE DE DORMITÓRIOS: %s\n\n", ct_DADOS[0][0],ct_DADOS[0][1]);

        System.out.printf("NOME DO ESTÁDIO: %s\nCAPACIDADE: %s\nNÚMERO DE BANHEIROS: %s\nNÚMERO DE LANCHONETES: %s\n\n", estadio_dados[0][0],estadio_dados[0][1],estadio_dados[0][2],estadio_dados[0][3]);

        System.out.printf("QUANTIDADE DE ÔNIBUS DISPONÍVEIS : %d\n\n", onibus);

    }
    static void relatorio_socio(String[][] matriz_socio, int opcao)
    {
        int cont=0;
        for(int i=0;i<matriz_socio.length;i++)
        {
            if(!"-1".equals(matriz_socio[i][1]))
            {
                cont++;
            }
            if("-1".equals(matriz_socio[i][1]))
            {
                break;
            }

                if(opcao==2)
                {
                    if(matriz_socio[i][8].equals("A"))
                    {
                        System.out.printf("NOME = %s // CPF = %s // E-MAIL = %s // TELEFONE = %s // ENDEREÇO = %s // VALOR DE CONTRIBUIÇÃO = %s // TIPO DO SÓCIO = %s // SITUAÇÃO = %s\n", matriz_socio[i][1],matriz_socio[i][2],matriz_socio[i][3],matriz_socio[i][4],matriz_socio[i][5],matriz_socio[i][6],matriz_socio[i][7],matriz_socio[i][8]);
                    }
                }
                else if(opcao==3)
                {
                    if(matriz_socio[i][8].equals("N"))
                    {
                        System.out.printf("NOME = %s // CPF = %s // E-MAIL = %s // TELEFONE = %s // ENDEREÇO = %s // VALOR DE CONTRIBUIÇÃO = %s // TIPO DO SÓCIO = %s // SITUAÇÃO = %s\n", matriz_socio[i][1],matriz_socio[i][2],matriz_socio[i][3],matriz_socio[i][4],matriz_socio[i][5],matriz_socio[i][6],matriz_socio[i][7],matriz_socio[i][8]);
                    }
                }
                else if(opcao==4)
                {
                    System.out.printf("NOME = %s // CPF = %s // E-MAIL = %s // TELEFONE = %s // ENDEREÇO = %s // VALOR DE CONTRIBUIÇÃO = %s // TIPO DO SÓCIO = %s // SITUAÇÃO = %s", matriz_socio[i][1],matriz_socio[i][2],matriz_socio[i][3],matriz_socio[i][4],matriz_socio[i][5],matriz_socio[i][6],matriz_socio[i][7],matriz_socio[i][8]);

                }
            

            
        }
        if(opcao==1)
        {
            System.out.printf("QUANTIDADE = %d\n", cont);
        }
        else if(cont==0)
        {
            System.out.printf("NÃO HÁ SÓCIOS CADASTRADOS!\n");
        }
    }
    public static void main(String[] args) 
    {
        int onibus= 0;
        int estadio = 0;
        int ct = 0;
        int[] array_qnt = new int[9];
        Scanner input = new Scanner(System.in);
        String[][] matriz_func = new String[40][11];
        String[][] matriz_socio = new String[100][9];
        String[][] estadio_dados = new String[1][4];
        String[][] ct_DADOS = new String[1][2];
        Float[] categorias_socio = new Float[4];

        categorias_socio[0] = 120.0f; // categoria junior
        categorias_socio[1] = 200.0f; // categoria sênior
        categorias_socio[2] = 350.0f; // categoria elite
        inicializar_matriz(matriz_func);
        inicializar_matriz(matriz_socio);
        

       
        
        System.out.printf("BEM VINDO AO GERENCIADOR CSATWO\nChamo-me Azulão e serei seu ajudante nesse trabalho\n\n");
        //AUTENTICADOR
        while(true)
        {
            System.out.printf("Login: ");
            String  login = input.nextLine();
            System.out.println();
            System.out.print("Senha: ");
            String senha = input.nextLine();
            System.out.println();
            if("maiordoestado".equals(login)  && "39seriea".equals(senha))
            {
                System.out.printf("Senha Correta\n");
                break;
            }

            System.out.printf("Senha incorreta\nDigite novamente\n");
            clearsoccer();
        }

        while(true)
        {

        
            System.out.printf("\nESCOLHA UMA DESSAS OPÇÕES:\n\n");
            System.out.printf("[1]ADICIONAR FUNCIONÁRIO\n[2]ADICIONAR SÓCIO-TORCEDOR\n[3]GERENCIAR RECURSOS\n[4]RELATÓRIOS\n[5]SAIR DO PROGRAMA\nDIGITE: ");
            int number = input.nextInt();
            if(number==1) // adicionar funcionarios
            {
                
                System.out.printf("\nESCOLHA UMA DESSAS OPÇÕES:\n\n");
                System.out.println("[1]PRESIDENTE\n[2]MÉDICO\n[3]ADVOGADO\n[4]TÉCNICO\n[5]PREPARADOR FÍSICO\n[6]MOTORISTA\n[7]COZINHEIRO\n[8]JOGADOR\n[9]VOLTAR\nDIGITE: ");
                int number_adicionar = input.nextInt();
                input.nextLine();
                if(number_adicionar==1 || number_adicionar==3 || number_adicionar==4 || number_adicionar==5 || number_adicionar==7 )
                {
                    add_simples(matriz_func,number_adicionar,array_qnt);
                    
                }
                else if(number_adicionar==9)
                {

                }
                else
                {
                    add_composto(matriz_func, number_adicionar,array_qnt);
                }
               
            }
            else if(number==2)
            {
                System.out.printf("\nESCOLHA UMA DESSAS OPÇÕES:\n\n");
                System.out.printf("[1]ADICIONAR SÓCIO-TORCEDOR\n[2]EDITAR SÓCIO-TORCEDOR\n");
                int number_socio = input.nextInt();
                input.nextLine();
                if(number_socio==1)
                {
                    adicionar_socio(matriz_socio, categorias_socio);
                }
                else
                {
                    System.out.printf("O QUE VOCÊ DESEJA EDITAR?\n[1]ADIMPLÊNCIA\n[2]TIPO SÓCIO\n[3]VOLTAR\n");
                    int escolha = input.nextInt();
                    input.nextLine();
                    if(escolha==1)
                    {
                        System.out.printf("DIGITE O CPF COMPLETO DO SÓCIO: ");
                        
                        String cpf_completo_busca = input.nextLine();
                        editar_socio(matriz_socio,cpf_completo_busca,escolha);
                    }
                    else if(escolha==2)
                    {
                        valorcategorias(matriz_socio,categorias_socio);
                    }
                }
            }
            else if(number==3)
            {
                System.out.printf("DIGITE A OPÇÃO DESEJADA:\n[1]ÔNIBUS\n[2]ESTÁDIO\n[3]CENTRO DE TREINAMENTO\n[4]VOLTAR\n");
                int escolha_gerenciamento = input.nextInt();
                input.nextLine();
                if(escolha_gerenciamento==1)
                {
                     
                    System.out.printf("DIGITE A OPÇÃO DESEJADA:\n[1]ADICIONAR\n[2]VERIFICAR DISPONIBILIDADE\n");
                    int escolha_onibus = input.nextInt();
                    input.nextLine();
                    if(escolha_onibus==1)
                    {
                        onibus++;
                        System.out.printf("ÔNIBUS ADICIONADO COM SUCESSO\n");
                    }
                    else
                    {
                        if(onibus==0)
                        {
                            System.out.printf("NÃO HÁ ÔNIBUS NO CLUBE\n");
                        }
                        else
                        {
                            System.out.printf("TEMOS %d ÔNIBUS DISPONÍVEIS\n", onibus);
                        }
                        
                    }
                }
                else if(escolha_gerenciamento==2)
                {
                    System.out.printf("DIGITE A OPÇÃO DESEJADA:\n[1]ADICIONAR ESTÁDIO\n[2]VERIFICAR DISPONIBILIDADE\n[3]EDITAR DADOS DO ESTÁDIO\n[4]VOLTAR\n");
                    int escolha_estadio = input.nextInt();
                    input.nextLine();
                    if(escolha_estadio==1)
                    {
                        estadio++;
                        dados_estadio(estadio_dados);

                    }
                    else if(escolha_estadio==2)
                    {
                        if(estadio==0)
                        {
                            System.out.printf("NÃO HÁ ESTÁDIOS DISPONÍVEIS");
                        }
                        else
                        {
                            System.out.printf("DADOS DO ESTÁDIO:\nNOME: %s\nCAPACIDADE: %s\nNÚMERO LANCHONETES: %s\nNÚMERO BANHEIROS: %s\n", estadio_dados[0][0],estadio_dados[0][1], estadio_dados[0][2],estadio_dados[0][3]);

                        }
                    }
                    else if(escolha_estadio==3)
                    {
                        editar_dados_estadio(estadio_dados);
                    }

                }
                else if(escolha_gerenciamento==3)
                {
                    System.out.printf("DIGITE A OPÇÃO DESEJADA:\n[1]ADICIONAR CENTRO DE TREINAMENTO\n[2]VERIFICAR DISPONIBILIDADE\n[3]EDITAR DADOS DO CT\n[4]VOLTAR\n");
                    int escolha_CT = input.nextInt();
                    input.nextLine();
                    if(escolha_CT==1)
                    {
                        ct++;
                        dados_ct(ct_DADOS);
                    }
                    else if(escolha_CT==2)
                    {
                        if(ct==0)
                        {
                            System.out.printf("NÃO HÁ CT NO CLUBE\n");
                        }
                        else
                        {
                            System.out.printf("DADOS DO CT:\nNOME: %s\nCAPACIDADE DE DORMITÓRIOS: %s\n", ct_DADOS[0][0],ct_DADOS[0][1]);
                        }
                    }
                    else if(escolha_CT==3)
                    {
                        editar_dados_CT(ct_DADOS);
                    }

                }
            }
            else if(number==4)
            {
                System.out.printf("DIGITE UMA OPÇÃO PARA RELATÓRIO:\n[1]TIME\n[2]FUNCIONÁRIOS\n[3]SÓCIO-TORCEDOR\n[4]RECURSOS FÍSICOS\n[5]VOLTAR\n");
                int n = input.nextInt();
                if(n==1)
                {
                    System.out.printf("DIGITE UMA OPÇÃO:\n[1]RELATÓRIO\n[2]BUSCA\n");
                    int opcao = input.nextInt();
                    input.nextLine();
                    
                      relatorio_time(matriz_func,opcao);

                    
                }
                else if(n==2)
                {
                    relatorio_funcionarios(matriz_func);
                }
                else if(n==3)
                {
                    System.out.printf("DIGITE UMA OPÇÃO:\n[1]QUANTIDADE\n[2]ADIMPLENTES\n[3]INADIMPLENTES\n[4]RELATÓRIO GERAL-SÓCIO\n");
                    int opcao_socio = input.nextInt();
                    input.nextLine();
                    relatorio_socio(matriz_socio,opcao_socio);

                    
                }
                else if(n==4)
                {
                    relatorio_recursos(estadio_dados,ct_DADOS,onibus);
                }
            }
            else
            {
                return;
            }
        }
       
       

    }
       
}
