
  
public class CalculoIMC{
    double Resultado;
    double peso;
    double altura;
public static void main (String[] args){
    CalculoIMC pessoa = new CalculoIMC(); //instancia
    
    pessoa.peso = 55.600;
    pessoa.altura = 1.70;
    pessoa.Resultado = pessoa.peso / (pessoa.altura * pessoa.altura);
    pessoa.Resultado = pessoa.Resultado;
    
        if(pessoa.Resultado < 18.5){
        System.out.println("Deficit de massa Corporal && Baixo(com risco de outras doenças) ");
} 

    else if(pessoa.Resultado > 18.5 && pessoa.Resultado < 24.9){
        System.out.println("Massa Corporal Normal && Normal ");
} 

    else if(pessoa.Resultado > 24.9 && pessoa.Resultado < 29.9){
        System.out.println("Sobrepeso && Elevado ");
} 

    else if(pessoa.Resultado > 29.9 && pessoa.Resultado < 34.9){
        System.out.println("Obesidade Leve && Alto ");
} 

    else if(pessoa.Resultado > 34.9 && pessoa.Resultado < 39.9){
        System.out.println("Obesidade Media && Muito Alto ");
} 

    else if(pessoa.Resultado >= 40){
        System.out.println("Obesidade Morbida && Iminente ");
}
}
}