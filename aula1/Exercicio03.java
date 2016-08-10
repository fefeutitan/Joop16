class Exercicio03{
	public static void main(String[] args){
		int impar = 0;
		for(int x=0;x<=100;x=x+1){
			
			if ((x>=10 && x<=50) && x % 2 != 0){	
			impar++;		

			//System.out.println(x);
			}		
			
		}
		System.out.println("Impares: "+impar);
	}
}