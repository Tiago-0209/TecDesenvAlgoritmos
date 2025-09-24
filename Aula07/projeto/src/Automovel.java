public class Automovel {
public String nomeProprietario;
public String modelo;
public String placa;
public int ano;
public Automovel (String nomeProprietario, String modelo, String placa, int ano){
this.nomeProprietario = nomeProprietario;
this.modelo = modelo;
this.placa = placa;
this.ano = ano;
}
public void imprimir (){
System.out.println(nomeProprietario+ " possui um(a) "+modelo+ " com placa "+placa+
" e ano "+ano);
}
public void transferirProprietario (String nome) {
this.nomeProprietario = nome;
}
public void mudarPlaca (String nPlaca) {
this.placa = nPlaca;
}
public static void main (String args []){
Automovel a;
a = new Automovel ("Eduardo", "Palio", "JWO2125", 2002);
a.imprimir();
System.out.println ("***Transferencia de Proprietario***");
a.transferirProprietario("Rosa");
a.imprimir();
a = new Automovel ("Rodrigo", "Parati", "JSX6481", 1999);
a.imprimir();
System.out.println ("***Mudanca de Placa***");
a.mudarPlaca("SDK2581");
a.imprimir();
}}